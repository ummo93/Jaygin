// GENERATED FILE ;

package com.raylib;

public class Jaylib {
    private final Raylib target;

    public Jaylib(Raylib target) {
        this.target = target;
    }

    public static void drawSplineSegmentCatmullRom(com.raylib.Raylib.Vector2 p1, com.raylib.Raylib.Vector2 p2, com.raylib.Raylib.Vector2 p3, com.raylib.Raylib.Vector2 p4, float thick, com.raylib.Raylib.Color color) {
        Raylib.DrawSplineSegmentCatmullRom(p1, p2, p3, p4, thick, color);
    }

    public static void stopAutomationEventRecording() {
        Raylib.StopAutomationEventRecording();
    }

    public static boolean checkCollisionPointTriangle(com.raylib.Raylib.Vector2 point, com.raylib.Raylib.Vector2 p1, com.raylib.Raylib.Vector2 p2, com.raylib.Raylib.Vector2 p3) {
        return Raylib.CheckCollisionPointTriangle(point, p1, p2, p3);
    }

    public static void drawSplineSegmentBezierCubic(com.raylib.Raylib.Vector2 p1, com.raylib.Raylib.Vector2 c2, com.raylib.Raylib.Vector2 c3, com.raylib.Raylib.Vector2 p4, float thick, com.raylib.Raylib.Color color) {
        Raylib.DrawSplineSegmentBezierCubic(p1, c2, c3, p4, thick, color);
    }

    public static void startAutomationEventRecording() {
        Raylib.StartAutomationEventRecording();
    }

    public static void drawSplineSegmentBezierQuadratic(com.raylib.Raylib.Vector2 p1, com.raylib.Raylib.Vector2 c2, com.raylib.Raylib.Vector2 p3, float thick, com.raylib.Raylib.Color color) {
        Raylib.DrawSplineSegmentBezierQuadratic(p1, c2, p3, thick, color);
    }

    public static void drawRectangleRoundedLinesEx(com.raylib.Raylib.Rectangle rec, float roundness, int segments, float lineThick, com.raylib.Raylib.Color color) {
        Raylib.DrawRectangleRoundedLinesEx(rec, roundness, segments, lineThick, color);
    }

    public static void setAutomationEventBaseFrame(int frame) {
        Raylib.SetAutomationEventBaseFrame(frame);
    }

    public static void setAudioStreamBufferSizeDefault(int size) {
        Raylib.SetAudioStreamBufferSizeDefault(size);
    }

    public static com.raylib.Raylib.Matrix rlGetMatrixViewOffsetStereo(int arg0) {
        return Raylib.rlGetMatrixViewOffsetStereo(arg0);
    }

    public static void rlDrawVertexArrayElementsInstanced(int arg0, int arg1, org.bytedeco.javacpp.Pointer arg2, int arg3) {
        Raylib.rlDrawVertexArrayElementsInstanced(arg0, arg1, arg2, arg3);
    }

    public static void rlUpdateVertexBufferElements(int arg0, org.bytedeco.javacpp.Pointer arg1, int arg2, int arg3) {
        Raylib.rlUpdateVertexBufferElements(arg0, arg1, arg2, arg3);
    }

    public static void rlEnableVertexBufferElement(int arg0) {
        Raylib.rlEnableVertexBufferElement(arg0);
    }

    public static void rlSetMatrixViewOffsetStereo(com.raylib.Raylib.Matrix arg0, com.raylib.Raylib.Matrix arg1) {
        Raylib.rlSetMatrixViewOffsetStereo(arg0, arg1);
    }

    public static void rlDisableVertexBufferElement() {
        Raylib.rlDisableVertexBufferElement();
    }

