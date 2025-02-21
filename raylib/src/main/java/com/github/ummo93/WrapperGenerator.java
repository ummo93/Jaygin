package com.github.ummo93;

import com.raylib.Raylib;
import javassist.*;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;


public class WrapperGenerator {
    public static void generateWrapper(Class<?> targetClass, String outputDir, String className) throws Exception {
        ClassPool pool = ClassPool.getDefault();
        pool.insertClassPath(new ClassClassPath(targetClass));
        String packageName = targetClass.getPackage().getName();

        StringBuilder classContent = new StringBuilder();
        classContent.append("// GENERATED FILE ").append(";\n\n");
        classContent.append("package ").append(packageName).append(";\n\n");
        classContent.append("public class ").append(className).append(" {\n");

        // Non-static methods
        classContent.append("    private final ").append(targetClass.getSimpleName()).append(" target;\n\n");
        classContent.append("    public ").append(className).append("(").append(targetClass.getSimpleName()).append(" target) {\n");
        classContent.append("        this.target = target;\n");
        classContent.append("    }\n\n");

        for (Method method : targetClass.getDeclaredMethods()) {
            String methodName = method.getName();
            String wrapperMethodName = Character.toLowerCase(methodName.charAt(0)) + methodName.substring(1);
            boolean isStatic = Modifier.isStatic(method.getModifiers());
            String comment = RaylibApiStructure.infoMap.get(methodName);

            if (comment != null) {
                classContent
                    .append("    /**\n")
                    .append("     * ").append(comment).append("\n")
                    .append("     */").append("\n");
            }
            if (isStatic) {
                // Gen static methods
                classContent.append("    public static ").append(getTypeName(method.getReturnType())).append(" ").append(wrapperMethodName).append("(");
            } else {
                // Gen non-static methods
                classContent.append("    public ").append(getTypeName(method.getReturnType())).append(" ").append(wrapperMethodName).append("(");
            }

            Class<?>[] parameterTypes = method.getParameterTypes();
            String[] trueArgNames = RaylibApiStructure.argsMap.get(methodName);

            for (int i = 0; i < parameterTypes.length; i++) {
                if (i > 0) classContent.append(", ");
                if (trueArgNames != null) {
                    classContent.append(getTypeName(parameterTypes[i])).append(" ").append(trueArgNames[i]);
                } else {
                    classContent.append(getTypeName(parameterTypes[i])).append(" arg").append(i);
                }
            }
            classContent.append(") {\n");

            if (method.getReturnType().equals(Void.TYPE)) {
                if (isStatic) {
                    classContent.append("        ").append(targetClass.getSimpleName()).append(".").append(methodName).append("(");
                } else {
                    classContent.append("        target.").append(methodName).append("(");
                }
            } else {
                if (isStatic) {
                    classContent.append("        return ").append(targetClass.getSimpleName()).append(".").append(methodName).append("(");
                } else {
                    classContent.append("        return target.").append(methodName).append("(");
                }
            }

            for (int i = 0; i < parameterTypes.length; i++) {
                if (i > 0) classContent.append(", ");
                if (trueArgNames != null) {
                    classContent.append(trueArgNames[i]);
                } else {
                    classContent.append("arg").append(i);
                }
            }
            classContent.append(");\n");

            classContent.append("    }\n\n");
        }

        classContent.append("}\n");

        writeFile(outputDir + "/" + packageName.replace(".", "/") + "/" + className + ".java", classContent.toString());
    }

    private static String getTypeName(Class<?> cls) {
        if (cls.isArray()) {
            return getTypeName(cls.getComponentType()) + "[]";
        }
        return cls.getName().replace('$', '.');
    }

    private static void writeFile(String filePath, String content) throws IOException {
        FileWriter writer = new FileWriter(filePath);
        writer.write(content);
        writer.close();
    }

    public static void main(String[] args) throws Exception {
        RaylibApiStructure.loadRaylibMethodInfos("raylib.json");
        RaylibApiStructure.loadRaylibMethodInfos("raygui.json");
        RaylibApiStructure.loadRaylibMethodInfos("raymath.json");
        generateWrapper(Raylib.class, args[0], args[1]);
    }
}