    public static void rlSetVertexAttributeDefault(int arg0, org.bytedeco.javacpp.Pointer arg1, int arg2, int arg3) {
        Raylib.rlSetVertexAttributeDefault(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.Vector4 quaternionFromVector3ToVector3(com.raylib.Raylib.Vector3 from, com.raylib.Raylib.Vector3 to) {
        return Raylib.QuaternionFromVector3ToVector3(from, to);
    }

    public static com.raylib.Raylib.Matrix rlGetMatrixProjectionStereo(int arg0) {
        return Raylib.rlGetMatrixProjectionStereo(arg0);
    }

    public static int getPhysicsShapeVerticesCount(int arg0) {
        return Raylib.GetPhysicsShapeVerticesCount(arg0);
    }

    public static void rlSetVertexAttributeDivisor(int arg0, int arg1) {
        Raylib.rlSetVertexAttributeDivisor(arg0, arg1);
    }

    public static void rlSetMatrixProjectionStereo(com.raylib.Raylib.Matrix arg0, com.raylib.Raylib.Matrix arg1) {
        Raylib.rlSetMatrixProjectionStereo(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 quaternionCubicHermiteSpline(com.raylib.Raylib.Vector4 q1, com.raylib.Raylib.Vector4 outTangent1, com.raylib.Raylib.Vector4 q2, com.raylib.Raylib.Vector4 inTangent2, float t) {
        return Raylib.QuaternionCubicHermiteSpline(q1, outTangent1, q2, inTangent2, t);
    }

    public static int getMonitorPhysicalHeight(int monitor) {
        return Raylib.GetMonitorPhysicalHeight(monitor);
    }

    public static int getShaderLocationAttrib(com.raylib.Raylib.Shader shader, java.lang.String attribName) {
        return Raylib.GetShaderLocationAttrib(shader, attribName);
    }

    public static int getShaderLocationAttrib(com.raylib.Raylib.Shader shader, org.bytedeco.javacpp.BytePointer attribName) {
        return Raylib.GetShaderLocationAttrib(shader, attribName);
    }

    public static void setShaderValueTexture(com.raylib.Raylib.Shader shader, int locIndex, com.raylib.Raylib.Texture texture) {
        Raylib.SetShaderValueTexture(shader, locIndex, texture);
    }

    public static com.raylib.Raylib.Ray getScreenToWorldRayEx(com.raylib.Raylib.Vector2 position, com.raylib.Raylib.Camera3D camera, int width, int height) {
        return Raylib.GetScreenToWorldRayEx(position, camera, width, height);
    }

    public static void setShaderValueMatrix(com.raylib.Raylib.Shader shader, int locIndex, com.raylib.Raylib.Matrix mat) {
        Raylib.SetShaderValueMatrix(shader, locIndex, mat);
    }

    public static void unloadRandomSequence(org.bytedeco.javacpp.IntPointer sequence) {
        Raylib.UnloadRandomSequence(sequence);
    }

    public static void unloadRandomSequence(java.nio.IntBuffer sequence) {
        Raylib.UnloadRandomSequence(sequence);
    }

    public static void unloadRandomSequence(int[] sequence) {
        Raylib.UnloadRandomSequence(sequence);
    }

    public static void setTraceLogCallback(com.raylib.Raylib.TraceLogCallback callback) {
        Raylib.SetTraceLogCallback(callback);
    }

    public static void unloadVrStereoConfig(com.raylib.Raylib.VrStereoConfig config) {
        Raylib.UnloadVrStereoConfig(config);
    }

    public static com.raylib.Raylib.Ray getScreenToWorldRay(com.raylib.Raylib.Vector2 position, com.raylib.Raylib.Camera3D camera) {
        return Raylib.GetScreenToWorldRay(position, camera);
    }

    public static void toggleBorderlessWindowed() {
        Raylib.ToggleBorderlessWindowed();
    }

    public static int getMonitorPhysicalWidth(int monitor) {
        return Raylib.GetMonitorPhysicalWidth(monitor);
    }

    public static int getMonitorRefreshRate(int monitor) {
        return Raylib.GetMonitorRefreshRate(monitor);
    }

    public static void disableEventWaiting() {
        Raylib.DisableEventWaiting();
    }

    public static com.raylib.Raylib.Shader loadShaderFromMemory(org.bytedeco.javacpp.BytePointer vsCode, org.bytedeco.javacpp.BytePointer fsCode) {
        return Raylib.LoadShaderFromMemory(vsCode, fsCode);
    }

    public static com.raylib.Raylib.Shader loadShaderFromMemory(java.lang.String vsCode, java.lang.String fsCode) {
        return Raylib.LoadShaderFromMemory(vsCode, fsCode);
    }

    public static com.raylib.Raylib.Vector2 getSplinePointCatmullRom(com.raylib.Raylib.Vector2 p1, com.raylib.Raylib.Vector2 p2, com.raylib.Raylib.Vector2 p3, com.raylib.Raylib.Vector2 p4, float t) {
        return Raylib.GetSplinePointCatmullRom(p1, p2, p3, p4, t);
    }

    public static boolean checkCollisionPointPoly(com.raylib.Raylib.Vector2 point, com.raylib.Raylib.Vector2 points, int pointCount) {
        return Raylib.CheckCollisionPointPoly(point, points, pointCount);
    }

    public static void setSaveFileDataCallback(com.raylib.Raylib.SaveFileDataCallback callback) {
        Raylib.SetSaveFileDataCallback(callback);
    }

    public static boolean isGamepadButtonPressed(int gamepad, int button) {
        return Raylib.IsGamepadButtonPressed(gamepad, button);
    }

    public static com.raylib.Raylib.Vector2 getSplinePointBasis(com.raylib.Raylib.Vector2 p1, com.raylib.Raylib.Vector2 p2, com.raylib.Raylib.Vector2 p3, com.raylib.Raylib.Vector2 p4, float t) {
        return Raylib.GetSplinePointBasis(p1, p2, p3, p4, t);
    }

    public static com.raylib.Raylib.Vector2 getSplinePointBezierCubic(com.raylib.Raylib.Vector2 p1, com.raylib.Raylib.Vector2 c2, com.raylib.Raylib.Vector2 c3, com.raylib.Raylib.Vector2 p4, float t) {
        return Raylib.GetSplinePointBezierCubic(p1, c2, c3, p4, t);
    }

    public static org.bytedeco.javacpp.BytePointer getApplicationDirectory() {
        return Raylib.GetApplicationDirectory();
    }

    public static void unloadAutomationEventList(com.raylib.Raylib.AutomationEventList list) {
        Raylib.UnloadAutomationEventList(list);
    }

    public static int getGamepadAxisCount(int gamepad) {
        return Raylib.GetGamepadAxisCount(gamepad);
    }

    public static boolean checkCollisionPointRec(com.raylib.Raylib.Vector2 point, com.raylib.Raylib.Rectangle rec) {
        return Raylib.CheckCollisionPointRec(point, rec);
    }

    public static boolean checkCollisionLines(com.raylib.Raylib.Vector2 startPos1, com.raylib.Raylib.Vector2 endPos1, com.raylib.Raylib.Vector2 startPos2, com.raylib.Raylib.Vector2 endPos2, com.raylib.Raylib.Vector2 collisionPoint) {
        return Raylib.CheckCollisionLines(startPos1, endPos1, startPos2, endPos2, collisionPoint);
    }

    public static com.raylib.Raylib.Image loadImageAnimFromMemory(java.lang.String fileType, org.bytedeco.javacpp.BytePointer fileData, int dataSize, org.bytedeco.javacpp.IntPointer frames) {
        return Raylib.LoadImageAnimFromMemory(fileType, fileData, dataSize, frames);
    }

    public static com.raylib.Raylib.Image loadImageAnimFromMemory(org.bytedeco.javacpp.BytePointer fileType, java.nio.ByteBuffer fileData, int dataSize, java.nio.IntBuffer frames) {
        return Raylib.LoadImageAnimFromMemory(fileType, fileData, dataSize, frames);
    }

    public static com.raylib.Raylib.Image loadImageAnimFromMemory(java.lang.String fileType, byte[] fileData, int dataSize, int[] frames) {
        return Raylib.LoadImageAnimFromMemory(fileType, fileData, dataSize, frames);
    }

    public static com.raylib.Raylib.Image loadImageAnimFromMemory(org.bytedeco.javacpp.BytePointer fileType, org.bytedeco.javacpp.BytePointer fileData, int dataSize, org.bytedeco.javacpp.IntPointer frames) {
        return Raylib.LoadImageAnimFromMemory(fileType, fileData, dataSize, frames);
    }

    public static com.raylib.Raylib.Image loadImageAnimFromMemory(java.lang.String fileType, java.nio.ByteBuffer fileData, int dataSize, java.nio.IntBuffer frames) {
        return Raylib.LoadImageAnimFromMemory(fileType, fileData, dataSize, frames);
    }

    public static com.raylib.Raylib.Image loadImageAnimFromMemory(org.bytedeco.javacpp.BytePointer fileType, byte[] fileData, int dataSize, int[] frames) {
        return Raylib.LoadImageAnimFromMemory(fileType, fileData, dataSize, frames);
    }

    public static float getGesturePinchAngle() {
        return Raylib.GetGesturePinchAngle();
    }

    public static void drawSplineSegmentLinear(com.raylib.Raylib.Vector2 p1, com.raylib.Raylib.Vector2 p2, float thick, com.raylib.Raylib.Color color) {
        Raylib.DrawSplineSegmentLinear(p1, p2, thick, color);
    }

    public static boolean checkCollisionPointCircle(com.raylib.Raylib.Vector2 point, com.raylib.Raylib.Vector2 center, float radius) {
        return Raylib.CheckCollisionPointCircle(point, center, radius);
    }

    public static com.raylib.Raylib.Image loadImageFromMemory(org.bytedeco.javacpp.BytePointer fileType, byte[] fileData, int dataSize) {
        return Raylib.LoadImageFromMemory(fileType, fileData, dataSize);
    }

    public static com.raylib.Raylib.Image loadImageFromMemory(java.lang.String fileType, org.bytedeco.javacpp.BytePointer fileData, int dataSize) {
        return Raylib.LoadImageFromMemory(fileType, fileData, dataSize);
    }

    public static com.raylib.Raylib.Image loadImageFromMemory(java.lang.String fileType, java.nio.ByteBuffer fileData, int dataSize) {
        return Raylib.LoadImageFromMemory(fileType, fileData, dataSize);
    }

    public static com.raylib.Raylib.Image loadImageFromMemory(org.bytedeco.javacpp.BytePointer fileType, org.bytedeco.javacpp.BytePointer fileData, int dataSize) {
        return Raylib.LoadImageFromMemory(fileType, fileData, dataSize);
    }

    public static com.raylib.Raylib.Image loadImageFromMemory(org.bytedeco.javacpp.BytePointer fileType, java.nio.ByteBuffer fileData, int dataSize) {
        return Raylib.LoadImageFromMemory(fileType, fileData, dataSize);
    }

    public static com.raylib.Raylib.Image loadImageFromMemory(java.lang.String fileType, byte[] fileData, int dataSize) {
        return Raylib.LoadImageFromMemory(fileType, fileData, dataSize);
    }

    public static com.raylib.Raylib.Image loadImageFromTexture(com.raylib.Raylib.Texture texture) {
        return Raylib.LoadImageFromTexture(texture);
    }

    public static boolean isGamepadButtonDown(int gamepad, int button) {
        return Raylib.IsGamepadButtonDown(gamepad, button);
    }

    public static com.raylib.Raylib.Vector2 getGestureDragVector() {
        return Raylib.GetGestureDragVector();
    }

    public static com.raylib.Raylib.Image loadImageFromScreen() {
        return Raylib.LoadImageFromScreen();
    }

    public static java.nio.ByteBuffer exportImageToMemory(com.raylib.Raylib.Image image, org.bytedeco.javacpp.BytePointer fileType, java.nio.IntBuffer fileSize) {
        return Raylib.ExportImageToMemory(image, fileType, fileSize);
    }

    public static byte[] exportImageToMemory(com.raylib.Raylib.Image image, org.bytedeco.javacpp.BytePointer fileType, int[] fileSize) {
        return Raylib.ExportImageToMemory(image, fileType, fileSize);
    }

    public static java.nio.ByteBuffer exportImageToMemory(com.raylib.Raylib.Image image, java.lang.String fileType, java.nio.IntBuffer fileSize) {
        return Raylib.ExportImageToMemory(image, fileType, fileSize);
    }

    public static org.bytedeco.javacpp.BytePointer exportImageToMemory(com.raylib.Raylib.Image image, java.lang.String fileType, org.bytedeco.javacpp.IntPointer fileSize) {
        return Raylib.ExportImageToMemory(image, fileType, fileSize);
    }

    public static byte[] exportImageToMemory(com.raylib.Raylib.Image image, java.lang.String fileType, int[] fileSize) {
        return Raylib.ExportImageToMemory(image, fileType, fileSize);
    }

    public static org.bytedeco.javacpp.BytePointer exportImageToMemory(com.raylib.Raylib.Image image, org.bytedeco.javacpp.BytePointer fileType, org.bytedeco.javacpp.IntPointer fileSize) {
        return Raylib.ExportImageToMemory(image, fileType, fileSize);
    }

    public static void drawRectangleRounded(com.raylib.Raylib.Rectangle rec, float roundness, int segments, com.raylib.Raylib.Color color) {
        Raylib.DrawRectangleRounded(rec, roundness, segments, color);
    }

    public static com.raylib.Raylib.Image genImageGradientLinear(int width, int height, int direction, com.raylib.Raylib.Color start, com.raylib.Raylib.Color end) {
        return Raylib.GenImageGradientLinear(width, height, direction, start, end);
    }

    public static boolean isGamepadButtonReleased(int gamepad, int button) {
        return Raylib.IsGamepadButtonReleased(gamepad, button);
    }

    public static void drawRectangleLinesEx(com.raylib.Raylib.Rectangle rec, float lineThick, com.raylib.Raylib.Color color) {
        Raylib.DrawRectangleLinesEx(rec, lineThick, color);
    }

    public static org.bytedeco.javacpp.BytePointer getWorkingDirectory() {
        return Raylib.GetWorkingDirectory();
    }

    public static void playAutomationEvent(com.raylib.Raylib.AutomationEvent event) {
        Raylib.PlayAutomationEvent(event);
    }

    public static boolean isMouseButtonReleased(int button) {
        return Raylib.IsMouseButtonReleased(button);
    }

    public static void drawRectangleGradientV(int posX, int posY, int width, int height, com.raylib.Raylib.Color top, com.raylib.Raylib.Color bottom) {
        Raylib.DrawRectangleGradientV(posX, posY, width, height, top, bottom);
    }

    public static com.raylib.Raylib.FilePathList loadDirectoryFilesEx(java.lang.String basePath, java.lang.String filter, boolean scanSubdirs) {
        return Raylib.LoadDirectoryFilesEx(basePath, filter, scanSubdirs);
    }

    public static com.raylib.Raylib.FilePathList loadDirectoryFilesEx(org.bytedeco.javacpp.BytePointer basePath, org.bytedeco.javacpp.BytePointer filter, boolean scanSubdirs) {
        return Raylib.LoadDirectoryFilesEx(basePath, filter, scanSubdirs);
    }

    public static boolean exportAutomationEventList(com.raylib.Raylib.AutomationEventList list, org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.ExportAutomationEventList(list, fileName);
    }

    public static boolean exportAutomationEventList(com.raylib.Raylib.AutomationEventList list, java.lang.String fileName) {
        return Raylib.ExportAutomationEventList(list, fileName);
    }

    public static float getGestureDragAngle() {
        return Raylib.GetGestureDragAngle();
    }

    public static com.raylib.Raylib.AutomationEventList loadAutomationEventList(org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.LoadAutomationEventList(fileName);
    }

    public static com.raylib.Raylib.AutomationEventList loadAutomationEventList(java.lang.String fileName) {
        return Raylib.LoadAutomationEventList(fileName);
    }

    public static void setGamepadVibration(int gamepad, float leftMotor, float rightMotor, float duration) {
        Raylib.SetGamepadVibration(gamepad, leftMotor, rightMotor, duration);
    }

    public static float getGestureHoldDuration() {
        return Raylib.GetGestureHoldDuration();
    }

    public static com.raylib.Raylib.Vector2 getGesturePinchVector() {
        return Raylib.GetGesturePinchVector();
    }

    public static com.raylib.Raylib.Rectangle getShapesTextureRectangle() {
        return Raylib.GetShapesTextureRectangle();
    }

    public static void drawCircleSectorLines(com.raylib.Raylib.Vector2 center, float radius, float startAngle, float endAngle, int segments, com.raylib.Raylib.Color color) {
        Raylib.DrawCircleSectorLines(center, radius, startAngle, endAngle, segments, color);
    }

    public static java.lang.String getPrevDirectoryPath(java.lang.String dirPath) {
        return Raylib.GetPrevDirectoryPath(dirPath);
    }

    public static org.bytedeco.javacpp.BytePointer getPrevDirectoryPath(org.bytedeco.javacpp.BytePointer dirPath) {
        return Raylib.GetPrevDirectoryPath(dirPath);
    }

    public static void drawRectangleGradientEx(com.raylib.Raylib.Rectangle rec, com.raylib.Raylib.Color topLeft, com.raylib.Raylib.Color bottomLeft, com.raylib.Raylib.Color topRight, com.raylib.Raylib.Color bottomRight) {
        Raylib.DrawRectangleGradientEx(rec, topLeft, bottomLeft, topRight, bottomRight);
    }

    public static void drawSplineCatmullRom(com.raylib.Raylib.Vector2 points, int pointCount, float thick, com.raylib.Raylib.Color color) {
        Raylib.DrawSplineCatmullRom(points, pointCount, thick, color);
    }

    public static void drawSplineBezierQuadratic(com.raylib.Raylib.Vector2 points, int pointCount, float thick, com.raylib.Raylib.Color color) {
        Raylib.DrawSplineBezierQuadratic(points, pointCount, thick, color);
    }

    public static void setLoadFileDataCallback(com.raylib.Raylib.LoadFileDataCallback callback) {
        Raylib.SetLoadFileDataCallback(callback);
    }

    public static void setSaveFileTextCallback(com.raylib.Raylib.SaveFileTextCallback callback) {
        Raylib.SetSaveFileTextCallback(callback);
    }

    public static void unloadDirectoryFiles(com.raylib.Raylib.FilePathList files) {
        Raylib.UnloadDirectoryFiles(files);
    }

    public static void setAutomationEventList(com.raylib.Raylib.AutomationEventList list) {
        Raylib.SetAutomationEventList(list);
    }

    public static void drawSplineBezierCubic(com.raylib.Raylib.Vector2 points, int pointCount, float thick, com.raylib.Raylib.Color color) {
        Raylib.DrawSplineBezierCubic(points, pointCount, thick, color);
    }

    public static java.lang.String getFileNameWithoutExt(java.lang.String filePath) {
        return Raylib.GetFileNameWithoutExt(filePath);
    }

    public static org.bytedeco.javacpp.BytePointer getFileNameWithoutExt(org.bytedeco.javacpp.BytePointer filePath) {
        return Raylib.GetFileNameWithoutExt(filePath);
    }

    public static int getGamepadButtonPressed() {
        return Raylib.GetGamepadButtonPressed();
    }

    public static void drawRectangleGradientH(int posX, int posY, int width, int height, com.raylib.Raylib.Color left, com.raylib.Raylib.Color right) {
        Raylib.DrawRectangleGradientH(posX, posY, width, height, left, right);
    }

    public static void drawSplineSegmentBasis(com.raylib.Raylib.Vector2 p1, com.raylib.Raylib.Vector2 p2, com.raylib.Raylib.Vector2 p3, com.raylib.Raylib.Vector2 p4, float thick, com.raylib.Raylib.Color color) {
        Raylib.DrawSplineSegmentBasis(p1, p2, p3, p4, thick, color);
    }

    public static boolean checkCollisionCircles(com.raylib.Raylib.Vector2 center1, float radius1, com.raylib.Raylib.Vector2 center2, float radius2) {
        return Raylib.CheckCollisionCircles(center1, radius1, center2, radius2);
    }

    public static float getGamepadAxisMovement(int gamepad, int axis) {
        return Raylib.GetGamepadAxisMovement(gamepad, axis);
    }

    public static boolean checkCollisionCircleRec(com.raylib.Raylib.Vector2 center, float radius, com.raylib.Raylib.Rectangle rec) {
        return Raylib.CheckCollisionCircleRec(center, radius, rec);
    }

    public static boolean isMouseButtonPressed(int button) {
        return Raylib.IsMouseButtonPressed(button);
    }

    public static void setLoadFileTextCallback(com.raylib.Raylib.LoadFileTextCallback callback) {
        Raylib.SetLoadFileTextCallback(callback);
    }

    public static void drawRectangleRoundedLines(com.raylib.Raylib.Rectangle rec, float roundness, int segments, com.raylib.Raylib.Color color) {
        Raylib.DrawRectangleRoundedLines(rec, roundness, segments, color);
    }

    public static com.raylib.Raylib.Vector2 getSplinePointBezierQuad(com.raylib.Raylib.Vector2 p1, com.raylib.Raylib.Vector2 c2, com.raylib.Raylib.Vector2 p3, float t) {
        return Raylib.GetSplinePointBezierQuad(p1, c2, p3, t);
    }

    public static boolean checkCollisionCircleLine(com.raylib.Raylib.Vector2 center, float radius, com.raylib.Raylib.Vector2 p1, com.raylib.Raylib.Vector2 p2) {
        return Raylib.CheckCollisionCircleLine(center, radius, p1, p2);
    }

    public static boolean checkCollisionPointLine(com.raylib.Raylib.Vector2 point, com.raylib.Raylib.Vector2 p1, com.raylib.Raylib.Vector2 p2, int threshold) {
        return Raylib.CheckCollisionPointLine(point, p1, p2, threshold);
    }

    public static com.raylib.Raylib.Vector2 getSplinePointLinear(com.raylib.Raylib.Vector2 startPos, com.raylib.Raylib.Vector2 endPos, float t) {
        return Raylib.GetSplinePointLinear(startPos, endPos, t);
    }

    public static void unloadModelAnimations(com.raylib.Raylib.ModelAnimation animations, int animCount) {
        Raylib.UnloadModelAnimations(animations, animCount);
    }

    public static com.raylib.Raylib.RayCollision getRayCollisionQuad(com.raylib.Raylib.Ray ray, com.raylib.Raylib.Vector3 p1, com.raylib.Raylib.Vector3 p2, com.raylib.Raylib.Vector3 p3, com.raylib.Raylib.Vector3 p4) {
        return Raylib.GetRayCollisionQuad(ray, p1, p2, p3, p4);
    }

    public static com.raylib.Raylib.RayCollision getRayCollisionTriangle(com.raylib.Raylib.Ray ray, com.raylib.Raylib.Vector3 p1, com.raylib.Raylib.Vector3 p2, com.raylib.Raylib.Vector3 p3) {
        return Raylib.GetRayCollisionTriangle(ray, p1, p2, p3);
    }

    public static boolean isAudioStreamPlaying(com.raylib.Raylib.AudioStream stream) {
        return Raylib.IsAudioStreamPlaying(stream);
    }

    public static boolean checkCollisionSpheres(com.raylib.Raylib.Vector3 center1, float radius1, com.raylib.Raylib.Vector3 center2, float radius2) {
        return Raylib.CheckCollisionSpheres(center1, radius1, center2, radius2);
    }

    public static void detachAudioStreamProcessor(com.raylib.Raylib.AudioStream stream, com.raylib.Raylib.AudioCallback processor) {
        Raylib.DetachAudioStreamProcessor(stream, processor);
    }

    public static void attachAudioMixedProcessor(com.raylib.Raylib.AudioCallback processor) {
        Raylib.AttachAudioMixedProcessor(processor);
    }

    public static double rlGetCullDistanceNear() {
        return Raylib.rlGetCullDistanceNear();
    }

    public static void detachAudioMixedProcessor(com.raylib.Raylib.AudioCallback processor) {
        Raylib.DetachAudioMixedProcessor(processor);
    }

    public static void updateModelAnimation(com.raylib.Raylib.Model model, com.raylib.Raylib.ModelAnimation anim, int frame) {
        Raylib.UpdateModelAnimation(model, anim, frame);
    }

    public static void imageDrawRectangleLines(com.raylib.Raylib.Image dst, com.raylib.Raylib.Rectangle rec, int thick, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawRectangleLines(dst, rec, thick, color);
    }

    public static double rlGetCullDistanceFar() {
        return Raylib.rlGetCullDistanceFar();
    }

    public static boolean rlEnableVertexArray(int arg0) {
        return Raylib.rlEnableVertexArray(arg0);
    }

    public static void rlDisableVertexArray() {
        Raylib.rlDisableVertexArray();
    }

    public static com.raylib.Raylib.Image genImageGradientRadial(int width, int height, float density, com.raylib.Raylib.Color inner, com.raylib.Raylib.Color outer) {
        return Raylib.GenImageGradientRadial(width, height, density, inner, outer);
    }

    public static void imageDrawTriangleLines(com.raylib.Raylib.Image dst, com.raylib.Raylib.Vector2 v1, com.raylib.Raylib.Vector2 v2, com.raylib.Raylib.Vector2 v3, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawTriangleLines(dst, v1, v2, v3, color);
    }

    public static int getCodepointPrevious(org.bytedeco.javacpp.BytePointer text, java.nio.IntBuffer codepointSize) {
        return Raylib.GetCodepointPrevious(text, codepointSize);
    }

    public static int getCodepointPrevious(org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.IntPointer codepointSize) {
        return Raylib.GetCodepointPrevious(text, codepointSize);
    }

    public static int getCodepointPrevious(java.lang.String text, org.bytedeco.javacpp.IntPointer codepointSize) {
        return Raylib.GetCodepointPrevious(text, codepointSize);
    }

    public static int getCodepointPrevious(java.lang.String text, java.nio.IntBuffer codepointSize) {
        return Raylib.GetCodepointPrevious(text, codepointSize);
    }

    public static int getCodepointPrevious(java.lang.String text, int[] codepointSize) {
        return Raylib.GetCodepointPrevious(text, codepointSize);
    }

    public static int getCodepointPrevious(org.bytedeco.javacpp.BytePointer text, int[] codepointSize) {
        return Raylib.GetCodepointPrevious(text, codepointSize);
    }

    public static void setAudioStreamCallback(com.raylib.Raylib.AudioStream stream, com.raylib.Raylib.AudioCallback callback) {
        Raylib.SetAudioStreamCallback(stream, callback);
    }

    public static com.raylib.Raylib.Image genImagePerlinNoise(int width, int height, int offsetX, int offsetY, float scale) {
        return Raylib.GenImagePerlinNoise(width, height, offsetX, offsetY, scale);
    }

    public static void imageDrawTriangleStrip(com.raylib.Raylib.Image dst, com.raylib.Raylib.Vector2 points, int pointCount, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawTriangleStrip(dst, points, pointCount, color);
    }

    public static void imageDrawRectangleRec(com.raylib.Raylib.Image dst, com.raylib.Raylib.Rectangle rec, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawRectangleRec(dst, rec, color);
    }

    public static com.raylib.Raylib.Rectangle getImageAlphaBorder(com.raylib.Raylib.Image image, float threshold) {
        return Raylib.GetImageAlphaBorder(image, threshold);
    }

    public static void drawCylinderWiresEx(com.raylib.Raylib.Vector3 startPos, com.raylib.Raylib.Vector3 endPos, float startRadius, float endRadius, int sides, com.raylib.Raylib.Color color) {
        Raylib.DrawCylinderWiresEx(startPos, endPos, startRadius, endRadius, sides, color);
    }

    public static void imageDrawRectangleV(com.raylib.Raylib.Image dst, com.raylib.Raylib.Vector2 position, com.raylib.Raylib.Vector2 size, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawRectangleV(dst, position, size, color);
    }

    public static com.raylib.Raylib.BoundingBox getModelBoundingBox(com.raylib.Raylib.Model model) {
        return Raylib.GetModelBoundingBox(model);
    }

    public static void setModelMeshMaterial(com.raylib.Raylib.Model model, int meshId, int materialId) {
        Raylib.SetModelMeshMaterial(model, meshId, materialId);
    }

    public static void imageAlphaPremultiply(com.raylib.Raylib.Image image) {
        Raylib.ImageAlphaPremultiply(image);
    }

    public static boolean checkCollisionBoxes(com.raylib.Raylib.BoundingBox box1, com.raylib.Raylib.BoundingBox box2) {
        return Raylib.CheckCollisionBoxes(box1, box2);
    }

    public static com.raylib.Raylib.RayCollision getRayCollisionSphere(com.raylib.Raylib.Ray ray, com.raylib.Raylib.Vector3 center, float radius) {
        return Raylib.GetRayCollisionSphere(ray, center, radius);
    }

    public static com.raylib.Raylib.Music loadMusicStreamFromMemory(org.bytedeco.javacpp.BytePointer fileType, org.bytedeco.javacpp.BytePointer data, int dataSize) {
        return Raylib.LoadMusicStreamFromMemory(fileType, data, dataSize);
    }

    public static com.raylib.Raylib.Music loadMusicStreamFromMemory(java.lang.String fileType, byte[] data, int dataSize) {
        return Raylib.LoadMusicStreamFromMemory(fileType, data, dataSize);
    }

    public static com.raylib.Raylib.Music loadMusicStreamFromMemory(java.lang.String fileType, org.bytedeco.javacpp.BytePointer data, int dataSize) {
        return Raylib.LoadMusicStreamFromMemory(fileType, data, dataSize);
    }

    public static com.raylib.Raylib.Music loadMusicStreamFromMemory(org.bytedeco.javacpp.BytePointer fileType, java.nio.ByteBuffer data, int dataSize) {
        return Raylib.LoadMusicStreamFromMemory(fileType, data, dataSize);
    }

    public static com.raylib.Raylib.Music loadMusicStreamFromMemory(java.lang.String fileType, java.nio.ByteBuffer data, int dataSize) {
        return Raylib.LoadMusicStreamFromMemory(fileType, data, dataSize);
    }

    public static com.raylib.Raylib.Music loadMusicStreamFromMemory(org.bytedeco.javacpp.BytePointer fileType, byte[] data, int dataSize) {
        return Raylib.LoadMusicStreamFromMemory(fileType, data, dataSize);
    }

    public static void imageFlipHorizontal(com.raylib.Raylib.Image image) {
        Raylib.ImageFlipHorizontal(image);
    }

    public static void unloadModelAnimation(com.raylib.Raylib.ModelAnimation anim) {
        Raylib.UnloadModelAnimation(anim);
    }

    public static com.raylib.Raylib.Texture loadTextureFromImage(com.raylib.Raylib.Image image) {
        return Raylib.LoadTextureFromImage(image);
    }

    public static boolean isRenderTextureValid(com.raylib.Raylib.RenderTexture target) {
        return Raylib.IsRenderTextureValid(target);
    }

    public static void attachAudioStreamProcessor(com.raylib.Raylib.AudioStream stream, com.raylib.Raylib.AudioCallback processor) {
        Raylib.AttachAudioStreamProcessor(stream, processor);
    }

    public static boolean isModelAnimationValid(com.raylib.Raylib.Model model, com.raylib.Raylib.ModelAnimation anim) {
        return Raylib.IsModelAnimationValid(model, anim);
    }

    public static void unloadRenderTexture(com.raylib.Raylib.RenderTexture target) {
        Raylib.UnloadRenderTexture(target);
    }

    public static void imageColorBrightness(com.raylib.Raylib.Image image, int brightness) {
        Raylib.ImageColorBrightness(image, brightness);
    }

    public static void imageDrawCircleLinesV(com.raylib.Raylib.Image dst, com.raylib.Raylib.Vector2 center, int radius, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawCircleLinesV(dst, center, radius, color);
    }

    public static com.raylib.Raylib.Material loadMaterialDefault() {
        return Raylib.LoadMaterialDefault();
    }

    public static void updateModelAnimationBones(com.raylib.Raylib.Model model, com.raylib.Raylib.ModelAnimation anim, int frame) {
        Raylib.UpdateModelAnimationBones(model, anim, frame);
    }

    public static boolean checkCollisionBoxSphere(com.raylib.Raylib.BoundingBox box, com.raylib.Raylib.Vector3 center, float radius) {
        return Raylib.CheckCollisionBoxSphere(box, center, radius);
    }

    public static com.raylib.Raylib.RayCollision getRayCollisionMesh(com.raylib.Raylib.Ray ray, com.raylib.Raylib.Mesh mesh, com.raylib.Raylib.Matrix transform) {
        return Raylib.GetRayCollisionMesh(ray, mesh, transform);
    }

    public static com.raylib.Raylib.ModelAnimation loadModelAnimations(java.lang.String fileName, java.nio.IntBuffer animCount) {
        return Raylib.LoadModelAnimations(fileName, animCount);
    }

    public static com.raylib.Raylib.ModelAnimation loadModelAnimations(org.bytedeco.javacpp.BytePointer fileName, org.bytedeco.javacpp.IntPointer animCount) {
        return Raylib.LoadModelAnimations(fileName, animCount);
    }

    public static com.raylib.Raylib.ModelAnimation loadModelAnimations(java.lang.String fileName, int[] animCount) {
        return Raylib.LoadModelAnimations(fileName, animCount);
    }

    public static com.raylib.Raylib.ModelAnimation loadModelAnimations(org.bytedeco.javacpp.BytePointer fileName, java.nio.IntBuffer animCount) {
        return Raylib.LoadModelAnimations(fileName, animCount);
    }

    public static com.raylib.Raylib.ModelAnimation loadModelAnimations(java.lang.String fileName, org.bytedeco.javacpp.IntPointer animCount) {
        return Raylib.LoadModelAnimations(fileName, animCount);
    }

    public static com.raylib.Raylib.ModelAnimation loadModelAnimations(org.bytedeco.javacpp.BytePointer fileName, int[] animCount) {
        return Raylib.LoadModelAnimations(fileName, animCount);
    }

    public static boolean isMusicStreamPlaying(com.raylib.Raylib.Music music) {
        return Raylib.IsMusicStreamPlaying(music);
    }

    public static boolean isAudioStreamProcessed(com.raylib.Raylib.AudioStream stream) {
        return Raylib.IsAudioStreamProcessed(stream);
    }

    public static void setAudioStreamVolume(com.raylib.Raylib.AudioStream stream, float volume) {
        Raylib.SetAudioStreamVolume(stream, volume);
    }

    public static void setAudioStreamPitch(com.raylib.Raylib.AudioStream stream, float pitch) {
        Raylib.SetAudioStreamPitch(stream, pitch);
    }

    public static com.raylib.Raylib.Image genImageGradientSquare(int width, int height, float density, com.raylib.Raylib.Color inner, com.raylib.Raylib.Color outer) {
        return Raylib.GenImageGradientSquare(width, height, density, inner, outer);
    }

    public static void imageColorGrayscale(com.raylib.Raylib.Image image) {
        Raylib.ImageColorGrayscale(image);
    }

    public static void imageDrawTriangleEx(com.raylib.Raylib.Image dst, com.raylib.Raylib.Vector2 v1, com.raylib.Raylib.Vector2 v2, com.raylib.Raylib.Vector2 v3, com.raylib.Raylib.Color c1, com.raylib.Raylib.Color c2, com.raylib.Raylib.Color c3) {
        Raylib.ImageDrawTriangleEx(dst, v1, v2, v3, c1, c2, c3);
    }

    public static com.raylib.Raylib.Color colorFromNormalized(com.raylib.Raylib.Vector4 normalized) {
        return Raylib.ColorFromNormalized(normalized);
    }

    public static void imageKernelConvolution(com.raylib.Raylib.Image image, java.nio.FloatBuffer kernel, int kernelSize) {
        Raylib.ImageKernelConvolution(image, kernel, kernelSize);
    }

    public static void imageKernelConvolution(com.raylib.Raylib.Image image, org.bytedeco.javacpp.FloatPointer kernel, int kernelSize) {
        Raylib.ImageKernelConvolution(image, kernel, kernelSize);
    }

    public static void imageKernelConvolution(com.raylib.Raylib.Image image, float[] kernel, int kernelSize) {
        Raylib.ImageKernelConvolution(image, kernel, kernelSize);
    }

    public static void imageClearBackground(com.raylib.Raylib.Image dst, com.raylib.Raylib.Color color) {
        Raylib.ImageClearBackground(dst, color);
    }

    public static void imageDrawCircleLines(com.raylib.Raylib.Image dst, int centerX, int centerY, int radius, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawCircleLines(dst, centerX, centerY, radius, color);
    }

    public static void drawTriangleStrip3D(com.raylib.Raylib.Vector3 points, int pointCount, com.raylib.Raylib.Color color) {
        Raylib.DrawTriangleStrip3D(points, pointCount, color);
    }

    public static void imageDrawTriangleFan(com.raylib.Raylib.Image dst, com.raylib.Raylib.Vector2 points, int pointCount, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawTriangleFan(dst, points, pointCount, color);
    }

    public static int rlGetShaderBufferSize(int arg0) {
        return Raylib.rlGetShaderBufferSize(arg0);
    }

    public static com.raylib.Raylib.Matrix rlGetMatrixModelview() {
        return Raylib.rlGetMatrixModelview();
    }

    public static void rlSetVertexAttribute(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        Raylib.rlSetVertexAttribute(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void rlDisableVertexAttribute(int arg0) {
        Raylib.rlDisableVertexAttribute(arg0);
    }

    public static void rlDisableColorBlend() {
        Raylib.rlDisableColorBlend();
    }

    public static void rlComputeShaderDispatch(int arg0, int arg1, int arg2) {
        Raylib.rlComputeShaderDispatch(arg0, arg1, arg2);
    }

    public static void rlEnableBackfaceCulling() {
        Raylib.rlEnableBackfaceCulling();
    }

    public static void rlSetFramebufferHeight(int arg0) {
        Raylib.rlSetFramebufferHeight(arg0);
    }

    public static int rlGetTextureIdDefault() {
        return Raylib.rlGetTextureIdDefault();
    }

    public static void rlEnableVertexBuffer(int arg0) {
        Raylib.rlEnableVertexBuffer(arg0);
    }

    public static void rlActiveTextureSlot(int arg0) {
        Raylib.rlActiveTextureSlot(arg0);
    }

    public static void rlDisableStereoRender() {
        Raylib.rlDisableStereoRender();
    }

    public static void rlEnableSmoothLines() {
        Raylib.rlEnableSmoothLines();
    }

    public static int rlLoadVertexBufferElement(org.bytedeco.javacpp.Pointer arg0, int arg1, boolean arg2) {
        return Raylib.rlLoadVertexBufferElement(arg0, arg1, arg2);
    }

    public static void rlUnloadVertexBuffer(int arg0) {
        Raylib.rlUnloadVertexBuffer(arg0);
    }

    public static void rlGenTextureMipmaps(int arg0, int arg1, int arg2, int arg3, org.bytedeco.javacpp.IntPointer arg4) {
        Raylib.rlGenTextureMipmaps(arg0, arg1, arg2, arg3, arg4);
    }

    public static void rlGenTextureMipmaps(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        Raylib.rlGenTextureMipmaps(arg0, arg1, arg2, arg3, arg4);
    }

    public static void rlGenTextureMipmaps(int arg0, int arg1, int arg2, int arg3, java.nio.IntBuffer arg4) {
        Raylib.rlGenTextureMipmaps(arg0, arg1, arg2, arg3, arg4);
    }

    public static void rlFramebufferAttach(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Raylib.rlFramebufferAttach(arg0, arg1, arg2, arg3, arg4);
    }

    public static void rlClearScreenBuffers() {
        Raylib.rlClearScreenBuffers();
    }

    public static int rlGetFramebufferWidth() {
        return Raylib.rlGetFramebufferWidth();
    }

    public static org.bytedeco.javacpp.BytePointer rlGetPixelFormatName(int arg0) {
        return Raylib.rlGetPixelFormatName(arg0);
    }

    public static void rlDrawRenderBatchActive() {
        Raylib.rlDrawRenderBatchActive();
    }

    public static void rlEnableVertexAttribute(int arg0) {
        Raylib.rlEnableVertexAttribute(arg0);
    }

    public static void rlSetRenderBatchActive(com.raylib.Raylib.rlRenderBatch arg0) {
        Raylib.rlSetRenderBatchActive(arg0);
    }

    public static void rlSetFramebufferWidth(int arg0) {
        Raylib.rlSetFramebufferWidth(arg0);
    }

    public static void rlEnableScissorTest() {
        Raylib.rlEnableScissorTest();
    }

    public static void rlEnableFramebuffer(int arg0) {
        Raylib.rlEnableFramebuffer(arg0);
    }

    public static void rlDisableSmoothLines() {
        Raylib.rlDisableSmoothLines();
    }

    public static void rlDisableFramebuffer() {
        Raylib.rlDisableFramebuffer();
    }

    public static void rlUnloadVertexArray(int arg0) {
        Raylib.rlUnloadVertexArray(arg0);
    }

    public static void rlEnableTextureCubemap(int arg0) {
        Raylib.rlEnableTextureCubemap(arg0);
    }

    public static int rlLoadTextureCubemap(org.bytedeco.javacpp.Pointer arg0, int arg1, int arg2, int arg3) {
        return Raylib.rlLoadTextureCubemap(arg0, arg1, arg2, arg3);
    }

    public static void rlGetGlTextureFormats(int arg0, java.nio.IntBuffer arg1, java.nio.IntBuffer arg2, java.nio.IntBuffer arg3) {
        Raylib.rlGetGlTextureFormats(arg0, arg1, arg2, arg3);
    }

    public static void rlGetGlTextureFormats(int arg0, org.bytedeco.javacpp.IntPointer arg1, org.bytedeco.javacpp.IntPointer arg2, org.bytedeco.javacpp.IntPointer arg3) {
        Raylib.rlGetGlTextureFormats(arg0, arg1, arg2, arg3);
    }

    public static void rlGetGlTextureFormats(int arg0, int[] arg1, int[] arg2, int[] arg3) {
        Raylib.rlGetGlTextureFormats(arg0, arg1, arg2, arg3);
    }

    public static void rlUnloadFramebuffer(int arg0) {
        Raylib.rlUnloadFramebuffer(arg0);
    }

    public static void rlDrawVertexArrayElements(int arg0, int arg1, org.bytedeco.javacpp.Pointer arg2) {
        Raylib.rlDrawVertexArrayElements(arg0, arg1, arg2);
    }

    public static org.bytedeco.javacpp.Pointer rlReadTexturePixels(int arg0, int arg1, int arg2, int arg3) {
        return Raylib.rlReadTexturePixels(arg0, arg1, arg2, arg3);
    }

    public static void rlDisableBackfaceCulling() {
        Raylib.rlDisableBackfaceCulling();
    }

    public static void rlDisableScissorTest() {
        Raylib.rlDisableScissorTest();
    }

    public static int rlLoadShaderProgram(int arg0, int arg1) {
        return Raylib.rlLoadShaderProgram(arg0, arg1);
    }

    public static void rlSetUniformMatrices(int arg0, com.raylib.Raylib.Matrix arg1, int arg2) {
        Raylib.rlSetUniformMatrices(arg0, arg1, arg2);
    }

    public static void rlTextureParameters(int arg0, int arg1, int arg2) {
        Raylib.rlTextureParameters(arg0, arg1, arg2);
    }

    public static void rlDrawVertexArrayInstanced(int arg0, int arg1, int arg2) {
        Raylib.rlDrawVertexArrayInstanced(arg0, arg1, arg2);
    }

    public static void rlUnloadShaderProgram(int arg0) {
        Raylib.rlUnloadShaderProgram(arg0);
    }

    public static int rlLoadComputeShaderProgram(int arg0) {
        return Raylib.rlLoadComputeShaderProgram(arg0);
    }

    public static void rlUnloadShaderBuffer(int arg0) {
        Raylib.rlUnloadShaderBuffer(arg0);
    }

    public static void rlEnableStereoRender() {
        Raylib.rlEnableStereoRender();
    }

    public static void rlUpdateVertexBuffer(int arg0, org.bytedeco.javacpp.Pointer arg1, int arg2, int arg3) {
        Raylib.rlUpdateVertexBuffer(arg0, arg1, arg2, arg3);
    }

    public static void rlActiveDrawBuffers(int arg0) {
        Raylib.rlActiveDrawBuffers(arg0);
    }

    public static int rlGetActiveFramebuffer() {
        return Raylib.rlGetActiveFramebuffer();
    }

    public static void rlSetBlendFactorsSeparate(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        Raylib.rlSetBlendFactorsSeparate(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void rlDisableVertexBuffer() {
        Raylib.rlDisableVertexBuffer();
    }

    public static int rlGetFramebufferHeight() {
        return Raylib.rlGetFramebufferHeight();
    }

    public static void rlUnloadRenderBatch(com.raylib.Raylib.rlRenderBatch arg0) {
        Raylib.rlUnloadRenderBatch(arg0);
    }

    public static boolean rlCheckRenderBatchLimit(int arg0) {
        return Raylib.rlCheckRenderBatchLimit(arg0);
    }

    public static int rlGetShaderIdDefault() {
        return Raylib.rlGetShaderIdDefault();
    }

    public static boolean rlFramebufferComplete(int arg0) {
        return Raylib.rlFramebufferComplete(arg0);
    }

    public static int rlGetLocationUniform(int arg0, java.lang.String arg1) {
        return Raylib.rlGetLocationUniform(arg0, arg1);
    }

    public static int rlGetLocationUniform(int arg0, org.bytedeco.javacpp.BytePointer arg1) {
        return Raylib.rlGetLocationUniform(arg0, arg1);
    }

    public static void rlCubemapParameters(int arg0, int arg1, int arg2) {
        Raylib.rlCubemapParameters(arg0, arg1, arg2);
    }

    public static void rlDisableTextureCubemap() {
        Raylib.rlDisableTextureCubemap();
    }

    public static org.bytedeco.javacpp.IntPointer rlGetShaderLocsDefault() {
        return Raylib.rlGetShaderLocsDefault();
    }

    public static int rlGetLocationAttrib(int arg0, org.bytedeco.javacpp.BytePointer arg1) {
        return Raylib.rlGetLocationAttrib(arg0, arg1);
    }

    public static int rlGetLocationAttrib(int arg0, java.lang.String arg1) {
        return Raylib.rlGetLocationAttrib(arg0, arg1);
    }

    public static boolean rlIsStereoRenderEnabled() {
        return Raylib.rlIsStereoRenderEnabled();
    }

    public static void rlSetUniformSampler(int arg0, int arg1) {
        Raylib.rlSetUniformSampler(arg0, arg1);
    }

    public static void rlUpdateShaderBuffer(int arg0, org.bytedeco.javacpp.Pointer arg1, int arg2, int arg3) {
        Raylib.rlUpdateShaderBuffer(arg0, arg1, arg2, arg3);
    }

    public static void setPhysicsBodyRotation(com.raylib.Raylib.PhysicsBody arg0, float arg1) {
        Raylib.SetPhysicsBodyRotation(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 vector3CubicHermite(com.raylib.Raylib.Vector3 v1, com.raylib.Raylib.Vector3 tangent1, com.raylib.Raylib.Vector3 v2, com.raylib.Raylib.Vector3 tangent2, float amount) {
        return Raylib.Vector3CubicHermite(v1, tangent1, v2, tangent2, amount);
    }

    public static com.raylib.Raylib.Vector4 quaternionTransform(com.raylib.Raylib.Vector4 q, com.raylib.Raylib.Matrix mat) {
        return Raylib.QuaternionTransform(q, mat);
    }

    public static com.raylib.Raylib.PhysicsBody createPhysicsBodyPolygon(com.raylib.Raylib.Vector2 arg0, float arg1, int arg2, float arg3) {
        return Raylib.CreatePhysicsBodyPolygon(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.Vector4 quaternionFromMatrix(com.raylib.Raylib.Matrix mat) {
        return Raylib.QuaternionFromMatrix(mat);
    }

    public static com.raylib.Raylib.Vector2 vector2SubtractValue(com.raylib.Raylib.Vector2 v, float sub) {
        return Raylib.Vector2SubtractValue(v, sub);
    }

    public static com.raylib.Raylib.PhysicsBody createPhysicsBodyRectangle(com.raylib.Raylib.Vector2 arg0, float arg1, float arg2, float arg3) {
        return Raylib.CreatePhysicsBodyRectangle(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.Vector4 quaternionFromAxisAngle(com.raylib.Raylib.Vector3 axis, float angle) {
        return Raylib.QuaternionFromAxisAngle(axis, angle);
    }

    public static com.raylib.Raylib.Vector4 vector4SubtractValue(com.raylib.Raylib.Vector4 v, float add) {
        return Raylib.Vector4SubtractValue(v, add);
    }

    public static void quaternionToAxisAngle(com.raylib.Raylib.Vector4 q, com.raylib.Raylib.Vector3 outAxis, org.bytedeco.javacpp.FloatPointer outAngle) {
        Raylib.QuaternionToAxisAngle(q, outAxis, outAngle);
    }

    public static void quaternionToAxisAngle(com.raylib.Raylib.Vector4 q, com.raylib.Raylib.Vector3 outAxis, java.nio.FloatBuffer outAngle) {
        Raylib.QuaternionToAxisAngle(q, outAxis, outAngle);
    }

    public static void quaternionToAxisAngle(com.raylib.Raylib.Vector4 q, com.raylib.Raylib.Vector3 outAxis, float[] outAngle) {
        Raylib.QuaternionToAxisAngle(q, outAxis, outAngle);
    }

    public static com.raylib.Raylib.Vector4 quaternionSubtractValue(com.raylib.Raylib.Vector4 q, float sub) {
        return Raylib.QuaternionSubtractValue(q, sub);
    }

    public static com.raylib.Raylib.Vector4 quaternionFromEuler(float pitch, float yaw, float roll) {
        return Raylib.QuaternionFromEuler(pitch, yaw, roll);
    }

    public static int getPhysicsShapeType(int arg0) {
        return Raylib.GetPhysicsShapeType(arg0);
    }

    public static com.raylib.Raylib.Vector2 getPhysicsShapeVertex(com.raylib.Raylib.PhysicsBody arg0, int arg1) {
        return Raylib.GetPhysicsShapeVertex(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 vector3RotateByQuaternion(com.raylib.Raylib.Vector3 v, com.raylib.Raylib.Vector4 q) {
        return Raylib.Vector3RotateByQuaternion(v, q);
    }

    public static com.raylib.Raylib.Matrix rlGetMatrixProjection() {
        return Raylib.rlGetMatrixProjection();
    }

    public static com.raylib.Raylib.Vector4 quaternionNormalize(com.raylib.Raylib.Vector4 q) {
        return Raylib.QuaternionNormalize(q);
    }

    public static void rlSetMatrixProjection(com.raylib.Raylib.Matrix arg0) {
        Raylib.rlSetMatrixProjection(arg0);
    }

    public static void guiLoadStyleDefault() {
        Raylib.GuiLoadStyleDefault();
    }

    public static com.raylib.Raylib.Vector3 vector3SubtractValue(com.raylib.Raylib.Vector3 v, float sub) {
        return Raylib.Vector3SubtractValue(v, sub);
    }

    public static com.raylib.Raylib.Vector3 vector3CrossProduct(com.raylib.Raylib.Vector3 v1, com.raylib.Raylib.Vector3 v2) {
        return Raylib.Vector3CrossProduct(v1, v2);
    }

    public static com.raylib.Raylib.Vector3 vector3Perpendicular(com.raylib.Raylib.Vector3 v) {
        return Raylib.Vector3Perpendicular(v);
    }

    public static int getPhysicsBodiesCount() {
        return Raylib.GetPhysicsBodiesCount();
    }

    public static void rlSetMatrixModelview(com.raylib.Raylib.Matrix arg0) {
        Raylib.rlSetMatrixModelview(arg0);
    }

    public static void vector3OrthoNormalize(com.raylib.Raylib.Vector3 v1, com.raylib.Raylib.Vector3 v2) {
        Raylib.Vector3OrthoNormalize(v1, v2);
    }

    public static com.raylib.Raylib.Matrix rlGetMatrixTransform() {
        return Raylib.rlGetMatrixTransform();
    }

    public static com.raylib.Raylib.PhysicsBody createPhysicsBodyCircle(com.raylib.Raylib.Vector2 arg0, float arg1, float arg2) {
        return Raylib.CreatePhysicsBodyCircle(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Vector3 vector3RotateByAxisAngle(com.raylib.Raylib.Vector3 v, com.raylib.Raylib.Vector3 axis, float angle) {
        return Raylib.Vector3RotateByAxisAngle(v, axis, angle);
    }

    public static double getTime() {
        return Raylib.GetTime();
    }

    public static org.bytedeco.javacpp.Pointer memAlloc(int size) {
        return Raylib.MemAlloc(size);
    }

    public static int[] computeMD5(byte[] data, int dataSize) {
        return Raylib.ComputeMD5(data, dataSize);
    }

    public static org.bytedeco.javacpp.IntPointer computeMD5(org.bytedeco.javacpp.BytePointer data, int dataSize) {
        return Raylib.ComputeMD5(data, dataSize);
    }

    public static java.nio.IntBuffer computeMD5(java.nio.ByteBuffer data, int dataSize) {
        return Raylib.ComputeMD5(data, dataSize);
    }

    public static void openURL(java.lang.String url) {
        Raylib.OpenURL(url);
    }

    public static void openURL(org.bytedeco.javacpp.BytePointer url) {
        Raylib.OpenURL(url);
    }

    public static boolean isKeyDown(int key) {
        return Raylib.IsKeyDown(key);
    }

    public static boolean isKeyUp(int key) {
        return Raylib.IsKeyUp(key);
    }

    public static void setExitKey(int key) {
        Raylib.SetExitKey(key);
    }

    public static void showCursor() {
        Raylib.ShowCursor();
    }

    public static void endDrawing() {
        Raylib.EndDrawing();
    }

    public static void endMode2D() {
        Raylib.EndMode2D();
    }

    public static com.raylib.Raylib.Shader loadShader(java.lang.String vsFileName, java.lang.String fsFileName) {
        return Raylib.LoadShader(vsFileName, fsFileName);
    }

    public static com.raylib.Raylib.Shader loadShader(org.bytedeco.javacpp.BytePointer vsFileName, org.bytedeco.javacpp.BytePointer fsFileName) {
        return Raylib.LoadShader(vsFileName, fsFileName);
    }

    public static void endMode3D() {
        Raylib.EndMode3D();
    }

    public static void hideCursor() {
        Raylib.HideCursor();
    }

    public static org.bytedeco.javacpp.Pointer memRealloc(org.bytedeco.javacpp.Pointer ptr, int size) {
        return Raylib.MemRealloc(ptr, size);
    }

    public static void memFree(org.bytedeco.javacpp.Pointer ptr) {
        Raylib.MemFree(ptr);
    }

    public static int getFPS() {
        return Raylib.GetFPS();
    }

    public static void initWindow(int width, int height, java.lang.String title) {
        Raylib.InitWindow(width, height, title);
    }

    public static void initWindow(int width, int height, org.bytedeco.javacpp.BytePointer title) {
        Raylib.InitWindow(width, height, title);
    }

    public static void waitTime(double seconds) {
        Raylib.WaitTime(seconds);
    }

    public static void traceLog(int logLevel, java.lang.String text) {
        Raylib.TraceLog(logLevel, text);
    }

    public static void traceLog(int logLevel, org.bytedeco.javacpp.BytePointer text) {
        Raylib.TraceLog(logLevel, text);
    }

    public static boolean fileExists(java.lang.String fileName) {
        return Raylib.FileExists(fileName);
    }

    public static boolean fileExists(org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.FileExists(fileName);
    }

    public static boolean isPathFile(java.lang.String path) {
        return Raylib.IsPathFile(path);
    }

    public static boolean isPathFile(org.bytedeco.javacpp.BytePointer path) {
        return Raylib.IsPathFile(path);
    }

    public static void drawPoly(com.raylib.Raylib.Vector2 center, int sides, float radius, float rotation, com.raylib.Raylib.Color color) {
        Raylib.DrawPoly(center, sides, radius, rotation, color);
    }

    public static void drawPixelV(com.raylib.Raylib.Vector2 position, com.raylib.Raylib.Color color) {
        Raylib.DrawPixelV(position, color);
    }

    public static com.raylib.Raylib.Image loadImage(org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.LoadImage(fileName);
    }

    public static com.raylib.Raylib.Image loadImage(java.lang.String fileName) {
        return Raylib.LoadImage(fileName);
    }

    public static com.raylib.Raylib.Image imageCopy(com.raylib.Raylib.Image image) {
        return Raylib.ImageCopy(image);
    }

    public static int getMouseY() {
        return Raylib.GetMouseY();
    }

    public static int getMouseX() {
        return Raylib.GetMouseX();
    }

    public static com.raylib.Raylib.Image imageText(java.lang.String text, int fontSize, com.raylib.Raylib.Color color) {
        return Raylib.ImageText(text, fontSize, color);
    }

    public static com.raylib.Raylib.Image imageText(org.bytedeco.javacpp.BytePointer text, int fontSize, com.raylib.Raylib.Color color) {
        return Raylib.ImageText(text, fontSize, color);
    }

    public static void drawLineEx(com.raylib.Raylib.Vector2 startPos, com.raylib.Raylib.Vector2 endPos, float thick, com.raylib.Raylib.Color color) {
        Raylib.DrawLineEx(startPos, endPos, thick, color);
    }

    public static int getTouchY() {
        return Raylib.GetTouchY();
    }

    public static void imageToPOT(com.raylib.Raylib.Image image, com.raylib.Raylib.Color fill) {
        Raylib.ImageToPOT(image, fill);
    }

    public static void imageCrop(com.raylib.Raylib.Image image, com.raylib.Raylib.Rectangle crop) {
        Raylib.ImageCrop(image, crop);
    }

    public static int getTouchX() {
        return Raylib.GetTouchX();
    }

    public static void drawPixel(int posX, int posY, com.raylib.Raylib.Color color) {
        Raylib.DrawPixel(posX, posY, color);
    }

    public static void drawLine(int startPosX, int startPosY, int endPosX, int endPosY, com.raylib.Raylib.Color color) {
        Raylib.DrawLine(startPosX, startPosY, endPosX, endPosY, color);
    }

    public static void drawLineV(com.raylib.Raylib.Vector2 startPos, com.raylib.Raylib.Vector2 endPos, com.raylib.Raylib.Color color) {
        Raylib.DrawLineV(startPos, endPos, color);
    }

    public static void drawCircle(int centerX, int centerY, float radius, com.raylib.Raylib.Color color) {
        Raylib.DrawCircle(centerX, centerY, radius, color);
    }

    public static void drawRing(com.raylib.Raylib.Vector2 center, float innerRadius, float outerRadius, float startAngle, float endAngle, int segments, com.raylib.Raylib.Color color) {
        Raylib.DrawRing(center, innerRadius, outerRadius, startAngle, endAngle, segments, color);
    }

    public static boolean isWindowFullscreen() {
        return Raylib.IsWindowFullscreen();
    }

    public static void closeWindow() {
        Raylib.CloseWindow();
    }

    public static void enableEventWaiting() {
        Raylib.EnableEventWaiting();
    }

    public static boolean isWindowState(int flag) {
        return Raylib.IsWindowState(flag);
    }

    public static org.bytedeco.javacpp.BytePointer getClipboardText() {
        return Raylib.GetClipboardText();
    }

    public static void beginTextureMode(com.raylib.Raylib.RenderTexture target) {
        Raylib.BeginTextureMode(target);
    }

    public static com.raylib.Raylib.Vector2 getWindowScaleDPI() {
        return Raylib.GetWindowScaleDPI();
    }

    public static void setWindowFocused() {
        Raylib.SetWindowFocused();
    }

    public static boolean isCursorHidden() {
        return Raylib.IsCursorHidden();
    }

    public static void beginShaderMode(com.raylib.Raylib.Shader shader) {
        Raylib.BeginShaderMode(shader);
    }

    public static void endBlendMode() {
        Raylib.EndBlendMode();
    }

    public static boolean isWindowResized() {
        return Raylib.IsWindowResized();
    }

    public static boolean isWindowMinimized() {
        return Raylib.IsWindowMinimized();
    }

    public static void toggleFullscreen() {
        Raylib.ToggleFullscreen();
    }

    public static void setWindowIcon(com.raylib.Raylib.Image image) {
        Raylib.SetWindowIcon(image);
    }

    public static org.bytedeco.javacpp.Pointer getWindowHandle() {
        return Raylib.GetWindowHandle();
    }

    public static int getMonitorCount() {
        return Raylib.GetMonitorCount();
    }

    public static void beginMode2D(com.raylib.Raylib.Camera2D camera) {
        Raylib.BeginMode2D(camera);
    }

    public static void setWindowOpacity(float opacity) {
        Raylib.SetWindowOpacity(opacity);
    }

    public static void maximizeWindow() {
        Raylib.MaximizeWindow();
    }

    public static boolean isWindowHidden() {
        return Raylib.IsWindowHidden();
    }

    public static int getMonitorHeight(int monitor) {
        return Raylib.GetMonitorHeight(monitor);
    }

    public static void setWindowMaxSize(int width, int height) {
        Raylib.SetWindowMaxSize(width, height);
    }

    public static void beginMode3D(com.raylib.Raylib.Camera3D camera) {
        Raylib.BeginMode3D(camera);
    }

    public static void endTextureMode() {
        Raylib.EndTextureMode();
    }

    public static void beginBlendMode(int mode) {
        Raylib.BeginBlendMode(mode);
    }

    public static void endShaderMode() {
        Raylib.EndShaderMode();
    }

    public static void setWindowMonitor(int monitor) {
        Raylib.SetWindowMonitor(monitor);
    }

    public static com.raylib.Raylib.Image getClipboardImage() {
        return Raylib.GetClipboardImage();
    }

    public static void setWindowIcons(com.raylib.Raylib.Image images, int count) {
        Raylib.SetWindowIcons(images, count);
    }

    public static void minimizeWindow() {
        Raylib.MinimizeWindow();
    }

    public static boolean isWindowFocused() {
        return Raylib.IsWindowFocused();
    }

    public static void restoreWindow() {
        Raylib.RestoreWindow();
    }

    public static void setWindowTitle(java.lang.String title) {
        Raylib.SetWindowTitle(title);
    }

    public static void setWindowTitle(org.bytedeco.javacpp.BytePointer title) {
        Raylib.SetWindowTitle(title);
    }

    public static void setWindowMinSize(int width, int height) {
        Raylib.SetWindowMinSize(width, height);
    }

    public static boolean isWindowReady() {
        return Raylib.IsWindowReady();
    }

    public static int getRenderWidth() {
        return Raylib.GetRenderWidth();
    }

    public static int getRenderHeight() {
        return Raylib.GetRenderHeight();
    }

    public static void setClipboardText(org.bytedeco.javacpp.BytePointer text) {
        Raylib.SetClipboardText(text);
    }

    public static void setClipboardText(java.lang.String text) {
        Raylib.SetClipboardText(text);
    }

    public static void enableCursor() {
        Raylib.EnableCursor();
    }

    public static void setWindowSize(int width, int height) {
        Raylib.SetWindowSize(width, height);
    }

    public static com.raylib.Raylib.Vector2 getWindowPosition() {
        return Raylib.GetWindowPosition();
    }

    public static void disableCursor() {
        Raylib.DisableCursor();
    }

    public static boolean isWindowMaximized() {
        return Raylib.IsWindowMaximized();
    }

    public static int getScreenWidth() {
        return Raylib.GetScreenWidth();
    }

    public static void clearWindowState(int flags) {
        Raylib.ClearWindowState(flags);
    }

    public static int getScreenHeight() {
        return Raylib.GetScreenHeight();
    }

    public static com.raylib.Raylib.Vector2 getMonitorPosition(int monitor) {
        return Raylib.GetMonitorPosition(monitor);
    }

    public static int getMonitorWidth(int monitor) {
        return Raylib.GetMonitorWidth(monitor);
    }

    public static void setWindowPosition(int x, int y) {
        Raylib.SetWindowPosition(x, y);
    }

    public static boolean windowShouldClose() {
        return Raylib.WindowShouldClose();
    }

    public static org.bytedeco.javacpp.BytePointer getMonitorName(int monitor) {
        return Raylib.GetMonitorName(monitor);
    }

    public static boolean isCursorOnScreen() {
        return Raylib.IsCursorOnScreen();
    }

    public static int getCurrentMonitor() {
        return Raylib.GetCurrentMonitor();
    }

    public static void clearBackground(com.raylib.Raylib.Color color) {
        Raylib.ClearBackground(color);
    }

    public static void beginDrawing() {
        Raylib.BeginDrawing();
    }

    public static void setWindowState(int flags) {
        Raylib.SetWindowState(flags);
    }

    public static com.raylib.Raylib.Vector2 getWorldToScreenEx(com.raylib.Raylib.Vector3 position, com.raylib.Raylib.Camera3D camera, int width, int height) {
        return Raylib.GetWorldToScreenEx(position, camera, width, height);
    }

    public static float getFrameTime() {
        return Raylib.GetFrameTime();
    }

    public static void setConfigFlags(int flags) {
        Raylib.SetConfigFlags(flags);
    }

    public static org.bytedeco.javacpp.BytePointer loadFileData(java.lang.String fileName, org.bytedeco.javacpp.IntPointer dataSize) {
        return Raylib.LoadFileData(fileName, dataSize);
    }

    public static org.bytedeco.javacpp.BytePointer loadFileData(org.bytedeco.javacpp.BytePointer fileName, org.bytedeco.javacpp.IntPointer dataSize) {
        return Raylib.LoadFileData(fileName, dataSize);
    }

    public static java.nio.ByteBuffer loadFileData(java.lang.String fileName, java.nio.IntBuffer dataSize) {
        return Raylib.LoadFileData(fileName, dataSize);
    }

    public static byte[] loadFileData(org.bytedeco.javacpp.BytePointer fileName, int[] dataSize) {
        return Raylib.LoadFileData(fileName, dataSize);
    }

    public static byte[] loadFileData(java.lang.String fileName, int[] dataSize) {
        return Raylib.LoadFileData(fileName, dataSize);
    }

    public static java.nio.ByteBuffer loadFileData(org.bytedeco.javacpp.BytePointer fileName, java.nio.IntBuffer dataSize) {
        return Raylib.LoadFileData(fileName, dataSize);
    }

    public static boolean isKeyPressedRepeat(int key) {
        return Raylib.IsKeyPressedRepeat(key);
    }

    public static void takeScreenshot(org.bytedeco.javacpp.BytePointer fileName) {
        Raylib.TakeScreenshot(fileName);
    }

    public static void takeScreenshot(java.lang.String fileName) {
        Raylib.TakeScreenshot(fileName);
    }

    public static int getCharPressed() {
        return Raylib.GetCharPressed();
    }

    public static com.raylib.Raylib.Vector2 getWorldToScreen(com.raylib.Raylib.Vector3 position, com.raylib.Raylib.Camera3D camera) {
        return Raylib.GetWorldToScreen(position, camera);
    }

    public static void pollInputEvents() {
        Raylib.PollInputEvents();
    }

    public static boolean exportDataAsCode(org.bytedeco.javacpp.BytePointer data, int dataSize, org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.ExportDataAsCode(data, dataSize, fileName);
    }

    public static boolean exportDataAsCode(org.bytedeco.javacpp.BytePointer data, int dataSize, java.lang.String fileName) {
        return Raylib.ExportDataAsCode(data, dataSize, fileName);
    }

    public static boolean exportDataAsCode(byte[] data, int dataSize, org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.ExportDataAsCode(data, dataSize, fileName);
    }

    public static boolean exportDataAsCode(java.nio.ByteBuffer data, int dataSize, org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.ExportDataAsCode(data, dataSize, fileName);
    }

    public static boolean exportDataAsCode(java.nio.ByteBuffer data, int dataSize, java.lang.String fileName) {
        return Raylib.ExportDataAsCode(data, dataSize, fileName);
    }

    public static boolean exportDataAsCode(byte[] data, int dataSize, java.lang.String fileName) {
        return Raylib.ExportDataAsCode(data, dataSize, fileName);
    }

    public static void unloadFileData(org.bytedeco.javacpp.BytePointer data) {
        Raylib.UnloadFileData(data);
    }

    public static void unloadFileData(java.nio.ByteBuffer data) {
        Raylib.UnloadFileData(data);
    }

    public static void unloadFileData(byte[] data) {
        Raylib.UnloadFileData(data);
    }

    public static void unloadFileText(org.bytedeco.javacpp.BytePointer text) {
        Raylib.UnloadFileText(text);
    }

    public static void unloadFileText(byte[] text) {
        Raylib.UnloadFileText(text);
    }

    public static void unloadFileText(java.nio.ByteBuffer text) {
        Raylib.UnloadFileText(text);
    }

    public static void setTraceLogLevel(int logLevel) {
        Raylib.SetTraceLogLevel(logLevel);
    }

    public static boolean saveFileText(java.lang.String fileName, org.bytedeco.javacpp.BytePointer text) {
        return Raylib.SaveFileText(fileName, text);
    }

    public static boolean saveFileText(org.bytedeco.javacpp.BytePointer fileName, java.nio.ByteBuffer text) {
        return Raylib.SaveFileText(fileName, text);
    }

    public static boolean saveFileText(org.bytedeco.javacpp.BytePointer fileName, org.bytedeco.javacpp.BytePointer text) {
        return Raylib.SaveFileText(fileName, text);
    }

    public static boolean saveFileText(java.lang.String fileName, byte[] text) {
        return Raylib.SaveFileText(fileName, text);
    }

    public static boolean saveFileText(java.lang.String fileName, java.nio.ByteBuffer text) {
        return Raylib.SaveFileText(fileName, text);
    }

    public static boolean saveFileText(org.bytedeco.javacpp.BytePointer fileName, byte[] text) {
        return Raylib.SaveFileText(fileName, text);
    }

    public static void swapScreenBuffer() {
        Raylib.SwapScreenBuffer();
    }

    public static java.lang.String getDirectoryPath(java.lang.String filePath) {
        return Raylib.GetDirectoryPath(filePath);
    }

    public static org.bytedeco.javacpp.BytePointer getDirectoryPath(org.bytedeco.javacpp.BytePointer filePath) {
        return Raylib.GetDirectoryPath(filePath);
    }

    public static boolean saveFileData(org.bytedeco.javacpp.BytePointer fileName, org.bytedeco.javacpp.Pointer data, int dataSize) {
        return Raylib.SaveFileData(fileName, data, dataSize);
    }

    public static boolean saveFileData(java.lang.String fileName, org.bytedeco.javacpp.Pointer data, int dataSize) {
        return Raylib.SaveFileData(fileName, data, dataSize);
    }

    public static boolean isFileNameValid(java.lang.String fileName) {
        return Raylib.IsFileNameValid(fileName);
    }

    public static boolean isFileNameValid(org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.IsFileNameValid(fileName);
    }

    public static void endScissorMode() {
        Raylib.EndScissorMode();
    }

    public static com.raylib.Raylib.FilePathList loadDroppedFiles() {
        return Raylib.LoadDroppedFiles();
    }

    public static void setShaderValue(com.raylib.Raylib.Shader shader, int locIndex, org.bytedeco.javacpp.Pointer value, int uniformType) {
        Raylib.SetShaderValue(shader, locIndex, value, uniformType);
    }

    public static void unloadShader(com.raylib.Raylib.Shader shader) {
        Raylib.UnloadShader(shader);
    }

    public static void setTargetFPS(int fps) {
        Raylib.SetTargetFPS(fps);
    }

    public static long getFileModTime(java.lang.String fileName) {
        return Raylib.GetFileModTime(fileName);
    }

    public static long getFileModTime(org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.GetFileModTime(fileName);
    }

    public static java.nio.ByteBuffer loadFileText(java.lang.String fileName) {
        return Raylib.LoadFileText(fileName);
    }

    public static org.bytedeco.javacpp.BytePointer loadFileText(org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.LoadFileText(fileName);
    }

    public static boolean isKeyPressed(int key) {
        return Raylib.IsKeyPressed(key);
    }

    public static boolean isKeyReleased(int key) {
        return Raylib.IsKeyReleased(key);
    }

    public static com.raylib.Raylib.Matrix getCameraMatrix2D(com.raylib.Raylib.Camera2D camera) {
        return Raylib.GetCameraMatrix2D(camera);
    }

    public static com.raylib.Raylib.Matrix getCameraMatrix(com.raylib.Raylib.Camera3D camera) {
        return Raylib.GetCameraMatrix(camera);
    }

    public static com.raylib.Raylib.Vector2 getWorldToScreen2D(com.raylib.Raylib.Vector2 position, com.raylib.Raylib.Camera2D camera) {
        return Raylib.GetWorldToScreen2D(position, camera);
    }

    public static boolean directoryExists(org.bytedeco.javacpp.BytePointer dirPath) {
        return Raylib.DirectoryExists(dirPath);
    }

    public static boolean directoryExists(java.lang.String dirPath) {
        return Raylib.DirectoryExists(dirPath);
    }

    public static boolean changeDirectory(org.bytedeco.javacpp.BytePointer dir) {
        return Raylib.ChangeDirectory(dir);
    }

    public static boolean changeDirectory(java.lang.String dir) {
        return Raylib.ChangeDirectory(dir);
    }

    public static com.raylib.Raylib.Vector2 getScreenToWorld2D(com.raylib.Raylib.Vector2 position, com.raylib.Raylib.Camera2D camera) {
        return Raylib.GetScreenToWorld2D(position, camera);
    }

    public static java.lang.String getFileName(java.lang.String filePath) {
        return Raylib.GetFileName(filePath);
    }

    public static org.bytedeco.javacpp.BytePointer getFileName(org.bytedeco.javacpp.BytePointer filePath) {
        return Raylib.GetFileName(filePath);
    }

    public static java.nio.ByteBuffer compressData(java.nio.ByteBuffer data, int dataSize, java.nio.IntBuffer compDataSize) {
        return Raylib.CompressData(data, dataSize, compDataSize);
    }

    public static byte[] compressData(byte[] data, int dataSize, int[] compDataSize) {
        return Raylib.CompressData(data, dataSize, compDataSize);
    }

    public static org.bytedeco.javacpp.BytePointer compressData(org.bytedeco.javacpp.BytePointer data, int dataSize, org.bytedeco.javacpp.IntPointer compDataSize) {
        return Raylib.CompressData(data, dataSize, compDataSize);
    }

    public static com.raylib.Raylib.FilePathList loadDirectoryFiles(org.bytedeco.javacpp.BytePointer dirPath) {
        return Raylib.LoadDirectoryFiles(dirPath);
    }

    public static com.raylib.Raylib.FilePathList loadDirectoryFiles(java.lang.String dirPath) {
        return Raylib.LoadDirectoryFiles(dirPath);
    }

    public static void beginScissorMode(int x, int y, int width, int height) {
        Raylib.BeginScissorMode(x, y, width, height);
    }

    public static int getRandomValue(int min, int max) {
        return Raylib.GetRandomValue(min, max);
    }

    public static void beginVrStereoMode(com.raylib.Raylib.VrStereoConfig config) {
        Raylib.BeginVrStereoMode(config);
    }

    public static com.raylib.Raylib.VrStereoConfig loadVrStereoConfig(com.raylib.Raylib.VrDeviceInfo device) {
        return Raylib.LoadVrStereoConfig(device);
    }

    public static int computeCRC32(java.nio.ByteBuffer data, int dataSize) {
        return Raylib.ComputeCRC32(data, dataSize);
    }

    public static int computeCRC32(org.bytedeco.javacpp.BytePointer data, int dataSize) {
        return Raylib.ComputeCRC32(data, dataSize);
    }

    public static int computeCRC32(byte[] data, int dataSize) {
        return Raylib.ComputeCRC32(data, dataSize);
    }

    public static org.bytedeco.javacpp.IntPointer computeSHA1(org.bytedeco.javacpp.BytePointer data, int dataSize) {
        return Raylib.ComputeSHA1(data, dataSize);
    }

    public static int[] computeSHA1(byte[] data, int dataSize) {
        return Raylib.ComputeSHA1(data, dataSize);
    }

    public static java.nio.IntBuffer computeSHA1(java.nio.ByteBuffer data, int dataSize) {
        return Raylib.ComputeSHA1(data, dataSize);
    }

    public static org.bytedeco.javacpp.IntPointer loadRandomSequence(int count, int min, int max) {
        return Raylib.LoadRandomSequence(count, min, max);
    }

    public static int getKeyPressed() {
        return Raylib.GetKeyPressed();
    }

    public static boolean isGamepadAvailable(int gamepad) {
        return Raylib.IsGamepadAvailable(gamepad);
    }

    public static boolean isFileDropped() {
        return Raylib.IsFileDropped();
    }

    public static org.bytedeco.javacpp.BytePointer getGamepadName(int gamepad) {
        return Raylib.GetGamepadName(gamepad);
    }

    public static void unloadDroppedFiles(com.raylib.Raylib.FilePathList files) {
        Raylib.UnloadDroppedFiles(files);
    }

    public static int getFileLength(java.lang.String fileName) {
        return Raylib.GetFileLength(fileName);
    }

    public static int getFileLength(org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.GetFileLength(fileName);
    }

    public static boolean isFileExtension(org.bytedeco.javacpp.BytePointer fileName, org.bytedeco.javacpp.BytePointer ext) {
        return Raylib.IsFileExtension(fileName, ext);
    }

    public static boolean isFileExtension(java.lang.String fileName, java.lang.String ext) {
        return Raylib.IsFileExtension(fileName, ext);
    }

    public static int getShaderLocation(com.raylib.Raylib.Shader shader, org.bytedeco.javacpp.BytePointer uniformName) {
        return Raylib.GetShaderLocation(shader, uniformName);
    }

    public static int getShaderLocation(com.raylib.Raylib.Shader shader, java.lang.String uniformName) {
        return Raylib.GetShaderLocation(shader, uniformName);
    }

    public static boolean isShaderValid(com.raylib.Raylib.Shader shader) {
        return Raylib.IsShaderValid(shader);
    }

    public static void setRandomSeed(int seed) {
        Raylib.SetRandomSeed(seed);
    }

    public static int makeDirectory(org.bytedeco.javacpp.BytePointer dirPath) {
        return Raylib.MakeDirectory(dirPath);
    }

    public static int makeDirectory(java.lang.String dirPath) {
        return Raylib.MakeDirectory(dirPath);
    }

    public static org.bytedeco.javacpp.BytePointer decompressData(org.bytedeco.javacpp.BytePointer compData, int compDataSize, org.bytedeco.javacpp.IntPointer dataSize) {
        return Raylib.DecompressData(compData, compDataSize, dataSize);
    }

    public static java.nio.ByteBuffer decompressData(java.nio.ByteBuffer compData, int compDataSize, java.nio.IntBuffer dataSize) {
        return Raylib.DecompressData(compData, compDataSize, dataSize);
    }

    public static byte[] decompressData(byte[] compData, int compDataSize, int[] dataSize) {
        return Raylib.DecompressData(compData, compDataSize, dataSize);
    }

    public static byte[] encodeDataBase64(byte[] data, int dataSize, int[] outputSize) {
        return Raylib.EncodeDataBase64(data, dataSize, outputSize);
    }

    public static java.nio.ByteBuffer encodeDataBase64(java.nio.ByteBuffer data, int dataSize, java.nio.IntBuffer outputSize) {
        return Raylib.EncodeDataBase64(data, dataSize, outputSize);
    }

    public static org.bytedeco.javacpp.BytePointer encodeDataBase64(org.bytedeco.javacpp.BytePointer data, int dataSize, org.bytedeco.javacpp.IntPointer outputSize) {
        return Raylib.EncodeDataBase64(data, dataSize, outputSize);
    }

    public static void endVrStereoMode() {
        Raylib.EndVrStereoMode();
    }

    public static org.bytedeco.javacpp.BytePointer getFileExtension(org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.GetFileExtension(fileName);
    }

    public static java.lang.String getFileExtension(java.lang.String fileName) {
        return Raylib.GetFileExtension(fileName);
    }

    public static byte[] decodeDataBase64(byte[] data, int[] outputSize) {
        return Raylib.DecodeDataBase64(data, outputSize);
    }

    public static org.bytedeco.javacpp.BytePointer decodeDataBase64(org.bytedeco.javacpp.BytePointer data, org.bytedeco.javacpp.IntPointer outputSize) {
        return Raylib.DecodeDataBase64(data, outputSize);
    }

    public static java.nio.ByteBuffer decodeDataBase64(java.nio.ByteBuffer data, java.nio.IntBuffer outputSize) {
        return Raylib.DecodeDataBase64(data, outputSize);
    }

    public static void setShaderValueV(com.raylib.Raylib.Shader shader, int locIndex, org.bytedeco.javacpp.Pointer value, int uniformType, int count) {
        Raylib.SetShaderValueV(shader, locIndex, value, uniformType, count);
    }

    public static float getMouseWheelMove() {
        return Raylib.GetMouseWheelMove();
    }

    public static boolean checkCollisionRecs(com.raylib.Raylib.Rectangle rec1, com.raylib.Raylib.Rectangle rec2) {
        return Raylib.CheckCollisionRecs(rec1, rec2);
    }

    public static com.raylib.Raylib.Vector2 getMouseDelta() {
        return Raylib.GetMouseDelta();
    }

    public static int getTouchPointId(int index) {
        return Raylib.GetTouchPointId(index);
    }

    public static void drawEllipse(int centerX, int centerY, float radiusH, float radiusV, com.raylib.Raylib.Color color) {
        Raylib.DrawEllipse(centerX, centerY, radiusH, radiusV, color);
    }

    public static void drawCircleV(com.raylib.Raylib.Vector2 center, float radius, com.raylib.Raylib.Color color) {
        Raylib.DrawCircleV(center, radius, color);
    }

    public static void drawRectangleRec(com.raylib.Raylib.Rectangle rec, com.raylib.Raylib.Color color) {
        Raylib.DrawRectangleRec(rec, color);
    }

    public static boolean isGamepadButtonUp(int gamepad, int button) {
        return Raylib.IsGamepadButtonUp(gamepad, button);
    }

    public static void drawTriangle(com.raylib.Raylib.Vector2 v1, com.raylib.Raylib.Vector2 v2, com.raylib.Raylib.Vector2 v3, com.raylib.Raylib.Color color) {
        Raylib.DrawTriangle(v1, v2, v3, color);
    }

    public static com.raylib.Raylib.Vector2 getTouchPosition(int index) {
        return Raylib.GetTouchPosition(index);
    }

    public static void setMouseCursor(int cursor) {
        Raylib.SetMouseCursor(cursor);
    }

    public static int getGestureDetected() {
        return Raylib.GetGestureDetected();
    }

    public static void updateCamera(com.raylib.Raylib.Camera3D camera, int mode) {
        Raylib.UpdateCamera(camera, mode);
    }

    public static void drawPolyLines(com.raylib.Raylib.Vector2 center, int sides, float radius, float rotation, com.raylib.Raylib.Color color) {
        Raylib.DrawPolyLines(center, sides, radius, rotation, color);
    }

    public static com.raylib.Raylib.Image loadImageRaw(java.lang.String fileName, int width, int height, int format, int headerSize) {
        return Raylib.LoadImageRaw(fileName, width, height, format, headerSize);
    }

    public static com.raylib.Raylib.Image loadImageRaw(org.bytedeco.javacpp.BytePointer fileName, int width, int height, int format, int headerSize) {
        return Raylib.LoadImageRaw(fileName, width, height, format, headerSize);
    }

    public static void drawLineBezier(com.raylib.Raylib.Vector2 startPos, com.raylib.Raylib.Vector2 endPos, float thick, com.raylib.Raylib.Color color) {
        Raylib.DrawLineBezier(startPos, endPos, thick, color);
    }

    public static void unloadImage(com.raylib.Raylib.Image image) {
        Raylib.UnloadImage(image);
    }

    public static boolean exportImageAsCode(com.raylib.Raylib.Image image, org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.ExportImageAsCode(image, fileName);
    }

    public static boolean exportImageAsCode(com.raylib.Raylib.Image image, java.lang.String fileName) {
        return Raylib.ExportImageAsCode(image, fileName);
    }

    public static com.raylib.Raylib.Image genImageColor(int width, int height, com.raylib.Raylib.Color color) {
        return Raylib.GenImageColor(width, height, color);
    }

    public static com.raylib.Raylib.Vector2 getMouseWheelMoveV() {
        return Raylib.GetMouseWheelMoveV();
    }

    public static com.raylib.Raylib.Image genImageChecked(int width, int height, int checksX, int checksY, com.raylib.Raylib.Color col1, com.raylib.Raylib.Color col2) {
        return Raylib.GenImageChecked(width, height, checksX, checksY, col1, col2);
    }

    public static com.raylib.Raylib.Rectangle getCollisionRec(com.raylib.Raylib.Rectangle rec1, com.raylib.Raylib.Rectangle rec2) {
        return Raylib.GetCollisionRec(rec1, rec2);
    }

    public static com.raylib.Raylib.Image genImageCellular(int width, int height, int tileSize) {
        return Raylib.GenImageCellular(width, height, tileSize);
    }

    public static void drawPolyLinesEx(com.raylib.Raylib.Vector2 center, int sides, float radius, float rotation, float lineThick, com.raylib.Raylib.Color color) {
        Raylib.DrawPolyLinesEx(center, sides, radius, rotation, lineThick, color);
    }

    public static com.raylib.Raylib.Image genImageText(int width, int height, java.lang.String text) {
        return Raylib.GenImageText(width, height, text);
    }

    public static com.raylib.Raylib.Image genImageText(int width, int height, org.bytedeco.javacpp.BytePointer text) {
        return Raylib.GenImageText(width, height, text);
    }

    public static void drawRectangle(int posX, int posY, int width, int height, com.raylib.Raylib.Color color) {
        Raylib.DrawRectangle(posX, posY, width, height, color);
    }

    public static com.raylib.Raylib.Image genImageWhiteNoise(int width, int height, float factor) {
        return Raylib.GenImageWhiteNoise(width, height, factor);
    }

    public static com.raylib.Raylib.Image imageFromImage(com.raylib.Raylib.Image image, com.raylib.Raylib.Rectangle rec) {
        return Raylib.ImageFromImage(image, rec);
    }

    public static void drawEllipseLines(int centerX, int centerY, float radiusH, float radiusV, com.raylib.Raylib.Color color) {
        Raylib.DrawEllipseLines(centerX, centerY, radiusH, radiusV, color);
    }

    public static void updateCameraPro(com.raylib.Raylib.Camera3D camera, com.raylib.Raylib.Vector3 movement, com.raylib.Raylib.Vector3 rotation, float zoom) {
        Raylib.UpdateCameraPro(camera, movement, rotation, zoom);
    }

    public static boolean isImageValid(com.raylib.Raylib.Image image) {
        return Raylib.IsImageValid(image);
    }

    public static void setShapesTexture(com.raylib.Raylib.Texture texture, com.raylib.Raylib.Rectangle source) {
        Raylib.SetShapesTexture(texture, source);
    }

    public static com.raylib.Raylib.Image imageFromChannel(com.raylib.Raylib.Image image, int selectedChannel) {
        return Raylib.ImageFromChannel(image, selectedChannel);
    }

    public static void drawCircleLinesV(com.raylib.Raylib.Vector2 center, float radius, com.raylib.Raylib.Color color) {
        Raylib.DrawCircleLinesV(center, radius, color);
    }

    public static void drawRectanglePro(com.raylib.Raylib.Rectangle rec, com.raylib.Raylib.Vector2 origin, float rotation, com.raylib.Raylib.Color color) {
        Raylib.DrawRectanglePro(rec, origin, rotation, color);
    }

    public static void drawSplineBasis(com.raylib.Raylib.Vector2 points, int pointCount, float thick, com.raylib.Raylib.Color color) {
        Raylib.DrawSplineBasis(points, pointCount, thick, color);
    }

    public static void drawCircleSector(com.raylib.Raylib.Vector2 center, float radius, float startAngle, float endAngle, int segments, com.raylib.Raylib.Color color) {
        Raylib.DrawCircleSector(center, radius, startAngle, endAngle, segments, color);
    }

    public static com.raylib.Raylib.Image loadImageAnim(java.lang.String fileName, int[] frames) {
        return Raylib.LoadImageAnim(fileName, frames);
    }

    public static com.raylib.Raylib.Image loadImageAnim(org.bytedeco.javacpp.BytePointer fileName, org.bytedeco.javacpp.IntPointer frames) {
        return Raylib.LoadImageAnim(fileName, frames);
    }

    public static com.raylib.Raylib.Image loadImageAnim(java.lang.String fileName, org.bytedeco.javacpp.IntPointer frames) {
        return Raylib.LoadImageAnim(fileName, frames);
    }

    public static com.raylib.Raylib.Image loadImageAnim(java.lang.String fileName, java.nio.IntBuffer frames) {
        return Raylib.LoadImageAnim(fileName, frames);
    }

    public static com.raylib.Raylib.Image loadImageAnim(org.bytedeco.javacpp.BytePointer fileName, java.nio.IntBuffer frames) {
        return Raylib.LoadImageAnim(fileName, frames);
    }

    public static com.raylib.Raylib.Image loadImageAnim(org.bytedeco.javacpp.BytePointer fileName, int[] frames) {
        return Raylib.LoadImageAnim(fileName, frames);
    }

    public static com.raylib.Raylib.Image imageTextEx(com.raylib.Raylib.Font font, java.lang.String text, float fontSize, float spacing, com.raylib.Raylib.Color tint) {
        return Raylib.ImageTextEx(font, text, fontSize, spacing, tint);
    }

    public static com.raylib.Raylib.Image imageTextEx(com.raylib.Raylib.Font font, org.bytedeco.javacpp.BytePointer text, float fontSize, float spacing, com.raylib.Raylib.Color tint) {
        return Raylib.ImageTextEx(font, text, fontSize, spacing, tint);
    }

    public static void setMouseScale(float scaleX, float scaleY) {
        Raylib.SetMouseScale(scaleX, scaleY);
    }

    public static void drawRectangleV(com.raylib.Raylib.Vector2 position, com.raylib.Raylib.Vector2 size, com.raylib.Raylib.Color color) {
        Raylib.DrawRectangleV(position, size, color);
    }

    public static void drawTriangleFan(com.raylib.Raylib.Vector2 points, int pointCount, com.raylib.Raylib.Color color) {
        Raylib.DrawTriangleFan(points, pointCount, color);
    }

    public static void drawCircleGradient(int centerX, int centerY, float radius, com.raylib.Raylib.Color inner, com.raylib.Raylib.Color outer) {
        Raylib.DrawCircleGradient(centerX, centerY, radius, inner, outer);
    }

    public static void imageFormat(com.raylib.Raylib.Image image, int newFormat) {
        Raylib.ImageFormat(image, newFormat);
    }

    public static boolean exportImage(com.raylib.Raylib.Image image, org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.ExportImage(image, fileName);
    }

    public static boolean exportImage(com.raylib.Raylib.Image image, java.lang.String fileName) {
        return Raylib.ExportImage(image, fileName);
    }

    public static boolean isGestureDetected(int gesture) {
        return Raylib.IsGestureDetected(gesture);
    }

    public static void imageAlphaCrop(com.raylib.Raylib.Image image, float threshold) {
        Raylib.ImageAlphaCrop(image, threshold);
    }

    public static void drawRectangleLines(int posX, int posY, int width, int height, com.raylib.Raylib.Color color) {
        Raylib.DrawRectangleLines(posX, posY, width, height, color);
    }

    public static int setGamepadMappings(org.bytedeco.javacpp.BytePointer mappings) {
        return Raylib.SetGamepadMappings(mappings);
    }

    public static int setGamepadMappings(java.lang.String mappings) {
        return Raylib.SetGamepadMappings(mappings);
    }

    public static boolean isMouseButtonDown(int button) {
        return Raylib.IsMouseButtonDown(button);
    }

    public static boolean isMouseButtonUp(int button) {
        return Raylib.IsMouseButtonUp(button);
    }

    public static com.raylib.Raylib.Vector2 getMousePosition() {
        return Raylib.GetMousePosition();
    }

    public static int getTouchPointCount() {
        return Raylib.GetTouchPointCount();
    }

    public static com.raylib.Raylib.Texture getShapesTexture() {
        return Raylib.GetShapesTexture();
    }

    public static void setMouseOffset(int offsetX, int offsetY) {
        Raylib.SetMouseOffset(offsetX, offsetY);
    }

    public static void drawRingLines(com.raylib.Raylib.Vector2 center, float innerRadius, float outerRadius, float startAngle, float endAngle, int segments, com.raylib.Raylib.Color color) {
        Raylib.DrawRingLines(center, innerRadius, outerRadius, startAngle, endAngle, segments, color);
    }

    public static void drawTriangleLines(com.raylib.Raylib.Vector2 v1, com.raylib.Raylib.Vector2 v2, com.raylib.Raylib.Vector2 v3, com.raylib.Raylib.Color color) {
        Raylib.DrawTriangleLines(v1, v2, v3, color);
    }

    public static void setMousePosition(int x, int y) {
        Raylib.SetMousePosition(x, y);
    }

    public static void drawLineStrip(com.raylib.Raylib.Vector2 points, int pointCount, com.raylib.Raylib.Color color) {
        Raylib.DrawLineStrip(points, pointCount, color);
    }

    public static void imageAlphaClear(com.raylib.Raylib.Image image, com.raylib.Raylib.Color color, float threshold) {
        Raylib.ImageAlphaClear(image, color, threshold);
    }

    public static void setGesturesEnabled(int flags) {
        Raylib.SetGesturesEnabled(flags);
    }

    public static void drawCircleLines(int centerX, int centerY, float radius, com.raylib.Raylib.Color color) {
        Raylib.DrawCircleLines(centerX, centerY, radius, color);
    }

    public static void drawTriangleStrip(com.raylib.Raylib.Vector2 points, int pointCount, com.raylib.Raylib.Color color) {
        Raylib.DrawTriangleStrip(points, pointCount, color);
    }

    public static void drawSplineLinear(com.raylib.Raylib.Vector2 points, int pointCount, float thick, com.raylib.Raylib.Color color) {
        Raylib.DrawSplineLinear(points, pointCount, thick, color);
    }

    public static com.raylib.Raylib.RenderTexture loadRenderTexture(int width, int height) {
        return Raylib.LoadRenderTexture(width, height);
    }

    public static void imageResizeNN(com.raylib.Raylib.Image image, int newWidth, int newHeight) {
        Raylib.ImageResizeNN(image, newWidth, newHeight);
    }

    public static void imageRotate(com.raylib.Raylib.Image image, int degrees) {
        Raylib.ImageRotate(image, degrees);
    }

    public static void imageColorReplace(com.raylib.Raylib.Image image, com.raylib.Raylib.Color color, com.raylib.Raylib.Color replace) {
        Raylib.ImageColorReplace(image, color, replace);
    }

    public static void imageDither(com.raylib.Raylib.Image image, int rBpp, int gBpp, int bBpp, int aBpp) {
        Raylib.ImageDither(image, rBpp, gBpp, bBpp, aBpp);
    }

    public static void imageDrawPixelV(com.raylib.Raylib.Image dst, com.raylib.Raylib.Vector2 position, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawPixelV(dst, position, color);
    }

    public static void imageDrawLineEx(com.raylib.Raylib.Image dst, com.raylib.Raylib.Vector2 start, com.raylib.Raylib.Vector2 end, int thick, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawLineEx(dst, start, end, thick, color);
    }

    public static com.raylib.Raylib.Texture loadTextureCubemap(com.raylib.Raylib.Image image, int layout) {
        return Raylib.LoadTextureCubemap(image, layout);
    }

    public static com.raylib.Raylib.Color colorFromHSV(float hue, float saturation, float value) {
        return Raylib.ColorFromHSV(hue, saturation, value);
    }

    public static void updateTextureRec(com.raylib.Raylib.Texture texture, com.raylib.Raylib.Rectangle rec, org.bytedeco.javacpp.Pointer pixels) {
        Raylib.UpdateTextureRec(texture, rec, pixels);
    }

    public static void unloadImageColors(com.raylib.Raylib.Color colors) {
        Raylib.UnloadImageColors(colors);
    }

    public static void setPixelColor(org.bytedeco.javacpp.Pointer dstPtr, com.raylib.Raylib.Color color, int format) {
        Raylib.SetPixelColor(dstPtr, color, format);
    }

    public static void imageBlurGaussian(com.raylib.Raylib.Image image, int blurSize) {
        Raylib.ImageBlurGaussian(image, blurSize);
    }

    public static void setTextureFilter(com.raylib.Raylib.Texture texture, int filter) {
        Raylib.SetTextureFilter(texture, filter);
    }

    public static com.raylib.Raylib.Font loadFontFromImage(com.raylib.Raylib.Image image, com.raylib.Raylib.Color key, int firstChar) {
        return Raylib.LoadFontFromImage(image, key, firstChar);
    }

    public static com.raylib.Raylib.Font loadFontFromMemory(org.bytedeco.javacpp.BytePointer fileType, org.bytedeco.javacpp.BytePointer fileData, int dataSize, int fontSize, org.bytedeco.javacpp.IntPointer codepoints, int codepointCount) {
        return Raylib.LoadFontFromMemory(fileType, fileData, dataSize, fontSize, codepoints, codepointCount);
    }

    public static com.raylib.Raylib.Font loadFontFromMemory(java.lang.String fileType, java.nio.ByteBuffer fileData, int dataSize, int fontSize, java.nio.IntBuffer codepoints, int codepointCount) {
        return Raylib.LoadFontFromMemory(fileType, fileData, dataSize, fontSize, codepoints, codepointCount);
    }

    public static com.raylib.Raylib.Font loadFontFromMemory(java.lang.String fileType, byte[] fileData, int dataSize, int fontSize, int[] codepoints, int codepointCount) {
        return Raylib.LoadFontFromMemory(fileType, fileData, dataSize, fontSize, codepoints, codepointCount);
    }

    public static com.raylib.Raylib.Font loadFontFromMemory(org.bytedeco.javacpp.BytePointer fileType, java.nio.ByteBuffer fileData, int dataSize, int fontSize, java.nio.IntBuffer codepoints, int codepointCount) {
        return Raylib.LoadFontFromMemory(fileType, fileData, dataSize, fontSize, codepoints, codepointCount);
    }

    public static com.raylib.Raylib.Font loadFontFromMemory(java.lang.String fileType, org.bytedeco.javacpp.BytePointer fileData, int dataSize, int fontSize, org.bytedeco.javacpp.IntPointer codepoints, int codepointCount) {
        return Raylib.LoadFontFromMemory(fileType, fileData, dataSize, fontSize, codepoints, codepointCount);
    }

    public static com.raylib.Raylib.Font loadFontFromMemory(org.bytedeco.javacpp.BytePointer fileType, byte[] fileData, int dataSize, int fontSize, int[] codepoints, int codepointCount) {
        return Raylib.LoadFontFromMemory(fileType, fileData, dataSize, fontSize, codepoints, codepointCount);
    }

    public static boolean colorIsEqual(com.raylib.Raylib.Color col1, com.raylib.Raylib.Color col2) {
        return Raylib.ColorIsEqual(col1, col2);
    }

    public static boolean isFontValid(com.raylib.Raylib.Font font) {
        return Raylib.IsFontValid(font);
    }

    public static void imageResize(com.raylib.Raylib.Image image, int newWidth, int newHeight) {
        Raylib.ImageResize(image, newWidth, newHeight);
    }

    public static com.raylib.Raylib.Color getImageColor(com.raylib.Raylib.Image image, int x, int y) {
        return Raylib.GetImageColor(image, x, y);
    }

    public static com.raylib.Raylib.Texture loadTexture(org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.LoadTexture(fileName);
    }

    public static com.raylib.Raylib.Texture loadTexture(java.lang.String fileName) {
        return Raylib.LoadTexture(fileName);
    }

    public static void imageDrawCircleV(com.raylib.Raylib.Image dst, com.raylib.Raylib.Vector2 center, int radius, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawCircleV(dst, center, radius, color);
    }

    public static void genTextureMipmaps(com.raylib.Raylib.Texture texture) {
        Raylib.GenTextureMipmaps(texture);
    }

    public static void imageColorContrast(com.raylib.Raylib.Image image, float contrast) {
        Raylib.ImageColorContrast(image, contrast);
    }

    public static void drawTextureRec(com.raylib.Raylib.Texture texture, com.raylib.Raylib.Rectangle source, com.raylib.Raylib.Vector2 position, com.raylib.Raylib.Color tint) {
        Raylib.DrawTextureRec(texture, source, position, tint);
    }

    public static com.raylib.Raylib.Vector4 colorNormalize(com.raylib.Raylib.Color color) {
        return Raylib.ColorNormalize(color);
    }

    public static void imageRotateCCW(com.raylib.Raylib.Image image) {
        Raylib.ImageRotateCCW(image);
    }

    public static com.raylib.Raylib.Color loadImagePalette(com.raylib.Raylib.Image image, int maxPaletteSize, org.bytedeco.javacpp.IntPointer colorCount) {
        return Raylib.LoadImagePalette(image, maxPaletteSize, colorCount);
    }

    public static com.raylib.Raylib.Color loadImagePalette(com.raylib.Raylib.Image image, int maxPaletteSize, int[] colorCount) {
        return Raylib.LoadImagePalette(image, maxPaletteSize, colorCount);
    }

    public static com.raylib.Raylib.Color loadImagePalette(com.raylib.Raylib.Image image, int maxPaletteSize, java.nio.IntBuffer colorCount) {
        return Raylib.LoadImagePalette(image, maxPaletteSize, colorCount);
    }

    public static void updateTexture(com.raylib.Raylib.Texture texture, org.bytedeco.javacpp.Pointer pixels) {
        Raylib.UpdateTexture(texture, pixels);
    }

    public static com.raylib.Raylib.Color colorContrast(com.raylib.Raylib.Color color, float contrast) {
        return Raylib.ColorContrast(color, contrast);
    }

    public static void imageDrawLine(com.raylib.Raylib.Image dst, int startPosX, int startPosY, int endPosX, int endPosY, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawLine(dst, startPosX, startPosY, endPosX, endPosY, color);
    }

    public static com.raylib.Raylib.Color loadImageColors(com.raylib.Raylib.Image image) {
        return Raylib.LoadImageColors(image);
    }

    public static void imageDrawRectangle(com.raylib.Raylib.Image dst, int posX, int posY, int width, int height, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawRectangle(dst, posX, posY, width, height, color);
    }

    public static void imageResizeCanvas(com.raylib.Raylib.Image image, int newWidth, int newHeight, int offsetX, int offsetY, com.raylib.Raylib.Color fill) {
        Raylib.ImageResizeCanvas(image, newWidth, newHeight, offsetX, offsetY, fill);
    }

    public static void imageRotateCW(com.raylib.Raylib.Image image) {
        Raylib.ImageRotateCW(image);
    }

    public static boolean isTextureValid(com.raylib.Raylib.Texture texture) {
        return Raylib.IsTextureValid(texture);
    }

    public static void drawTexturePro(com.raylib.Raylib.Texture texture, com.raylib.Raylib.Rectangle source, com.raylib.Raylib.Rectangle dest, com.raylib.Raylib.Vector2 origin, float rotation, com.raylib.Raylib.Color tint) {
        Raylib.DrawTexturePro(texture, source, dest, origin, rotation, tint);
    }

    public static void drawTextureNPatch(com.raylib.Raylib.Texture texture, com.raylib.Raylib.NPatchInfo nPatchInfo, com.raylib.Raylib.Rectangle dest, com.raylib.Raylib.Vector2 origin, float rotation, com.raylib.Raylib.Color tint) {
        Raylib.DrawTextureNPatch(texture, nPatchInfo, dest, origin, rotation, tint);
    }

    public static void unloadTexture(com.raylib.Raylib.Texture texture) {
        Raylib.UnloadTexture(texture);
    }

    public static void imageDrawCircle(com.raylib.Raylib.Image dst, int centerX, int centerY, int radius, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawCircle(dst, centerX, centerY, radius, color);
    }

    public static com.raylib.Raylib.Color colorBrightness(com.raylib.Raylib.Color color, float factor) {
        return Raylib.ColorBrightness(color, factor);
    }

    public static void drawTextureV(com.raylib.Raylib.Texture texture, com.raylib.Raylib.Vector2 position, com.raylib.Raylib.Color tint) {
        Raylib.DrawTextureV(texture, position, tint);
    }

    public static void imageAlphaMask(com.raylib.Raylib.Image image, com.raylib.Raylib.Image alphaMask) {
        Raylib.ImageAlphaMask(image, alphaMask);
    }

    public static void imageColorTint(com.raylib.Raylib.Image image, com.raylib.Raylib.Color color) {
        Raylib.ImageColorTint(image, color);
    }

    public static void drawTexture(com.raylib.Raylib.Texture texture, int posX, int posY, com.raylib.Raylib.Color tint) {
        Raylib.DrawTexture(texture, posX, posY, tint);
    }

    public static void unloadImagePalette(com.raylib.Raylib.Color colors) {
        Raylib.UnloadImagePalette(colors);
    }

    public static com.raylib.Raylib.Color colorAlphaBlend(com.raylib.Raylib.Color dst, com.raylib.Raylib.Color src, com.raylib.Raylib.Color tint) {
        return Raylib.ColorAlphaBlend(dst, src, tint);
    }

    public static void imageDrawLineV(com.raylib.Raylib.Image dst, com.raylib.Raylib.Vector2 start, com.raylib.Raylib.Vector2 end, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawLineV(dst, start, end, color);
    }

    public static void imageMipmaps(com.raylib.Raylib.Image image) {
        Raylib.ImageMipmaps(image);
    }

    public static com.raylib.Raylib.Color getPixelColor(org.bytedeco.javacpp.Pointer srcPtr, int format) {
        return Raylib.GetPixelColor(srcPtr, format);
    }

    public static int getPixelDataSize(int width, int height, int format) {
        return Raylib.GetPixelDataSize(width, height, format);
    }

    public static void imageDrawTriangle(com.raylib.Raylib.Image dst, com.raylib.Raylib.Vector2 v1, com.raylib.Raylib.Vector2 v2, com.raylib.Raylib.Vector2 v3, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawTriangle(dst, v1, v2, v3, color);
    }

    public static void imageDrawPixel(com.raylib.Raylib.Image dst, int posX, int posY, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawPixel(dst, posX, posY, color);
    }

    public static com.raylib.Raylib.Font getFontDefault() {
        return Raylib.GetFontDefault();
    }

    public static com.raylib.Raylib.GlyphInfo loadFontData(org.bytedeco.javacpp.BytePointer fileData, int dataSize, int fontSize, org.bytedeco.javacpp.IntPointer codepoints, int codepointCount, int type) {
        return Raylib.LoadFontData(fileData, dataSize, fontSize, codepoints, codepointCount, type);
    }

    public static com.raylib.Raylib.GlyphInfo loadFontData(java.nio.ByteBuffer fileData, int dataSize, int fontSize, java.nio.IntBuffer codepoints, int codepointCount, int type) {
        return Raylib.LoadFontData(fileData, dataSize, fontSize, codepoints, codepointCount, type);
    }

    public static com.raylib.Raylib.GlyphInfo loadFontData(byte[] fileData, int dataSize, int fontSize, int[] codepoints, int codepointCount, int type) {
        return Raylib.LoadFontData(fileData, dataSize, fontSize, codepoints, codepointCount, type);
    }

    public static void imageDrawText(com.raylib.Raylib.Image dst, org.bytedeco.javacpp.BytePointer text, int posX, int posY, int fontSize, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawText(dst, text, posX, posY, fontSize, color);
    }

    public static void imageDrawText(com.raylib.Raylib.Image dst, java.lang.String text, int posX, int posY, int fontSize, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawText(dst, text, posX, posY, fontSize, color);
    }

    public static void drawTextureEx(com.raylib.Raylib.Texture texture, com.raylib.Raylib.Vector2 position, float rotation, float scale, com.raylib.Raylib.Color tint) {
        Raylib.DrawTextureEx(texture, position, rotation, scale, tint);
    }

    public static void imageFlipVertical(com.raylib.Raylib.Image image) {
        Raylib.ImageFlipVertical(image);
    }

    public static void setTextureWrap(com.raylib.Raylib.Texture texture, int wrap) {
        Raylib.SetTextureWrap(texture, wrap);
    }

    public static void imageColorInvert(com.raylib.Raylib.Image image) {
        Raylib.ImageColorInvert(image);
    }

    public static void imageDrawTextEx(com.raylib.Raylib.Image dst, com.raylib.Raylib.Font font, org.bytedeco.javacpp.BytePointer text, com.raylib.Raylib.Vector2 position, float fontSize, float spacing, com.raylib.Raylib.Color tint) {
        Raylib.ImageDrawTextEx(dst, font, text, position, fontSize, spacing, tint);
    }

    public static void imageDrawTextEx(com.raylib.Raylib.Image dst, com.raylib.Raylib.Font font, java.lang.String text, com.raylib.Raylib.Vector2 position, float fontSize, float spacing, com.raylib.Raylib.Color tint) {
        Raylib.ImageDrawTextEx(dst, font, text, position, fontSize, spacing, tint);
    }

    public static void rlRotatef(float arg0, float arg1, float arg2, float arg3) {
        Raylib.rlRotatef(arg0, arg1, arg2, arg3);
    }

    public static void drawLine3D(com.raylib.Raylib.Vector3 startPos, com.raylib.Raylib.Vector3 endPos, com.raylib.Raylib.Color color) {
        Raylib.DrawLine3D(startPos, endPos, color);
    }

    public static org.bytedeco.javacpp.BytePointer textSplit(java.lang.String text, byte delimiter, org.bytedeco.javacpp.IntPointer count) {
        return Raylib.TextSplit(text, delimiter, count);
    }

    public static byte[] textSplit(org.bytedeco.javacpp.BytePointer text, byte delimiter, int[] count) {
        return Raylib.TextSplit(text, delimiter, count);
    }

    public static java.nio.ByteBuffer textSplit(java.lang.String text, byte delimiter, java.nio.IntBuffer count) {
        return Raylib.TextSplit(text, delimiter, count);
    }

    public static org.bytedeco.javacpp.PointerPointer textSplit(org.bytedeco.javacpp.BytePointer text, byte delimiter, org.bytedeco.javacpp.IntPointer count) {
        return Raylib.TextSplit(text, delimiter, count);
    }

    public static java.nio.ByteBuffer textSplit(org.bytedeco.javacpp.BytePointer text, byte delimiter, java.nio.IntBuffer count) {
        return Raylib.TextSplit(text, delimiter, count);
    }

    public static byte[] textSplit(java.lang.String text, byte delimiter, int[] count) {
        return Raylib.TextSplit(text, delimiter, count);
    }

    public static void rlFrustum(double arg0, double arg1, double arg2, double arg3, double arg4, double arg5) {
        Raylib.rlFrustum(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static com.raylib.Raylib.Color colorTint(com.raylib.Raylib.Color color, com.raylib.Raylib.Color tint) {
        return Raylib.ColorTint(color, tint);
    }

    public static void rlOrtho(double arg0, double arg1, double arg2, double arg3, double arg4, double arg5) {
        Raylib.rlOrtho(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static com.raylib.Raylib.Sound loadSound(java.lang.String fileName) {
        return Raylib.LoadSound(fileName);
    }

    public static com.raylib.Raylib.Sound loadSound(org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.LoadSound(fileName);
    }

    public static void drawPlane(com.raylib.Raylib.Vector3 centerPos, com.raylib.Raylib.Vector2 size, com.raylib.Raylib.Color color) {
        Raylib.DrawPlane(centerPos, size, color);
    }

    public static com.raylib.Raylib.Font loadFont(java.lang.String fileName) {
        return Raylib.LoadFont(fileName);
    }

    public static com.raylib.Raylib.Font loadFont(org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.LoadFont(fileName);
    }

    public static boolean exportMesh(com.raylib.Raylib.Mesh mesh, org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.ExportMesh(mesh, fileName);
    }

    public static boolean exportMesh(com.raylib.Raylib.Mesh mesh, java.lang.String fileName) {
        return Raylib.ExportMesh(mesh, fileName);
    }

    public static boolean exportWave(com.raylib.Raylib.Wave wave, java.lang.String fileName) {
        return Raylib.ExportWave(wave, fileName);
    }

    public static boolean exportWave(com.raylib.Raylib.Wave wave, org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.ExportWave(wave, fileName);
    }

    public static void drawCube(com.raylib.Raylib.Vector3 position, float width, float height, float length, com.raylib.Raylib.Color color) {
        Raylib.DrawCube(position, width, height, length, color);
    }

    public static void waveCrop(com.raylib.Raylib.Wave wave, int initFrame, int finalFrame) {
        Raylib.WaveCrop(wave, initFrame, finalFrame);
    }

    public static void unloadMesh(com.raylib.Raylib.Mesh mesh) {
        Raylib.UnloadMesh(mesh);
    }

    public static com.raylib.Raylib.Model loadModel(java.lang.String fileName) {
        return Raylib.LoadModel(fileName);
    }

    public static com.raylib.Raylib.Model loadModel(org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.LoadModel(fileName);
    }

    public static void imageDraw(com.raylib.Raylib.Image dst, com.raylib.Raylib.Image src, com.raylib.Raylib.Rectangle srcRec, com.raylib.Raylib.Rectangle dstRec, com.raylib.Raylib.Color tint) {
        Raylib.ImageDraw(dst, src, srcRec, dstRec, tint);
    }

    public static void rlEnd() {
        Raylib.rlEnd();
    }

    public static void rlVertex3f(float arg0, float arg1, float arg2) {
        Raylib.rlVertex3f(arg0, arg1, arg2);
    }

    public static void rlNormal3f(float arg0, float arg1, float arg2) {
        Raylib.rlNormal3f(arg0, arg1, arg2);
    }

    public static void unloadUTF8(byte[] text) {
        Raylib.UnloadUTF8(text);
    }

    public static void unloadUTF8(java.nio.ByteBuffer text) {
        Raylib.UnloadUTF8(text);
    }

    public static void unloadUTF8(org.bytedeco.javacpp.BytePointer text) {
        Raylib.UnloadUTF8(text);
    }

    public static void unloadWave(com.raylib.Raylib.Wave wave) {
        Raylib.UnloadWave(wave);
    }

    public static void rlColor4ub(byte arg0, byte arg1, byte arg2, byte arg3) {
        Raylib.rlColor4ub(arg0, arg1, arg2, arg3);
    }

    public static void drawModel(com.raylib.Raylib.Model model, com.raylib.Raylib.Vector3 position, float scale, com.raylib.Raylib.Color tint) {
        Raylib.DrawModel(model, position, scale, tint);
    }

    public static java.lang.String textJoin(org.bytedeco.javacpp.BytePointer textList, int count, java.lang.String delimiter) {
        return Raylib.TextJoin(textList, count, delimiter);
    }

    public static java.lang.String textJoin(java.nio.ByteBuffer textList, int count, java.lang.String delimiter) {
        return Raylib.TextJoin(textList, count, delimiter);
    }

    public static org.bytedeco.javacpp.BytePointer textJoin(byte[] textList, int count, org.bytedeco.javacpp.BytePointer delimiter) {
        return Raylib.TextJoin(textList, count, delimiter);
    }

    public static org.bytedeco.javacpp.BytePointer textJoin(org.bytedeco.javacpp.BytePointer textList, int count, org.bytedeco.javacpp.BytePointer delimiter) {
        return Raylib.TextJoin(textList, count, delimiter);
    }

    public static org.bytedeco.javacpp.BytePointer textJoin(java.nio.ByteBuffer textList, int count, org.bytedeco.javacpp.BytePointer delimiter) {
        return Raylib.TextJoin(textList, count, delimiter);
    }

    public static java.lang.String textJoin(byte[] textList, int count, java.lang.String delimiter) {
        return Raylib.TextJoin(textList, count, delimiter);
    }

    public static org.bytedeco.javacpp.BytePointer textJoin(org.bytedeco.javacpp.PointerPointer textList, int count, org.bytedeco.javacpp.BytePointer delimiter) {
        return Raylib.TextJoin(textList, count, delimiter);
    }

    public static com.raylib.Raylib.Wave waveCopy(com.raylib.Raylib.Wave wave) {
        return Raylib.WaveCopy(wave);
    }

    public static void rlColor3f(float arg0, float arg1, float arg2) {
        Raylib.rlColor3f(arg0, arg1, arg2);
    }

    public static void drawSphere(com.raylib.Raylib.Vector3 centerPos, float radius, com.raylib.Raylib.Color color) {
        Raylib.DrawSphere(centerPos, radius, color);
    }

    public static int textLength(org.bytedeco.javacpp.BytePointer text) {
        return Raylib.TextLength(text);
    }

    public static int textLength(java.lang.String text) {
        return Raylib.TextLength(text);
    }

    public static com.raylib.Raylib.Color colorLerp(com.raylib.Raylib.Color color1, com.raylib.Raylib.Color color2, float factor) {
        return Raylib.ColorLerp(color1, color2, factor);
    }

    public static java.lang.String textFormat(java.lang.String text) {
        return Raylib.TextFormat(text);
    }

    public static org.bytedeco.javacpp.BytePointer textFormat(org.bytedeco.javacpp.BytePointer text) {
        return Raylib.TextFormat(text);
    }

    public static void drawGrid(int slices, float spacing) {
        Raylib.DrawGrid(slices, spacing);
    }

    public static void uploadMesh(com.raylib.Raylib.Mesh mesh, boolean dynamic) {
        Raylib.UploadMesh(mesh, dynamic);
    }

    public static void unloadFont(com.raylib.Raylib.Font font) {
        Raylib.UnloadFont(font);
    }

    public static void stopSound(com.raylib.Raylib.Sound sound) {
        Raylib.StopSound(sound);
    }

    public static void textAppend(org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.BytePointer append, org.bytedeco.javacpp.IntPointer position) {
        Raylib.TextAppend(text, append, position);
    }

    public static void textAppend(org.bytedeco.javacpp.BytePointer text, java.lang.String append, org.bytedeco.javacpp.IntPointer position) {
        Raylib.TextAppend(text, append, position);
    }

    public static void textAppend(java.nio.ByteBuffer text, java.lang.String append, java.nio.IntBuffer position) {
        Raylib.TextAppend(text, append, position);
    }

    public static void textAppend(byte[] text, org.bytedeco.javacpp.BytePointer append, int[] position) {
        Raylib.TextAppend(text, append, position);
    }

    public static void textAppend(java.nio.ByteBuffer text, org.bytedeco.javacpp.BytePointer append, java.nio.IntBuffer position) {
        Raylib.TextAppend(text, append, position);
    }

    public static void textAppend(byte[] text, java.lang.String append, int[] position) {
        Raylib.TextAppend(text, append, position);
    }

    public static com.raylib.Raylib.Font loadFontEx(org.bytedeco.javacpp.BytePointer fileName, int fontSize, org.bytedeco.javacpp.IntPointer codepoints, int codepointCount) {
        return Raylib.LoadFontEx(fileName, fontSize, codepoints, codepointCount);
    }

    public static com.raylib.Raylib.Font loadFontEx(java.lang.String fileName, int fontSize, org.bytedeco.javacpp.IntPointer codepoints, int codepointCount) {
        return Raylib.LoadFontEx(fileName, fontSize, codepoints, codepointCount);
    }

    public static com.raylib.Raylib.Font loadFontEx(org.bytedeco.javacpp.BytePointer fileName, int fontSize, java.nio.IntBuffer codepoints, int codepointCount) {
        return Raylib.LoadFontEx(fileName, fontSize, codepoints, codepointCount);
    }

    public static com.raylib.Raylib.Font loadFontEx(java.lang.String fileName, int fontSize, java.nio.IntBuffer codepoints, int codepointCount) {
        return Raylib.LoadFontEx(fileName, fontSize, codepoints, codepointCount);
    }

    public static com.raylib.Raylib.Font loadFontEx(java.lang.String fileName, int fontSize, int[] codepoints, int codepointCount) {
        return Raylib.LoadFontEx(fileName, fontSize, codepoints, codepointCount);
    }

    public static com.raylib.Raylib.Font loadFontEx(org.bytedeco.javacpp.BytePointer fileName, int fontSize, int[] codepoints, int codepointCount) {
        return Raylib.LoadFontEx(fileName, fontSize, codepoints, codepointCount);
    }

    public static void rlViewport(int arg0, int arg1, int arg2, int arg3) {
        Raylib.rlViewport(arg0, arg1, arg2, arg3);
    }

    public static void rlVertex2i(int arg0, int arg1) {
        Raylib.rlVertex2i(arg0, arg1);
    }

    public static int textCopy(org.bytedeco.javacpp.BytePointer dst, java.lang.String src) {
        return Raylib.TextCopy(dst, src);
    }

    public static int textCopy(java.nio.ByteBuffer dst, java.lang.String src) {
        return Raylib.TextCopy(dst, src);
    }

    public static int textCopy(org.bytedeco.javacpp.BytePointer dst, org.bytedeco.javacpp.BytePointer src) {
        return Raylib.TextCopy(dst, src);
    }

    public static int textCopy(byte[] dst, org.bytedeco.javacpp.BytePointer src) {
        return Raylib.TextCopy(dst, src);
    }

    public static int textCopy(byte[] dst, java.lang.String src) {
        return Raylib.TextCopy(dst, src);
    }

    public static int textCopy(java.nio.ByteBuffer dst, org.bytedeco.javacpp.BytePointer src) {
        return Raylib.TextCopy(dst, src);
    }

    public static void drawText(org.bytedeco.javacpp.BytePointer text, int posX, int posY, int fontSize, com.raylib.Raylib.Color color) {
        Raylib.DrawText(text, posX, posY, fontSize, color);
    }

    public static void drawText(java.lang.String text, int posX, int posY, int fontSize, com.raylib.Raylib.Color color) {
        Raylib.DrawText(text, posX, posY, fontSize, color);
    }

    public static void playSound(com.raylib.Raylib.Sound sound) {
        Raylib.PlaySound(sound);
    }

    public static void drawTextEx(com.raylib.Raylib.Font font, org.bytedeco.javacpp.BytePointer text, com.raylib.Raylib.Vector2 position, float fontSize, float spacing, com.raylib.Raylib.Color tint) {
        Raylib.DrawTextEx(font, text, position, fontSize, spacing, tint);
    }

    public static void drawTextEx(com.raylib.Raylib.Font font, java.lang.String text, com.raylib.Raylib.Vector2 position, float fontSize, float spacing, com.raylib.Raylib.Color tint) {
        Raylib.DrawTextEx(font, text, position, fontSize, spacing, tint);
    }

    public static int colorToInt(com.raylib.Raylib.Color color) {
        return Raylib.ColorToInt(color);
    }

    public static void drawCubeV(com.raylib.Raylib.Vector3 position, com.raylib.Raylib.Vector3 size, com.raylib.Raylib.Color color) {
        Raylib.DrawCubeV(position, size, color);
    }

    public static void pauseSound(com.raylib.Raylib.Sound sound) {
        Raylib.PauseSound(sound);
    }

    public static void rlScalef(float arg0, float arg1, float arg2) {
        Raylib.rlScalef(arg0, arg1, arg2);
    }

    public static void rlVertex2f(float arg0, float arg1) {
        Raylib.rlVertex2f(arg0, arg1);
    }

    public static com.raylib.Raylib.Color colorAlpha(com.raylib.Raylib.Color color, float alpha) {
        return Raylib.ColorAlpha(color, alpha);
    }

    public static void drawMesh(com.raylib.Raylib.Mesh mesh, com.raylib.Raylib.Material material, com.raylib.Raylib.Matrix transform) {
        Raylib.DrawMesh(mesh, material, transform);
    }

    public static void rlBegin(int arg0) {
        Raylib.rlBegin(arg0);
    }

    public static com.raylib.Raylib.Color fade(com.raylib.Raylib.Color color, float alpha) {
        return Raylib.Fade(color, alpha);
    }

    public static com.raylib.Raylib.Color getColor(int hexValue) {
        return Raylib.GetColor(hexValue);
    }

    public static org.bytedeco.javacpp.BytePointer loadUTF8(org.bytedeco.javacpp.IntPointer codepoints, int length) {
        return Raylib.LoadUTF8(codepoints, length);
    }

    public static java.nio.ByteBuffer loadUTF8(java.nio.IntBuffer codepoints, int length) {
        return Raylib.LoadUTF8(codepoints, length);
    }

    public static byte[] loadUTF8(int[] codepoints, int length) {
        return Raylib.LoadUTF8(codepoints, length);
    }

    public static com.raylib.Raylib.Vector3 colorToHSV(com.raylib.Raylib.Color color) {
        return Raylib.ColorToHSV(color);
    }

    public static java.nio.ByteBuffer textInsert(java.lang.String text, java.lang.String insert, int position) {
        return Raylib.TextInsert(text, insert, position);
    }

    public static org.bytedeco.javacpp.BytePointer textInsert(org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.BytePointer insert, int position) {
        return Raylib.TextInsert(text, insert, position);
    }

    public static void drawFPS(int posX, int posY) {
        Raylib.DrawFPS(posX, posY);
    }

    public static void drawRay(com.raylib.Raylib.Ray ray, com.raylib.Raylib.Color color) {
        Raylib.DrawRay(ray, color);
    }

    public static com.raylib.Raylib.Wave loadWave(java.lang.String fileName) {
        return Raylib.LoadWave(fileName);
    }

    public static com.raylib.Raylib.Wave loadWave(org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.LoadWave(fileName);
    }

    public static void waveFormat(com.raylib.Raylib.Wave wave, int sampleRate, int sampleSize, int channels) {
        Raylib.WaveFormat(wave, sampleRate, sampleSize, channels);
    }

    public static com.raylib.Raylib.Vector2 vector2Add(com.raylib.Raylib.Vector2 v1, com.raylib.Raylib.Vector2 v2) {
        return Raylib.Vector2Add(v1, v2);
    }

    public static com.raylib.Raylib.Vector2 vector2Min(com.raylib.Raylib.Vector2 v1, com.raylib.Raylib.Vector2 v2) {
        return Raylib.Vector2Min(v1, v2);
    }

    public static com.raylib.Raylib.Vector2 vector2Max(com.raylib.Raylib.Vector2 v1, com.raylib.Raylib.Vector2 v2) {
        return Raylib.Vector2Max(v1, v2);
    }

    public static com.raylib.Raylib.Vector3 vector3One() {
        return Raylib.Vector3One();
    }

    public static com.raylib.Raylib.Vector2 vector2One() {
        return Raylib.Vector2One();
    }

    public static void rlColor4f(float arg0, float arg1, float arg2, float arg3) {
        Raylib.rlColor4f(arg0, arg1, arg2, arg3);
    }

    public static float clamp(float value, float min, float max) {
        return Raylib.Clamp(value, min, max);
    }

    public static float lerp(float start, float end, float amount) {
        return Raylib.Lerp(start, end, amount);
    }

    public static void rlScissor(int arg0, int arg1, int arg2, int arg3) {
        Raylib.rlScissor(arg0, arg1, arg2, arg3);
    }

    public static float remap(float value, float inputStart, float inputEnd, float outputStart, float outputEnd) {
        return Raylib.Remap(value, inputStart, inputEnd, outputStart, outputEnd);
    }

    public static void rlglInit(int arg0, int arg1) {
        Raylib.rlglInit(arg0, arg1);
    }

    public static float wrap(float value, float min, float max) {
        return Raylib.Wrap(value, min, max);
    }

    public static void rlglClose() {
        Raylib.rlglClose();
    }

    public static float normalize(float value, float start, float end) {
        return Raylib.Normalize(value, start, end);
    }

    public static com.raylib.Raylib.Mesh genMeshPoly(int sides, float radius) {
        return Raylib.GenMeshPoly(sides, radius);
    }

    public static com.raylib.Raylib.Mesh genMeshPlane(float width, float length, int resX, int resZ) {
        return Raylib.GenMeshPlane(width, length, resX, resZ);
    }

    public static void drawModelPointsEx(com.raylib.Raylib.Model model, com.raylib.Raylib.Vector3 position, com.raylib.Raylib.Vector3 rotationAxis, float rotationAngle, com.raylib.Raylib.Vector3 scale, com.raylib.Raylib.Color tint) {
        Raylib.DrawModelPointsEx(model, position, rotationAxis, rotationAngle, scale, tint);
    }

    public static com.raylib.Raylib.Mesh genMeshCube(float width, float height, float length) {
        return Raylib.GenMeshCube(width, height, length);
    }

    public static org.bytedeco.javacpp.BytePointer textToLower(org.bytedeco.javacpp.BytePointer text) {
        return Raylib.TextToLower(text);
    }

    public static java.lang.String textToLower(java.lang.String text) {
        return Raylib.TextToLower(text);
    }

    public static com.raylib.Raylib.Mesh genMeshSphere(float radius, int rings, int slices) {
        return Raylib.GenMeshSphere(radius, rings, slices);
    }

    public static java.nio.ByteBuffer textReplace(java.lang.String text, java.lang.String replace, java.lang.String by) {
        return Raylib.TextReplace(text, replace, by);
    }

    public static org.bytedeco.javacpp.BytePointer textReplace(org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.BytePointer replace, org.bytedeco.javacpp.BytePointer by) {
        return Raylib.TextReplace(text, replace, by);
    }

    public static int getGlyphIndex(com.raylib.Raylib.Font font, int codepoint) {
        return Raylib.GetGlyphIndex(font, codepoint);
    }

    public static void unloadCodepoints(java.nio.IntBuffer codepoints) {
        Raylib.UnloadCodepoints(codepoints);
    }

    public static void unloadCodepoints(org.bytedeco.javacpp.IntPointer codepoints) {
        Raylib.UnloadCodepoints(codepoints);
    }

    public static void unloadCodepoints(int[] codepoints) {
        Raylib.UnloadCodepoints(codepoints);
    }

    public static void drawTextCodepoint(com.raylib.Raylib.Font font, int codepoint, com.raylib.Raylib.Vector2 position, float fontSize, com.raylib.Raylib.Color tint) {
        Raylib.DrawTextCodepoint(font, codepoint, position, fontSize, tint);
    }

    public static boolean textIsEqual(java.lang.String text1, java.lang.String text2) {
        return Raylib.TextIsEqual(text1, text2);
    }

    public static boolean textIsEqual(org.bytedeco.javacpp.BytePointer text1, org.bytedeco.javacpp.BytePointer text2) {
        return Raylib.TextIsEqual(text1, text2);
    }

    public static org.bytedeco.javacpp.BytePointer textToSnake(org.bytedeco.javacpp.BytePointer text) {
        return Raylib.TextToSnake(text);
    }

    public static java.lang.String textToSnake(java.lang.String text) {
        return Raylib.TextToSnake(text);
    }

    public static int getCodepointCount(java.lang.String text) {
        return Raylib.GetCodepointCount(text);
    }

    public static int getCodepointCount(org.bytedeco.javacpp.BytePointer text) {
        return Raylib.GetCodepointCount(text);
    }

    public static float textToFloat(java.lang.String text) {
        return Raylib.TextToFloat(text);
    }

    public static float textToFloat(org.bytedeco.javacpp.BytePointer text) {
        return Raylib.TextToFloat(text);
    }

    public static void drawCubeWires(com.raylib.Raylib.Vector3 position, float width, float height, float length, com.raylib.Raylib.Color color) {
        Raylib.DrawCubeWires(position, width, height, length, color);
    }

    public static void setTextLineSpacing(int spacing) {
        Raylib.SetTextLineSpacing(spacing);
    }

    public static com.raylib.Raylib.Vector2 measureTextEx(com.raylib.Raylib.Font font, java.lang.String text, float fontSize, float spacing) {
        return Raylib.MeasureTextEx(font, text, fontSize, spacing);
    }

    public static com.raylib.Raylib.Vector2 measureTextEx(com.raylib.Raylib.Font font, org.bytedeco.javacpp.BytePointer text, float fontSize, float spacing) {
        return Raylib.MeasureTextEx(font, text, fontSize, spacing);
    }

    public static void unloadFontData(com.raylib.Raylib.GlyphInfo glyphs, int glyphCount) {
        Raylib.UnloadFontData(glyphs, glyphCount);
    }

    public static com.raylib.Raylib.Image genImageFontAtlas(com.raylib.Raylib.GlyphInfo glyphs, com.raylib.Raylib.Rectangle glyphRecs, int glyphCount, int fontSize, int padding, int packMethod) {
        return Raylib.GenImageFontAtlas(glyphs, glyphRecs, glyphCount, fontSize, padding, packMethod);
    }

    public static com.raylib.Raylib.Image genImageFontAtlas(com.raylib.Raylib.GlyphInfo glyphs, org.bytedeco.javacpp.PointerPointer glyphRecs, int glyphCount, int fontSize, int padding, int packMethod) {
        return Raylib.GenImageFontAtlas(glyphs, glyphRecs, glyphCount, fontSize, padding, packMethod);
    }

    public static org.bytedeco.javacpp.IntPointer loadCodepoints(java.lang.String text, org.bytedeco.javacpp.IntPointer count) {
        return Raylib.LoadCodepoints(text, count);
    }

    public static int[] loadCodepoints(java.lang.String text, int[] count) {
        return Raylib.LoadCodepoints(text, count);
    }

    public static java.nio.IntBuffer loadCodepoints(org.bytedeco.javacpp.BytePointer text, java.nio.IntBuffer count) {
        return Raylib.LoadCodepoints(text, count);
    }

    public static java.nio.IntBuffer loadCodepoints(java.lang.String text, java.nio.IntBuffer count) {
        return Raylib.LoadCodepoints(text, count);
    }

    public static int[] loadCodepoints(org.bytedeco.javacpp.BytePointer text, int[] count) {
        return Raylib.LoadCodepoints(text, count);
    }

    public static org.bytedeco.javacpp.IntPointer loadCodepoints(org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.IntPointer count) {
        return Raylib.LoadCodepoints(text, count);
    }

    public static org.bytedeco.javacpp.BytePointer textToCamel(org.bytedeco.javacpp.BytePointer text) {
        return Raylib.TextToCamel(text);
    }

    public static java.lang.String textToCamel(java.lang.String text) {
        return Raylib.TextToCamel(text);
    }

    public static int measureText(org.bytedeco.javacpp.BytePointer text, int fontSize) {
        return Raylib.MeasureText(text, fontSize);
    }

    public static int measureText(java.lang.String text, int fontSize) {
        return Raylib.MeasureText(text, fontSize);
    }

    public static void drawPoint3D(com.raylib.Raylib.Vector3 position, com.raylib.Raylib.Color color) {
        Raylib.DrawPoint3D(position, color);
    }

    public static void drawCylinderWires(com.raylib.Raylib.Vector3 position, float radiusTop, float radiusBottom, float height, int slices, com.raylib.Raylib.Color color) {
        Raylib.DrawCylinderWires(position, radiusTop, radiusBottom, height, slices, color);
    }

    public static void drawCapsule(com.raylib.Raylib.Vector3 startPos, com.raylib.Raylib.Vector3 endPos, float radius, int slices, int rings, com.raylib.Raylib.Color color) {
        Raylib.DrawCapsule(startPos, endPos, radius, slices, rings, color);
    }

    public static int getCodepoint(org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.IntPointer codepointSize) {
        return Raylib.GetCodepoint(text, codepointSize);
    }

    public static int getCodepoint(java.lang.String text, int[] codepointSize) {
        return Raylib.GetCodepoint(text, codepointSize);
    }

    public static int getCodepoint(java.lang.String text, org.bytedeco.javacpp.IntPointer codepointSize) {
        return Raylib.GetCodepoint(text, codepointSize);
    }

    public static int getCodepoint(org.bytedeco.javacpp.BytePointer text, java.nio.IntBuffer codepointSize) {
        return Raylib.GetCodepoint(text, codepointSize);
    }

    public static int getCodepoint(java.lang.String text, java.nio.IntBuffer codepointSize) {
        return Raylib.GetCodepoint(text, codepointSize);
    }

    public static int getCodepoint(org.bytedeco.javacpp.BytePointer text, int[] codepointSize) {
        return Raylib.GetCodepoint(text, codepointSize);
    }

    public static com.raylib.Raylib.Model loadModelFromMesh(com.raylib.Raylib.Mesh mesh) {
        return Raylib.LoadModelFromMesh(mesh);
    }

    public static void drawTextPro(com.raylib.Raylib.Font font, org.bytedeco.javacpp.BytePointer text, com.raylib.Raylib.Vector2 position, com.raylib.Raylib.Vector2 origin, float rotation, float fontSize, float spacing, com.raylib.Raylib.Color tint) {
        Raylib.DrawTextPro(font, text, position, origin, rotation, fontSize, spacing, tint);
    }

    public static void drawTextPro(com.raylib.Raylib.Font font, java.lang.String text, com.raylib.Raylib.Vector2 position, com.raylib.Raylib.Vector2 origin, float rotation, float fontSize, float spacing, com.raylib.Raylib.Color tint) {
        Raylib.DrawTextPro(font, text, position, origin, rotation, fontSize, spacing, tint);
    }

    public static boolean exportFontAsCode(com.raylib.Raylib.Font font, org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.ExportFontAsCode(font, fileName);
    }

    public static boolean exportFontAsCode(com.raylib.Raylib.Font font, java.lang.String fileName) {
        return Raylib.ExportFontAsCode(font, fileName);
    }

    public static org.bytedeco.javacpp.BytePointer codepointToUTF8(int codepoint, int[] utf8Size) {
        return Raylib.CodepointToUTF8(codepoint, utf8Size);
    }

    public static org.bytedeco.javacpp.BytePointer codepointToUTF8(int codepoint, org.bytedeco.javacpp.IntPointer utf8Size) {
        return Raylib.CodepointToUTF8(codepoint, utf8Size);
    }

    public static java.lang.String codepointToUTF8(int codepoint, java.nio.IntBuffer utf8Size) {
        return Raylib.CodepointToUTF8(codepoint, utf8Size);
    }

    public static int textFindIndex(org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.BytePointer find) {
        return Raylib.TextFindIndex(text, find);
    }

    public static int textFindIndex(java.lang.String text, java.lang.String find) {
        return Raylib.TextFindIndex(text, find);
    }

    public static int getCodepointNext(org.bytedeco.javacpp.BytePointer text, int[] codepointSize) {
        return Raylib.GetCodepointNext(text, codepointSize);
    }

    public static int getCodepointNext(org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.IntPointer codepointSize) {
        return Raylib.GetCodepointNext(text, codepointSize);
    }

    public static int getCodepointNext(org.bytedeco.javacpp.BytePointer text, java.nio.IntBuffer codepointSize) {
        return Raylib.GetCodepointNext(text, codepointSize);
    }

    public static int getCodepointNext(java.lang.String text, int[] codepointSize) {
        return Raylib.GetCodepointNext(text, codepointSize);
    }

    public static int getCodepointNext(java.lang.String text, java.nio.IntBuffer codepointSize) {
        return Raylib.GetCodepointNext(text, codepointSize);
    }

    public static int getCodepointNext(java.lang.String text, org.bytedeco.javacpp.IntPointer codepointSize) {
        return Raylib.GetCodepointNext(text, codepointSize);
    }

    public static com.raylib.Raylib.Rectangle getGlyphAtlasRec(com.raylib.Raylib.Font font, int codepoint) {
        return Raylib.GetGlyphAtlasRec(font, codepoint);
    }

    public static void drawCircle3D(com.raylib.Raylib.Vector3 center, float radius, com.raylib.Raylib.Vector3 rotationAxis, float rotationAngle, com.raylib.Raylib.Color color) {
        Raylib.DrawCircle3D(center, radius, rotationAxis, rotationAngle, color);
    }

    public static boolean isModelValid(com.raylib.Raylib.Model model) {
        return Raylib.IsModelValid(model);
    }

    public static void drawModelWires(com.raylib.Raylib.Model model, com.raylib.Raylib.Vector3 position, float scale, com.raylib.Raylib.Color tint) {
        Raylib.DrawModelWires(model, position, scale, tint);
    }

    public static void drawModelWiresEx(com.raylib.Raylib.Model model, com.raylib.Raylib.Vector3 position, com.raylib.Raylib.Vector3 rotationAxis, float rotationAngle, com.raylib.Raylib.Vector3 scale, com.raylib.Raylib.Color tint) {
        Raylib.DrawModelWiresEx(model, position, rotationAxis, rotationAngle, scale, tint);
    }

    public static org.bytedeco.javacpp.BytePointer textToPascal(org.bytedeco.javacpp.BytePointer text) {
        return Raylib.TextToPascal(text);
    }

    public static java.lang.String textToPascal(java.lang.String text) {
        return Raylib.TextToPascal(text);
    }

    public static int textToInteger(org.bytedeco.javacpp.BytePointer text) {
        return Raylib.TextToInteger(text);
    }

    public static int textToInteger(java.lang.String text) {
        return Raylib.TextToInteger(text);
    }

    public static void drawTriangle3D(com.raylib.Raylib.Vector3 v1, com.raylib.Raylib.Vector3 v2, com.raylib.Raylib.Vector3 v3, com.raylib.Raylib.Color color) {
        Raylib.DrawTriangle3D(v1, v2, v3, color);
    }

    public static void drawModelPoints(com.raylib.Raylib.Model model, com.raylib.Raylib.Vector3 position, float scale, com.raylib.Raylib.Color tint) {
        Raylib.DrawModelPoints(model, position, scale, tint);
    }

    public static void drawBillboardRec(com.raylib.Raylib.Camera3D camera, com.raylib.Raylib.Texture texture, com.raylib.Raylib.Rectangle source, com.raylib.Raylib.Vector3 position, com.raylib.Raylib.Vector2 size, com.raylib.Raylib.Color tint) {
        Raylib.DrawBillboardRec(camera, texture, source, position, size, tint);
    }

    public static void drawBillboardPro(com.raylib.Raylib.Camera3D camera, com.raylib.Raylib.Texture texture, com.raylib.Raylib.Rectangle source, com.raylib.Raylib.Vector3 position, com.raylib.Raylib.Vector3 up, com.raylib.Raylib.Vector2 size, com.raylib.Raylib.Vector2 origin, float rotation, com.raylib.Raylib.Color tint) {
        Raylib.DrawBillboardPro(camera, texture, source, position, up, size, origin, rotation, tint);
    }

    public static void drawBillboard(com.raylib.Raylib.Camera3D camera, com.raylib.Raylib.Texture texture, com.raylib.Raylib.Vector3 position, float scale, com.raylib.Raylib.Color tint) {
        Raylib.DrawBillboard(camera, texture, position, scale, tint);
    }

    public static void drawModelEx(com.raylib.Raylib.Model model, com.raylib.Raylib.Vector3 position, com.raylib.Raylib.Vector3 rotationAxis, float rotationAngle, com.raylib.Raylib.Vector3 scale, com.raylib.Raylib.Color tint) {
        Raylib.DrawModelEx(model, position, rotationAxis, rotationAngle, scale, tint);
    }

    public static void updateMeshBuffer(com.raylib.Raylib.Mesh mesh, int index, org.bytedeco.javacpp.Pointer data, int dataSize, int offset) {
        Raylib.UpdateMeshBuffer(mesh, index, data, dataSize, offset);
    }

    public static void drawMeshInstanced(com.raylib.Raylib.Mesh mesh, com.raylib.Raylib.Material material, com.raylib.Raylib.Matrix transforms, int instances) {
        Raylib.DrawMeshInstanced(mesh, material, transforms, instances);
    }

    public static void drawTextCodepoints(com.raylib.Raylib.Font font, int[] codepoints, int codepointCount, com.raylib.Raylib.Vector2 position, float fontSize, float spacing, com.raylib.Raylib.Color tint) {
        Raylib.DrawTextCodepoints(font, codepoints, codepointCount, position, fontSize, spacing, tint);
    }

    public static void drawTextCodepoints(com.raylib.Raylib.Font font, java.nio.IntBuffer codepoints, int codepointCount, com.raylib.Raylib.Vector2 position, float fontSize, float spacing, com.raylib.Raylib.Color tint) {
        Raylib.DrawTextCodepoints(font, codepoints, codepointCount, position, fontSize, spacing, tint);
    }

    public static void drawTextCodepoints(com.raylib.Raylib.Font font, org.bytedeco.javacpp.IntPointer codepoints, int codepointCount, com.raylib.Raylib.Vector2 position, float fontSize, float spacing, com.raylib.Raylib.Color tint) {
        Raylib.DrawTextCodepoints(font, codepoints, codepointCount, position, fontSize, spacing, tint);
    }

    public static org.bytedeco.javacpp.BytePointer textToUpper(org.bytedeco.javacpp.BytePointer text) {
        return Raylib.TextToUpper(text);
    }

    public static java.lang.String textToUpper(java.lang.String text) {
        return Raylib.TextToUpper(text);
    }

    public static void drawCylinder(com.raylib.Raylib.Vector3 position, float radiusTop, float radiusBottom, float height, int slices, com.raylib.Raylib.Color color) {
        Raylib.DrawCylinder(position, radiusTop, radiusBottom, height, slices, color);
    }

    public static void drawCapsuleWires(com.raylib.Raylib.Vector3 startPos, com.raylib.Raylib.Vector3 endPos, float radius, int slices, int rings, com.raylib.Raylib.Color color) {
        Raylib.DrawCapsuleWires(startPos, endPos, radius, slices, rings, color);
    }

    public static void drawSphereWires(com.raylib.Raylib.Vector3 centerPos, float radius, int rings, int slices, com.raylib.Raylib.Color color) {
        Raylib.DrawSphereWires(centerPos, radius, rings, slices, color);
    }

    public static void unloadModel(com.raylib.Raylib.Model model) {
        Raylib.UnloadModel(model);
    }

    public static java.lang.String textSubtext(java.lang.String text, int position, int length) {
        return Raylib.TextSubtext(text, position, length);
    }

    public static org.bytedeco.javacpp.BytePointer textSubtext(org.bytedeco.javacpp.BytePointer text, int position, int length) {
        return Raylib.TextSubtext(text, position, length);
    }

    public static void drawSphereEx(com.raylib.Raylib.Vector3 centerPos, float radius, int rings, int slices, com.raylib.Raylib.Color color) {
        Raylib.DrawSphereEx(centerPos, radius, rings, slices, color);
    }

    public static void drawBoundingBox(com.raylib.Raylib.BoundingBox box, com.raylib.Raylib.Color color) {
        Raylib.DrawBoundingBox(box, color);
    }

    public static com.raylib.Raylib.BoundingBox getMeshBoundingBox(com.raylib.Raylib.Mesh mesh) {
        return Raylib.GetMeshBoundingBox(mesh);
    }

    public static com.raylib.Raylib.GlyphInfo getGlyphInfo(com.raylib.Raylib.Font font, int codepoint) {
        return Raylib.GetGlyphInfo(font, codepoint);
    }

    public static void drawCylinderEx(com.raylib.Raylib.Vector3 startPos, com.raylib.Raylib.Vector3 endPos, float startRadius, float endRadius, int sides, com.raylib.Raylib.Color color) {
        Raylib.DrawCylinderEx(startPos, endPos, startRadius, endRadius, sides, color);
    }

    public static void drawCubeWiresV(com.raylib.Raylib.Vector3 position, com.raylib.Raylib.Vector3 size, com.raylib.Raylib.Color color) {
        Raylib.DrawCubeWiresV(position, size, color);
    }

    public static void genMeshTangents(com.raylib.Raylib.Mesh mesh) {
        Raylib.GenMeshTangents(mesh);
    }

    public static boolean exportMeshAsCode(com.raylib.Raylib.Mesh mesh, java.lang.String fileName) {
        return Raylib.ExportMeshAsCode(mesh, fileName);
    }

    public static boolean exportMeshAsCode(com.raylib.Raylib.Mesh mesh, org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.ExportMeshAsCode(mesh, fileName);
    }

    public static void setMusicPan(com.raylib.Raylib.Music music, float pan) {
        Raylib.SetMusicPan(music, pan);
    }

    public static com.raylib.Raylib.Mesh genMeshCylinder(float radius, float height, int slices) {
        return Raylib.GenMeshCylinder(radius, height, slices);
    }

    public static com.raylib.Raylib.Material loadMaterials(org.bytedeco.javacpp.BytePointer fileName, int[] materialCount) {
        return Raylib.LoadMaterials(fileName, materialCount);
    }

    public static com.raylib.Raylib.Material loadMaterials(org.bytedeco.javacpp.BytePointer fileName, java.nio.IntBuffer materialCount) {
        return Raylib.LoadMaterials(fileName, materialCount);
    }

    public static com.raylib.Raylib.Material loadMaterials(java.lang.String fileName, java.nio.IntBuffer materialCount) {
        return Raylib.LoadMaterials(fileName, materialCount);
    }

    public static com.raylib.Raylib.Material loadMaterials(java.lang.String fileName, org.bytedeco.javacpp.IntPointer materialCount) {
        return Raylib.LoadMaterials(fileName, materialCount);
    }

    public static com.raylib.Raylib.Material loadMaterials(org.bytedeco.javacpp.BytePointer fileName, org.bytedeco.javacpp.IntPointer materialCount) {
        return Raylib.LoadMaterials(fileName, materialCount);
    }

    public static com.raylib.Raylib.Material loadMaterials(java.lang.String fileName, int[] materialCount) {
        return Raylib.LoadMaterials(fileName, materialCount);
    }

    public static void unloadSound(com.raylib.Raylib.Sound sound) {
        Raylib.UnloadSound(sound);
    }

    public static com.raylib.Raylib.Mesh genMeshKnot(float radius, float size, int radSeg, int sides) {
        return Raylib.GenMeshKnot(radius, size, radSeg, sides);
    }

    public static boolean isSoundPlaying(com.raylib.Raylib.Sound sound) {
        return Raylib.IsSoundPlaying(sound);
    }

    public static void updateAudioStream(com.raylib.Raylib.AudioStream stream, org.bytedeco.javacpp.Pointer data, int frameCount) {
        Raylib.UpdateAudioStream(stream, data, frameCount);
    }

    public static void setMusicVolume(com.raylib.Raylib.Music music, float volume) {
        Raylib.SetMusicVolume(music, volume);
    }

    public static void rlPushMatrix() {
        Raylib.rlPushMatrix();
    }

    public static void rlPopMatrix() {
        Raylib.rlPopMatrix();
    }

    public static void rlLoadIdentity() {
        Raylib.rlLoadIdentity();
    }

    public static void setMusicPitch(com.raylib.Raylib.Music music, float pitch) {
        Raylib.SetMusicPitch(music, pitch);
    }

    public static void unloadSoundAlias(com.raylib.Raylib.Sound alias) {
        Raylib.UnloadSoundAlias(alias);
    }

    public static com.raylib.Raylib.Sound loadSoundFromWave(com.raylib.Raylib.Wave wave) {
        return Raylib.LoadSoundFromWave(wave);
    }

    public static void unloadWaveSamples(java.nio.FloatBuffer samples) {
        Raylib.UnloadWaveSamples(samples);
    }

    public static void unloadWaveSamples(org.bytedeco.javacpp.FloatPointer samples) {
        Raylib.UnloadWaveSamples(samples);
    }

    public static void unloadWaveSamples(float[] samples) {
        Raylib.UnloadWaveSamples(samples);
    }

    public static void setMasterVolume(float volume) {
        Raylib.SetMasterVolume(volume);
    }

    public static void pauseAudioStream(com.raylib.Raylib.AudioStream stream) {
        Raylib.PauseAudioStream(stream);
    }

    public static void setSoundVolume(com.raylib.Raylib.Sound sound, float volume) {
        Raylib.SetSoundVolume(sound, volume);
    }

    public static void rlMatrixMode(int arg0) {
        Raylib.rlMatrixMode(arg0);
    }

    public static float getMusicTimeLength(com.raylib.Raylib.Music music) {
        return Raylib.GetMusicTimeLength(music);
    }

    public static void closeAudioDevice() {
        Raylib.CloseAudioDevice();
    }

    public static void updateMusicStream(com.raylib.Raylib.Music music) {
        Raylib.UpdateMusicStream(music);
    }

    public static void playAudioStream(com.raylib.Raylib.AudioStream stream) {
        Raylib.PlayAudioStream(stream);
    }

    public static void rlTranslatef(float arg0, float arg1, float arg2) {
        Raylib.rlTranslatef(arg0, arg1, arg2);
    }

    public static void setMaterialTexture(com.raylib.Raylib.Material material, int mapType, com.raylib.Raylib.Texture texture) {
        Raylib.SetMaterialTexture(material, mapType, texture);
    }

    public static void rlMultMatrixf(float[] arg0) {
        Raylib.rlMultMatrixf(arg0);
    }

    public static void rlMultMatrixf(java.nio.FloatBuffer arg0) {
        Raylib.rlMultMatrixf(arg0);
    }

    public static void rlMultMatrixf(org.bytedeco.javacpp.FloatPointer arg0) {
        Raylib.rlMultMatrixf(arg0);
    }

    public static void updateSound(com.raylib.Raylib.Sound sound, org.bytedeco.javacpp.Pointer data, int sampleCount) {
        Raylib.UpdateSound(sound, data, sampleCount);
    }

    public static boolean isSoundValid(com.raylib.Raylib.Sound sound) {
        return Raylib.IsSoundValid(sound);
    }

    public static boolean isMaterialValid(com.raylib.Raylib.Material material) {
        return Raylib.IsMaterialValid(material);
    }

    public static void setSoundPitch(com.raylib.Raylib.Sound sound, float pitch) {
        Raylib.SetSoundPitch(sound, pitch);
    }

    public static void playMusicStream(com.raylib.Raylib.Music music) {
        Raylib.PlayMusicStream(music);
    }

    public static com.raylib.Raylib.Mesh genMeshCubicmap(com.raylib.Raylib.Image cubicmap, com.raylib.Raylib.Vector3 cubeSize) {
        return Raylib.GenMeshCubicmap(cubicmap, cubeSize);
    }

    public static com.raylib.Raylib.Sound loadSoundAlias(com.raylib.Raylib.Sound source) {
        return Raylib.LoadSoundAlias(source);
    }

    public static void stopMusicStream(com.raylib.Raylib.Music music) {
        Raylib.StopMusicStream(music);
    }

    public static com.raylib.Raylib.Mesh genMeshHemiSphere(float radius, int rings, int slices) {
        return Raylib.GenMeshHemiSphere(radius, rings, slices);
    }

    public static com.raylib.Raylib.RayCollision getRayCollisionBox(com.raylib.Raylib.Ray ray, com.raylib.Raylib.BoundingBox box) {
        return Raylib.GetRayCollisionBox(ray, box);
    }

    public static void unloadMaterial(com.raylib.Raylib.Material material) {
        Raylib.UnloadMaterial(material);
    }

    public static float getMasterVolume() {
        return Raylib.GetMasterVolume();
    }

    public static boolean exportWaveAsCode(com.raylib.Raylib.Wave wave, java.lang.String fileName) {
        return Raylib.ExportWaveAsCode(wave, fileName);
    }

    public static boolean exportWaveAsCode(com.raylib.Raylib.Wave wave, org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.ExportWaveAsCode(wave, fileName);
    }

    public static void unloadMusicStream(com.raylib.Raylib.Music music) {
        Raylib.UnloadMusicStream(music);
    }

    public static com.raylib.Raylib.Mesh genMeshCone(float radius, float height, int slices) {
        return Raylib.GenMeshCone(radius, height, slices);
    }

    public static void resumeMusicStream(com.raylib.Raylib.Music music) {
        Raylib.ResumeMusicStream(music);
    }

    public static float getMusicTimePlayed(com.raylib.Raylib.Music music) {
        return Raylib.GetMusicTimePlayed(music);
    }

    public static com.raylib.Raylib.Music loadMusicStream(java.lang.String fileName) {
        return Raylib.LoadMusicStream(fileName);
    }

    public static com.raylib.Raylib.Music loadMusicStream(org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.LoadMusicStream(fileName);
    }

    public static com.raylib.Raylib.AudioStream loadAudioStream(int sampleRate, int sampleSize, int channels) {
        return Raylib.LoadAudioStream(sampleRate, sampleSize, channels);
    }

    public static org.bytedeco.javacpp.FloatPointer loadWaveSamples(com.raylib.Raylib.Wave wave) {
        return Raylib.LoadWaveSamples(wave);
    }

    public static boolean isAudioStreamValid(com.raylib.Raylib.AudioStream stream) {
        return Raylib.IsAudioStreamValid(stream);
    }

    public static void unloadAudioStream(com.raylib.Raylib.AudioStream stream) {
        Raylib.UnloadAudioStream(stream);
    }

    public static void pauseMusicStream(com.raylib.Raylib.Music music) {
        Raylib.PauseMusicStream(music);
    }

    public static com.raylib.Raylib.Mesh genMeshTorus(float radius, float size, int radSeg, int sides) {
        return Raylib.GenMeshTorus(radius, size, radSeg, sides);
    }

    public static com.raylib.Raylib.Mesh genMeshHeightmap(com.raylib.Raylib.Image heightmap, com.raylib.Raylib.Vector3 size) {
        return Raylib.GenMeshHeightmap(heightmap, size);
    }

    public static boolean isAudioDeviceReady() {
        return Raylib.IsAudioDeviceReady();
    }

    public static void resumeSound(com.raylib.Raylib.Sound sound) {
        Raylib.ResumeSound(sound);
    }

    public static void setSoundPan(com.raylib.Raylib.Sound sound, float pan) {
        Raylib.SetSoundPan(sound, pan);
    }

    public static void stopAudioStream(com.raylib.Raylib.AudioStream stream) {
        Raylib.StopAudioStream(stream);
    }

    public static void resumeAudioStream(com.raylib.Raylib.AudioStream stream) {
        Raylib.ResumeAudioStream(stream);
    }

    public static boolean isMusicValid(com.raylib.Raylib.Music music) {
        return Raylib.IsMusicValid(music);
    }

    public static boolean isWaveValid(com.raylib.Raylib.Wave wave) {
        return Raylib.IsWaveValid(wave);
    }

    public static void seekMusicStream(com.raylib.Raylib.Music music, float position) {
        Raylib.SeekMusicStream(music, position);
    }

    public static void setAudioStreamPan(com.raylib.Raylib.AudioStream stream, float pan) {
        Raylib.SetAudioStreamPan(stream, pan);
    }

    public static com.raylib.Raylib.Wave loadWaveFromMemory(org.bytedeco.javacpp.BytePointer fileType, java.nio.ByteBuffer fileData, int dataSize) {
        return Raylib.LoadWaveFromMemory(fileType, fileData, dataSize);
    }

    public static com.raylib.Raylib.Wave loadWaveFromMemory(java.lang.String fileType, org.bytedeco.javacpp.BytePointer fileData, int dataSize) {
        return Raylib.LoadWaveFromMemory(fileType, fileData, dataSize);
    }

    public static com.raylib.Raylib.Wave loadWaveFromMemory(java.lang.String fileType, java.nio.ByteBuffer fileData, int dataSize) {
        return Raylib.LoadWaveFromMemory(fileType, fileData, dataSize);
    }

    public static com.raylib.Raylib.Wave loadWaveFromMemory(org.bytedeco.javacpp.BytePointer fileType, byte[] fileData, int dataSize) {
        return Raylib.LoadWaveFromMemory(fileType, fileData, dataSize);
    }

    public static com.raylib.Raylib.Wave loadWaveFromMemory(org.bytedeco.javacpp.BytePointer fileType, org.bytedeco.javacpp.BytePointer fileData, int dataSize) {
        return Raylib.LoadWaveFromMemory(fileType, fileData, dataSize);
    }

    public static com.raylib.Raylib.Wave loadWaveFromMemory(java.lang.String fileType, byte[] fileData, int dataSize) {
        return Raylib.LoadWaveFromMemory(fileType, fileData, dataSize);
    }

    public static void initAudioDevice() {
        Raylib.InitAudioDevice();
    }

    public static com.raylib.Raylib.Vector4 addPut(com.raylib.Raylib.Vector4 arg0, float arg1) {
        return Raylib.addPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 addPut(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.addPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Matrix addPut(com.raylib.Raylib.Matrix arg0, com.raylib.Raylib.Matrix arg1) {
        return Raylib.addPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 addPut(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.addPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 addPut(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.addPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 vector4Add(com.raylib.Raylib.Vector4 v1, com.raylib.Raylib.Vector4 v2) {
        return Raylib.Vector4Add(v1, v2);
    }

    public static int guiLine(com.raylib.Raylib.Rectangle bounds, java.lang.String text) {
        return Raylib.GuiLine(bounds, text);
    }

    public static int guiLine(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text) {
        return Raylib.GuiLine(bounds, text);
    }

    public static int guiButton(com.raylib.Raylib.Rectangle bounds, java.lang.String text) {
        return Raylib.GuiButton(bounds, text);
    }

    public static int guiButton(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text) {
        return Raylib.GuiButton(bounds, text);
    }

    public static void guiEnable() {
        Raylib.GuiEnable();
    }

    public static int guiTextBox(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, int textSize, boolean editMode) {
        return Raylib.GuiTextBox(bounds, text, textSize, editMode);
    }

    public static int guiTextBox(com.raylib.Raylib.Rectangle bounds, byte[] text, int textSize, boolean editMode) {
        return Raylib.GuiTextBox(bounds, text, textSize, editMode);
    }

    public static int guiTextBox(com.raylib.Raylib.Rectangle bounds, java.nio.ByteBuffer text, int textSize, boolean editMode) {
        return Raylib.GuiTextBox(bounds, text, textSize, editMode);
    }

    public static int guiGrid(com.raylib.Raylib.Rectangle bounds, java.lang.String text, float spacing, int subdivs, com.raylib.Raylib.Vector2 mouseCell) {
        return Raylib.GuiGrid(bounds, text, spacing, subdivs, mouseCell);
    }

    public static int guiGrid(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, float spacing, int subdivs, com.raylib.Raylib.Vector2 mouseCell) {
        return Raylib.GuiGrid(bounds, text, spacing, subdivs, mouseCell);
    }

    public static void guiLock() {
        Raylib.GuiLock();
    }

    public static int guiPanel(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text) {
        return Raylib.GuiPanel(bounds, text);
    }

    public static int guiPanel(com.raylib.Raylib.Rectangle bounds, java.lang.String text) {
        return Raylib.GuiPanel(bounds, text);
    }

    public static void guiSetFont(com.raylib.Raylib.Font font) {
        Raylib.GuiSetFont(font);
    }

    public static void guiUnlock() {
        Raylib.GuiUnlock();
    }

    public static com.raylib.Raylib.Vector4 vector4Max(com.raylib.Raylib.Vector4 v1, com.raylib.Raylib.Vector4 v2) {
        return Raylib.Vector4Max(v1, v2);
    }

    public static int guiTabBar(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, int count, org.bytedeco.javacpp.IntPointer active) {
        return Raylib.GuiTabBar(bounds, text, count, active);
    }

    public static int guiTabBar(com.raylib.Raylib.Rectangle bounds, byte[] text, int count, int[] active) {
        return Raylib.GuiTabBar(bounds, text, count, active);
    }

    public static int guiTabBar(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.PointerPointer text, int count, org.bytedeco.javacpp.IntPointer active) {
        return Raylib.GuiTabBar(bounds, text, count, active);
    }

    public static int guiTabBar(com.raylib.Raylib.Rectangle bounds, java.nio.ByteBuffer text, int count, java.nio.IntBuffer active) {
        return Raylib.GuiTabBar(bounds, text, count, active);
    }

    public static com.raylib.Raylib.Font guiGetFont() {
        return Raylib.GuiGetFont();
    }

    public static com.raylib.Raylib.Vector4 dividePut(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.dividePut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 dividePut(com.raylib.Raylib.Vector2 arg0, float arg1) {
        return Raylib.dividePut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 dividePut(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.dividePut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 dividePut(com.raylib.Raylib.Vector3 arg0, float arg1) {
        return Raylib.dividePut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 dividePut(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.dividePut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 dividePut(com.raylib.Raylib.Vector4 arg0, float arg1) {
        return Raylib.dividePut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 vector3Max(com.raylib.Raylib.Vector3 v1, com.raylib.Raylib.Vector3 v2) {
        return Raylib.Vector3Max(v1, v2);
    }

    public static int guiSpinner(com.raylib.Raylib.Rectangle bounds, java.lang.String text, int[] value, int minValue, int maxValue, boolean editMode) {
        return Raylib.GuiSpinner(bounds, text, value, minValue, maxValue, editMode);
    }

    public static int guiSpinner(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, int[] value, int minValue, int maxValue, boolean editMode) {
        return Raylib.GuiSpinner(bounds, text, value, minValue, maxValue, editMode);
    }

    public static int guiSpinner(com.raylib.Raylib.Rectangle bounds, java.lang.String text, org.bytedeco.javacpp.IntPointer value, int minValue, int maxValue, boolean editMode) {
        return Raylib.GuiSpinner(bounds, text, value, minValue, maxValue, editMode);
    }

    public static int guiSpinner(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, java.nio.IntBuffer value, int minValue, int maxValue, boolean editMode) {
        return Raylib.GuiSpinner(bounds, text, value, minValue, maxValue, editMode);
    }

    public static int guiSpinner(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.IntPointer value, int minValue, int maxValue, boolean editMode) {
        return Raylib.GuiSpinner(bounds, text, value, minValue, maxValue, editMode);
    }

    public static int guiSpinner(com.raylib.Raylib.Rectangle bounds, java.lang.String text, java.nio.IntBuffer value, int minValue, int maxValue, boolean editMode) {
        return Raylib.GuiSpinner(bounds, text, value, minValue, maxValue, editMode);
    }

    public static com.raylib.Raylib.Vector3 vector3Min(com.raylib.Raylib.Vector3 v1, com.raylib.Raylib.Vector3 v2) {
        return Raylib.Vector3Min(v1, v2);
    }

    public static void guiDisable() {
        Raylib.GuiDisable();
    }

    public static boolean notEquals(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.notEquals(arg0, arg1);
    }

    public static boolean notEquals(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.notEquals(arg0, arg1);
    }

    public static boolean notEquals(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.notEquals(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 vector3Add(com.raylib.Raylib.Vector3 v1, com.raylib.Raylib.Vector3 v2) {
        return Raylib.Vector3Add(v1, v2);
    }

    public static com.raylib.Raylib.Matrix matrixAdd(com.raylib.Raylib.Matrix left, com.raylib.Raylib.Matrix right) {
        return Raylib.MatrixAdd(left, right);
    }

    public static int guiToggle(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.BoolPointer active) {
        return Raylib.GuiToggle(bounds, text, active);
    }

    public static int guiToggle(com.raylib.Raylib.Rectangle bounds, java.lang.String text, boolean[] active) {
        return Raylib.GuiToggle(bounds, text, active);
    }

    public static int guiSlider(com.raylib.Raylib.Rectangle bounds, java.lang.String textLeft, java.lang.String textRight, org.bytedeco.javacpp.FloatPointer value, float minValue, float maxValue) {
        return Raylib.GuiSlider(bounds, textLeft, textRight, value, minValue, maxValue);
    }

    public static int guiSlider(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer textLeft, org.bytedeco.javacpp.BytePointer textRight, java.nio.FloatBuffer value, float minValue, float maxValue) {
        return Raylib.GuiSlider(bounds, textLeft, textRight, value, minValue, maxValue);
    }

    public static int guiSlider(com.raylib.Raylib.Rectangle bounds, java.lang.String textLeft, java.lang.String textRight, float[] value, float minValue, float maxValue) {
        return Raylib.GuiSlider(bounds, textLeft, textRight, value, minValue, maxValue);
    }

    public static int guiSlider(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer textLeft, org.bytedeco.javacpp.BytePointer textRight, org.bytedeco.javacpp.FloatPointer value, float minValue, float maxValue) {
        return Raylib.GuiSlider(bounds, textLeft, textRight, value, minValue, maxValue);
    }

    public static int guiSlider(com.raylib.Raylib.Rectangle bounds, java.lang.String textLeft, java.lang.String textRight, java.nio.FloatBuffer value, float minValue, float maxValue) {
        return Raylib.GuiSlider(bounds, textLeft, textRight, value, minValue, maxValue);
    }

    public static int guiSlider(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer textLeft, org.bytedeco.javacpp.BytePointer textRight, float[] value, float minValue, float maxValue) {
        return Raylib.GuiSlider(bounds, textLeft, textRight, value, minValue, maxValue);
    }

    public static int guiLabel(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text) {
        return Raylib.GuiLabel(bounds, text);
    }

    public static int guiLabel(com.raylib.Raylib.Rectangle bounds, java.lang.String text) {
        return Raylib.GuiLabel(bounds, text);
    }

    public static com.raylib.Raylib.Vector4 vector4One() {
        return Raylib.Vector4One();
    }

    public static com.raylib.Raylib.Vector4 vector4Min(com.raylib.Raylib.Vector4 v1, com.raylib.Raylib.Vector4 v2) {
        return Raylib.Vector4Min(v1, v2);
    }

    public static com.raylib.Raylib.Matrix matrixMultiply(com.raylib.Raylib.Matrix left, com.raylib.Raylib.Matrix right) {
        return Raylib.MatrixMultiply(left, right);
    }

    public static com.raylib.Raylib.Matrix matrixRotateZYX(com.raylib.Raylib.Vector3 angle) {
        return Raylib.MatrixRotateZYX(angle);
    }

    public static com.raylib.Raylib.Vector4 vector4UnitY() {
        return Raylib.Vector4UnitY();
    }

    public static com.raylib.Raylib.Vector4 quaternionAdd(com.raylib.Raylib.Vector4 q1, com.raylib.Raylib.Vector4 q2) {
        return Raylib.QuaternionAdd(q1, q2);
    }

    public static com.raylib.Raylib.Vector4 quaternionMultiply(com.raylib.Raylib.Vector4 q1, com.raylib.Raylib.Vector4 q2) {
        return Raylib.QuaternionMultiply(q1, q2);
    }

    public static com.raylib.Raylib.Matrix matrixTranspose(com.raylib.Raylib.Matrix mat) {
        return Raylib.MatrixTranspose(mat);
    }

    public static com.raylib.Raylib.Vector3 vector3UnitX() {
        return Raylib.Vector3UnitX();
    }

    public static com.raylib.Raylib.Vector4 vector4Ones() {
        return Raylib.Vector4Ones();
    }

    public static com.raylib.Raylib.Vector2 vector2Ones() {
        return Raylib.Vector2Ones();
    }

    public static com.raylib.Raylib.Vector4 quaternionInvert(com.raylib.Raylib.Vector4 q) {
        return Raylib.QuaternionInvert(q);
    }

    public static int quaternionEquals(com.raylib.Raylib.Vector4 p, com.raylib.Raylib.Vector4 q) {
        return Raylib.QuaternionEquals(p, q);
    }

    public static com.raylib.Raylib.Matrix matrixSubtract(com.raylib.Raylib.Matrix left, com.raylib.Raylib.Matrix right) {
        return Raylib.MatrixSubtract(left, right);
    }

    public static com.raylib.Raylib.Matrix matrixFrustum(double left, double right, double bottom, double top, double nearPlane, double farPlane) {
        return Raylib.MatrixFrustum(left, right, bottom, top, nearPlane, farPlane);
    }

    public static com.raylib.Raylib.Matrix matrixTranslate(float x, float y, float z) {
        return Raylib.MatrixTranslate(x, y, z);
    }

    public static com.raylib.Raylib.Vector4 quaternionSlerp(com.raylib.Raylib.Vector4 q1, com.raylib.Raylib.Vector4 q2, float amount) {
        return Raylib.QuaternionSlerp(q1, q2, amount);
    }

    public static com.raylib.Raylib.Vector3 vector3UnitZ() {
        return Raylib.Vector3UnitZ();
    }

    public static com.raylib.Raylib.Vector2 vector2Zeros() {
        return Raylib.Vector2Zeros();
    }

    public static com.raylib.Raylib.Vector4 quaternionAddValue(com.raylib.Raylib.Vector4 q, float add) {
        return Raylib.QuaternionAddValue(q, add);
    }

    public static com.raylib.Raylib.Vector4 vector4UnitZ() {
        return Raylib.Vector4UnitZ();
    }

    public static com.raylib.Raylib.Matrix matrixRotateXYZ(com.raylib.Raylib.Vector3 angle) {
        return Raylib.MatrixRotateXYZ(angle);
    }

    public static com.raylib.Raylib.Matrix matrixIdentity() {
        return Raylib.MatrixIdentity();
    }

    public static com.raylib.Raylib.Vector4 quaternionDivide(com.raylib.Raylib.Vector4 q1, com.raylib.Raylib.Vector4 q2) {
        return Raylib.QuaternionDivide(q1, q2);
    }

    public static com.raylib.Raylib.Vector4 vector4UnitW() {
        return Raylib.Vector4UnitW();
    }

    public static void resetPhysics() {
        Raylib.ResetPhysics();
    }

    public static com.raylib.Raylib.Vector2 vector2UnitY() {
        return Raylib.Vector2UnitY();
    }

    public static com.raylib.Raylib.Matrix matrixRotateY(float angle) {
        return Raylib.MatrixRotateY(angle);
    }

    public static com.raylib.Raylib.Matrix matrixRotateX(float angle) {
        return Raylib.MatrixRotateX(angle);
    }

    public static float quaternionLength(com.raylib.Raylib.Vector4 q) {
        return Raylib.QuaternionLength(q);
    }

    public static com.raylib.Raylib.Vector4 quaternionSubtract(com.raylib.Raylib.Vector4 q1, com.raylib.Raylib.Vector4 q2) {
        return Raylib.QuaternionSubtract(q1, q2);
    }

    public static com.raylib.Raylib.Vector2 subtractPut(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Matrix arg1) {
        return Raylib.subtractPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 subtractPut(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.subtractPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 subtractPut(com.raylib.Raylib.Vector4 arg0, float arg1) {
        return Raylib.subtractPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 subtractPut(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Matrix arg1) {
        return Raylib.subtractPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 subtractPut(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.subtractPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Matrix subtractPut(com.raylib.Raylib.Matrix arg0, com.raylib.Raylib.Matrix arg1) {
        return Raylib.subtractPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 subtractPut(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.subtractPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Matrix matrixRotate(com.raylib.Raylib.Vector3 axis, float angle) {
        return Raylib.MatrixRotate(axis, angle);
    }

    public static com.raylib.Raylib.Vector3 vector3Zeros() {
        return Raylib.Vector3Zeros();
    }

    public static com.raylib.Raylib.Matrix quaternionToMatrix(com.raylib.Raylib.Vector4 q) {
        return Raylib.QuaternionToMatrix(q);
    }

    public static com.raylib.Raylib.Matrix matrixOrtho(double left, double right, double bottom, double top, double nearPlane, double farPlane) {
        return Raylib.MatrixOrtho(left, right, bottom, top, nearPlane, farPlane);
    }

    public static com.raylib.Raylib.Vector4 vector4UnitX() {
        return Raylib.Vector4UnitX();
    }

    public static com.raylib.Raylib.Vector4 quaternionZeros() {
        return Raylib.QuaternionZeros();
    }

    public static com.raylib.Raylib.Matrix matrixRotateZ(float angle) {
        return Raylib.MatrixRotateZ(angle);
    }

    public static com.raylib.Raylib.Vector3 vector3UnitY() {
        return Raylib.Vector3UnitY();
    }

    public static com.raylib.Raylib.Vector4 vector4Zeros() {
        return Raylib.Vector4Zeros();
    }

    public static com.raylib.Raylib.Vector4 quaternionNlerp(com.raylib.Raylib.Vector4 q1, com.raylib.Raylib.Vector4 q2, float amount) {
        return Raylib.QuaternionNlerp(q1, q2, amount);
    }

    public static com.raylib.Raylib.Matrix matrixLookAt(com.raylib.Raylib.Vector3 eye, com.raylib.Raylib.Vector3 target, com.raylib.Raylib.Vector3 up) {
        return Raylib.MatrixLookAt(eye, target, up);
    }

    public static com.raylib.Raylib.Vector4 quaternionOnes() {
        return Raylib.QuaternionOnes();
    }

    public static com.raylib.Raylib.Vector4 quaternionLerp(com.raylib.Raylib.Vector4 q1, com.raylib.Raylib.Vector4 q2, float amount) {
        return Raylib.QuaternionLerp(q1, q2, amount);
    }

    public static com.raylib.Raylib.Matrix matrixScale(float x, float y, float z) {
        return Raylib.MatrixScale(x, y, z);
    }

    public static com.raylib.Raylib.float16 matrixToFloatV(com.raylib.Raylib.Matrix mat) {
        return Raylib.MatrixToFloatV(mat);
    }

    public static com.raylib.Raylib.Matrix matrixInvert(com.raylib.Raylib.Matrix mat) {
        return Raylib.MatrixInvert(mat);
    }

    public static com.raylib.Raylib.Matrix matrixPerspective(double fovY, double aspect, double nearPlane, double farPlane) {
        return Raylib.MatrixPerspective(fovY, aspect, nearPlane, farPlane);
    }

    public static com.raylib.Raylib.Vector4 quaternionIdentity() {
        return Raylib.QuaternionIdentity();
    }

    public static com.raylib.Raylib.Vector2 vector2UnitX() {
        return Raylib.Vector2UnitX();
    }

    public static com.raylib.Raylib.Vector3 vector3Ones() {
        return Raylib.Vector3Ones();
    }

    public static com.raylib.Raylib.Vector4 quaternionScale(com.raylib.Raylib.Vector4 q, float mul) {
        return Raylib.QuaternionScale(q, mul);
    }

    public static com.raylib.Raylib.Vector3 quaternionToEuler(com.raylib.Raylib.Vector4 q) {
        return Raylib.QuaternionToEuler(q);
    }

    public static com.raylib.Raylib.Vector3 multiplyPut(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.multiplyPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 multiplyPut(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.multiplyPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 multiplyPut(com.raylib.Raylib.Vector4 arg0, float arg1) {
        return Raylib.multiplyPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 multiplyPut(com.raylib.Raylib.Vector2 arg0, float arg1) {
        return Raylib.multiplyPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Matrix multiplyPut(com.raylib.Raylib.Matrix arg0, com.raylib.Raylib.Matrix arg1) {
        return Raylib.multiplyPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 multiplyPut(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.multiplyPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 multiplyPut(com.raylib.Raylib.Vector3 arg0, float arg1) {
        return Raylib.multiplyPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 multiplyPut(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Matrix arg1) {
        return Raylib.multiplyPut(arg0, arg1);
    }

    public static void matrixDecompose(com.raylib.Raylib.Matrix mat, com.raylib.Raylib.Vector3 translation, com.raylib.Raylib.Vector4 rotation, com.raylib.Raylib.Vector3 scale) {
        Raylib.MatrixDecompose(mat, translation, rotation, scale);
    }

    public static com.raylib.Raylib.Vector4 quaternionUnitX() {
        return Raylib.QuaternionUnitX();
    }

    public static void initPhysics() {
        Raylib.InitPhysics();
    }

    public static void updatePhysics() {
        Raylib.UpdatePhysics();
    }

    public static int guiGetState() {
        return Raylib.GuiGetState();
    }

    public static int guiScrollPanel(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, com.raylib.Raylib.Rectangle content, com.raylib.Raylib.Vector2 scroll, com.raylib.Raylib.Rectangle view) {
        return Raylib.GuiScrollPanel(bounds, text, content, scroll, view);
    }

    public static int guiScrollPanel(com.raylib.Raylib.Rectangle bounds, java.lang.String text, com.raylib.Raylib.Rectangle content, com.raylib.Raylib.Vector2 scroll, com.raylib.Raylib.Rectangle view) {
        return Raylib.GuiScrollPanel(bounds, text, content, scroll, view);
    }

    public static void guiSetAlpha(float alpha) {
        Raylib.GuiSetAlpha(alpha);
    }

    public static void setPhysicsGravity(float arg0, float arg1) {
        Raylib.SetPhysicsGravity(arg0, arg1);
    }

    public static org.bytedeco.javacpp.IntPointer guiGetIcons() {
        return Raylib.GuiGetIcons();
    }

    public static org.bytedeco.javacpp.BytePointer guiIconText(int iconId, org.bytedeco.javacpp.BytePointer text) {
        return Raylib.GuiIconText(iconId, text);
    }

    public static java.lang.String guiIconText(int iconId, java.lang.String text) {
        return Raylib.GuiIconText(iconId, text);
    }

    public static void guiDrawIcon(int iconId, int posX, int posY, int pixelSize, com.raylib.Raylib.Color color) {
        Raylib.GuiDrawIcon(iconId, posX, posY, pixelSize, color);
    }

    public static int guiCheckBox(com.raylib.Raylib.Rectangle bounds, java.lang.String text, boolean[] checked) {
        return Raylib.GuiCheckBox(bounds, text, checked);
    }

    public static int guiCheckBox(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.BoolPointer checked) {
        return Raylib.GuiCheckBox(bounds, text, checked);
    }

    public static int guiComboBox(com.raylib.Raylib.Rectangle bounds, java.lang.String text, int[] active) {
        return Raylib.GuiComboBox(bounds, text, active);
    }

    public static int guiComboBox(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, java.nio.IntBuffer active) {
        return Raylib.GuiComboBox(bounds, text, active);
    }

    public static int guiComboBox(com.raylib.Raylib.Rectangle bounds, java.lang.String text, org.bytedeco.javacpp.IntPointer active) {
        return Raylib.GuiComboBox(bounds, text, active);
    }

    public static int guiComboBox(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, int[] active) {
        return Raylib.GuiComboBox(bounds, text, active);
    }

    public static int guiComboBox(com.raylib.Raylib.Rectangle bounds, java.lang.String text, java.nio.IntBuffer active) {
        return Raylib.GuiComboBox(bounds, text, active);
    }

    public static int guiComboBox(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.IntPointer active) {
        return Raylib.GuiComboBox(bounds, text, active);
    }

    public static void physicsAddTorque(com.raylib.Raylib.PhysicsBody arg0, float arg1) {
        Raylib.PhysicsAddTorque(arg0, arg1);
    }

    public static void physicsShatter(com.raylib.Raylib.PhysicsBody arg0, com.raylib.Raylib.Vector2 arg1, float arg2) {
        Raylib.PhysicsShatter(arg0, arg1, arg2);
    }

    public static int guiValueBox(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, int[] value, int minValue, int maxValue, boolean editMode) {
        return Raylib.GuiValueBox(bounds, text, value, minValue, maxValue, editMode);
    }

    public static int guiValueBox(com.raylib.Raylib.Rectangle bounds, java.lang.String text, org.bytedeco.javacpp.IntPointer value, int minValue, int maxValue, boolean editMode) {
        return Raylib.GuiValueBox(bounds, text, value, minValue, maxValue, editMode);
    }

    public static int guiValueBox(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, java.nio.IntBuffer value, int minValue, int maxValue, boolean editMode) {
        return Raylib.GuiValueBox(bounds, text, value, minValue, maxValue, editMode);
    }

    public static int guiValueBox(com.raylib.Raylib.Rectangle bounds, java.lang.String text, int[] value, int minValue, int maxValue, boolean editMode) {
        return Raylib.GuiValueBox(bounds, text, value, minValue, maxValue, editMode);
    }

    public static int guiValueBox(com.raylib.Raylib.Rectangle bounds, java.lang.String text, java.nio.IntBuffer value, int minValue, int maxValue, boolean editMode) {
        return Raylib.GuiValueBox(bounds, text, value, minValue, maxValue, editMode);
    }

    public static int guiValueBox(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.IntPointer value, int minValue, int maxValue, boolean editMode) {
        return Raylib.GuiValueBox(bounds, text, value, minValue, maxValue, editMode);
    }

    public static int guiToggleGroup(com.raylib.Raylib.Rectangle bounds, java.lang.String text, java.nio.IntBuffer active) {
        return Raylib.GuiToggleGroup(bounds, text, active);
    }

    public static int guiToggleGroup(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.IntPointer active) {
        return Raylib.GuiToggleGroup(bounds, text, active);
    }

    public static int guiToggleGroup(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, int[] active) {
        return Raylib.GuiToggleGroup(bounds, text, active);
    }

    public static int guiToggleGroup(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, java.nio.IntBuffer active) {
        return Raylib.GuiToggleGroup(bounds, text, active);
    }

    public static int guiToggleGroup(com.raylib.Raylib.Rectangle bounds, java.lang.String text, int[] active) {
        return Raylib.GuiToggleGroup(bounds, text, active);
    }

    public static int guiToggleGroup(com.raylib.Raylib.Rectangle bounds, java.lang.String text, org.bytedeco.javacpp.IntPointer active) {
        return Raylib.GuiToggleGroup(bounds, text, active);
    }

    public static int guiSliderBar(com.raylib.Raylib.Rectangle bounds, java.lang.String textLeft, java.lang.String textRight, java.nio.FloatBuffer value, float minValue, float maxValue) {
        return Raylib.GuiSliderBar(bounds, textLeft, textRight, value, minValue, maxValue);
    }

    public static int guiSliderBar(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer textLeft, org.bytedeco.javacpp.BytePointer textRight, float[] value, float minValue, float maxValue) {
        return Raylib.GuiSliderBar(bounds, textLeft, textRight, value, minValue, maxValue);
    }

    public static int guiSliderBar(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer textLeft, org.bytedeco.javacpp.BytePointer textRight, org.bytedeco.javacpp.FloatPointer value, float minValue, float maxValue) {
        return Raylib.GuiSliderBar(bounds, textLeft, textRight, value, minValue, maxValue);
    }

    public static int guiSliderBar(com.raylib.Raylib.Rectangle bounds, java.lang.String textLeft, java.lang.String textRight, float[] value, float minValue, float maxValue) {
        return Raylib.GuiSliderBar(bounds, textLeft, textRight, value, minValue, maxValue);
    }

    public static int guiSliderBar(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer textLeft, org.bytedeco.javacpp.BytePointer textRight, java.nio.FloatBuffer value, float minValue, float maxValue) {
        return Raylib.GuiSliderBar(bounds, textLeft, textRight, value, minValue, maxValue);
    }

    public static int guiSliderBar(com.raylib.Raylib.Rectangle bounds, java.lang.String textLeft, java.lang.String textRight, org.bytedeco.javacpp.FloatPointer value, float minValue, float maxValue) {
        return Raylib.GuiSliderBar(bounds, textLeft, textRight, value, minValue, maxValue);
    }

    public static int guiStatusBar(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text) {
        return Raylib.GuiStatusBar(bounds, text);
    }

    public static int guiStatusBar(com.raylib.Raylib.Rectangle bounds, java.lang.String text) {
        return Raylib.GuiStatusBar(bounds, text);
    }

    public static int guiColorPanel(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, com.raylib.Raylib.Color color) {
        return Raylib.GuiColorPanel(bounds, text, color);
    }

    public static int guiColorPanel(com.raylib.Raylib.Rectangle bounds, java.lang.String text, com.raylib.Raylib.Color color) {
        return Raylib.GuiColorPanel(bounds, text, color);
    }

    public static void closePhysics() {
        Raylib.ClosePhysics();
    }

    public static int guiDropdownBox(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.IntPointer active, boolean editMode) {
        return Raylib.GuiDropdownBox(bounds, text, active, editMode);
    }

    public static int guiDropdownBox(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, java.nio.IntBuffer active, boolean editMode) {
        return Raylib.GuiDropdownBox(bounds, text, active, editMode);
    }

    public static int guiDropdownBox(com.raylib.Raylib.Rectangle bounds, java.lang.String text, int[] active, boolean editMode) {
        return Raylib.GuiDropdownBox(bounds, text, active, editMode);
    }

    public static int guiDropdownBox(com.raylib.Raylib.Rectangle bounds, java.lang.String text, org.bytedeco.javacpp.IntPointer active, boolean editMode) {
        return Raylib.GuiDropdownBox(bounds, text, active, editMode);
    }

    public static int guiDropdownBox(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, int[] active, boolean editMode) {
        return Raylib.GuiDropdownBox(bounds, text, active, editMode);
    }

    public static int guiDropdownBox(com.raylib.Raylib.Rectangle bounds, java.lang.String text, java.nio.IntBuffer active, boolean editMode) {
        return Raylib.GuiDropdownBox(bounds, text, active, editMode);
    }

    public static int guiValueBoxFloat(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, java.nio.ByteBuffer arg2, java.nio.FloatBuffer arg3, boolean arg4) {
        return Raylib.GuiValueBoxFloat(arg0, arg1, arg2, arg3, arg4);
    }

    public static int guiValueBoxFloat(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, byte[] arg2, float[] arg3, boolean arg4) {
        return Raylib.GuiValueBoxFloat(arg0, arg1, arg2, arg3, arg4);
    }

    public static int guiValueBoxFloat(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, org.bytedeco.javacpp.BytePointer arg2, org.bytedeco.javacpp.FloatPointer arg3, boolean arg4) {
        return Raylib.GuiValueBoxFloat(arg0, arg1, arg2, arg3, arg4);
    }

    public static int guiValueBoxFloat(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, org.bytedeco.javacpp.BytePointer arg2, org.bytedeco.javacpp.FloatPointer arg3, boolean arg4) {
        return Raylib.GuiValueBoxFloat(arg0, arg1, arg2, arg3, arg4);
    }

    public static int guiValueBoxFloat(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, java.nio.ByteBuffer arg2, java.nio.FloatBuffer arg3, boolean arg4) {
        return Raylib.GuiValueBoxFloat(arg0, arg1, arg2, arg3, arg4);
    }

    public static int guiValueBoxFloat(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, byte[] arg2, float[] arg3, boolean arg4) {
        return Raylib.GuiValueBoxFloat(arg0, arg1, arg2, arg3, arg4);
    }

    public static int guiListViewEx(com.raylib.Raylib.Rectangle bounds, byte[] text, int count, int[] scrollIndex, int[] active, int[] focus) {
        return Raylib.GuiListViewEx(bounds, text, count, scrollIndex, active, focus);
    }

    public static int guiListViewEx(com.raylib.Raylib.Rectangle bounds, java.nio.ByteBuffer text, int count, java.nio.IntBuffer scrollIndex, java.nio.IntBuffer active, java.nio.IntBuffer focus) {
        return Raylib.GuiListViewEx(bounds, text, count, scrollIndex, active, focus);
    }

    public static int guiListViewEx(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.PointerPointer text, int count, org.bytedeco.javacpp.IntPointer scrollIndex, org.bytedeco.javacpp.IntPointer active, org.bytedeco.javacpp.IntPointer focus) {
        return Raylib.GuiListViewEx(bounds, text, count, scrollIndex, active, focus);
    }

    public static int guiListViewEx(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, int count, org.bytedeco.javacpp.IntPointer scrollIndex, org.bytedeco.javacpp.IntPointer active, org.bytedeco.javacpp.IntPointer focus) {
        return Raylib.GuiListViewEx(bounds, text, count, scrollIndex, active, focus);
    }

    public static int guiGetStyle(int control, int property) {
        return Raylib.GuiGetStyle(control, property);
    }

    public static void guiLoadStyle(java.lang.String fileName) {
        Raylib.GuiLoadStyle(fileName);
    }

    public static void guiLoadStyle(org.bytedeco.javacpp.BytePointer fileName) {
        Raylib.GuiLoadStyle(fileName);
    }

    public static com.raylib.Raylib.PhysicsBody getPhysicsBody(int arg0) {
        return Raylib.GetPhysicsBody(arg0);
    }

    public static int guiTextInputBox(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer title, org.bytedeco.javacpp.BytePointer message, org.bytedeco.javacpp.BytePointer buttons, java.nio.ByteBuffer text, int textMaxSize, org.bytedeco.javacpp.BoolPointer secretViewActive) {
        return Raylib.GuiTextInputBox(bounds, title, message, buttons, text, textMaxSize, secretViewActive);
    }

    public static int guiTextInputBox(com.raylib.Raylib.Rectangle bounds, java.lang.String title, java.lang.String message, java.lang.String buttons, byte[] text, int textMaxSize, boolean[] secretViewActive) {
        return Raylib.GuiTextInputBox(bounds, title, message, buttons, text, textMaxSize, secretViewActive);
    }

    public static int guiTextInputBox(com.raylib.Raylib.Rectangle bounds, java.lang.String title, java.lang.String message, java.lang.String buttons, org.bytedeco.javacpp.BytePointer text, int textMaxSize, boolean[] secretViewActive) {
        return Raylib.GuiTextInputBox(bounds, title, message, buttons, text, textMaxSize, secretViewActive);
    }

    public static int guiTextInputBox(com.raylib.Raylib.Rectangle bounds, java.lang.String title, java.lang.String message, java.lang.String buttons, java.nio.ByteBuffer text, int textMaxSize, boolean[] secretViewActive) {
        return Raylib.GuiTextInputBox(bounds, title, message, buttons, text, textMaxSize, secretViewActive);
    }

    public static int guiTextInputBox(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer title, org.bytedeco.javacpp.BytePointer message, org.bytedeco.javacpp.BytePointer buttons, org.bytedeco.javacpp.BytePointer text, int textMaxSize, org.bytedeco.javacpp.BoolPointer secretViewActive) {
        return Raylib.GuiTextInputBox(bounds, title, message, buttons, text, textMaxSize, secretViewActive);
    }

    public static int guiTextInputBox(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer title, org.bytedeco.javacpp.BytePointer message, org.bytedeco.javacpp.BytePointer buttons, byte[] text, int textMaxSize, org.bytedeco.javacpp.BoolPointer secretViewActive) {
        return Raylib.GuiTextInputBox(bounds, title, message, buttons, text, textMaxSize, secretViewActive);
    }

    public static void guiSetState(int state) {
        Raylib.GuiSetState(state);
    }

    public static void guiSetStyle(int control, int property, int value) {
        Raylib.GuiSetStyle(control, property, value);
    }

    public static int guiDummyRec(com.raylib.Raylib.Rectangle bounds, java.lang.String text) {
        return Raylib.GuiDummyRec(bounds, text);
    }

    public static int guiDummyRec(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text) {
        return Raylib.GuiDummyRec(bounds, text);
    }

    public static int guiColorBarAlpha(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, java.nio.FloatBuffer alpha) {
        return Raylib.GuiColorBarAlpha(bounds, text, alpha);
    }

    public static int guiColorBarAlpha(com.raylib.Raylib.Rectangle bounds, java.lang.String text, float[] alpha) {
        return Raylib.GuiColorBarAlpha(bounds, text, alpha);
    }

    public static int guiColorBarAlpha(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.FloatPointer alpha) {
        return Raylib.GuiColorBarAlpha(bounds, text, alpha);
    }

    public static int guiColorBarAlpha(com.raylib.Raylib.Rectangle bounds, java.lang.String text, org.bytedeco.javacpp.FloatPointer alpha) {
        return Raylib.GuiColorBarAlpha(bounds, text, alpha);
    }

    public static int guiColorBarAlpha(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, float[] alpha) {
        return Raylib.GuiColorBarAlpha(bounds, text, alpha);
    }

    public static int guiColorBarAlpha(com.raylib.Raylib.Rectangle bounds, java.lang.String text, java.nio.FloatBuffer alpha) {
        return Raylib.GuiColorBarAlpha(bounds, text, alpha);
    }

    public static int guiMessageBox(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer title, org.bytedeco.javacpp.BytePointer message, org.bytedeco.javacpp.BytePointer buttons) {
        return Raylib.GuiMessageBox(bounds, title, message, buttons);
    }

    public static int guiMessageBox(com.raylib.Raylib.Rectangle bounds, java.lang.String title, java.lang.String message, java.lang.String buttons) {
        return Raylib.GuiMessageBox(bounds, title, message, buttons);
    }

    public static boolean guiIsLocked() {
        return Raylib.GuiIsLocked();
    }

    public static int guiColorPanelHSV(com.raylib.Raylib.Rectangle bounds, java.lang.String text, com.raylib.Raylib.Vector3 colorHsv) {
        return Raylib.GuiColorPanelHSV(bounds, text, colorHsv);
    }

    public static int guiColorPanelHSV(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, com.raylib.Raylib.Vector3 colorHsv) {
        return Raylib.GuiColorPanelHSV(bounds, text, colorHsv);
    }

    public static void guiSetTooltip(org.bytedeco.javacpp.BytePointer tooltip) {
        Raylib.GuiSetTooltip(tooltip);
    }

    public static void guiSetTooltip(java.lang.String tooltip) {
        Raylib.GuiSetTooltip(tooltip);
    }

    public static void setPhysicsTimeStep(double arg0) {
        Raylib.SetPhysicsTimeStep(arg0);
    }

    public static void guiEnableTooltip() {
        Raylib.GuiEnableTooltip();
    }

    public static void guiSetIconScale(int scale) {
        Raylib.GuiSetIconScale(scale);
    }

    public static void destroyPhysicsBody(com.raylib.Raylib.PhysicsBody arg0) {
        Raylib.DestroyPhysicsBody(arg0);
    }

    public static int guiToggleSlider(com.raylib.Raylib.Rectangle bounds, java.lang.String text, org.bytedeco.javacpp.IntPointer active) {
        return Raylib.GuiToggleSlider(bounds, text, active);
    }

    public static int guiToggleSlider(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, int[] active) {
        return Raylib.GuiToggleSlider(bounds, text, active);
    }

    public static int guiToggleSlider(com.raylib.Raylib.Rectangle bounds, java.lang.String text, java.nio.IntBuffer active) {
        return Raylib.GuiToggleSlider(bounds, text, active);
    }

    public static int guiToggleSlider(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.IntPointer active) {
        return Raylib.GuiToggleSlider(bounds, text, active);
    }

    public static int guiToggleSlider(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, java.nio.IntBuffer active) {
        return Raylib.GuiToggleSlider(bounds, text, active);
    }

    public static int guiToggleSlider(com.raylib.Raylib.Rectangle bounds, java.lang.String text, int[] active) {
        return Raylib.GuiToggleSlider(bounds, text, active);
    }

    public static int guiProgressBar(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer textLeft, org.bytedeco.javacpp.BytePointer textRight, float[] value, float minValue, float maxValue) {
        return Raylib.GuiProgressBar(bounds, textLeft, textRight, value, minValue, maxValue);
    }

    public static int guiProgressBar(com.raylib.Raylib.Rectangle bounds, java.lang.String textLeft, java.lang.String textRight, java.nio.FloatBuffer value, float minValue, float maxValue) {
        return Raylib.GuiProgressBar(bounds, textLeft, textRight, value, minValue, maxValue);
    }

    public static int guiProgressBar(com.raylib.Raylib.Rectangle bounds, java.lang.String textLeft, java.lang.String textRight, org.bytedeco.javacpp.FloatPointer value, float minValue, float maxValue) {
        return Raylib.GuiProgressBar(bounds, textLeft, textRight, value, minValue, maxValue);
    }

    public static int guiProgressBar(com.raylib.Raylib.Rectangle bounds, java.lang.String textLeft, java.lang.String textRight, float[] value, float minValue, float maxValue) {
        return Raylib.GuiProgressBar(bounds, textLeft, textRight, value, minValue, maxValue);
    }

    public static int guiProgressBar(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer textLeft, org.bytedeco.javacpp.BytePointer textRight, org.bytedeco.javacpp.FloatPointer value, float minValue, float maxValue) {
        return Raylib.GuiProgressBar(bounds, textLeft, textRight, value, minValue, maxValue);
    }

    public static int guiProgressBar(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer textLeft, org.bytedeco.javacpp.BytePointer textRight, java.nio.FloatBuffer value, float minValue, float maxValue) {
        return Raylib.GuiProgressBar(bounds, textLeft, textRight, value, minValue, maxValue);
    }

    public static int guiListView(com.raylib.Raylib.Rectangle bounds, java.lang.String text, int[] scrollIndex, int[] active) {
        return Raylib.GuiListView(bounds, text, scrollIndex, active);
    }

    public static int guiListView(com.raylib.Raylib.Rectangle bounds, java.lang.String text, java.nio.IntBuffer scrollIndex, java.nio.IntBuffer active) {
        return Raylib.GuiListView(bounds, text, scrollIndex, active);
    }

    public static int guiListView(com.raylib.Raylib.Rectangle bounds, java.lang.String text, org.bytedeco.javacpp.IntPointer scrollIndex, org.bytedeco.javacpp.IntPointer active) {
        return Raylib.GuiListView(bounds, text, scrollIndex, active);
    }

    public static int guiListView(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.IntPointer scrollIndex, org.bytedeco.javacpp.IntPointer active) {
        return Raylib.GuiListView(bounds, text, scrollIndex, active);
    }

    public static int guiListView(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, int[] scrollIndex, int[] active) {
        return Raylib.GuiListView(bounds, text, scrollIndex, active);
    }

    public static int guiListView(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, java.nio.IntBuffer scrollIndex, java.nio.IntBuffer active) {
        return Raylib.GuiListView(bounds, text, scrollIndex, active);
    }

    public static int guiWindowBox(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer title) {
        return Raylib.GuiWindowBox(bounds, title);
    }

    public static int guiWindowBox(com.raylib.Raylib.Rectangle bounds, java.lang.String title) {
        return Raylib.GuiWindowBox(bounds, title);
    }

    public static int guiColorPicker(com.raylib.Raylib.Rectangle bounds, java.lang.String text, com.raylib.Raylib.Color color) {
        return Raylib.GuiColorPicker(bounds, text, color);
    }

    public static int guiColorPicker(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, com.raylib.Raylib.Color color) {
        return Raylib.GuiColorPicker(bounds, text, color);
    }

    public static int guiColorBarHue(com.raylib.Raylib.Rectangle bounds, java.lang.String text, java.nio.FloatBuffer value) {
        return Raylib.GuiColorBarHue(bounds, text, value);
    }

    public static int guiColorBarHue(com.raylib.Raylib.Rectangle bounds, java.lang.String text, org.bytedeco.javacpp.FloatPointer value) {
        return Raylib.GuiColorBarHue(bounds, text, value);
    }

    public static int guiColorBarHue(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, java.nio.FloatBuffer value) {
        return Raylib.GuiColorBarHue(bounds, text, value);
    }

    public static int guiColorBarHue(com.raylib.Raylib.Rectangle bounds, java.lang.String text, float[] value) {
        return Raylib.GuiColorBarHue(bounds, text, value);
    }

    public static int guiColorBarHue(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, float[] value) {
        return Raylib.GuiColorBarHue(bounds, text, value);
    }

    public static int guiColorBarHue(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.FloatPointer value) {
        return Raylib.GuiColorBarHue(bounds, text, value);
    }

    public static int guiLabelButton(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text) {
        return Raylib.GuiLabelButton(bounds, text);
    }

    public static int guiLabelButton(com.raylib.Raylib.Rectangle bounds, java.lang.String text) {
        return Raylib.GuiLabelButton(bounds, text);
    }

    public static void physicsAddForce(com.raylib.Raylib.PhysicsBody arg0, com.raylib.Raylib.Vector2 arg1) {
        Raylib.PhysicsAddForce(arg0, arg1);
    }

    public static void guiDisableTooltip() {
        Raylib.GuiDisableTooltip();
    }

    public static java.nio.ByteBuffer guiLoadIcons(java.lang.String fileName, boolean loadIconsName) {
        return Raylib.GuiLoadIcons(fileName, loadIconsName);
    }

    public static org.bytedeco.javacpp.PointerPointer guiLoadIcons(org.bytedeco.javacpp.BytePointer fileName, boolean loadIconsName) {
        return Raylib.GuiLoadIcons(fileName, loadIconsName);
    }

    public static int guiGroupBox(com.raylib.Raylib.Rectangle bounds, java.lang.String text) {
        return Raylib.GuiGroupBox(bounds, text);
    }

    public static int guiGroupBox(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text) {
        return Raylib.GuiGroupBox(bounds, text);
    }

    public static int guiColorPickerHSV(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, com.raylib.Raylib.Vector3 colorHsv) {
        return Raylib.GuiColorPickerHSV(bounds, text, colorHsv);
    }

    public static int guiColorPickerHSV(com.raylib.Raylib.Rectangle bounds, java.lang.String text, com.raylib.Raylib.Vector3 colorHsv) {
        return Raylib.GuiColorPickerHSV(bounds, text, colorHsv);
    }

    public static float vector2LengthSqr(com.raylib.Raylib.Vector2 v) {
        return Raylib.Vector2LengthSqr(v);
    }

    public static int rlCompileShader(java.lang.String arg0, int arg1) {
        return Raylib.rlCompileShader(arg0, arg1);
    }

    public static int rlCompileShader(org.bytedeco.javacpp.BytePointer arg0, int arg1) {
        return Raylib.rlCompileShader(arg0, arg1);
    }

    public static void rlColorMask(boolean arg0, boolean arg1, boolean arg2, boolean arg3) {
        Raylib.rlColorMask(arg0, arg1, arg2, arg3);
    }

    public static void rlEnableTexture(int arg0) {
        Raylib.rlEnableTexture(arg0);
    }

    public static void rlLoadExtensions(org.bytedeco.javacpp.Pointer arg0) {
        Raylib.rlLoadExtensions(arg0);
    }

    public static void rlEnableShader(int arg0) {
        Raylib.rlEnableShader(arg0);
    }

    public static com.raylib.Raylib.rlRenderBatch rlLoadRenderBatch(int arg0, int arg1) {
        return Raylib.rlLoadRenderBatch(arg0, arg1);
    }

    public static void rlDisableTexture() {
        Raylib.rlDisableTexture();
    }

    public static void rlSetTexture(int arg0) {
        Raylib.rlSetTexture(arg0);
    }

    public static void rlUnloadTexture(int arg0) {
        Raylib.rlUnloadTexture(arg0);
    }

    public static void rlLoadDrawQuad() {
        Raylib.rlLoadDrawQuad();
    }

    public static void rlDisableDepthTest() {
        Raylib.rlDisableDepthTest();
    }

    public static void rlSetBlendMode(int arg0) {
        Raylib.rlSetBlendMode(arg0);
    }

    public static void rlDrawVertexArray(int arg0, int arg1) {
        Raylib.rlDrawVertexArray(arg0, arg1);
    }

    public static int rlLoadTextureDepth(int arg0, int arg1, boolean arg2) {
        return Raylib.rlLoadTextureDepth(arg0, arg1, arg2);
    }

    public static org.bytedeco.javacpp.BytePointer rlReadScreenPixels(int arg0, int arg1) {
        return Raylib.rlReadScreenPixels(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 vector2AddValue(com.raylib.Raylib.Vector2 v, float add) {
        return Raylib.Vector2AddValue(v, add);
    }

    public static int rlGetVersion() {
        return Raylib.rlGetVersion();
    }

    public static float vector2LineAngle(com.raylib.Raylib.Vector2 start, com.raylib.Raylib.Vector2 end) {
        return Raylib.Vector2LineAngle(start, end);
    }

    public static void rlSetCullFace(int arg0) {
        Raylib.rlSetCullFace(arg0);
    }

    public static void rlEnableDepthMask() {
        Raylib.rlEnableDepthMask();
    }

    public static void rlSetClipPlanes(double arg0, double arg1) {
        Raylib.rlSetClipPlanes(arg0, arg1);
    }

    public static float vector2DistanceSqr(com.raylib.Raylib.Vector2 v1, com.raylib.Raylib.Vector2 v2) {
        return Raylib.Vector2DistanceSqr(v1, v2);
    }

    public static int floatEquals(float x, float y) {
        return Raylib.FloatEquals(x, y);
    }

    public static float vector2Angle(com.raylib.Raylib.Vector2 v1, com.raylib.Raylib.Vector2 v2) {
        return Raylib.Vector2Angle(v1, v2);
    }

    public static void rlUpdateTexture(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, org.bytedeco.javacpp.Pointer arg6) {
        Raylib.rlUpdateTexture(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static void rlBindShaderBuffer(int arg0, int arg1) {
        Raylib.rlBindShaderBuffer(arg0, arg1);
    }

    public static int rlLoadVertexArray() {
        return Raylib.rlLoadVertexArray();
    }

    public static void rlCopyShaderBuffer(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Raylib.rlCopyShaderBuffer(arg0, arg1, arg2, arg3, arg4);
    }

    public static void rlClearColor(byte arg0, byte arg1, byte arg2, byte arg3) {
        Raylib.rlClearColor(arg0, arg1, arg2, arg3);
    }

    public static void rlBindFramebuffer(int arg0, int arg1) {
        Raylib.rlBindFramebuffer(arg0, arg1);
    }

    public static void rlEnableWireMode() {
        Raylib.rlEnableWireMode();
    }

    public static int rlLoadShaderBuffer(int arg0, org.bytedeco.javacpp.Pointer arg1, int arg2) {
        return Raylib.rlLoadShaderBuffer(arg0, arg1, arg2);
    }

    public static void rlSetUniformMatrix(int arg0, com.raylib.Raylib.Matrix arg1) {
        Raylib.rlSetUniformMatrix(arg0, arg1);
    }

    public static int rlLoadTexture(org.bytedeco.javacpp.Pointer arg0, int arg1, int arg2, int arg3, int arg4) {
        return Raylib.rlLoadTexture(arg0, arg1, arg2, arg3, arg4);
    }

    public static com.raylib.Raylib.Vector2 vector2Scale(com.raylib.Raylib.Vector2 v, float scale) {
        return Raylib.Vector2Scale(v, scale);
    }

    public static int rlLoadShaderCode(org.bytedeco.javacpp.BytePointer arg0, org.bytedeco.javacpp.BytePointer arg1) {
        return Raylib.rlLoadShaderCode(arg0, arg1);
    }

    public static int rlLoadShaderCode(java.lang.String arg0, java.lang.String arg1) {
        return Raylib.rlLoadShaderCode(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 vector2Zero() {
        return Raylib.Vector2Zero();
    }

    public static void rlDisableShader() {
        Raylib.rlDisableShader();
    }

    public static void rlEnableDepthTest() {
        Raylib.rlEnableDepthTest();
    }

    public static void rlDisableDepthMask() {
        Raylib.rlDisableDepthMask();
    }

    public static void rlBlitFramebuffer(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        Raylib.rlBlitFramebuffer(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    public static void rlEnablePointMode() {
        Raylib.rlEnablePointMode();
    }

    public static float rlGetLineWidth() {
        return Raylib.rlGetLineWidth();
    }

    public static int rlLoadVertexBuffer(org.bytedeco.javacpp.Pointer arg0, int arg1, boolean arg2) {
        return Raylib.rlLoadVertexBuffer(arg0, arg1, arg2);
    }

    public static void rlLoadDrawCube() {
        Raylib.rlLoadDrawCube();
    }

    public static void rlDisableWireMode() {
        Raylib.rlDisableWireMode();
    }

    public static void rlBindImageTexture(int arg0, int arg1, int arg2, boolean arg3) {
        Raylib.rlBindImageTexture(arg0, arg1, arg2, arg3);
    }

    public static int rlLoadFramebuffer() {
        return Raylib.rlLoadFramebuffer();
    }

    public static void rlEnableColorBlend() {
        Raylib.rlEnableColorBlend();
    }

    public static void rlDrawRenderBatch(com.raylib.Raylib.rlRenderBatch arg0) {
        Raylib.rlDrawRenderBatch(arg0);
    }

    public static void rlReadShaderBuffer(int arg0, org.bytedeco.javacpp.Pointer arg1, int arg2, int arg3) {
        Raylib.rlReadShaderBuffer(arg0, arg1, arg2, arg3);
    }

    public static float vector2DotProduct(com.raylib.Raylib.Vector2 v1, com.raylib.Raylib.Vector2 v2) {
        return Raylib.Vector2DotProduct(v1, v2);
    }

    public static void rlSetBlendFactors(int arg0, int arg1, int arg2) {
        Raylib.rlSetBlendFactors(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Vector2 vector2Subtract(com.raylib.Raylib.Vector2 v1, com.raylib.Raylib.Vector2 v2) {
        return Raylib.Vector2Subtract(v1, v2);
    }

    public static float vector2Distance(com.raylib.Raylib.Vector2 v1, com.raylib.Raylib.Vector2 v2) {
        return Raylib.Vector2Distance(v1, v2);
    }

    public static void rlTexCoord2f(float arg0, float arg1) {
        Raylib.rlTexCoord2f(arg0, arg1);
    }

    public static void rlCheckErrors() {
        Raylib.rlCheckErrors();
    }

    public static void rlSetLineWidth(float arg0) {
        Raylib.rlSetLineWidth(arg0);
    }

    public static void rlSetUniform(int arg0, org.bytedeco.javacpp.Pointer arg1, int arg2, int arg3) {
        Raylib.rlSetUniform(arg0, arg1, arg2, arg3);
    }

    public static void rlSetShader(int arg0, org.bytedeco.javacpp.IntPointer arg1) {
        Raylib.rlSetShader(arg0, arg1);
    }

    public static void rlSetShader(int arg0, int[] arg1) {
        Raylib.rlSetShader(arg0, arg1);
    }

    public static void rlSetShader(int arg0, java.nio.IntBuffer arg1) {
        Raylib.rlSetShader(arg0, arg1);
    }

    public static float vector2Length(com.raylib.Raylib.Vector2 v) {
        return Raylib.Vector2Length(v);
    }

    public static com.raylib.Raylib.Vector4 vector4Lerp(com.raylib.Raylib.Vector4 v1, com.raylib.Raylib.Vector4 v2, float amount) {
        return Raylib.Vector4Lerp(v1, v2, amount);
    }

    public static com.raylib.Raylib.Vector3 vector3Negate(com.raylib.Raylib.Vector3 v) {
        return Raylib.Vector3Negate(v);
    }

    public static com.raylib.Raylib.Vector4 vector4Negate(com.raylib.Raylib.Vector4 v) {
        return Raylib.Vector4Negate(v);
    }

    public static com.raylib.Raylib.Vector4 vector4MoveTowards(com.raylib.Raylib.Vector4 v, com.raylib.Raylib.Vector4 target, float maxDistance) {
        return Raylib.Vector4MoveTowards(v, target, maxDistance);
    }

    public static com.raylib.Raylib.Vector3 vector3Reject(com.raylib.Raylib.Vector3 v1, com.raylib.Raylib.Vector3 v2) {
        return Raylib.Vector3Reject(v1, v2);
    }

    public static com.raylib.Raylib.Vector4 vector4Invert(com.raylib.Raylib.Vector4 v) {
        return Raylib.Vector4Invert(v);
    }

    public static int vector4Equals(com.raylib.Raylib.Vector4 p, com.raylib.Raylib.Vector4 q) {
        return Raylib.Vector4Equals(p, q);
    }

    public static float matrixDeterminant(com.raylib.Raylib.Matrix mat) {
        return Raylib.MatrixDeterminant(mat);
    }

    public static float matrixTrace(com.raylib.Raylib.Matrix mat) {
        return Raylib.MatrixTrace(mat);
    }

    public static com.raylib.Raylib.Vector2 vector2Reflect(com.raylib.Raylib.Vector2 v, com.raylib.Raylib.Vector2 normal) {
        return Raylib.Vector2Reflect(v, normal);
    }

    public static com.raylib.Raylib.Vector2 vector2Transform(com.raylib.Raylib.Vector2 v, com.raylib.Raylib.Matrix mat) {
        return Raylib.Vector2Transform(v, mat);
    }

    public static com.raylib.Raylib.Vector2 vector2Invert(com.raylib.Raylib.Vector2 v) {
        return Raylib.Vector2Invert(v);
    }

    public static int vector2Equals(com.raylib.Raylib.Vector2 p, com.raylib.Raylib.Vector2 q) {
        return Raylib.Vector2Equals(p, q);
    }

    public static com.raylib.Raylib.Vector2 vector2Divide(com.raylib.Raylib.Vector2 v1, com.raylib.Raylib.Vector2 v2) {
        return Raylib.Vector2Divide(v1, v2);
    }

    public static com.raylib.Raylib.Vector3 vector3Zero() {
        return Raylib.Vector3Zero();
    }

    public static com.raylib.Raylib.Vector3 vector3AddValue(com.raylib.Raylib.Vector3 v, float add) {
        return Raylib.Vector3AddValue(v, add);
    }

    public static com.raylib.Raylib.Vector3 vector3Subtract(com.raylib.Raylib.Vector3 v1, com.raylib.Raylib.Vector3 v2) {
        return Raylib.Vector3Subtract(v1, v2);
    }

    public static com.raylib.Raylib.Vector3 vector3Scale(com.raylib.Raylib.Vector3 v, float scalar) {
        return Raylib.Vector3Scale(v, scalar);
    }

    public static com.raylib.Raylib.Vector3 vector3Invert(com.raylib.Raylib.Vector3 v) {
        return Raylib.Vector3Invert(v);
    }

    public static float vector3DistanceSqr(com.raylib.Raylib.Vector3 v1, com.raylib.Raylib.Vector3 v2) {
        return Raylib.Vector3DistanceSqr(v1, v2);
    }

    public static com.raylib.Raylib.Vector3 vector3Clamp(com.raylib.Raylib.Vector3 v, com.raylib.Raylib.Vector3 min, com.raylib.Raylib.Vector3 max) {
        return Raylib.Vector3Clamp(v, min, max);
    }

    public static int vector3Equals(com.raylib.Raylib.Vector3 p, com.raylib.Raylib.Vector3 q) {
        return Raylib.Vector3Equals(p, q);
    }

    public static com.raylib.Raylib.Vector4 vector4Subtract(com.raylib.Raylib.Vector4 v1, com.raylib.Raylib.Vector4 v2) {
        return Raylib.Vector4Subtract(v1, v2);
    }

    public static float vector4DistanceSqr(com.raylib.Raylib.Vector4 v1, com.raylib.Raylib.Vector4 v2) {
        return Raylib.Vector4DistanceSqr(v1, v2);
    }

    public static com.raylib.Raylib.Vector3 vector3MoveTowards(com.raylib.Raylib.Vector3 v, com.raylib.Raylib.Vector3 target, float maxDistance) {
        return Raylib.Vector3MoveTowards(v, target, maxDistance);
    }

    public static com.raylib.Raylib.Vector3 vector3Barycenter(com.raylib.Raylib.Vector3 p, com.raylib.Raylib.Vector3 a, com.raylib.Raylib.Vector3 b, com.raylib.Raylib.Vector3 c) {
        return Raylib.Vector3Barycenter(p, a, b, c);
    }

    public static com.raylib.Raylib.Vector2 vector2Multiply(com.raylib.Raylib.Vector2 v1, com.raylib.Raylib.Vector2 v2) {
        return Raylib.Vector2Multiply(v1, v2);
    }

    public static com.raylib.Raylib.Vector2 vector2Lerp(com.raylib.Raylib.Vector2 v1, com.raylib.Raylib.Vector2 v2, float amount) {
        return Raylib.Vector2Lerp(v1, v2, amount);
    }

    public static float vector3Length(com.raylib.Raylib.Vector3 v) {
        return Raylib.Vector3Length(v);
    }

    public static com.raylib.Raylib.Vector3 vector3Unproject(com.raylib.Raylib.Vector3 source, com.raylib.Raylib.Matrix projection, com.raylib.Raylib.Matrix view) {
        return Raylib.Vector3Unproject(source, projection, view);
    }

    public static float vector4DotProduct(com.raylib.Raylib.Vector4 v1, com.raylib.Raylib.Vector4 v2) {
        return Raylib.Vector4DotProduct(v1, v2);
    }

    public static com.raylib.Raylib.Vector2 vector2Clamp(com.raylib.Raylib.Vector2 v, com.raylib.Raylib.Vector2 min, com.raylib.Raylib.Vector2 max) {
        return Raylib.Vector2Clamp(v, min, max);
    }

    public static com.raylib.Raylib.Vector3 vector3Transform(com.raylib.Raylib.Vector3 v, com.raylib.Raylib.Matrix mat) {
        return Raylib.Vector3Transform(v, mat);
    }

    public static com.raylib.Raylib.Vector2 vector2Refract(com.raylib.Raylib.Vector2 v, com.raylib.Raylib.Vector2 n, float r) {
        return Raylib.Vector2Refract(v, n, r);
    }

    public static float vector3Angle(com.raylib.Raylib.Vector3 v1, com.raylib.Raylib.Vector3 v2) {
        return Raylib.Vector3Angle(v1, v2);
    }

    public static com.raylib.Raylib.Vector3 vector3Divide(com.raylib.Raylib.Vector3 v1, com.raylib.Raylib.Vector3 v2) {
        return Raylib.Vector3Divide(v1, v2);
    }

    public static com.raylib.Raylib.Vector3 vector3Reflect(com.raylib.Raylib.Vector3 v, com.raylib.Raylib.Vector3 normal) {
        return Raylib.Vector3Reflect(v, normal);
    }

    public static com.raylib.Raylib.Vector4 vector4Zero() {
        return Raylib.Vector4Zero();
    }

    public static com.raylib.Raylib.Vector2 vector2ClampValue(com.raylib.Raylib.Vector2 v, float min, float max) {
        return Raylib.Vector2ClampValue(v, min, max);
    }

    public static com.raylib.Raylib.Vector3 vector3Lerp(com.raylib.Raylib.Vector3 v1, com.raylib.Raylib.Vector3 v2, float amount) {
        return Raylib.Vector3Lerp(v1, v2, amount);
    }

    public static com.raylib.Raylib.Vector3 vector3Normalize(com.raylib.Raylib.Vector3 v) {
        return Raylib.Vector3Normalize(v);
    }

    public static com.raylib.Raylib.Vector2 vector2Negate(com.raylib.Raylib.Vector2 v) {
        return Raylib.Vector2Negate(v);
    }

    public static com.raylib.Raylib.Vector3 vector3Refract(com.raylib.Raylib.Vector3 v, com.raylib.Raylib.Vector3 n, float r) {
        return Raylib.Vector3Refract(v, n, r);
    }

    public static com.raylib.Raylib.Vector3 vector3Multiply(com.raylib.Raylib.Vector3 v1, com.raylib.Raylib.Vector3 v2) {
        return Raylib.Vector3Multiply(v1, v2);
    }

    public static com.raylib.Raylib.Vector2 vector2Normalize(com.raylib.Raylib.Vector2 v) {
        return Raylib.Vector2Normalize(v);
    }

    public static com.raylib.Raylib.Vector2 vector2MoveTowards(com.raylib.Raylib.Vector2 v, com.raylib.Raylib.Vector2 target, float maxDistance) {
        return Raylib.Vector2MoveTowards(v, target, maxDistance);
    }

    public static float vector3DotProduct(com.raylib.Raylib.Vector3 v1, com.raylib.Raylib.Vector3 v2) {
        return Raylib.Vector3DotProduct(v1, v2);
    }

    public static float vector3Distance(com.raylib.Raylib.Vector3 v1, com.raylib.Raylib.Vector3 v2) {
        return Raylib.Vector3Distance(v1, v2);
    }

    public static com.raylib.Raylib.Vector3 vector3Project(com.raylib.Raylib.Vector3 v1, com.raylib.Raylib.Vector3 v2) {
        return Raylib.Vector3Project(v1, v2);
    }

    public static com.raylib.Raylib.float3 vector3ToFloatV(com.raylib.Raylib.Vector3 v) {
        return Raylib.Vector3ToFloatV(v);
    }

    public static com.raylib.Raylib.Vector4 vector4AddValue(com.raylib.Raylib.Vector4 v, float add) {
        return Raylib.Vector4AddValue(v, add);
    }

    public static float vector4LengthSqr(com.raylib.Raylib.Vector4 v) {
        return Raylib.Vector4LengthSqr(v);
    }

    public static float vector4Distance(com.raylib.Raylib.Vector4 v1, com.raylib.Raylib.Vector4 v2) {
        return Raylib.Vector4Distance(v1, v2);
    }

    public static com.raylib.Raylib.Vector4 vector4Scale(com.raylib.Raylib.Vector4 v, float scale) {
        return Raylib.Vector4Scale(v, scale);
    }

    public static float vector3LengthSqr(com.raylib.Raylib.Vector3 v) {
        return Raylib.Vector3LengthSqr(v);
    }

    public static com.raylib.Raylib.Vector3 vector3ClampValue(com.raylib.Raylib.Vector3 v, float min, float max) {
        return Raylib.Vector3ClampValue(v, min, max);
    }

    public static com.raylib.Raylib.Vector4 vector4Multiply(com.raylib.Raylib.Vector4 v1, com.raylib.Raylib.Vector4 v2) {
        return Raylib.Vector4Multiply(v1, v2);
    }

    public static com.raylib.Raylib.Vector2 vector2Rotate(com.raylib.Raylib.Vector2 v, float angle) {
        return Raylib.Vector2Rotate(v, angle);
    }

    public static float vector4Length(com.raylib.Raylib.Vector4 v) {
        return Raylib.Vector4Length(v);
    }

    public static com.raylib.Raylib.Vector4 vector4Divide(com.raylib.Raylib.Vector4 v1, com.raylib.Raylib.Vector4 v2) {
        return Raylib.Vector4Divide(v1, v2);
    }

    public static com.raylib.Raylib.Vector4 vector4Normalize(com.raylib.Raylib.Vector4 v) {
        return Raylib.Vector4Normalize(v);
    }

    public static boolean equals(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.equals(arg0, arg1);
    }

    public static boolean equals(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.equals(arg0, arg1);
    }

    public static boolean equals(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.equals(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 add(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.add(arg0, arg1);
    }

    public static com.raylib.Raylib.Matrix add(com.raylib.Raylib.Matrix arg0, com.raylib.Raylib.Matrix arg1) {
        return Raylib.add(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 add(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.add(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 add(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.add(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 add(com.raylib.Raylib.Vector4 arg0, float arg1) {
        return Raylib.add(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 multiply(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Matrix arg1) {
        return Raylib.multiply(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 multiply(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.multiply(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 multiply(com.raylib.Raylib.Vector2 arg0, float arg1) {
        return Raylib.multiply(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 multiply(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.multiply(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 multiply(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Matrix arg1) {
        return Raylib.multiply(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 multiply(com.raylib.Raylib.Vector3 arg0, float arg1) {
        return Raylib.multiply(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 multiply(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Matrix arg1) {
        return Raylib.multiply(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 multiply(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.multiply(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 multiply(com.raylib.Raylib.Vector4 arg0, float arg1) {
        return Raylib.multiply(arg0, arg1);
    }

    public static com.raylib.Raylib.Matrix multiply(com.raylib.Raylib.Matrix arg0, com.raylib.Raylib.Matrix arg1) {
        return Raylib.multiply(arg0, arg1);
    }

    public static com.raylib.Raylib.Matrix subtract(com.raylib.Raylib.Matrix arg0, com.raylib.Raylib.Matrix arg1) {
        return Raylib.subtract(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 subtract(com.raylib.Raylib.Vector4 arg0, float arg1) {
        return Raylib.subtract(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 subtract(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.subtract(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 subtract(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.subtract(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 subtract(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.subtract(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 divide(com.raylib.Raylib.Vector3 arg0, float arg1) {
        return Raylib.divide(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 divide(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.divide(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 divide(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.divide(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 divide(com.raylib.Raylib.Vector2 arg0, float arg1) {
        return Raylib.divide(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 divide(com.raylib.Raylib.Vector4 arg0, float arg1) {
        return Raylib.divide(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 divide(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.divide(arg0, arg1);
    }

}
