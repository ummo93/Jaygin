// GENERATED FILE ;

package com.raylib;

public class Jaylib {
    private final Raylib target;

    public Jaylib(Raylib target) {
        this.target = target;
    }

    public static void attachAudioMixedProcessor(com.raylib.Raylib.AudioCallback arg0) {
        Raylib.AttachAudioMixedProcessor(arg0);
    }

    public static void detachAudioStreamProcessor(com.raylib.Raylib.AudioStream arg0, com.raylib.Raylib.AudioCallback arg1) {
        Raylib.DetachAudioStreamProcessor(arg0, arg1);
    }

    public static void stopAutomationEventRecording() {
        Raylib.StopAutomationEventRecording();
    }

    public static boolean checkCollisionPointTriangle(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1, com.raylib.Raylib.Vector2 arg2, com.raylib.Raylib.Vector2 arg3) {
        return Raylib.CheckCollisionPointTriangle(arg0, arg1, arg2, arg3);
    }

    public static void drawSplineSegmentBezierCubic(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1, com.raylib.Raylib.Vector2 arg2, com.raylib.Raylib.Vector2 arg3, float arg4, com.raylib.Raylib.Color arg5) {
        Raylib.DrawSplineSegmentBezierCubic(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void setAutomationEventBaseFrame(int arg0) {
        Raylib.SetAutomationEventBaseFrame(arg0);
    }

    public static void drawSplineSegmentBezierQuadratic(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1, com.raylib.Raylib.Vector2 arg2, float arg3, com.raylib.Raylib.Color arg4) {
        Raylib.DrawSplineSegmentBezierQuadratic(arg0, arg1, arg2, arg3, arg4);
    }

    public static void startAutomationEventRecording() {
        Raylib.StartAutomationEventRecording();
    }

    public static void drawRectangleRoundedLinesEx(com.raylib.Raylib.Rectangle arg0, float arg1, int arg2, float arg3, com.raylib.Raylib.Color arg4) {
        Raylib.DrawRectangleRoundedLinesEx(arg0, arg1, arg2, arg3, arg4);
    }

    public static void drawSplineSegmentCatmullRom(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1, com.raylib.Raylib.Vector2 arg2, com.raylib.Raylib.Vector2 arg3, float arg4, com.raylib.Raylib.Color arg5) {
        Raylib.DrawSplineSegmentCatmullRom(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void rlSetVertexAttributeDefault(int arg0, org.bytedeco.javacpp.Pointer arg1, int arg2, int arg3) {
        Raylib.rlSetVertexAttributeDefault(arg0, arg1, arg2, arg3);
    }

    public static void rlSetVertexAttributeDivisor(int arg0, int arg1) {
        Raylib.rlSetVertexAttributeDivisor(arg0, arg1);
    }

    public static void rlDrawVertexArrayElementsInstanced(int arg0, int arg1, org.bytedeco.javacpp.Pointer arg2, int arg3) {
        Raylib.rlDrawVertexArrayElementsInstanced(arg0, arg1, arg2, arg3);
    }

    public static void setAudioStreamBufferSizeDefault(int arg0) {
        Raylib.SetAudioStreamBufferSizeDefault(arg0);
    }

    public static void rlEnableVertexBufferElement(int arg0) {
        Raylib.rlEnableVertexBufferElement(arg0);
    }

    public static com.raylib.Raylib.Matrix rlGetMatrixProjectionStereo(int arg0) {
        return Raylib.rlGetMatrixProjectionStereo(arg0);
    }

    public static void rlDisableVertexBufferElement() {
        Raylib.rlDisableVertexBufferElement();
    }

    public static void rlUpdateVertexBufferElements(int arg0, org.bytedeco.javacpp.Pointer arg1, int arg2, int arg3) {
        Raylib.rlUpdateVertexBufferElements(arg0, arg1, arg2, arg3);
    }

    public static void rlSetMatrixProjectionStereo(com.raylib.Raylib.Matrix arg0, com.raylib.Raylib.Matrix arg1) {
        Raylib.rlSetMatrixProjectionStereo(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 quaternionFromVector3ToVector3(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.QuaternionFromVector3ToVector3(arg0, arg1);
    }

    public static void rlSetMatrixViewOffsetStereo(com.raylib.Raylib.Matrix arg0, com.raylib.Raylib.Matrix arg1) {
        Raylib.rlSetMatrixViewOffsetStereo(arg0, arg1);
    }

    public static com.raylib.Raylib.Matrix rlGetMatrixViewOffsetStereo(int arg0) {
        return Raylib.rlGetMatrixViewOffsetStereo(arg0);
    }

    public static int getPhysicsShapeVerticesCount(int arg0) {
        return Raylib.GetPhysicsShapeVerticesCount(arg0);
    }

    public static com.raylib.Raylib.Vector4 quaternionCubicHermiteSpline(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1, com.raylib.Raylib.Vector4 arg2, com.raylib.Raylib.Vector4 arg3, float arg4) {
        return Raylib.QuaternionCubicHermiteSpline(arg0, arg1, arg2, arg3, arg4);
    }

    public static int getMonitorPhysicalWidth(int arg0) {
        return Raylib.GetMonitorPhysicalWidth(arg0);
    }

    public static void disableEventWaiting() {
        Raylib.DisableEventWaiting();
    }

    public static com.raylib.Raylib.Shader loadShaderFromMemory(org.bytedeco.javacpp.BytePointer arg0, org.bytedeco.javacpp.BytePointer arg1) {
        return Raylib.LoadShaderFromMemory(arg0, arg1);
    }

    public static com.raylib.Raylib.Shader loadShaderFromMemory(java.lang.String arg0, java.lang.String arg1) {
        return Raylib.LoadShaderFromMemory(arg0, arg1);
    }

    public static void toggleBorderlessWindowed() {
        Raylib.ToggleBorderlessWindowed();
    }

    public static int getMonitorPhysicalHeight(int arg0) {
        return Raylib.GetMonitorPhysicalHeight(arg0);
    }

    public static void setShaderValueMatrix(com.raylib.Raylib.Shader arg0, int arg1, com.raylib.Raylib.Matrix arg2) {
        Raylib.SetShaderValueMatrix(arg0, arg1, arg2);
    }

    public static void setShaderValueTexture(com.raylib.Raylib.Shader arg0, int arg1, com.raylib.Raylib.Texture arg2) {
        Raylib.SetShaderValueTexture(arg0, arg1, arg2);
    }

    public static void setTraceLogCallback(com.raylib.Raylib.TraceLogCallback arg0) {
        Raylib.SetTraceLogCallback(arg0);
    }

    public static void unloadVrStereoConfig(com.raylib.Raylib.VrStereoConfig arg0) {
        Raylib.UnloadVrStereoConfig(arg0);
    }

    public static com.raylib.Raylib.Ray getScreenToWorldRay(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Camera3D arg1) {
        return Raylib.GetScreenToWorldRay(arg0, arg1);
    }

    public static void setSaveFileDataCallback(com.raylib.Raylib.SaveFileDataCallback arg0) {
        Raylib.SetSaveFileDataCallback(arg0);
    }

    public static void setLoadFileTextCallback(com.raylib.Raylib.LoadFileTextCallback arg0) {
        Raylib.SetLoadFileTextCallback(arg0);
    }

    public static int getMonitorRefreshRate(int arg0) {
        return Raylib.GetMonitorRefreshRate(arg0);
    }

    public static void unloadRandomSequence(java.nio.IntBuffer arg0) {
        Raylib.UnloadRandomSequence(arg0);
    }

    public static void unloadRandomSequence(org.bytedeco.javacpp.IntPointer arg0) {
        Raylib.UnloadRandomSequence(arg0);
    }

    public static void unloadRandomSequence(int[] arg0) {
        Raylib.UnloadRandomSequence(arg0);
    }

    public static void setSaveFileTextCallback(com.raylib.Raylib.SaveFileTextCallback arg0) {
        Raylib.SetSaveFileTextCallback(arg0);
    }

    public static int getShaderLocationAttrib(com.raylib.Raylib.Shader arg0, org.bytedeco.javacpp.BytePointer arg1) {
        return Raylib.GetShaderLocationAttrib(arg0, arg1);
    }

    public static int getShaderLocationAttrib(com.raylib.Raylib.Shader arg0, java.lang.String arg1) {
        return Raylib.GetShaderLocationAttrib(arg0, arg1);
    }

    public static com.raylib.Raylib.Ray getScreenToWorldRayEx(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Camera3D arg1, int arg2, int arg3) {
        return Raylib.GetScreenToWorldRayEx(arg0, arg1, arg2, arg3);
    }

    public static void setLoadFileDataCallback(com.raylib.Raylib.LoadFileDataCallback arg0) {
        Raylib.SetLoadFileDataCallback(arg0);
    }

    public static org.bytedeco.javacpp.BytePointer getFileNameWithoutExt(org.bytedeco.javacpp.BytePointer arg0) {
        return Raylib.GetFileNameWithoutExt(arg0);
    }

    public static java.lang.String getFileNameWithoutExt(java.lang.String arg0) {
        return Raylib.GetFileNameWithoutExt(arg0);
    }

    public static void drawSplineBezierCubic(com.raylib.Raylib.Vector2 arg0, int arg1, float arg2, com.raylib.Raylib.Color arg3) {
        Raylib.DrawSplineBezierCubic(arg0, arg1, arg2, arg3);
    }

    public static boolean checkCollisionCircleLine(com.raylib.Raylib.Vector2 arg0, float arg1, com.raylib.Raylib.Vector2 arg2, com.raylib.Raylib.Vector2 arg3) {
        return Raylib.CheckCollisionCircleLine(arg0, arg1, arg2, arg3);
    }

    public static void drawRectangleRounded(com.raylib.Raylib.Rectangle arg0, float arg1, int arg2, com.raylib.Raylib.Color arg3) {
        Raylib.DrawRectangleRounded(arg0, arg1, arg2, arg3);
    }

    public static boolean checkCollisionCircles(com.raylib.Raylib.Vector2 arg0, float arg1, com.raylib.Raylib.Vector2 arg2, float arg3) {
        return Raylib.CheckCollisionCircles(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.Image loadImageAnimFromMemory(org.bytedeco.javacpp.BytePointer arg0, byte[] arg1, int arg2, int[] arg3) {
        return Raylib.LoadImageAnimFromMemory(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.Image loadImageAnimFromMemory(org.bytedeco.javacpp.BytePointer arg0, org.bytedeco.javacpp.BytePointer arg1, int arg2, org.bytedeco.javacpp.IntPointer arg3) {
        return Raylib.LoadImageAnimFromMemory(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.Image loadImageAnimFromMemory(java.lang.String arg0, byte[] arg1, int arg2, int[] arg3) {
        return Raylib.LoadImageAnimFromMemory(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.Image loadImageAnimFromMemory(java.lang.String arg0, org.bytedeco.javacpp.BytePointer arg1, int arg2, org.bytedeco.javacpp.IntPointer arg3) {
        return Raylib.LoadImageAnimFromMemory(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.Image loadImageAnimFromMemory(org.bytedeco.javacpp.BytePointer arg0, java.nio.ByteBuffer arg1, int arg2, java.nio.IntBuffer arg3) {
        return Raylib.LoadImageAnimFromMemory(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.Image loadImageAnimFromMemory(java.lang.String arg0, java.nio.ByteBuffer arg1, int arg2, java.nio.IntBuffer arg3) {
        return Raylib.LoadImageAnimFromMemory(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.Vector2 getSplinePointBezierCubic(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1, com.raylib.Raylib.Vector2 arg2, com.raylib.Raylib.Vector2 arg3, float arg4) {
        return Raylib.GetSplinePointBezierCubic(arg0, arg1, arg2, arg3, arg4);
    }

    public static void imageColorGrayscale(com.raylib.Raylib.Image arg0) {
        Raylib.ImageColorGrayscale(arg0);
    }

    public static void imageColorBrightness(com.raylib.Raylib.Image arg0, int arg1) {
        Raylib.ImageColorBrightness(arg0, arg1);
    }

    public static void playAutomationEvent(com.raylib.Raylib.AutomationEvent arg0) {
        Raylib.PlayAutomationEvent(arg0);
    }

    public static com.raylib.Raylib.FilePathList loadDirectoryFilesEx(java.lang.String arg0, java.lang.String arg1, boolean arg2) {
        return Raylib.LoadDirectoryFilesEx(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.FilePathList loadDirectoryFilesEx(org.bytedeco.javacpp.BytePointer arg0, org.bytedeco.javacpp.BytePointer arg1, boolean arg2) {
        return Raylib.LoadDirectoryFilesEx(arg0, arg1, arg2);
    }

    public static boolean isGamepadButtonPressed(int arg0, int arg1) {
        return Raylib.IsGamepadButtonPressed(arg0, arg1);
    }

    public static void unloadAutomationEventList(com.raylib.Raylib.AutomationEventList arg0) {
        Raylib.UnloadAutomationEventList(arg0);
    }

    public static com.raylib.Raylib.Vector2 getGestureDragVector() {
        return Raylib.GetGestureDragVector();
    }

    public static com.raylib.Raylib.Rectangle getShapesTextureRectangle() {
        return Raylib.GetShapesTextureRectangle();
    }

    public static void drawRectangleRoundedLines(com.raylib.Raylib.Rectangle arg0, float arg1, int arg2, com.raylib.Raylib.Color arg3) {
        Raylib.DrawRectangleRoundedLines(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.Vector2 getSplinePointBasis(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1, com.raylib.Raylib.Vector2 arg2, com.raylib.Raylib.Vector2 arg3, float arg4) {
        return Raylib.GetSplinePointBasis(arg0, arg1, arg2, arg3, arg4);
    }

    public static float getGestureDragAngle() {
        return Raylib.GetGestureDragAngle();
    }

    public static com.raylib.Raylib.Vector2 getSplinePointCatmullRom(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1, com.raylib.Raylib.Vector2 arg2, com.raylib.Raylib.Vector2 arg3, float arg4) {
        return Raylib.GetSplinePointCatmullRom(arg0, arg1, arg2, arg3, arg4);
    }

    public static boolean checkCollisionCircleRec(com.raylib.Raylib.Vector2 arg0, float arg1, com.raylib.Raylib.Rectangle arg2) {
        return Raylib.CheckCollisionCircleRec(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Vector2 getSplinePointLinear(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1, float arg2) {
        return Raylib.GetSplinePointLinear(arg0, arg1, arg2);
    }

    public static boolean checkCollisionPointCircle(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1, float arg2) {
        return Raylib.CheckCollisionPointCircle(arg0, arg1, arg2);
    }

    public static boolean checkCollisionPointPoly(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1, int arg2) {
        return Raylib.CheckCollisionPointPoly(arg0, arg1, arg2);
    }

    public static void drawRectangleGradientEx(com.raylib.Raylib.Rectangle arg0, com.raylib.Raylib.Color arg1, com.raylib.Raylib.Color arg2, com.raylib.Raylib.Color arg3, com.raylib.Raylib.Color arg4) {
        Raylib.DrawRectangleGradientEx(arg0, arg1, arg2, arg3, arg4);
    }

    public static void drawRectangleGradientV(int arg0, int arg1, int arg2, int arg3, com.raylib.Raylib.Color arg4, com.raylib.Raylib.Color arg5) {
        Raylib.DrawRectangleGradientV(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static float getGesturePinchAngle() {
        return Raylib.GetGesturePinchAngle();
    }

    public static org.bytedeco.javacpp.BytePointer getApplicationDirectory() {
        return Raylib.GetApplicationDirectory();
    }

    public static int getGamepadAxisCount(int arg0) {
        return Raylib.GetGamepadAxisCount(arg0);
    }

    public static boolean isMouseButtonPressed(int arg0) {
        return Raylib.IsMouseButtonPressed(arg0);
    }

    public static com.raylib.Raylib.Image loadImageFromMemory(java.lang.String arg0, org.bytedeco.javacpp.BytePointer arg1, int arg2) {
        return Raylib.LoadImageFromMemory(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Image loadImageFromMemory(java.lang.String arg0, byte[] arg1, int arg2) {
        return Raylib.LoadImageFromMemory(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Image loadImageFromMemory(java.lang.String arg0, java.nio.ByteBuffer arg1, int arg2) {
        return Raylib.LoadImageFromMemory(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Image loadImageFromMemory(org.bytedeco.javacpp.BytePointer arg0, org.bytedeco.javacpp.BytePointer arg1, int arg2) {
        return Raylib.LoadImageFromMemory(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Image loadImageFromMemory(org.bytedeco.javacpp.BytePointer arg0, byte[] arg1, int arg2) {
        return Raylib.LoadImageFromMemory(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Image loadImageFromMemory(org.bytedeco.javacpp.BytePointer arg0, java.nio.ByteBuffer arg1, int arg2) {
        return Raylib.LoadImageFromMemory(arg0, arg1, arg2);
    }

    public static byte[] exportImageToMemory(com.raylib.Raylib.Image arg0, java.lang.String arg1, int[] arg2) {
        return Raylib.ExportImageToMemory(arg0, arg1, arg2);
    }

    public static java.nio.ByteBuffer exportImageToMemory(com.raylib.Raylib.Image arg0, org.bytedeco.javacpp.BytePointer arg1, java.nio.IntBuffer arg2) {
        return Raylib.ExportImageToMemory(arg0, arg1, arg2);
    }

    public static org.bytedeco.javacpp.BytePointer exportImageToMemory(com.raylib.Raylib.Image arg0, org.bytedeco.javacpp.BytePointer arg1, org.bytedeco.javacpp.IntPointer arg2) {
        return Raylib.ExportImageToMemory(arg0, arg1, arg2);
    }

    public static byte[] exportImageToMemory(com.raylib.Raylib.Image arg0, org.bytedeco.javacpp.BytePointer arg1, int[] arg2) {
        return Raylib.ExportImageToMemory(arg0, arg1, arg2);
    }

    public static org.bytedeco.javacpp.BytePointer exportImageToMemory(com.raylib.Raylib.Image arg0, java.lang.String arg1, org.bytedeco.javacpp.IntPointer arg2) {
        return Raylib.ExportImageToMemory(arg0, arg1, arg2);
    }

    public static java.nio.ByteBuffer exportImageToMemory(com.raylib.Raylib.Image arg0, java.lang.String arg1, java.nio.IntBuffer arg2) {
        return Raylib.ExportImageToMemory(arg0, arg1, arg2);
    }

    public static void drawSplineSegmentLinear(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1, float arg2, com.raylib.Raylib.Color arg3) {
        Raylib.DrawSplineSegmentLinear(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.Image genImageGradientRadial(int arg0, int arg1, float arg2, com.raylib.Raylib.Color arg3, com.raylib.Raylib.Color arg4) {
        return Raylib.GenImageGradientRadial(arg0, arg1, arg2, arg3, arg4);
    }

    public static boolean isMouseButtonReleased(int arg0) {
        return Raylib.IsMouseButtonReleased(arg0);
    }

    public static org.bytedeco.javacpp.BytePointer getPrevDirectoryPath(org.bytedeco.javacpp.BytePointer arg0) {
        return Raylib.GetPrevDirectoryPath(arg0);
    }

    public static java.lang.String getPrevDirectoryPath(java.lang.String arg0) {
        return Raylib.GetPrevDirectoryPath(arg0);
    }

    public static void drawSplineBezierQuadratic(com.raylib.Raylib.Vector2 arg0, int arg1, float arg2, com.raylib.Raylib.Color arg3) {
        Raylib.DrawSplineBezierQuadratic(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.Image genImageGradientLinear(int arg0, int arg1, int arg2, com.raylib.Raylib.Color arg3, com.raylib.Raylib.Color arg4) {
        return Raylib.GenImageGradientLinear(arg0, arg1, arg2, arg3, arg4);
    }

    public static org.bytedeco.javacpp.BytePointer getWorkingDirectory() {
        return Raylib.GetWorkingDirectory();
    }

    public static void unloadDirectoryFiles(com.raylib.Raylib.FilePathList arg0) {
        Raylib.UnloadDirectoryFiles(arg0);
    }

    public static boolean checkCollisionLines(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1, com.raylib.Raylib.Vector2 arg2, com.raylib.Raylib.Vector2 arg3, com.raylib.Raylib.Vector2 arg4) {
        return Raylib.CheckCollisionLines(arg0, arg1, arg2, arg3, arg4);
    }

    public static com.raylib.Raylib.Image loadImageFromTexture(com.raylib.Raylib.Texture arg0) {
        return Raylib.LoadImageFromTexture(arg0);
    }

    public static com.raylib.Raylib.Image genImagePerlinNoise(int arg0, int arg1, int arg2, int arg3, float arg4) {
        return Raylib.GenImagePerlinNoise(arg0, arg1, arg2, arg3, arg4);
    }

    public static void imageKernelConvolution(com.raylib.Raylib.Image arg0, float[] arg1, int arg2) {
        Raylib.ImageKernelConvolution(arg0, arg1, arg2);
    }

    public static void imageKernelConvolution(com.raylib.Raylib.Image arg0, org.bytedeco.javacpp.FloatPointer arg1, int arg2) {
        Raylib.ImageKernelConvolution(arg0, arg1, arg2);
    }

    public static void imageKernelConvolution(com.raylib.Raylib.Image arg0, java.nio.FloatBuffer arg1, int arg2) {
        Raylib.ImageKernelConvolution(arg0, arg1, arg2);
    }

    public static void imageFlipHorizontal(com.raylib.Raylib.Image arg0) {
        Raylib.ImageFlipHorizontal(arg0);
    }

    public static boolean isGamepadButtonReleased(int arg0, int arg1) {
        return Raylib.IsGamepadButtonReleased(arg0, arg1);
    }

    public static void drawSplineCatmullRom(com.raylib.Raylib.Vector2 arg0, int arg1, float arg2, com.raylib.Raylib.Color arg3) {
        Raylib.DrawSplineCatmullRom(arg0, arg1, arg2, arg3);
    }

    public static void drawSplineSegmentBasis(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1, com.raylib.Raylib.Vector2 arg2, com.raylib.Raylib.Vector2 arg3, float arg4, com.raylib.Raylib.Color arg5) {
        Raylib.DrawSplineSegmentBasis(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static int getGamepadButtonPressed() {
        return Raylib.GetGamepadButtonPressed();
    }

    public static float getGestureHoldDuration() {
        return Raylib.GetGestureHoldDuration();
    }

    public static com.raylib.Raylib.Vector2 getSplinePointBezierQuad(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1, com.raylib.Raylib.Vector2 arg2, float arg3) {
        return Raylib.GetSplinePointBezierQuad(arg0, arg1, arg2, arg3);
    }

    public static void drawCircleSectorLines(com.raylib.Raylib.Vector2 arg0, float arg1, float arg2, float arg3, int arg4, com.raylib.Raylib.Color arg5) {
        Raylib.DrawCircleSectorLines(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void setAutomationEventList(com.raylib.Raylib.AutomationEventList arg0) {
        Raylib.SetAutomationEventList(arg0);
    }

    public static com.raylib.Raylib.AutomationEventList loadAutomationEventList(java.lang.String arg0) {
        return Raylib.LoadAutomationEventList(arg0);
    }

    public static com.raylib.Raylib.AutomationEventList loadAutomationEventList(org.bytedeco.javacpp.BytePointer arg0) {
        return Raylib.LoadAutomationEventList(arg0);
    }

    public static com.raylib.Raylib.Vector2 getGesturePinchVector() {
        return Raylib.GetGesturePinchVector();
    }

    public static void drawRectangleGradientH(int arg0, int arg1, int arg2, int arg3, com.raylib.Raylib.Color arg4, com.raylib.Raylib.Color arg5) {
        Raylib.DrawRectangleGradientH(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static boolean checkCollisionPointRec(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Rectangle arg1) {
        return Raylib.CheckCollisionPointRec(arg0, arg1);
    }

    public static void setGamepadVibration(int arg0, float arg1, float arg2, float arg3) {
        Raylib.SetGamepadVibration(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.Image loadImageFromScreen() {
        return Raylib.LoadImageFromScreen();
    }

    public static float getGamepadAxisMovement(int arg0, int arg1) {
        return Raylib.GetGamepadAxisMovement(arg0, arg1);
    }

    public static boolean checkCollisionPointLine(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1, com.raylib.Raylib.Vector2 arg2, int arg3) {
        return Raylib.CheckCollisionPointLine(arg0, arg1, arg2, arg3);
    }

    public static boolean exportAutomationEventList(com.raylib.Raylib.AutomationEventList arg0, org.bytedeco.javacpp.BytePointer arg1) {
        return Raylib.ExportAutomationEventList(arg0, arg1);
    }

    public static boolean exportAutomationEventList(com.raylib.Raylib.AutomationEventList arg0, java.lang.String arg1) {
        return Raylib.ExportAutomationEventList(arg0, arg1);
    }

    public static void drawRectangleLinesEx(com.raylib.Raylib.Rectangle arg0, float arg1, com.raylib.Raylib.Color arg2) {
        Raylib.DrawRectangleLinesEx(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Image genImageGradientSquare(int arg0, int arg1, float arg2, com.raylib.Raylib.Color arg3, com.raylib.Raylib.Color arg4) {
        return Raylib.GenImageGradientSquare(arg0, arg1, arg2, arg3, arg4);
    }

    public static void imageAlphaPremultiply(com.raylib.Raylib.Image arg0) {
        Raylib.ImageAlphaPremultiply(arg0);
    }

    public static boolean isGamepadButtonDown(int arg0, int arg1) {
        return Raylib.IsGamepadButtonDown(arg0, arg1);
    }

    public static boolean isModelAnimationValid(com.raylib.Raylib.Model arg0, com.raylib.Raylib.ModelAnimation arg1) {
        return Raylib.IsModelAnimationValid(arg0, arg1);
    }

    public static boolean checkCollisionBoxes(com.raylib.Raylib.BoundingBox arg0, com.raylib.Raylib.BoundingBox arg1) {
        return Raylib.CheckCollisionBoxes(arg0, arg1);
    }

    public static boolean checkCollisionBoxSphere(com.raylib.Raylib.BoundingBox arg0, com.raylib.Raylib.Vector3 arg1, float arg2) {
        return Raylib.CheckCollisionBoxSphere(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.RayCollision getRayCollisionMesh(com.raylib.Raylib.Ray arg0, com.raylib.Raylib.Mesh arg1, com.raylib.Raylib.Matrix arg2) {
        return Raylib.GetRayCollisionMesh(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.RayCollision getRayCollisionTriangle(com.raylib.Raylib.Ray arg0, com.raylib.Raylib.Vector3 arg1, com.raylib.Raylib.Vector3 arg2, com.raylib.Raylib.Vector3 arg3) {
        return Raylib.GetRayCollisionTriangle(arg0, arg1, arg2, arg3);
    }

    public static void imageDrawTriangleFan(com.raylib.Raylib.Image arg0, com.raylib.Raylib.Vector2 arg1, int arg2, com.raylib.Raylib.Color arg3) {
        Raylib.ImageDrawTriangleFan(arg0, arg1, arg2, arg3);
    }

    public static void unloadModelAnimations(com.raylib.Raylib.ModelAnimation arg0, int arg1) {
        Raylib.UnloadModelAnimations(arg0, arg1);
    }

    public static com.raylib.Raylib.RayCollision getRayCollisionSphere(com.raylib.Raylib.Ray arg0, com.raylib.Raylib.Vector3 arg1, float arg2) {
        return Raylib.GetRayCollisionSphere(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.RayCollision getRayCollisionQuad(com.raylib.Raylib.Ray arg0, com.raylib.Raylib.Vector3 arg1, com.raylib.Raylib.Vector3 arg2, com.raylib.Raylib.Vector3 arg3, com.raylib.Raylib.Vector3 arg4) {
        return Raylib.GetRayCollisionQuad(arg0, arg1, arg2, arg3, arg4);
    }

    public static void imageClearBackground(com.raylib.Raylib.Image arg0, com.raylib.Raylib.Color arg1) {
        Raylib.ImageClearBackground(arg0, arg1);
    }

    public static com.raylib.Raylib.Music loadMusicStreamFromMemory(java.lang.String arg0, org.bytedeco.javacpp.BytePointer arg1, int arg2) {
        return Raylib.LoadMusicStreamFromMemory(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Music loadMusicStreamFromMemory(org.bytedeco.javacpp.BytePointer arg0, byte[] arg1, int arg2) {
        return Raylib.LoadMusicStreamFromMemory(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Music loadMusicStreamFromMemory(java.lang.String arg0, byte[] arg1, int arg2) {
        return Raylib.LoadMusicStreamFromMemory(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Music loadMusicStreamFromMemory(org.bytedeco.javacpp.BytePointer arg0, java.nio.ByteBuffer arg1, int arg2) {
        return Raylib.LoadMusicStreamFromMemory(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Music loadMusicStreamFromMemory(org.bytedeco.javacpp.BytePointer arg0, org.bytedeco.javacpp.BytePointer arg1, int arg2) {
        return Raylib.LoadMusicStreamFromMemory(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Music loadMusicStreamFromMemory(java.lang.String arg0, java.nio.ByteBuffer arg1, int arg2) {
        return Raylib.LoadMusicStreamFromMemory(arg0, arg1, arg2);
    }

    public static boolean isMusicStreamPlaying(com.raylib.Raylib.Music arg0) {
        return Raylib.IsMusicStreamPlaying(arg0);
    }

    public static boolean isAudioStreamProcessed(com.raylib.Raylib.AudioStream arg0) {
        return Raylib.IsAudioStreamProcessed(arg0);
    }

    public static void setAudioStreamVolume(com.raylib.Raylib.AudioStream arg0, float arg1) {
        Raylib.SetAudioStreamVolume(arg0, arg1);
    }

    public static boolean isRenderTextureValid(com.raylib.Raylib.RenderTexture arg0) {
        return Raylib.IsRenderTextureValid(arg0);
    }

    public static void setModelMeshMaterial(com.raylib.Raylib.Model arg0, int arg1, int arg2) {
        Raylib.SetModelMeshMaterial(arg0, arg1, arg2);
    }

    public static void imageDrawCircleLines(com.raylib.Raylib.Image arg0, int arg1, int arg2, int arg3, com.raylib.Raylib.Color arg4) {
        Raylib.ImageDrawCircleLines(arg0, arg1, arg2, arg3, arg4);
    }

    public static void drawTriangleStrip3D(com.raylib.Raylib.Vector3 arg0, int arg1, com.raylib.Raylib.Color arg2) {
        Raylib.DrawTriangleStrip3D(arg0, arg1, arg2);
    }

    public static void updateModelAnimation(com.raylib.Raylib.Model arg0, com.raylib.Raylib.ModelAnimation arg1, int arg2) {
        Raylib.UpdateModelAnimation(arg0, arg1, arg2);
    }

    public static void unloadModelAnimation(com.raylib.Raylib.ModelAnimation arg0) {
        Raylib.UnloadModelAnimation(arg0);
    }

    public static boolean isAudioStreamPlaying(com.raylib.Raylib.AudioStream arg0) {
        return Raylib.IsAudioStreamPlaying(arg0);
    }

    public static com.raylib.Raylib.Color colorFromNormalized(com.raylib.Raylib.Vector4 arg0) {
        return Raylib.ColorFromNormalized(arg0);
    }

    public static void setAudioStreamPitch(com.raylib.Raylib.AudioStream arg0, float arg1) {
        Raylib.SetAudioStreamPitch(arg0, arg1);
    }

    public static void setAudioStreamCallback(com.raylib.Raylib.AudioStream arg0, com.raylib.Raylib.AudioCallback arg1) {
        Raylib.SetAudioStreamCallback(arg0, arg1);
    }

    public static boolean checkCollisionSpheres(com.raylib.Raylib.Vector3 arg0, float arg1, com.raylib.Raylib.Vector3 arg2, float arg3) {
        return Raylib.CheckCollisionSpheres(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.Material loadMaterialDefault() {
        return Raylib.LoadMaterialDefault();
    }

    public static com.raylib.Raylib.Rectangle getImageAlphaBorder(com.raylib.Raylib.Image arg0, float arg1) {
        return Raylib.GetImageAlphaBorder(arg0, arg1);
    }

    public static void attachAudioStreamProcessor(com.raylib.Raylib.AudioStream arg0, com.raylib.Raylib.AudioCallback arg1) {
        Raylib.AttachAudioStreamProcessor(arg0, arg1);
    }

    public static void imageDrawRectangleV(com.raylib.Raylib.Image arg0, com.raylib.Raylib.Vector2 arg1, com.raylib.Raylib.Vector2 arg2, com.raylib.Raylib.Color arg3) {
        Raylib.ImageDrawRectangleV(arg0, arg1, arg2, arg3);
    }

    public static void imageDrawRectangleLines(com.raylib.Raylib.Image arg0, com.raylib.Raylib.Rectangle arg1, int arg2, com.raylib.Raylib.Color arg3) {
        Raylib.ImageDrawRectangleLines(arg0, arg1, arg2, arg3);
    }

    public static void imageDrawTriangleEx(com.raylib.Raylib.Image arg0, com.raylib.Raylib.Vector2 arg1, com.raylib.Raylib.Vector2 arg2, com.raylib.Raylib.Vector2 arg3, com.raylib.Raylib.Color arg4, com.raylib.Raylib.Color arg5, com.raylib.Raylib.Color arg6) {
        Raylib.ImageDrawTriangleEx(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static void imageDrawTriangleLines(com.raylib.Raylib.Image arg0, com.raylib.Raylib.Vector2 arg1, com.raylib.Raylib.Vector2 arg2, com.raylib.Raylib.Vector2 arg3, com.raylib.Raylib.Color arg4) {
        Raylib.ImageDrawTriangleLines(arg0, arg1, arg2, arg3, arg4);
    }

    public static void imageDrawCircleLinesV(com.raylib.Raylib.Image arg0, com.raylib.Raylib.Vector2 arg1, int arg2, com.raylib.Raylib.Color arg3) {
        Raylib.ImageDrawCircleLinesV(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.Texture loadTextureFromImage(com.raylib.Raylib.Image arg0) {
        return Raylib.LoadTextureFromImage(arg0);
    }

    public static void unloadRenderTexture(com.raylib.Raylib.RenderTexture arg0) {
        Raylib.UnloadRenderTexture(arg0);
    }

    public static void imageDrawTriangleStrip(com.raylib.Raylib.Image arg0, com.raylib.Raylib.Vector2 arg1, int arg2, com.raylib.Raylib.Color arg3) {
        Raylib.ImageDrawTriangleStrip(arg0, arg1, arg2, arg3);
    }

    public static int getCodepointPrevious(org.bytedeco.javacpp.BytePointer arg0, int[] arg1) {
        return Raylib.GetCodepointPrevious(arg0, arg1);
    }

    public static int getCodepointPrevious(java.lang.String arg0, java.nio.IntBuffer arg1) {
        return Raylib.GetCodepointPrevious(arg0, arg1);
    }

    public static int getCodepointPrevious(org.bytedeco.javacpp.BytePointer arg0, org.bytedeco.javacpp.IntPointer arg1) {
        return Raylib.GetCodepointPrevious(arg0, arg1);
    }

    public static int getCodepointPrevious(java.lang.String arg0, org.bytedeco.javacpp.IntPointer arg1) {
        return Raylib.GetCodepointPrevious(arg0, arg1);
    }

    public static int getCodepointPrevious(org.bytedeco.javacpp.BytePointer arg0, java.nio.IntBuffer arg1) {
        return Raylib.GetCodepointPrevious(arg0, arg1);
    }

    public static int getCodepointPrevious(java.lang.String arg0, int[] arg1) {
        return Raylib.GetCodepointPrevious(arg0, arg1);
    }

    public static void imageDrawRectangleRec(com.raylib.Raylib.Image arg0, com.raylib.Raylib.Rectangle arg1, com.raylib.Raylib.Color arg2) {
        Raylib.ImageDrawRectangleRec(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.BoundingBox getModelBoundingBox(com.raylib.Raylib.Model arg0) {
        return Raylib.GetModelBoundingBox(arg0);
    }

    public static com.raylib.Raylib.ModelAnimation loadModelAnimations(org.bytedeco.javacpp.BytePointer arg0, java.nio.IntBuffer arg1) {
        return Raylib.LoadModelAnimations(arg0, arg1);
    }

    public static com.raylib.Raylib.ModelAnimation loadModelAnimations(org.bytedeco.javacpp.BytePointer arg0, org.bytedeco.javacpp.IntPointer arg1) {
        return Raylib.LoadModelAnimations(arg0, arg1);
    }

    public static com.raylib.Raylib.ModelAnimation loadModelAnimations(java.lang.String arg0, org.bytedeco.javacpp.IntPointer arg1) {
        return Raylib.LoadModelAnimations(arg0, arg1);
    }

    public static com.raylib.Raylib.ModelAnimation loadModelAnimations(org.bytedeco.javacpp.BytePointer arg0, int[] arg1) {
        return Raylib.LoadModelAnimations(arg0, arg1);
    }

    public static com.raylib.Raylib.ModelAnimation loadModelAnimations(java.lang.String arg0, java.nio.IntBuffer arg1) {
        return Raylib.LoadModelAnimations(arg0, arg1);
    }

    public static com.raylib.Raylib.ModelAnimation loadModelAnimations(java.lang.String arg0, int[] arg1) {
        return Raylib.LoadModelAnimations(arg0, arg1);
    }

    public static void updateModelAnimationBones(com.raylib.Raylib.Model arg0, com.raylib.Raylib.ModelAnimation arg1, int arg2) {
        Raylib.UpdateModelAnimationBones(arg0, arg1, arg2);
    }

    public static void drawCylinderWiresEx(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1, float arg2, float arg3, int arg4, com.raylib.Raylib.Color arg5) {
        Raylib.DrawCylinderWiresEx(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void hideCursor() {
        Raylib.HideCursor();
    }

    public static void openURL(org.bytedeco.javacpp.BytePointer arg0) {
        Raylib.OpenURL(arg0);
    }

    public static void openURL(java.lang.String arg0) {
        Raylib.OpenURL(arg0);
    }

    public static boolean fileExists(java.lang.String arg0) {
        return Raylib.FileExists(arg0);
    }

    public static boolean fileExists(org.bytedeco.javacpp.BytePointer arg0) {
        return Raylib.FileExists(arg0);
    }

    public static void endDrawing() {
        Raylib.EndDrawing();
    }

    public static org.bytedeco.javacpp.Pointer memRealloc(org.bytedeco.javacpp.Pointer arg0, int arg1) {
        return Raylib.MemRealloc(arg0, arg1);
    }

    public static void endMode2D() {
        Raylib.EndMode2D();
    }

    public static void endMode3D() {
        Raylib.EndMode3D();
    }

    public static org.bytedeco.javacpp.Pointer memAlloc(int arg0) {
        return Raylib.MemAlloc(arg0);
    }

    public static void memFree(org.bytedeco.javacpp.Pointer arg0) {
        Raylib.MemFree(arg0);
    }

    public static boolean isPathFile(org.bytedeco.javacpp.BytePointer arg0) {
        return Raylib.IsPathFile(arg0);
    }

    public static boolean isPathFile(java.lang.String arg0) {
        return Raylib.IsPathFile(arg0);
    }

    public static org.bytedeco.javacpp.IntPointer computeMD5(org.bytedeco.javacpp.BytePointer arg0, int arg1) {
        return Raylib.ComputeMD5(arg0, arg1);
    }

    public static java.nio.IntBuffer computeMD5(java.nio.ByteBuffer arg0, int arg1) {
        return Raylib.ComputeMD5(arg0, arg1);
    }

    public static int[] computeMD5(byte[] arg0, int arg1) {
        return Raylib.ComputeMD5(arg0, arg1);
    }

    public static boolean isKeyDown(int arg0) {
        return Raylib.IsKeyDown(arg0);
    }

    public static void waitTime(double arg0) {
        Raylib.WaitTime(arg0);
    }

    public static void showCursor() {
        Raylib.ShowCursor();
    }

    public static double getTime() {
        return Raylib.GetTime();
    }

    public static boolean isKeyUp(int arg0) {
        return Raylib.IsKeyUp(arg0);
    }

    public static void setExitKey(int arg0) {
        Raylib.SetExitKey(arg0);
    }

    public static int getMouseX() {
        return Raylib.GetMouseX();
    }

    public static int getMouseY() {
        return Raylib.GetMouseY();
    }

    public static com.raylib.Raylib.Shader loadShader(org.bytedeco.javacpp.BytePointer arg0, org.bytedeco.javacpp.BytePointer arg1) {
        return Raylib.LoadShader(arg0, arg1);
    }

    public static com.raylib.Raylib.Shader loadShader(java.lang.String arg0, java.lang.String arg1) {
        return Raylib.LoadShader(arg0, arg1);
    }

    public static int getFPS() {
        return Raylib.GetFPS();
    }

    public static void traceLog(int arg0, java.lang.String arg1) {
        Raylib.TraceLog(arg0, arg1);
    }

    public static void traceLog(int arg0, org.bytedeco.javacpp.BytePointer arg1) {
        Raylib.TraceLog(arg0, arg1);
    }

    public static void initWindow(int arg0, int arg1, org.bytedeco.javacpp.BytePointer arg2) {
        Raylib.InitWindow(arg0, arg1, arg2);
    }

    public static void initWindow(int arg0, int arg1, java.lang.String arg2) {
        Raylib.InitWindow(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Model loadModel(java.lang.String arg0) {
        return Raylib.LoadModel(arg0);
    }

    public static com.raylib.Raylib.Model loadModel(org.bytedeco.javacpp.BytePointer arg0) {
        return Raylib.LoadModel(arg0);
    }

    public static boolean exportWave(com.raylib.Raylib.Wave arg0, java.lang.String arg1) {
        return Raylib.ExportWave(arg0, arg1);
    }

    public static boolean exportWave(com.raylib.Raylib.Wave arg0, org.bytedeco.javacpp.BytePointer arg1) {
        return Raylib.ExportWave(arg0, arg1);
    }

    public static void playSound(com.raylib.Raylib.Sound arg0) {
        Raylib.PlaySound(arg0);
    }

    public static com.raylib.Raylib.Font loadFont(java.lang.String arg0) {
        return Raylib.LoadFont(arg0);
    }

    public static com.raylib.Raylib.Font loadFont(org.bytedeco.javacpp.BytePointer arg0) {
        return Raylib.LoadFont(arg0);
    }

    public static void drawGrid(int arg0, float arg1) {
        Raylib.DrawGrid(arg0, arg1);
    }

    public static void drawPlane(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector2 arg1, com.raylib.Raylib.Color arg2) {
        Raylib.DrawPlane(arg0, arg1, arg2);
    }

    public static void drawMesh(com.raylib.Raylib.Mesh arg0, com.raylib.Raylib.Material arg1, com.raylib.Raylib.Matrix arg2) {
        Raylib.DrawMesh(arg0, arg1, arg2);
    }

    public static java.lang.String textFormat(java.lang.String arg0) {
        return Raylib.TextFormat(arg0);
    }

    public static org.bytedeco.javacpp.BytePointer textFormat(org.bytedeco.javacpp.BytePointer arg0) {
        return Raylib.TextFormat(arg0);
    }

    public static void imageCrop(com.raylib.Raylib.Image arg0, com.raylib.Raylib.Rectangle arg1) {
        Raylib.ImageCrop(arg0, arg1);
    }

    public static void stopSound(com.raylib.Raylib.Sound arg0) {
        Raylib.StopSound(arg0);
    }

    public static com.raylib.Raylib.Image imageText(java.lang.String arg0, int arg1, com.raylib.Raylib.Color arg2) {
        return Raylib.ImageText(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Image imageText(org.bytedeco.javacpp.BytePointer arg0, int arg1, com.raylib.Raylib.Color arg2) {
        return Raylib.ImageText(arg0, arg1, arg2);
    }

    public static org.bytedeco.javacpp.BytePointer textJoin(java.nio.ByteBuffer arg0, int arg1, org.bytedeco.javacpp.BytePointer arg2) {
        return Raylib.TextJoin(arg0, arg1, arg2);
    }

    public static java.lang.String textJoin(byte[] arg0, int arg1, java.lang.String arg2) {
        return Raylib.TextJoin(arg0, arg1, arg2);
    }

    public static org.bytedeco.javacpp.BytePointer textJoin(org.bytedeco.javacpp.PointerPointer arg0, int arg1, org.bytedeco.javacpp.BytePointer arg2) {
        return Raylib.TextJoin(arg0, arg1, arg2);
    }

    public static org.bytedeco.javacpp.BytePointer textJoin(org.bytedeco.javacpp.BytePointer arg0, int arg1, org.bytedeco.javacpp.BytePointer arg2) {
        return Raylib.TextJoin(arg0, arg1, arg2);
    }

    public static java.lang.String textJoin(java.nio.ByteBuffer arg0, int arg1, java.lang.String arg2) {
        return Raylib.TextJoin(arg0, arg1, arg2);
    }

    public static org.bytedeco.javacpp.BytePointer textJoin(byte[] arg0, int arg1, org.bytedeco.javacpp.BytePointer arg2) {
        return Raylib.TextJoin(arg0, arg1, arg2);
    }

    public static java.lang.String textJoin(org.bytedeco.javacpp.BytePointer arg0, int arg1, java.lang.String arg2) {
        return Raylib.TextJoin(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Image loadImage(java.lang.String arg0) {
        return Raylib.LoadImage(arg0);
    }

    public static com.raylib.Raylib.Image loadImage(org.bytedeco.javacpp.BytePointer arg0) {
        return Raylib.LoadImage(arg0);
    }

    public static int colorToInt(com.raylib.Raylib.Color arg0) {
        return Raylib.ColorToInt(arg0);
    }

    public static com.raylib.Raylib.Color fade(com.raylib.Raylib.Color arg0, float arg1) {
        return Raylib.Fade(arg0, arg1);
    }

    public static void drawLine3D(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1, com.raylib.Raylib.Color arg2) {
        Raylib.DrawLine3D(arg0, arg1, arg2);
    }

    public static void drawRay(com.raylib.Raylib.Ray arg0, com.raylib.Raylib.Color arg1) {
        Raylib.DrawRay(arg0, arg1);
    }

    public static void drawModel(com.raylib.Raylib.Model arg0, com.raylib.Raylib.Vector3 arg1, float arg2, com.raylib.Raylib.Color arg3) {
        Raylib.DrawModel(arg0, arg1, arg2, arg3);
    }

    public static void unloadWave(com.raylib.Raylib.Wave arg0) {
        Raylib.UnloadWave(arg0);
    }

    public static com.raylib.Raylib.Wave waveCopy(com.raylib.Raylib.Wave arg0) {
        return Raylib.WaveCopy(arg0);
    }

    public static void waveCrop(com.raylib.Raylib.Wave arg0, int arg1, int arg2) {
        Raylib.WaveCrop(arg0, arg1, arg2);
    }

    public static void waveFormat(com.raylib.Raylib.Wave arg0, int arg1, int arg2, int arg3) {
        Raylib.WaveFormat(arg0, arg1, arg2, arg3);
    }

    public static byte[] loadUTF8(int[] arg0, int arg1) {
        return Raylib.LoadUTF8(arg0, arg1);
    }

    public static java.nio.ByteBuffer loadUTF8(java.nio.IntBuffer arg0, int arg1) {
        return Raylib.LoadUTF8(arg0, arg1);
    }

    public static org.bytedeco.javacpp.BytePointer loadUTF8(org.bytedeco.javacpp.IntPointer arg0, int arg1) {
        return Raylib.LoadUTF8(arg0, arg1);
    }

    public static void rlRotatef(float arg0, float arg1, float arg2, float arg3) {
        Raylib.rlRotatef(arg0, arg1, arg2, arg3);
    }

    public static void pauseSound(com.raylib.Raylib.Sound arg0) {
        Raylib.PauseSound(arg0);
    }

    public static com.raylib.Raylib.Color colorLerp(com.raylib.Raylib.Color arg0, com.raylib.Raylib.Color arg1, float arg2) {
        return Raylib.ColorLerp(arg0, arg1, arg2);
    }

    public static byte[] textSplit(java.lang.String arg0, byte arg1, int[] arg2) {
        return Raylib.TextSplit(arg0, arg1, arg2);
    }

    public static org.bytedeco.javacpp.PointerPointer textSplit(org.bytedeco.javacpp.BytePointer arg0, byte arg1, org.bytedeco.javacpp.IntPointer arg2) {
        return Raylib.TextSplit(arg0, arg1, arg2);
    }

    public static java.nio.ByteBuffer textSplit(java.lang.String arg0, byte arg1, java.nio.IntBuffer arg2) {
        return Raylib.TextSplit(arg0, arg1, arg2);
    }

    public static java.nio.ByteBuffer textSplit(org.bytedeco.javacpp.BytePointer arg0, byte arg1, java.nio.IntBuffer arg2) {
        return Raylib.TextSplit(arg0, arg1, arg2);
    }

    public static byte[] textSplit(org.bytedeco.javacpp.BytePointer arg0, byte arg1, int[] arg2) {
        return Raylib.TextSplit(arg0, arg1, arg2);
    }

    public static org.bytedeco.javacpp.BytePointer textSplit(java.lang.String arg0, byte arg1, org.bytedeco.javacpp.IntPointer arg2) {
        return Raylib.TextSplit(arg0, arg1, arg2);
    }

    public static void drawPixelV(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Color arg1) {
        Raylib.DrawPixelV(arg0, arg1);
    }

    public static int getTouchY() {
        return Raylib.GetTouchY();
    }

    public static void drawCircle(int arg0, int arg1, float arg2, com.raylib.Raylib.Color arg3) {
        Raylib.DrawCircle(arg0, arg1, arg2, arg3);
    }

    public static void drawTextEx(com.raylib.Raylib.Font arg0, org.bytedeco.javacpp.BytePointer arg1, com.raylib.Raylib.Vector2 arg2, float arg3, float arg4, com.raylib.Raylib.Color arg5) {
        Raylib.DrawTextEx(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void drawTextEx(com.raylib.Raylib.Font arg0, java.lang.String arg1, com.raylib.Raylib.Vector2 arg2, float arg3, float arg4, com.raylib.Raylib.Color arg5) {
        Raylib.DrawTextEx(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void drawSphere(com.raylib.Raylib.Vector3 arg0, float arg1, com.raylib.Raylib.Color arg2) {
        Raylib.DrawSphere(arg0, arg1, arg2);
    }

    public static void uploadMesh(com.raylib.Raylib.Mesh arg0, boolean arg1) {
        Raylib.UploadMesh(arg0, arg1);
    }

    public static com.raylib.Raylib.Wave loadWave(java.lang.String arg0) {
        return Raylib.LoadWave(arg0);
    }

    public static com.raylib.Raylib.Wave loadWave(org.bytedeco.javacpp.BytePointer arg0) {
        return Raylib.LoadWave(arg0);
    }

    public static void drawRing(com.raylib.Raylib.Vector2 arg0, float arg1, float arg2, float arg3, float arg4, int arg5, com.raylib.Raylib.Color arg6) {
        Raylib.DrawRing(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static void unloadUTF8(org.bytedeco.javacpp.BytePointer arg0) {
        Raylib.UnloadUTF8(arg0);
    }

    public static void unloadUTF8(byte[] arg0) {
        Raylib.UnloadUTF8(arg0);
    }

    public static void unloadUTF8(java.nio.ByteBuffer arg0) {
        Raylib.UnloadUTF8(arg0);
    }

    public static void drawLine(int arg0, int arg1, int arg2, int arg3, com.raylib.Raylib.Color arg4) {
        Raylib.DrawLine(arg0, arg1, arg2, arg3, arg4);
    }

    public static void drawPixel(int arg0, int arg1, com.raylib.Raylib.Color arg2) {
        Raylib.DrawPixel(arg0, arg1, arg2);
    }

    public static void textAppend(byte[] arg0, java.lang.String arg1, int[] arg2) {
        Raylib.TextAppend(arg0, arg1, arg2);
    }

    public static void textAppend(java.nio.ByteBuffer arg0, org.bytedeco.javacpp.BytePointer arg1, java.nio.IntBuffer arg2) {
        Raylib.TextAppend(arg0, arg1, arg2);
    }

    public static void textAppend(org.bytedeco.javacpp.BytePointer arg0, java.lang.String arg1, org.bytedeco.javacpp.IntPointer arg2) {
        Raylib.TextAppend(arg0, arg1, arg2);
    }

    public static void textAppend(byte[] arg0, org.bytedeco.javacpp.BytePointer arg1, int[] arg2) {
        Raylib.TextAppend(arg0, arg1, arg2);
    }

    public static void textAppend(java.nio.ByteBuffer arg0, java.lang.String arg1, java.nio.IntBuffer arg2) {
        Raylib.TextAppend(arg0, arg1, arg2);
    }

    public static void textAppend(org.bytedeco.javacpp.BytePointer arg0, org.bytedeco.javacpp.BytePointer arg1, org.bytedeco.javacpp.IntPointer arg2) {
        Raylib.TextAppend(arg0, arg1, arg2);
    }

    public static int getTouchX() {
        return Raylib.GetTouchX();
    }

    public static void unloadMesh(com.raylib.Raylib.Mesh arg0) {
        Raylib.UnloadMesh(arg0);
    }

    public static void drawLineEx(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1, float arg2, com.raylib.Raylib.Color arg3) {
        Raylib.DrawLineEx(arg0, arg1, arg2, arg3);
    }

    public static org.bytedeco.javacpp.BytePointer textInsert(org.bytedeco.javacpp.BytePointer arg0, org.bytedeco.javacpp.BytePointer arg1, int arg2) {
        return Raylib.TextInsert(arg0, arg1, arg2);
    }

    public static java.nio.ByteBuffer textInsert(java.lang.String arg0, java.lang.String arg1, int arg2) {
        return Raylib.TextInsert(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Color getColor(int arg0) {
        return Raylib.GetColor(arg0);
    }

    public static void unloadFont(com.raylib.Raylib.Font arg0) {
        Raylib.UnloadFont(arg0);
    }

    public static void drawPoly(com.raylib.Raylib.Vector2 arg0, int arg1, float arg2, float arg3, com.raylib.Raylib.Color arg4) {
        Raylib.DrawPoly(arg0, arg1, arg2, arg3, arg4);
    }

    public static void drawCubeV(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1, com.raylib.Raylib.Color arg2) {
        Raylib.DrawCubeV(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Image imageCopy(com.raylib.Raylib.Image arg0) {
        return Raylib.ImageCopy(arg0);
    }

    public static void imageDraw(com.raylib.Raylib.Image arg0, com.raylib.Raylib.Image arg1, com.raylib.Raylib.Rectangle arg2, com.raylib.Raylib.Rectangle arg3, com.raylib.Raylib.Color arg4) {
        Raylib.ImageDraw(arg0, arg1, arg2, arg3, arg4);
    }

    public static com.raylib.Raylib.Color colorTint(com.raylib.Raylib.Color arg0, com.raylib.Raylib.Color arg1) {
        return Raylib.ColorTint(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 colorToHSV(com.raylib.Raylib.Color arg0) {
        return Raylib.ColorToHSV(arg0);
    }

    public static com.raylib.Raylib.Color colorAlpha(com.raylib.Raylib.Color arg0, float arg1) {
        return Raylib.ColorAlpha(arg0, arg1);
    }

    public static com.raylib.Raylib.Font loadFontEx(java.lang.String arg0, int arg1, int[] arg2, int arg3) {
        return Raylib.LoadFontEx(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.Font loadFontEx(org.bytedeco.javacpp.BytePointer arg0, int arg1, org.bytedeco.javacpp.IntPointer arg2, int arg3) {
        return Raylib.LoadFontEx(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.Font loadFontEx(java.lang.String arg0, int arg1, java.nio.IntBuffer arg2, int arg3) {
        return Raylib.LoadFontEx(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.Font loadFontEx(org.bytedeco.javacpp.BytePointer arg0, int arg1, int[] arg2, int arg3) {
        return Raylib.LoadFontEx(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.Font loadFontEx(java.lang.String arg0, int arg1, org.bytedeco.javacpp.IntPointer arg2, int arg3) {
        return Raylib.LoadFontEx(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.Font loadFontEx(org.bytedeco.javacpp.BytePointer arg0, int arg1, java.nio.IntBuffer arg2, int arg3) {
        return Raylib.LoadFontEx(arg0, arg1, arg2, arg3);
    }

    public static void drawLineV(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1, com.raylib.Raylib.Color arg2) {
        Raylib.DrawLineV(arg0, arg1, arg2);
    }

    public static void imageToPOT(com.raylib.Raylib.Image arg0, com.raylib.Raylib.Color arg1) {
        Raylib.ImageToPOT(arg0, arg1);
    }

    public static void drawFPS(int arg0, int arg1) {
        Raylib.DrawFPS(arg0, arg1);
    }

    public static void drawText(org.bytedeco.javacpp.BytePointer arg0, int arg1, int arg2, int arg3, com.raylib.Raylib.Color arg4) {
        Raylib.DrawText(arg0, arg1, arg2, arg3, arg4);
    }

    public static void drawText(java.lang.String arg0, int arg1, int arg2, int arg3, com.raylib.Raylib.Color arg4) {
        Raylib.DrawText(arg0, arg1, arg2, arg3, arg4);
    }

    public static int textCopy(org.bytedeco.javacpp.BytePointer arg0, java.lang.String arg1) {
        return Raylib.TextCopy(arg0, arg1);
    }

    public static int textCopy(java.nio.ByteBuffer arg0, org.bytedeco.javacpp.BytePointer arg1) {
        return Raylib.TextCopy(arg0, arg1);
    }

    public static int textCopy(byte[] arg0, java.lang.String arg1) {
        return Raylib.TextCopy(arg0, arg1);
    }

    public static int textCopy(org.bytedeco.javacpp.BytePointer arg0, org.bytedeco.javacpp.BytePointer arg1) {
        return Raylib.TextCopy(arg0, arg1);
    }

    public static int textCopy(byte[] arg0, org.bytedeco.javacpp.BytePointer arg1) {
        return Raylib.TextCopy(arg0, arg1);
    }

    public static int textCopy(java.nio.ByteBuffer arg0, java.lang.String arg1) {
        return Raylib.TextCopy(arg0, arg1);
    }

    public static int textLength(java.lang.String arg0) {
        return Raylib.TextLength(arg0);
    }

    public static int textLength(org.bytedeco.javacpp.BytePointer arg0) {
        return Raylib.TextLength(arg0);
    }

    public static void drawCube(com.raylib.Raylib.Vector3 arg0, float arg1, float arg2, float arg3, com.raylib.Raylib.Color arg4) {
        Raylib.DrawCube(arg0, arg1, arg2, arg3, arg4);
    }

    public static boolean exportMesh(com.raylib.Raylib.Mesh arg0, org.bytedeco.javacpp.BytePointer arg1) {
        return Raylib.ExportMesh(arg0, arg1);
    }

    public static boolean exportMesh(com.raylib.Raylib.Mesh arg0, java.lang.String arg1) {
        return Raylib.ExportMesh(arg0, arg1);
    }

    public static com.raylib.Raylib.Sound loadSound(org.bytedeco.javacpp.BytePointer arg0) {
        return Raylib.LoadSound(arg0);
    }

    public static com.raylib.Raylib.Sound loadSound(java.lang.String arg0) {
        return Raylib.LoadSound(arg0);
    }

    public static int guiLabel(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1) {
        return Raylib.GuiLabel(arg0, arg1);
    }

    public static int guiLabel(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1) {
        return Raylib.GuiLabel(arg0, arg1);
    }

    public static com.raylib.Raylib.Font guiGetFont() {
        return Raylib.GuiGetFont();
    }

    public static int guiButton(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1) {
        return Raylib.GuiButton(arg0, arg1);
    }

    public static int guiButton(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1) {
        return Raylib.GuiButton(arg0, arg1);
    }

    public static float clamp(float arg0, float arg1, float arg2) {
        return Raylib.Clamp(arg0, arg1, arg2);
    }

    public static void rlglInit(int arg0, int arg1) {
        Raylib.rlglInit(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 vector3Add(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.Vector3Add(arg0, arg1);
    }

    public static int guiToggle(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, org.bytedeco.javacpp.BoolPointer arg2) {
        return Raylib.GuiToggle(arg0, arg1, arg2);
    }

    public static int guiToggle(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, boolean[] arg2) {
        return Raylib.GuiToggle(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Vector3 vector3One() {
        return Raylib.Vector3One();
    }

    public static void rlScalef(float arg0, float arg1, float arg2) {
        Raylib.rlScalef(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Vector2 vector2Add(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.Vector2Add(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 vector4Max(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.Vector4Max(arg0, arg1);
    }

    public static void rlColor3f(float arg0, float arg1, float arg2) {
        Raylib.rlColor3f(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Matrix addPut(com.raylib.Raylib.Matrix arg0, com.raylib.Raylib.Matrix arg1) {
        return Raylib.addPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 addPut(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.addPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 addPut(com.raylib.Raylib.Vector4 arg0, float arg1) {
        return Raylib.addPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 addPut(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.addPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 addPut(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.addPut(arg0, arg1);
    }

    public static void rlColor4ub(byte arg0, byte arg1, byte arg2, byte arg3) {
        Raylib.rlColor4ub(arg0, arg1, arg2, arg3);
    }

    public static void rlOrtho(double arg0, double arg1, double arg2, double arg3, double arg4, double arg5) {
        Raylib.rlOrtho(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static com.raylib.Raylib.Vector3 dividePut(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.dividePut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 dividePut(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.dividePut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 dividePut(com.raylib.Raylib.Vector2 arg0, float arg1) {
        return Raylib.dividePut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 dividePut(com.raylib.Raylib.Vector3 arg0, float arg1) {
        return Raylib.dividePut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 dividePut(com.raylib.Raylib.Vector4 arg0, float arg1) {
        return Raylib.dividePut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 dividePut(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.dividePut(arg0, arg1);
    }

    public static void rlVertex3f(float arg0, float arg1, float arg2) {
        Raylib.rlVertex3f(arg0, arg1, arg2);
    }

    public static void rlVertex2i(int arg0, int arg1) {
        Raylib.rlVertex2i(arg0, arg1);
    }

    public static float normalize(float arg0, float arg1, float arg2) {
        return Raylib.Normalize(arg0, arg1, arg2);
    }

    public static boolean notEquals(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.notEquals(arg0, arg1);
    }

    public static boolean notEquals(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.notEquals(arg0, arg1);
    }

    public static boolean notEquals(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.notEquals(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 vector3Max(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.Vector3Max(arg0, arg1);
    }

    public static void rlScissor(int arg0, int arg1, int arg2, int arg3) {
        Raylib.rlScissor(arg0, arg1, arg2, arg3);
    }

    public static void rlVertex2f(float arg0, float arg1) {
        Raylib.rlVertex2f(arg0, arg1);
    }

    public static void rlNormal3f(float arg0, float arg1, float arg2) {
        Raylib.rlNormal3f(arg0, arg1, arg2);
    }

    public static float remap(float arg0, float arg1, float arg2, float arg3, float arg4) {
        return Raylib.Remap(arg0, arg1, arg2, arg3, arg4);
    }

    public static void rlFrustum(double arg0, double arg1, double arg2, double arg3, double arg4, double arg5) {
        Raylib.rlFrustum(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static com.raylib.Raylib.Vector2 vector2Max(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.Vector2Max(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 vector2One() {
        return Raylib.Vector2One();
    }

    public static com.raylib.Raylib.Matrix matrixAdd(com.raylib.Raylib.Matrix arg0, com.raylib.Raylib.Matrix arg1) {
        return Raylib.MatrixAdd(arg0, arg1);
    }

    public static void rlEnd() {
        Raylib.rlEnd();
    }

    public static void guiDisable() {
        Raylib.GuiDisable();
    }

    public static com.raylib.Raylib.Vector4 vector4One() {
        return Raylib.Vector4One();
    }

    public static void rlColor4f(float arg0, float arg1, float arg2, float arg3) {
        Raylib.rlColor4f(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.Vector4 vector4Add(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.Vector4Add(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 vector2Min(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.Vector2Min(arg0, arg1);
    }

    public static int guiPanel(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1) {
        return Raylib.GuiPanel(arg0, arg1);
    }

    public static int guiPanel(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1) {
        return Raylib.GuiPanel(arg0, arg1);
    }

    public static int guiTabBar(com.raylib.Raylib.Rectangle arg0, byte[] arg1, int arg2, int[] arg3) {
        return Raylib.GuiTabBar(arg0, arg1, arg2, arg3);
    }

    public static int guiTabBar(com.raylib.Raylib.Rectangle arg0, java.nio.ByteBuffer arg1, int arg2, java.nio.IntBuffer arg3) {
        return Raylib.GuiTabBar(arg0, arg1, arg2, arg3);
    }

    public static int guiTabBar(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, int arg2, org.bytedeco.javacpp.IntPointer arg3) {
        return Raylib.GuiTabBar(arg0, arg1, arg2, arg3);
    }

    public static int guiTabBar(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.PointerPointer arg1, int arg2, org.bytedeco.javacpp.IntPointer arg3) {
        return Raylib.GuiTabBar(arg0, arg1, arg2, arg3);
    }

    public static void rlViewport(int arg0, int arg1, int arg2, int arg3) {
        Raylib.rlViewport(arg0, arg1, arg2, arg3);
    }

    public static float lerp(float arg0, float arg1, float arg2) {
        return Raylib.Lerp(arg0, arg1, arg2);
    }

    public static void rlBegin(int arg0) {
        Raylib.rlBegin(arg0);
    }

    public static void rlglClose() {
        Raylib.rlglClose();
    }

    public static float wrap(float arg0, float arg1, float arg2) {
        return Raylib.Wrap(arg0, arg1, arg2);
    }

    public static void guiLock() {
        Raylib.GuiLock();
    }

    public static com.raylib.Raylib.Vector4 vector4Min(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.Vector4Min(arg0, arg1);
    }

    public static void guiEnable() {
        Raylib.GuiEnable();
    }

    public static void guiUnlock() {
        Raylib.GuiUnlock();
    }

    public static void guiSetFont(com.raylib.Raylib.Font arg0) {
        Raylib.GuiSetFont(arg0);
    }

    public static int guiLine(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1) {
        return Raylib.GuiLine(arg0, arg1);
    }

    public static int guiLine(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1) {
        return Raylib.GuiLine(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 vector3Min(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.Vector3Min(arg0, arg1);
    }

    public static int guiSpinner(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, int[] arg2, int arg3, int arg4, boolean arg5) {
        return Raylib.GuiSpinner(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static int guiSpinner(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, int[] arg2, int arg3, int arg4, boolean arg5) {
        return Raylib.GuiSpinner(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static int guiSpinner(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, java.nio.IntBuffer arg2, int arg3, int arg4, boolean arg5) {
        return Raylib.GuiSpinner(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static int guiSpinner(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, org.bytedeco.javacpp.IntPointer arg2, int arg3, int arg4, boolean arg5) {
        return Raylib.GuiSpinner(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static int guiSpinner(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, java.nio.IntBuffer arg2, int arg3, int arg4, boolean arg5) {
        return Raylib.GuiSpinner(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static int guiSpinner(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, org.bytedeco.javacpp.IntPointer arg2, int arg3, int arg4, boolean arg5) {
        return Raylib.GuiSpinner(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static int guiTextBox(com.raylib.Raylib.Rectangle arg0, byte[] arg1, int arg2, boolean arg3) {
        return Raylib.GuiTextBox(arg0, arg1, arg2, arg3);
    }

    public static int guiTextBox(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, int arg2, boolean arg3) {
        return Raylib.GuiTextBox(arg0, arg1, arg2, arg3);
    }

    public static int guiTextBox(com.raylib.Raylib.Rectangle arg0, java.nio.ByteBuffer arg1, int arg2, boolean arg3) {
        return Raylib.GuiTextBox(arg0, arg1, arg2, arg3);
    }

    public static int guiGrid(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, float arg2, int arg3, com.raylib.Raylib.Vector2 arg4) {
        return Raylib.GuiGrid(arg0, arg1, arg2, arg3, arg4);
    }

    public static int guiGrid(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, float arg2, int arg3, com.raylib.Raylib.Vector2 arg4) {
        return Raylib.GuiGrid(arg0, arg1, arg2, arg3, arg4);
    }

    public static int guiSlider(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, org.bytedeco.javacpp.BytePointer arg2, float[] arg3, float arg4, float arg5) {
        return Raylib.GuiSlider(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static int guiSlider(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, java.lang.String arg2, java.nio.FloatBuffer arg3, float arg4, float arg5) {
        return Raylib.GuiSlider(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static int guiSlider(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, org.bytedeco.javacpp.BytePointer arg2, org.bytedeco.javacpp.FloatPointer arg3, float arg4, float arg5) {
        return Raylib.GuiSlider(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static int guiSlider(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, java.lang.String arg2, org.bytedeco.javacpp.FloatPointer arg3, float arg4, float arg5) {
        return Raylib.GuiSlider(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static int guiSlider(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, java.lang.String arg2, float[] arg3, float arg4, float arg5) {
        return Raylib.GuiSlider(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static int guiSlider(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, org.bytedeco.javacpp.BytePointer arg2, java.nio.FloatBuffer arg3, float arg4, float arg5) {
        return Raylib.GuiSlider(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static java.nio.ByteBuffer loadFileData(java.lang.String arg0, java.nio.IntBuffer arg1) {
        return Raylib.LoadFileData(arg0, arg1);
    }

    public static byte[] loadFileData(java.lang.String arg0, int[] arg1) {
        return Raylib.LoadFileData(arg0, arg1);
    }

    public static org.bytedeco.javacpp.BytePointer loadFileData(org.bytedeco.javacpp.BytePointer arg0, org.bytedeco.javacpp.IntPointer arg1) {
        return Raylib.LoadFileData(arg0, arg1);
    }

    public static java.nio.ByteBuffer loadFileData(org.bytedeco.javacpp.BytePointer arg0, java.nio.IntBuffer arg1) {
        return Raylib.LoadFileData(arg0, arg1);
    }

    public static org.bytedeco.javacpp.BytePointer loadFileData(java.lang.String arg0, org.bytedeco.javacpp.IntPointer arg1) {
        return Raylib.LoadFileData(arg0, arg1);
    }

    public static byte[] loadFileData(org.bytedeco.javacpp.BytePointer arg0, int[] arg1) {
        return Raylib.LoadFileData(arg0, arg1);
    }

    public static void disableCursor() {
        Raylib.DisableCursor();
    }

    public static void endTextureMode() {
        Raylib.EndTextureMode();
    }

    public static void beginBlendMode(int arg0) {
        Raylib.BeginBlendMode(arg0);
    }

    public static com.raylib.Raylib.Vector2 getWorldToScreen2D(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Camera2D arg1) {
        return Raylib.GetWorldToScreen2D(arg0, arg1);
    }

    public static void endScissorMode() {
        Raylib.EndScissorMode();
    }

    public static com.raylib.Raylib.Matrix getCameraMatrix(com.raylib.Raylib.Camera3D arg0) {
        return Raylib.GetCameraMatrix(arg0);
    }

    public static void unloadFileText(org.bytedeco.javacpp.BytePointer arg0) {
        Raylib.UnloadFileText(arg0);
    }

    public static void unloadFileText(java.nio.ByteBuffer arg0) {
        Raylib.UnloadFileText(arg0);
    }

    public static void unloadFileText(byte[] arg0) {
        Raylib.UnloadFileText(arg0);
    }

    public static boolean isShaderValid(com.raylib.Raylib.Shader arg0) {
        return Raylib.IsShaderValid(arg0);
    }

    public static boolean directoryExists(org.bytedeco.javacpp.BytePointer arg0) {
        return Raylib.DirectoryExists(arg0);
    }

    public static boolean directoryExists(java.lang.String arg0) {
        return Raylib.DirectoryExists(arg0);
    }

    public static java.lang.String getFileExtension(java.lang.String arg0) {
        return Raylib.GetFileExtension(arg0);
    }

    public static org.bytedeco.javacpp.BytePointer getFileExtension(org.bytedeco.javacpp.BytePointer arg0) {
        return Raylib.GetFileExtension(arg0);
    }

    public static int getShaderLocation(com.raylib.Raylib.Shader arg0, java.lang.String arg1) {
        return Raylib.GetShaderLocation(arg0, arg1);
    }

    public static int getShaderLocation(com.raylib.Raylib.Shader arg0, org.bytedeco.javacpp.BytePointer arg1) {
        return Raylib.GetShaderLocation(arg0, arg1);
    }

    public static java.lang.String getFileName(java.lang.String arg0) {
        return Raylib.GetFileName(arg0);
    }

    public static org.bytedeco.javacpp.BytePointer getFileName(org.bytedeco.javacpp.BytePointer arg0) {
        return Raylib.GetFileName(arg0);
    }

    public static void setConfigFlags(int arg0) {
        Raylib.SetConfigFlags(arg0);
    }

    public static int makeDirectory(java.lang.String arg0) {
        return Raylib.MakeDirectory(arg0);
    }

    public static int makeDirectory(org.bytedeco.javacpp.BytePointer arg0) {
        return Raylib.MakeDirectory(arg0);
    }

    public static void beginMode3D(com.raylib.Raylib.Camera3D arg0) {
        Raylib.BeginMode3D(arg0);
    }

    public static boolean isFileNameValid(java.lang.String arg0) {
        return Raylib.IsFileNameValid(arg0);
    }

    public static boolean isFileNameValid(org.bytedeco.javacpp.BytePointer arg0) {
        return Raylib.IsFileNameValid(arg0);
    }

    public static com.raylib.Raylib.FilePathList loadDirectoryFiles(java.lang.String arg0) {
        return Raylib.LoadDirectoryFiles(arg0);
    }

    public static com.raylib.Raylib.FilePathList loadDirectoryFiles(org.bytedeco.javacpp.BytePointer arg0) {
        return Raylib.LoadDirectoryFiles(arg0);
    }

    public static void unloadFileData(org.bytedeco.javacpp.BytePointer arg0) {
        Raylib.UnloadFileData(arg0);
    }

    public static void unloadFileData(java.nio.ByteBuffer arg0) {
        Raylib.UnloadFileData(arg0);
    }

    public static void unloadFileData(byte[] arg0) {
        Raylib.UnloadFileData(arg0);
    }

    public static boolean saveFileData(org.bytedeco.javacpp.BytePointer arg0, org.bytedeco.javacpp.Pointer arg1, int arg2) {
        return Raylib.SaveFileData(arg0, arg1, arg2);
    }

    public static boolean saveFileData(java.lang.String arg0, org.bytedeco.javacpp.Pointer arg1, int arg2) {
        return Raylib.SaveFileData(arg0, arg1, arg2);
    }

    public static boolean isCursorHidden() {
        return Raylib.IsCursorHidden();
    }

    public static void beginVrStereoMode(com.raylib.Raylib.VrStereoConfig arg0) {
        Raylib.BeginVrStereoMode(arg0);
    }

    public static boolean exportDataAsCode(byte[] arg0, int arg1, org.bytedeco.javacpp.BytePointer arg2) {
        return Raylib.ExportDataAsCode(arg0, arg1, arg2);
    }

    public static boolean exportDataAsCode(java.nio.ByteBuffer arg0, int arg1, java.lang.String arg2) {
        return Raylib.ExportDataAsCode(arg0, arg1, arg2);
    }

    public static boolean exportDataAsCode(org.bytedeco.javacpp.BytePointer arg0, int arg1, org.bytedeco.javacpp.BytePointer arg2) {
        return Raylib.ExportDataAsCode(arg0, arg1, arg2);
    }

    public static boolean exportDataAsCode(byte[] arg0, int arg1, java.lang.String arg2) {
        return Raylib.ExportDataAsCode(arg0, arg1, arg2);
    }

    public static boolean exportDataAsCode(java.nio.ByteBuffer arg0, int arg1, org.bytedeco.javacpp.BytePointer arg2) {
        return Raylib.ExportDataAsCode(arg0, arg1, arg2);
    }

    public static boolean exportDataAsCode(org.bytedeco.javacpp.BytePointer arg0, int arg1, java.lang.String arg2) {
        return Raylib.ExportDataAsCode(arg0, arg1, arg2);
    }

    public static java.nio.ByteBuffer loadFileText(java.lang.String arg0) {
        return Raylib.LoadFileText(arg0);
    }

    public static org.bytedeco.javacpp.BytePointer loadFileText(org.bytedeco.javacpp.BytePointer arg0) {
        return Raylib.LoadFileText(arg0);
    }

    public static void enableCursor() {
        Raylib.EnableCursor();
    }

    public static void setTraceLogLevel(int arg0) {
        Raylib.SetTraceLogLevel(arg0);
    }

    public static boolean isFileExtension(org.bytedeco.javacpp.BytePointer arg0, org.bytedeco.javacpp.BytePointer arg1) {
        return Raylib.IsFileExtension(arg0, arg1);
    }

    public static boolean isFileExtension(java.lang.String arg0, java.lang.String arg1) {
        return Raylib.IsFileExtension(arg0, arg1);
    }

    public static int getFileLength(org.bytedeco.javacpp.BytePointer arg0) {
        return Raylib.GetFileLength(arg0);
    }

    public static int getFileLength(java.lang.String arg0) {
        return Raylib.GetFileLength(arg0);
    }

    public static boolean saveFileText(org.bytedeco.javacpp.BytePointer arg0, byte[] arg1) {
        return Raylib.SaveFileText(arg0, arg1);
    }

    public static boolean saveFileText(java.lang.String arg0, org.bytedeco.javacpp.BytePointer arg1) {
        return Raylib.SaveFileText(arg0, arg1);
    }

    public static boolean saveFileText(java.lang.String arg0, java.nio.ByteBuffer arg1) {
        return Raylib.SaveFileText(arg0, arg1);
    }

    public static boolean saveFileText(org.bytedeco.javacpp.BytePointer arg0, org.bytedeco.javacpp.BytePointer arg1) {
        return Raylib.SaveFileText(arg0, arg1);
    }

    public static boolean saveFileText(java.lang.String arg0, byte[] arg1) {
        return Raylib.SaveFileText(arg0, arg1);
    }

    public static boolean saveFileText(org.bytedeco.javacpp.BytePointer arg0, java.nio.ByteBuffer arg1) {
        return Raylib.SaveFileText(arg0, arg1);
    }

    public static java.lang.String getDirectoryPath(java.lang.String arg0) {
        return Raylib.GetDirectoryPath(arg0);
    }

    public static org.bytedeco.javacpp.BytePointer getDirectoryPath(org.bytedeco.javacpp.BytePointer arg0) {
        return Raylib.GetDirectoryPath(arg0);
    }

    public static boolean changeDirectory(java.lang.String arg0) {
        return Raylib.ChangeDirectory(arg0);
    }

    public static boolean changeDirectory(org.bytedeco.javacpp.BytePointer arg0) {
        return Raylib.ChangeDirectory(arg0);
    }

    public static void beginMode2D(com.raylib.Raylib.Camera2D arg0) {
        Raylib.BeginMode2D(arg0);
    }

    public static boolean isFileDropped() {
        return Raylib.IsFileDropped();
    }

    public static void setShaderValue(com.raylib.Raylib.Shader arg0, int arg1, org.bytedeco.javacpp.Pointer arg2, int arg3) {
        Raylib.SetShaderValue(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.Vector2 getScreenToWorld2D(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Camera2D arg1) {
        return Raylib.GetScreenToWorld2D(arg0, arg1);
    }

    public static com.raylib.Raylib.FilePathList loadDroppedFiles() {
        return Raylib.LoadDroppedFiles();
    }

    public static void unloadDroppedFiles(com.raylib.Raylib.FilePathList arg0) {
        Raylib.UnloadDroppedFiles(arg0);
    }

    public static void beginDrawing() {
        Raylib.BeginDrawing();
    }

    public static void endVrStereoMode() {
        Raylib.EndVrStereoMode();
    }

    public static void beginTextureMode(com.raylib.Raylib.RenderTexture arg0) {
        Raylib.BeginTextureMode(arg0);
    }

    public static void clearBackground(com.raylib.Raylib.Color arg0) {
        Raylib.ClearBackground(arg0);
    }

    public static com.raylib.Raylib.Vector2 getWorldToScreenEx(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Camera3D arg1, int arg2, int arg3) {
        return Raylib.GetWorldToScreenEx(arg0, arg1, arg2, arg3);
    }

    public static void unloadShader(com.raylib.Raylib.Shader arg0) {
        Raylib.UnloadShader(arg0);
    }

    public static void pollInputEvents() {
        Raylib.PollInputEvents();
    }

    public static void setShaderValueV(com.raylib.Raylib.Shader arg0, int arg1, org.bytedeco.javacpp.Pointer arg2, int arg3, int arg4) {
        Raylib.SetShaderValueV(arg0, arg1, arg2, arg3, arg4);
    }

    public static void endShaderMode() {
        Raylib.EndShaderMode();
    }

    public static void setTargetFPS(int arg0) {
        Raylib.SetTargetFPS(arg0);
    }

    public static void beginShaderMode(com.raylib.Raylib.Shader arg0) {
        Raylib.BeginShaderMode(arg0);
    }

    public static void beginScissorMode(int arg0, int arg1, int arg2, int arg3) {
        Raylib.BeginScissorMode(arg0, arg1, arg2, arg3);
    }

    public static boolean isCursorOnScreen() {
        return Raylib.IsCursorOnScreen();
    }

    public static com.raylib.Raylib.Matrix getCameraMatrix2D(com.raylib.Raylib.Camera2D arg0) {
        return Raylib.GetCameraMatrix2D(arg0);
    }

    public static float getFrameTime() {
        return Raylib.GetFrameTime();
    }

    public static void swapScreenBuffer() {
        Raylib.SwapScreenBuffer();
    }

    public static com.raylib.Raylib.Vector2 getWorldToScreen(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Camera3D arg1) {
        return Raylib.GetWorldToScreen(arg0, arg1);
    }

    public static void setRandomSeed(int arg0) {
        Raylib.SetRandomSeed(arg0);
    }

    public static com.raylib.Raylib.VrStereoConfig loadVrStereoConfig(com.raylib.Raylib.VrDeviceInfo arg0) {
        return Raylib.LoadVrStereoConfig(arg0);
    }

    public static int getRandomValue(int arg0, int arg1) {
        return Raylib.GetRandomValue(arg0, arg1);
    }

    public static void takeScreenshot(java.lang.String arg0) {
        Raylib.TakeScreenshot(arg0);
    }

    public static void takeScreenshot(org.bytedeco.javacpp.BytePointer arg0) {
        Raylib.TakeScreenshot(arg0);
    }

    public static void endBlendMode() {
        Raylib.EndBlendMode();
    }

    public static org.bytedeco.javacpp.IntPointer loadRandomSequence(int arg0, int arg1, int arg2) {
        return Raylib.LoadRandomSequence(arg0, arg1, arg2);
    }

    public static void drawTriangleLines(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1, com.raylib.Raylib.Vector2 arg2, com.raylib.Raylib.Color arg3) {
        Raylib.DrawTriangleLines(arg0, arg1, arg2, arg3);
    }

    public static void drawCircleGradient(int arg0, int arg1, float arg2, com.raylib.Raylib.Color arg3, com.raylib.Raylib.Color arg4) {
        Raylib.DrawCircleGradient(arg0, arg1, arg2, arg3, arg4);
    }

    public static void drawPolyLines(com.raylib.Raylib.Vector2 arg0, int arg1, float arg2, float arg3, com.raylib.Raylib.Color arg4) {
        Raylib.DrawPolyLines(arg0, arg1, arg2, arg3, arg4);
    }

    public static void drawPolyLinesEx(com.raylib.Raylib.Vector2 arg0, int arg1, float arg2, float arg3, float arg4, com.raylib.Raylib.Color arg5) {
        Raylib.DrawPolyLinesEx(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void drawRectangleRec(com.raylib.Raylib.Rectangle arg0, com.raylib.Raylib.Color arg1) {
        Raylib.DrawRectangleRec(arg0, arg1);
    }

    public static void drawSplineLinear(com.raylib.Raylib.Vector2 arg0, int arg1, float arg2, com.raylib.Raylib.Color arg3) {
        Raylib.DrawSplineLinear(arg0, arg1, arg2, arg3);
    }

    public static void drawSplineBasis(com.raylib.Raylib.Vector2 arg0, int arg1, float arg2, com.raylib.Raylib.Color arg3) {
        Raylib.DrawSplineBasis(arg0, arg1, arg2, arg3);
    }

    public static void drawTriangle(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1, com.raylib.Raylib.Vector2 arg2, com.raylib.Raylib.Color arg3) {
        Raylib.DrawTriangle(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.Vector2 getMouseDelta() {
        return Raylib.GetMouseDelta();
    }

    public static void updateCamera(com.raylib.Raylib.Camera3D arg0, int arg1) {
        Raylib.UpdateCamera(arg0, arg1);
    }

    public static void setMouseScale(float arg0, float arg1) {
        Raylib.SetMouseScale(arg0, arg1);
    }

    public static boolean isKeyPressed(int arg0) {
        return Raylib.IsKeyPressed(arg0);
    }

    public static void updateCameraPro(com.raylib.Raylib.Camera3D arg0, com.raylib.Raylib.Vector3 arg1, com.raylib.Raylib.Vector3 arg2, float arg3) {
        Raylib.UpdateCameraPro(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.Texture getShapesTexture() {
        return Raylib.GetShapesTexture();
    }

    public static void drawCircleSector(com.raylib.Raylib.Vector2 arg0, float arg1, float arg2, float arg3, int arg4, com.raylib.Raylib.Color arg5) {
        Raylib.DrawCircleSector(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static com.raylib.Raylib.Vector2 getMousePosition() {
        return Raylib.GetMousePosition();
    }

    public static byte[] decompressData(byte[] arg0, int arg1, int[] arg2) {
        return Raylib.DecompressData(arg0, arg1, arg2);
    }

    public static java.nio.ByteBuffer decompressData(java.nio.ByteBuffer arg0, int arg1, java.nio.IntBuffer arg2) {
        return Raylib.DecompressData(arg0, arg1, arg2);
    }

    public static org.bytedeco.javacpp.BytePointer decompressData(org.bytedeco.javacpp.BytePointer arg0, int arg1, org.bytedeco.javacpp.IntPointer arg2) {
        return Raylib.DecompressData(arg0, arg1, arg2);
    }

    public static org.bytedeco.javacpp.BytePointer getGamepadName(int arg0) {
        return Raylib.GetGamepadName(arg0);
    }

    public static int getTouchPointCount() {
        return Raylib.GetTouchPointCount();
    }

    public static int getGestureDetected() {
        return Raylib.GetGestureDetected();
    }

    public static void drawCircleV(com.raylib.Raylib.Vector2 arg0, float arg1, com.raylib.Raylib.Color arg2) {
        Raylib.DrawCircleV(arg0, arg1, arg2);
    }

    public static void drawCircleLines(int arg0, int arg1, float arg2, com.raylib.Raylib.Color arg3) {
        Raylib.DrawCircleLines(arg0, arg1, arg2, arg3);
    }

    public static boolean isMouseButtonDown(int arg0) {
        return Raylib.IsMouseButtonDown(arg0);
    }

    public static void drawLineStrip(com.raylib.Raylib.Vector2 arg0, int arg1, com.raylib.Raylib.Color arg2) {
        Raylib.DrawLineStrip(arg0, arg1, arg2);
    }

    public static void drawEllipseLines(int arg0, int arg1, float arg2, float arg3, com.raylib.Raylib.Color arg4) {
        Raylib.DrawEllipseLines(arg0, arg1, arg2, arg3, arg4);
    }

    public static org.bytedeco.javacpp.BytePointer compressData(org.bytedeco.javacpp.BytePointer arg0, int arg1, org.bytedeco.javacpp.IntPointer arg2) {
        return Raylib.CompressData(arg0, arg1, arg2);
    }

    public static java.nio.ByteBuffer compressData(java.nio.ByteBuffer arg0, int arg1, java.nio.IntBuffer arg2) {
        return Raylib.CompressData(arg0, arg1, arg2);
    }

    public static byte[] compressData(byte[] arg0, int arg1, int[] arg2) {
        return Raylib.CompressData(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Vector2 getMouseWheelMoveV() {
        return Raylib.GetMouseWheelMoveV();
    }

    public static int computeCRC32(org.bytedeco.javacpp.BytePointer arg0, int arg1) {
        return Raylib.ComputeCRC32(arg0, arg1);
    }

    public static int computeCRC32(java.nio.ByteBuffer arg0, int arg1) {
        return Raylib.ComputeCRC32(arg0, arg1);
    }

    public static int computeCRC32(byte[] arg0, int arg1) {
        return Raylib.ComputeCRC32(arg0, arg1);
    }

    public static void drawRectanglePro(com.raylib.Raylib.Rectangle arg0, com.raylib.Raylib.Vector2 arg1, float arg2, com.raylib.Raylib.Color arg3) {
        Raylib.DrawRectanglePro(arg0, arg1, arg2, arg3);
    }

    public static float getMouseWheelMove() {
        return Raylib.GetMouseWheelMove();
    }

    public static boolean checkCollisionRecs(com.raylib.Raylib.Rectangle arg0, com.raylib.Raylib.Rectangle arg1) {
        return Raylib.CheckCollisionRecs(arg0, arg1);
    }

    public static byte[] decodeDataBase64(byte[] arg0, int[] arg1) {
        return Raylib.DecodeDataBase64(arg0, arg1);
    }

    public static org.bytedeco.javacpp.BytePointer decodeDataBase64(org.bytedeco.javacpp.BytePointer arg0, org.bytedeco.javacpp.IntPointer arg1) {
        return Raylib.DecodeDataBase64(arg0, arg1);
    }

    public static java.nio.ByteBuffer decodeDataBase64(java.nio.ByteBuffer arg0, java.nio.IntBuffer arg1) {
        return Raylib.DecodeDataBase64(arg0, arg1);
    }

    public static long getFileModTime(org.bytedeco.javacpp.BytePointer arg0) {
        return Raylib.GetFileModTime(arg0);
    }

    public static long getFileModTime(java.lang.String arg0) {
        return Raylib.GetFileModTime(arg0);
    }

    public static void drawTriangleFan(com.raylib.Raylib.Vector2 arg0, int arg1, com.raylib.Raylib.Color arg2) {
        Raylib.DrawTriangleFan(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Rectangle getCollisionRec(com.raylib.Raylib.Rectangle arg0, com.raylib.Raylib.Rectangle arg1) {
        return Raylib.GetCollisionRec(arg0, arg1);
    }

    public static int getKeyPressed() {
        return Raylib.GetKeyPressed();
    }

    public static boolean isGamepadAvailable(int arg0) {
        return Raylib.IsGamepadAvailable(arg0);
    }

    public static int getTouchPointId(int arg0) {
        return Raylib.GetTouchPointId(arg0);
    }

    public static org.bytedeco.javacpp.BytePointer encodeDataBase64(org.bytedeco.javacpp.BytePointer arg0, int arg1, org.bytedeco.javacpp.IntPointer arg2) {
        return Raylib.EncodeDataBase64(arg0, arg1, arg2);
    }

    public static byte[] encodeDataBase64(byte[] arg0, int arg1, int[] arg2) {
        return Raylib.EncodeDataBase64(arg0, arg1, arg2);
    }

    public static java.nio.ByteBuffer encodeDataBase64(java.nio.ByteBuffer arg0, int arg1, java.nio.IntBuffer arg2) {
        return Raylib.EncodeDataBase64(arg0, arg1, arg2);
    }

    public static boolean isKeyPressedRepeat(int arg0) {
        return Raylib.IsKeyPressedRepeat(arg0);
    }

    public static boolean isKeyReleased(int arg0) {
        return Raylib.IsKeyReleased(arg0);
    }

    public static boolean isGestureDetected(int arg0) {
        return Raylib.IsGestureDetected(arg0);
    }

    public static void setGesturesEnabled(int arg0) {
        Raylib.SetGesturesEnabled(arg0);
    }

    public static void setMousePosition(int arg0, int arg1) {
        Raylib.SetMousePosition(arg0, arg1);
    }

    public static boolean isGamepadButtonUp(int arg0, int arg1) {
        return Raylib.IsGamepadButtonUp(arg0, arg1);
    }

    public static void setMouseCursor(int arg0) {
        Raylib.SetMouseCursor(arg0);
    }

    public static void setShapesTexture(com.raylib.Raylib.Texture arg0, com.raylib.Raylib.Rectangle arg1) {
        Raylib.SetShapesTexture(arg0, arg1);
    }

    public static void drawLineBezier(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1, float arg2, com.raylib.Raylib.Color arg3) {
        Raylib.DrawLineBezier(arg0, arg1, arg2, arg3);
    }

    public static void drawCircleLinesV(com.raylib.Raylib.Vector2 arg0, float arg1, com.raylib.Raylib.Color arg2) {
        Raylib.DrawCircleLinesV(arg0, arg1, arg2);
    }

    public static void drawRectangle(int arg0, int arg1, int arg2, int arg3, com.raylib.Raylib.Color arg4) {
        Raylib.DrawRectangle(arg0, arg1, arg2, arg3, arg4);
    }

    public static void drawRectangleV(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1, com.raylib.Raylib.Color arg2) {
        Raylib.DrawRectangleV(arg0, arg1, arg2);
    }

    public static int setGamepadMappings(org.bytedeco.javacpp.BytePointer arg0) {
        return Raylib.SetGamepadMappings(arg0);
    }

    public static int setGamepadMappings(java.lang.String arg0) {
        return Raylib.SetGamepadMappings(arg0);
    }

    public static void drawRingLines(com.raylib.Raylib.Vector2 arg0, float arg1, float arg2, float arg3, float arg4, int arg5, com.raylib.Raylib.Color arg6) {
        Raylib.DrawRingLines(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static void drawRectangleLines(int arg0, int arg1, int arg2, int arg3, com.raylib.Raylib.Color arg4) {
        Raylib.DrawRectangleLines(arg0, arg1, arg2, arg3, arg4);
    }

    public static void drawTriangleStrip(com.raylib.Raylib.Vector2 arg0, int arg1, com.raylib.Raylib.Color arg2) {
        Raylib.DrawTriangleStrip(arg0, arg1, arg2);
    }

    public static int getCharPressed() {
        return Raylib.GetCharPressed();
    }

    public static void setMouseOffset(int arg0, int arg1) {
        Raylib.SetMouseOffset(arg0, arg1);
    }

    public static boolean isMouseButtonUp(int arg0) {
        return Raylib.IsMouseButtonUp(arg0);
    }

    public static com.raylib.Raylib.Vector2 getTouchPosition(int arg0) {
        return Raylib.GetTouchPosition(arg0);
    }

    public static org.bytedeco.javacpp.IntPointer computeSHA1(org.bytedeco.javacpp.BytePointer arg0, int arg1) {
        return Raylib.ComputeSHA1(arg0, arg1);
    }

    public static java.nio.IntBuffer computeSHA1(java.nio.ByteBuffer arg0, int arg1) {
        return Raylib.ComputeSHA1(arg0, arg1);
    }

    public static int[] computeSHA1(byte[] arg0, int arg1) {
        return Raylib.ComputeSHA1(arg0, arg1);
    }

    public static void drawEllipse(int arg0, int arg1, float arg2, float arg3, com.raylib.Raylib.Color arg4) {
        Raylib.DrawEllipse(arg0, arg1, arg2, arg3, arg4);
    }

    public static boolean isWindowReady() {
        return Raylib.IsWindowReady();
    }

    public static boolean isWindowFullscreen() {
        return Raylib.IsWindowFullscreen();
    }

    public static void closeWindow() {
        Raylib.CloseWindow();
    }

    public static org.bytedeco.javacpp.Pointer getWindowHandle() {
        return Raylib.GetWindowHandle();
    }

    public static int getRenderHeight() {
        return Raylib.GetRenderHeight();
    }

    public static boolean isWindowHidden() {
        return Raylib.IsWindowHidden();
    }

    public static int getRenderWidth() {
        return Raylib.GetRenderWidth();
    }

    public static void setWindowTitle(java.lang.String arg0) {
        Raylib.SetWindowTitle(arg0);
    }

    public static void setWindowTitle(org.bytedeco.javacpp.BytePointer arg0) {
        Raylib.SetWindowTitle(arg0);
    }

    public static int getMonitorCount() {
        return Raylib.GetMonitorCount();
    }

    public static void toggleFullscreen() {
        Raylib.ToggleFullscreen();
    }

    public static void setWindowPosition(int arg0, int arg1) {
        Raylib.SetWindowPosition(arg0, arg1);
    }

    public static void restoreWindow() {
        Raylib.RestoreWindow();
    }

    public static boolean isWindowState(int arg0) {
        return Raylib.IsWindowState(arg0);
    }

    public static boolean windowShouldClose() {
        return Raylib.WindowShouldClose();
    }

    public static boolean isWindowFocused() {
        return Raylib.IsWindowFocused();
    }

    public static boolean isWindowMaximized() {
        return Raylib.IsWindowMaximized();
    }

    public static void clearWindowState(int arg0) {
        Raylib.ClearWindowState(arg0);
    }

    public static void setWindowSize(int arg0, int arg1) {
        Raylib.SetWindowSize(arg0, arg1);
    }

    public static int getScreenHeight() {
        return Raylib.GetScreenHeight();
    }

    public static int getMonitorWidth(int arg0) {
        return Raylib.GetMonitorWidth(arg0);
    }

    public static void setWindowIcons(com.raylib.Raylib.Image arg0, int arg1) {
        Raylib.SetWindowIcons(arg0, arg1);
    }

    public static boolean isWindowResized() {
        return Raylib.IsWindowResized();
    }

    public static int getMonitorHeight(int arg0) {
        return Raylib.GetMonitorHeight(arg0);
    }

    public static void setWindowIcon(com.raylib.Raylib.Image arg0) {
        Raylib.SetWindowIcon(arg0);
    }

    public static void setWindowFocused() {
        Raylib.SetWindowFocused();
    }

    public static void maximizeWindow() {
        Raylib.MaximizeWindow();
    }

    public static com.raylib.Raylib.Vector2 getMonitorPosition(int arg0) {
        return Raylib.GetMonitorPosition(arg0);
    }

    public static void setWindowMaxSize(int arg0, int arg1) {
        Raylib.SetWindowMaxSize(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 getWindowPosition() {
        return Raylib.GetWindowPosition();
    }

    public static int getScreenWidth() {
        return Raylib.GetScreenWidth();
    }

    public static int getCurrentMonitor() {
        return Raylib.GetCurrentMonitor();
    }

    public static void setWindowMinSize(int arg0, int arg1) {
        Raylib.SetWindowMinSize(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 getWindowScaleDPI() {
        return Raylib.GetWindowScaleDPI();
    }

    public static boolean isWindowMinimized() {
        return Raylib.IsWindowMinimized();
    }

    public static void setClipboardText(java.lang.String arg0) {
        Raylib.SetClipboardText(arg0);
    }

    public static void setClipboardText(org.bytedeco.javacpp.BytePointer arg0) {
        Raylib.SetClipboardText(arg0);
    }

    public static void minimizeWindow() {
        Raylib.MinimizeWindow();
    }

    public static org.bytedeco.javacpp.BytePointer getMonitorName(int arg0) {
        return Raylib.GetMonitorName(arg0);
    }

    public static org.bytedeco.javacpp.BytePointer getClipboardText() {
        return Raylib.GetClipboardText();
    }

    public static void setWindowMonitor(int arg0) {
        Raylib.SetWindowMonitor(arg0);
    }

    public static com.raylib.Raylib.Image getClipboardImage() {
        return Raylib.GetClipboardImage();
    }

    public static void setWindowOpacity(float arg0) {
        Raylib.SetWindowOpacity(arg0);
    }

    public static void setWindowState(int arg0) {
        Raylib.SetWindowState(arg0);
    }

    public static void enableEventWaiting() {
        Raylib.EnableEventWaiting();
    }

    public static void drawCubeWiresV(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1, com.raylib.Raylib.Color arg2) {
        Raylib.DrawCubeWiresV(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Color colorContrast(com.raylib.Raylib.Color arg0, float arg1) {
        return Raylib.ColorContrast(arg0, arg1);
    }

    public static void drawTextureNPatch(com.raylib.Raylib.Texture arg0, com.raylib.Raylib.NPatchInfo arg1, com.raylib.Raylib.Rectangle arg2, com.raylib.Raylib.Vector2 arg3, float arg4, com.raylib.Raylib.Color arg5) {
        Raylib.DrawTextureNPatch(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static org.bytedeco.javacpp.BytePointer textToPascal(org.bytedeco.javacpp.BytePointer arg0) {
        return Raylib.TextToPascal(arg0);
    }

    public static java.lang.String textToPascal(java.lang.String arg0) {
        return Raylib.TextToPascal(arg0);
    }

    public static void drawTextCodepoints(com.raylib.Raylib.Font arg0, int[] arg1, int arg2, com.raylib.Raylib.Vector2 arg3, float arg4, float arg5, com.raylib.Raylib.Color arg6) {
        Raylib.DrawTextCodepoints(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static void drawTextCodepoints(com.raylib.Raylib.Font arg0, java.nio.IntBuffer arg1, int arg2, com.raylib.Raylib.Vector2 arg3, float arg4, float arg5, com.raylib.Raylib.Color arg6) {
        Raylib.DrawTextCodepoints(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static void drawTextCodepoints(com.raylib.Raylib.Font arg0, org.bytedeco.javacpp.IntPointer arg1, int arg2, com.raylib.Raylib.Vector2 arg3, float arg4, float arg5, com.raylib.Raylib.Color arg6) {
        Raylib.DrawTextCodepoints(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static void setTextLineSpacing(int arg0) {
        Raylib.SetTextLineSpacing(arg0);
    }

    public static void drawCapsuleWires(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1, float arg2, int arg3, int arg4, com.raylib.Raylib.Color arg5) {
        Raylib.DrawCapsuleWires(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void drawTextPro(com.raylib.Raylib.Font arg0, java.lang.String arg1, com.raylib.Raylib.Vector2 arg2, com.raylib.Raylib.Vector2 arg3, float arg4, float arg5, float arg6, com.raylib.Raylib.Color arg7) {
        Raylib.DrawTextPro(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    public static void drawTextPro(com.raylib.Raylib.Font arg0, org.bytedeco.javacpp.BytePointer arg1, com.raylib.Raylib.Vector2 arg2, com.raylib.Raylib.Vector2 arg3, float arg4, float arg5, float arg6, com.raylib.Raylib.Color arg7) {
        Raylib.DrawTextPro(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    public static int measureText(java.lang.String arg0, int arg1) {
        return Raylib.MeasureText(arg0, arg1);
    }

    public static int measureText(org.bytedeco.javacpp.BytePointer arg0, int arg1) {
        return Raylib.MeasureText(arg0, arg1);
    }

    public static void drawCylinderWires(com.raylib.Raylib.Vector3 arg0, float arg1, float arg2, float arg3, int arg4, com.raylib.Raylib.Color arg5) {
        Raylib.DrawCylinderWires(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static com.raylib.Raylib.Model loadModelFromMesh(com.raylib.Raylib.Mesh arg0) {
        return Raylib.LoadModelFromMesh(arg0);
    }

    public static void drawCylinder(com.raylib.Raylib.Vector3 arg0, float arg1, float arg2, float arg3, int arg4, com.raylib.Raylib.Color arg5) {
        Raylib.DrawCylinder(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void drawCapsule(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1, float arg2, int arg3, int arg4, com.raylib.Raylib.Color arg5) {
        Raylib.DrawCapsule(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void drawSphereEx(com.raylib.Raylib.Vector3 arg0, float arg1, int arg2, int arg3, com.raylib.Raylib.Color arg4) {
        Raylib.DrawSphereEx(arg0, arg1, arg2, arg3, arg4);
    }

    public static void unloadModel(com.raylib.Raylib.Model arg0) {
        Raylib.UnloadModel(arg0);
    }

    public static float textToFloat(org.bytedeco.javacpp.BytePointer arg0) {
        return Raylib.TextToFloat(arg0);
    }

    public static float textToFloat(java.lang.String arg0) {
        return Raylib.TextToFloat(arg0);
    }

    public static com.raylib.Raylib.Rectangle getGlyphAtlasRec(com.raylib.Raylib.Font arg0, int arg1) {
        return Raylib.GetGlyphAtlasRec(arg0, arg1);
    }

    public static com.raylib.Raylib.Color getPixelColor(org.bytedeco.javacpp.Pointer arg0, int arg1) {
        return Raylib.GetPixelColor(arg0, arg1);
    }

    public static int textToInteger(java.lang.String arg0) {
        return Raylib.TextToInteger(arg0);
    }

    public static int textToInteger(org.bytedeco.javacpp.BytePointer arg0) {
        return Raylib.TextToInteger(arg0);
    }

    public static void drawCylinderEx(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1, float arg2, float arg3, int arg4, com.raylib.Raylib.Color arg5) {
        Raylib.DrawCylinderEx(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static boolean isModelValid(com.raylib.Raylib.Model arg0) {
        return Raylib.IsModelValid(arg0);
    }

    public static void drawModelEx(com.raylib.Raylib.Model arg0, com.raylib.Raylib.Vector3 arg1, com.raylib.Raylib.Vector3 arg2, float arg3, com.raylib.Raylib.Vector3 arg4, com.raylib.Raylib.Color arg5) {
        Raylib.DrawModelEx(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void unloadCodepoints(int[] arg0) {
        Raylib.UnloadCodepoints(arg0);
    }

    public static void unloadCodepoints(java.nio.IntBuffer arg0) {
        Raylib.UnloadCodepoints(arg0);
    }

    public static void unloadCodepoints(org.bytedeco.javacpp.IntPointer arg0) {
        Raylib.UnloadCodepoints(arg0);
    }

    public static com.raylib.Raylib.Font loadFontFromMemory(org.bytedeco.javacpp.BytePointer arg0, java.nio.ByteBuffer arg1, int arg2, int arg3, java.nio.IntBuffer arg4, int arg5) {
        return Raylib.LoadFontFromMemory(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static com.raylib.Raylib.Font loadFontFromMemory(org.bytedeco.javacpp.BytePointer arg0, byte[] arg1, int arg2, int arg3, int[] arg4, int arg5) {
        return Raylib.LoadFontFromMemory(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static com.raylib.Raylib.Font loadFontFromMemory(org.bytedeco.javacpp.BytePointer arg0, org.bytedeco.javacpp.BytePointer arg1, int arg2, int arg3, org.bytedeco.javacpp.IntPointer arg4, int arg5) {
        return Raylib.LoadFontFromMemory(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static com.raylib.Raylib.Font loadFontFromMemory(java.lang.String arg0, java.nio.ByteBuffer arg1, int arg2, int arg3, java.nio.IntBuffer arg4, int arg5) {
        return Raylib.LoadFontFromMemory(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static com.raylib.Raylib.Font loadFontFromMemory(java.lang.String arg0, org.bytedeco.javacpp.BytePointer arg1, int arg2, int arg3, org.bytedeco.javacpp.IntPointer arg4, int arg5) {
        return Raylib.LoadFontFromMemory(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static com.raylib.Raylib.Font loadFontFromMemory(java.lang.String arg0, byte[] arg1, int arg2, int arg3, int[] arg4, int arg5) {
        return Raylib.LoadFontFromMemory(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static com.raylib.Raylib.Color colorBrightness(com.raylib.Raylib.Color arg0, float arg1) {
        return Raylib.ColorBrightness(arg0, arg1);
    }

    public static int getCodepointCount(java.lang.String arg0) {
        return Raylib.GetCodepointCount(arg0);
    }

    public static int getCodepointCount(org.bytedeco.javacpp.BytePointer arg0) {
        return Raylib.GetCodepointCount(arg0);
    }

    public static int getCodepointNext(java.lang.String arg0, org.bytedeco.javacpp.IntPointer arg1) {
        return Raylib.GetCodepointNext(arg0, arg1);
    }

    public static int getCodepointNext(java.lang.String arg0, java.nio.IntBuffer arg1) {
        return Raylib.GetCodepointNext(arg0, arg1);
    }

    public static int getCodepointNext(org.bytedeco.javacpp.BytePointer arg0, int[] arg1) {
        return Raylib.GetCodepointNext(arg0, arg1);
    }

    public static int getCodepointNext(org.bytedeco.javacpp.BytePointer arg0, java.nio.IntBuffer arg1) {
        return Raylib.GetCodepointNext(arg0, arg1);
    }

    public static int getCodepointNext(org.bytedeco.javacpp.BytePointer arg0, org.bytedeco.javacpp.IntPointer arg1) {
        return Raylib.GetCodepointNext(arg0, arg1);
    }

    public static int getCodepointNext(java.lang.String arg0, int[] arg1) {
        return Raylib.GetCodepointNext(arg0, arg1);
    }

    public static com.raylib.Raylib.Font getFontDefault() {
        return Raylib.GetFontDefault();
    }

    public static java.lang.String textSubtext(java.lang.String arg0, int arg1, int arg2) {
        return Raylib.TextSubtext(arg0, arg1, arg2);
    }

    public static org.bytedeco.javacpp.BytePointer textSubtext(org.bytedeco.javacpp.BytePointer arg0, int arg1, int arg2) {
        return Raylib.TextSubtext(arg0, arg1, arg2);
    }

    public static void drawTextCodepoint(com.raylib.Raylib.Font arg0, int arg1, com.raylib.Raylib.Vector2 arg2, float arg3, com.raylib.Raylib.Color arg4) {
        Raylib.DrawTextCodepoint(arg0, arg1, arg2, arg3, arg4);
    }

    public static boolean colorIsEqual(com.raylib.Raylib.Color arg0, com.raylib.Raylib.Color arg1) {
        return Raylib.ColorIsEqual(arg0, arg1);
    }

    public static void setPixelColor(org.bytedeco.javacpp.Pointer arg0, com.raylib.Raylib.Color arg1, int arg2) {
        Raylib.SetPixelColor(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Color colorAlphaBlend(com.raylib.Raylib.Color arg0, com.raylib.Raylib.Color arg1, com.raylib.Raylib.Color arg2) {
        return Raylib.ColorAlphaBlend(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Vector2 measureTextEx(com.raylib.Raylib.Font arg0, java.lang.String arg1, float arg2, float arg3) {
        return Raylib.MeasureTextEx(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.Vector2 measureTextEx(com.raylib.Raylib.Font arg0, org.bytedeco.javacpp.BytePointer arg1, float arg2, float arg3) {
        return Raylib.MeasureTextEx(arg0, arg1, arg2, arg3);
    }

    public static java.lang.String textToLower(java.lang.String arg0) {
        return Raylib.TextToLower(arg0);
    }

    public static org.bytedeco.javacpp.BytePointer textToLower(org.bytedeco.javacpp.BytePointer arg0) {
        return Raylib.TextToLower(arg0);
    }

    public static com.raylib.Raylib.Color colorFromHSV(float arg0, float arg1, float arg2) {
        return Raylib.ColorFromHSV(arg0, arg1, arg2);
    }

    public static int getGlyphIndex(com.raylib.Raylib.Font arg0, int arg1) {
        return Raylib.GetGlyphIndex(arg0, arg1);
    }

    public static org.bytedeco.javacpp.IntPointer loadCodepoints(java.lang.String arg0, org.bytedeco.javacpp.IntPointer arg1) {
        return Raylib.LoadCodepoints(arg0, arg1);
    }

    public static int[] loadCodepoints(java.lang.String arg0, int[] arg1) {
        return Raylib.LoadCodepoints(arg0, arg1);
    }

    public static java.nio.IntBuffer loadCodepoints(org.bytedeco.javacpp.BytePointer arg0, java.nio.IntBuffer arg1) {
        return Raylib.LoadCodepoints(arg0, arg1);
    }

    public static org.bytedeco.javacpp.IntPointer loadCodepoints(org.bytedeco.javacpp.BytePointer arg0, org.bytedeco.javacpp.IntPointer arg1) {
        return Raylib.LoadCodepoints(arg0, arg1);
    }

    public static java.nio.IntBuffer loadCodepoints(java.lang.String arg0, java.nio.IntBuffer arg1) {
        return Raylib.LoadCodepoints(arg0, arg1);
    }

    public static int[] loadCodepoints(org.bytedeco.javacpp.BytePointer arg0, int[] arg1) {
        return Raylib.LoadCodepoints(arg0, arg1);
    }

    public static boolean isFontValid(com.raylib.Raylib.Font arg0) {
        return Raylib.IsFontValid(arg0);
    }

    public static com.raylib.Raylib.GlyphInfo loadFontData(org.bytedeco.javacpp.BytePointer arg0, int arg1, int arg2, org.bytedeco.javacpp.IntPointer arg3, int arg4, int arg5) {
        return Raylib.LoadFontData(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static com.raylib.Raylib.GlyphInfo loadFontData(byte[] arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        return Raylib.LoadFontData(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static com.raylib.Raylib.GlyphInfo loadFontData(java.nio.ByteBuffer arg0, int arg1, int arg2, java.nio.IntBuffer arg3, int arg4, int arg5) {
        return Raylib.LoadFontData(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void drawTexturePro(com.raylib.Raylib.Texture arg0, com.raylib.Raylib.Rectangle arg1, com.raylib.Raylib.Rectangle arg2, com.raylib.Raylib.Vector2 arg3, float arg4, com.raylib.Raylib.Color arg5) {
        Raylib.DrawTexturePro(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static int getPixelDataSize(int arg0, int arg1, int arg2) {
        return Raylib.GetPixelDataSize(arg0, arg1, arg2);
    }

    public static void unloadFontData(com.raylib.Raylib.GlyphInfo arg0, int arg1) {
        Raylib.UnloadFontData(arg0, arg1);
    }

    public static java.lang.String codepointToUTF8(int arg0, java.nio.IntBuffer arg1) {
        return Raylib.CodepointToUTF8(arg0, arg1);
    }

    public static org.bytedeco.javacpp.BytePointer codepointToUTF8(int arg0, int[] arg1) {
        return Raylib.CodepointToUTF8(arg0, arg1);
    }

    public static org.bytedeco.javacpp.BytePointer codepointToUTF8(int arg0, org.bytedeco.javacpp.IntPointer arg1) {
        return Raylib.CodepointToUTF8(arg0, arg1);
    }

    public static void drawTextureRec(com.raylib.Raylib.Texture arg0, com.raylib.Raylib.Rectangle arg1, com.raylib.Raylib.Vector2 arg2, com.raylib.Raylib.Color arg3) {
        Raylib.DrawTextureRec(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.GlyphInfo getGlyphInfo(com.raylib.Raylib.Font arg0, int arg1) {
        return Raylib.GetGlyphInfo(arg0, arg1);
    }

    public static com.raylib.Raylib.Image genImageFontAtlas(com.raylib.Raylib.GlyphInfo arg0, com.raylib.Raylib.Rectangle arg1, int arg2, int arg3, int arg4, int arg5) {
        return Raylib.GenImageFontAtlas(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static com.raylib.Raylib.Image genImageFontAtlas(com.raylib.Raylib.GlyphInfo arg0, org.bytedeco.javacpp.PointerPointer arg1, int arg2, int arg3, int arg4, int arg5) {
        return Raylib.GenImageFontAtlas(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static com.raylib.Raylib.Vector4 colorNormalize(com.raylib.Raylib.Color arg0) {
        return Raylib.ColorNormalize(arg0);
    }

    public static int getCodepoint(org.bytedeco.javacpp.BytePointer arg0, org.bytedeco.javacpp.IntPointer arg1) {
        return Raylib.GetCodepoint(arg0, arg1);
    }

    public static int getCodepoint(java.lang.String arg0, java.nio.IntBuffer arg1) {
        return Raylib.GetCodepoint(arg0, arg1);
    }

    public static int getCodepoint(java.lang.String arg0, org.bytedeco.javacpp.IntPointer arg1) {
        return Raylib.GetCodepoint(arg0, arg1);
    }

    public static int getCodepoint(org.bytedeco.javacpp.BytePointer arg0, int[] arg1) {
        return Raylib.GetCodepoint(arg0, arg1);
    }

    public static int getCodepoint(java.lang.String arg0, int[] arg1) {
        return Raylib.GetCodepoint(arg0, arg1);
    }

    public static int getCodepoint(org.bytedeco.javacpp.BytePointer arg0, java.nio.IntBuffer arg1) {
        return Raylib.GetCodepoint(arg0, arg1);
    }

    public static boolean textIsEqual(org.bytedeco.javacpp.BytePointer arg0, org.bytedeco.javacpp.BytePointer arg1) {
        return Raylib.TextIsEqual(arg0, arg1);
    }

    public static boolean textIsEqual(java.lang.String arg0, java.lang.String arg1) {
        return Raylib.TextIsEqual(arg0, arg1);
    }

    public static org.bytedeco.javacpp.BytePointer textReplace(org.bytedeco.javacpp.BytePointer arg0, org.bytedeco.javacpp.BytePointer arg1, org.bytedeco.javacpp.BytePointer arg2) {
        return Raylib.TextReplace(arg0, arg1, arg2);
    }

    public static java.nio.ByteBuffer textReplace(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        return Raylib.TextReplace(arg0, arg1, arg2);
    }

    public static int textFindIndex(java.lang.String arg0, java.lang.String arg1) {
        return Raylib.TextFindIndex(arg0, arg1);
    }

    public static int textFindIndex(org.bytedeco.javacpp.BytePointer arg0, org.bytedeco.javacpp.BytePointer arg1) {
        return Raylib.TextFindIndex(arg0, arg1);
    }

    public static org.bytedeco.javacpp.BytePointer textToUpper(org.bytedeco.javacpp.BytePointer arg0) {
        return Raylib.TextToUpper(arg0);
    }

    public static java.lang.String textToUpper(java.lang.String arg0) {
        return Raylib.TextToUpper(arg0);
    }

    public static org.bytedeco.javacpp.BytePointer textToSnake(org.bytedeco.javacpp.BytePointer arg0) {
        return Raylib.TextToSnake(arg0);
    }

    public static java.lang.String textToSnake(java.lang.String arg0) {
        return Raylib.TextToSnake(arg0);
    }

    public static java.lang.String textToCamel(java.lang.String arg0) {
        return Raylib.TextToCamel(arg0);
    }

    public static org.bytedeco.javacpp.BytePointer textToCamel(org.bytedeco.javacpp.BytePointer arg0) {
        return Raylib.TextToCamel(arg0);
    }

    public static boolean exportFontAsCode(com.raylib.Raylib.Font arg0, org.bytedeco.javacpp.BytePointer arg1) {
        return Raylib.ExportFontAsCode(arg0, arg1);
    }

    public static boolean exportFontAsCode(com.raylib.Raylib.Font arg0, java.lang.String arg1) {
        return Raylib.ExportFontAsCode(arg0, arg1);
    }

    public static void drawPoint3D(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Color arg1) {
        Raylib.DrawPoint3D(arg0, arg1);
    }

    public static com.raylib.Raylib.Font loadFontFromImage(com.raylib.Raylib.Image arg0, com.raylib.Raylib.Color arg1, int arg2) {
        return Raylib.LoadFontFromImage(arg0, arg1, arg2);
    }

    public static void drawCircle3D(com.raylib.Raylib.Vector3 arg0, float arg1, com.raylib.Raylib.Vector3 arg2, float arg3, com.raylib.Raylib.Color arg4) {
        Raylib.DrawCircle3D(arg0, arg1, arg2, arg3, arg4);
    }

    public static void drawTriangle3D(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1, com.raylib.Raylib.Vector3 arg2, com.raylib.Raylib.Color arg3) {
        Raylib.DrawTriangle3D(arg0, arg1, arg2, arg3);
    }

    public static void drawCubeWires(com.raylib.Raylib.Vector3 arg0, float arg1, float arg2, float arg3, com.raylib.Raylib.Color arg4) {
        Raylib.DrawCubeWires(arg0, arg1, arg2, arg3, arg4);
    }

    public static void drawSphereWires(com.raylib.Raylib.Vector3 arg0, float arg1, int arg2, int arg3, com.raylib.Raylib.Color arg4) {
        Raylib.DrawSphereWires(arg0, arg1, arg2, arg3, arg4);
    }

    public static void updateTexture(com.raylib.Raylib.Texture arg0, org.bytedeco.javacpp.Pointer arg1) {
        Raylib.UpdateTexture(arg0, arg1);
    }

    public static com.raylib.Raylib.Image genImageColor(int arg0, int arg1, com.raylib.Raylib.Color arg2) {
        return Raylib.GenImageColor(arg0, arg1, arg2);
    }

    public static boolean isImageValid(com.raylib.Raylib.Image arg0) {
        return Raylib.IsImageValid(arg0);
    }

    public static com.raylib.Raylib.Image genImageText(int arg0, int arg1, java.lang.String arg2) {
        return Raylib.GenImageText(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Image genImageText(int arg0, int arg1, org.bytedeco.javacpp.BytePointer arg2) {
        return Raylib.GenImageText(arg0, arg1, arg2);
    }

    public static void imageColorInvert(com.raylib.Raylib.Image arg0) {
        Raylib.ImageColorInvert(arg0);
    }

    public static com.raylib.Raylib.Image imageFromChannel(com.raylib.Raylib.Image arg0, int arg1) {
        return Raylib.ImageFromChannel(arg0, arg1);
    }

    public static com.raylib.Raylib.Texture loadTexture(org.bytedeco.javacpp.BytePointer arg0) {
        return Raylib.LoadTexture(arg0);
    }

    public static com.raylib.Raylib.Texture loadTexture(java.lang.String arg0) {
        return Raylib.LoadTexture(arg0);
    }

    public static void imageMipmaps(com.raylib.Raylib.Image arg0) {
        Raylib.ImageMipmaps(arg0);
    }

    public static void imageColorContrast(com.raylib.Raylib.Image arg0, float arg1) {
        Raylib.ImageColorContrast(arg0, arg1);
    }

    public static void imageDrawPixelV(com.raylib.Raylib.Image arg0, com.raylib.Raylib.Vector2 arg1, com.raylib.Raylib.Color arg2) {
        Raylib.ImageDrawPixelV(arg0, arg1, arg2);
    }

    public static void imageDrawLine(com.raylib.Raylib.Image arg0, int arg1, int arg2, int arg3, int arg4, com.raylib.Raylib.Color arg5) {
        Raylib.ImageDrawLine(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void imageAlphaCrop(com.raylib.Raylib.Image arg0, float arg1) {
        Raylib.ImageAlphaCrop(arg0, arg1);
    }

    public static com.raylib.Raylib.Color loadImagePalette(com.raylib.Raylib.Image arg0, int arg1, org.bytedeco.javacpp.IntPointer arg2) {
        return Raylib.LoadImagePalette(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Color loadImagePalette(com.raylib.Raylib.Image arg0, int arg1, int[] arg2) {
        return Raylib.LoadImagePalette(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Color loadImagePalette(com.raylib.Raylib.Image arg0, int arg1, java.nio.IntBuffer arg2) {
        return Raylib.LoadImagePalette(arg0, arg1, arg2);
    }

    public static void imageDrawLineEx(com.raylib.Raylib.Image arg0, com.raylib.Raylib.Vector2 arg1, com.raylib.Raylib.Vector2 arg2, int arg3, com.raylib.Raylib.Color arg4) {
        Raylib.ImageDrawLineEx(arg0, arg1, arg2, arg3, arg4);
    }

    public static void imageDrawTextEx(com.raylib.Raylib.Image arg0, com.raylib.Raylib.Font arg1, org.bytedeco.javacpp.BytePointer arg2, com.raylib.Raylib.Vector2 arg3, float arg4, float arg5, com.raylib.Raylib.Color arg6) {
        Raylib.ImageDrawTextEx(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static void imageDrawTextEx(com.raylib.Raylib.Image arg0, com.raylib.Raylib.Font arg1, java.lang.String arg2, com.raylib.Raylib.Vector2 arg3, float arg4, float arg5, com.raylib.Raylib.Color arg6) {
        Raylib.ImageDrawTextEx(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static com.raylib.Raylib.RenderTexture loadRenderTexture(int arg0, int arg1) {
        return Raylib.LoadRenderTexture(arg0, arg1);
    }

    public static void unloadImageColors(com.raylib.Raylib.Color arg0) {
        Raylib.UnloadImageColors(arg0);
    }

    public static void setTextureFilter(com.raylib.Raylib.Texture arg0, int arg1) {
        Raylib.SetTextureFilter(arg0, arg1);
    }

    public static void imageColorTint(com.raylib.Raylib.Image arg0, com.raylib.Raylib.Color arg1) {
        Raylib.ImageColorTint(arg0, arg1);
    }

    public static void imageDrawCircle(com.raylib.Raylib.Image arg0, int arg1, int arg2, int arg3, com.raylib.Raylib.Color arg4) {
        Raylib.ImageDrawCircle(arg0, arg1, arg2, arg3, arg4);
    }

    public static void updateTextureRec(com.raylib.Raylib.Texture arg0, com.raylib.Raylib.Rectangle arg1, org.bytedeco.javacpp.Pointer arg2) {
        Raylib.UpdateTextureRec(arg0, arg1, arg2);
    }

    public static void drawTexture(com.raylib.Raylib.Texture arg0, int arg1, int arg2, com.raylib.Raylib.Color arg3) {
        Raylib.DrawTexture(arg0, arg1, arg2, arg3);
    }

    public static void imageRotate(com.raylib.Raylib.Image arg0, int arg1) {
        Raylib.ImageRotate(arg0, arg1);
    }

    public static void imageDrawTriangle(com.raylib.Raylib.Image arg0, com.raylib.Raylib.Vector2 arg1, com.raylib.Raylib.Vector2 arg2, com.raylib.Raylib.Vector2 arg3, com.raylib.Raylib.Color arg4) {
        Raylib.ImageDrawTriangle(arg0, arg1, arg2, arg3, arg4);
    }

    public static boolean exportImageAsCode(com.raylib.Raylib.Image arg0, java.lang.String arg1) {
        return Raylib.ExportImageAsCode(arg0, arg1);
    }

    public static boolean exportImageAsCode(com.raylib.Raylib.Image arg0, org.bytedeco.javacpp.BytePointer arg1) {
        return Raylib.ExportImageAsCode(arg0, arg1);
    }

    public static void imageResizeCanvas(com.raylib.Raylib.Image arg0, int arg1, int arg2, int arg3, int arg4, com.raylib.Raylib.Color arg5) {
        Raylib.ImageResizeCanvas(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static com.raylib.Raylib.Image genImageChecked(int arg0, int arg1, int arg2, int arg3, com.raylib.Raylib.Color arg4, com.raylib.Raylib.Color arg5) {
        return Raylib.GenImageChecked(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static com.raylib.Raylib.Image genImageCellular(int arg0, int arg1, int arg2) {
        return Raylib.GenImageCellular(arg0, arg1, arg2);
    }

    public static void genTextureMipmaps(com.raylib.Raylib.Texture arg0) {
        Raylib.GenTextureMipmaps(arg0);
    }

    public static com.raylib.Raylib.Color loadImageColors(com.raylib.Raylib.Image arg0) {
        return Raylib.LoadImageColors(arg0);
    }

    public static void imageRotateCW(com.raylib.Raylib.Image arg0) {
        Raylib.ImageRotateCW(arg0);
    }

    public static void imageFormat(com.raylib.Raylib.Image arg0, int arg1) {
        Raylib.ImageFormat(arg0, arg1);
    }

    public static void imageDrawText(com.raylib.Raylib.Image arg0, org.bytedeco.javacpp.BytePointer arg1, int arg2, int arg3, int arg4, com.raylib.Raylib.Color arg5) {
        Raylib.ImageDrawText(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void imageDrawText(com.raylib.Raylib.Image arg0, java.lang.String arg1, int arg2, int arg3, int arg4, com.raylib.Raylib.Color arg5) {
        Raylib.ImageDrawText(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void imageAlphaMask(com.raylib.Raylib.Image arg0, com.raylib.Raylib.Image arg1) {
        Raylib.ImageAlphaMask(arg0, arg1);
    }

    public static void setTextureWrap(com.raylib.Raylib.Texture arg0, int arg1) {
        Raylib.SetTextureWrap(arg0, arg1);
    }

    public static void imageDrawLineV(com.raylib.Raylib.Image arg0, com.raylib.Raylib.Vector2 arg1, com.raylib.Raylib.Vector2 arg2, com.raylib.Raylib.Color arg3) {
        Raylib.ImageDrawLineV(arg0, arg1, arg2, arg3);
    }

    public static boolean exportImage(com.raylib.Raylib.Image arg0, org.bytedeco.javacpp.BytePointer arg1) {
        return Raylib.ExportImage(arg0, arg1);
    }

    public static boolean exportImage(com.raylib.Raylib.Image arg0, java.lang.String arg1) {
        return Raylib.ExportImage(arg0, arg1);
    }

    public static void drawTextureV(com.raylib.Raylib.Texture arg0, com.raylib.Raylib.Vector2 arg1, com.raylib.Raylib.Color arg2) {
        Raylib.DrawTextureV(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Image loadImageRaw(org.bytedeco.javacpp.BytePointer arg0, int arg1, int arg2, int arg3, int arg4) {
        return Raylib.LoadImageRaw(arg0, arg1, arg2, arg3, arg4);
    }

    public static com.raylib.Raylib.Image loadImageRaw(java.lang.String arg0, int arg1, int arg2, int arg3, int arg4) {
        return Raylib.LoadImageRaw(arg0, arg1, arg2, arg3, arg4);
    }

    public static com.raylib.Raylib.Image genImageWhiteNoise(int arg0, int arg1, float arg2) {
        return Raylib.GenImageWhiteNoise(arg0, arg1, arg2);
    }

    public static void imageResize(com.raylib.Raylib.Image arg0, int arg1, int arg2) {
        Raylib.ImageResize(arg0, arg1, arg2);
    }

    public static void drawTextureEx(com.raylib.Raylib.Texture arg0, com.raylib.Raylib.Vector2 arg1, float arg2, float arg3, com.raylib.Raylib.Color arg4) {
        Raylib.DrawTextureEx(arg0, arg1, arg2, arg3, arg4);
    }

    public static com.raylib.Raylib.Image imageTextEx(com.raylib.Raylib.Font arg0, java.lang.String arg1, float arg2, float arg3, com.raylib.Raylib.Color arg4) {
        return Raylib.ImageTextEx(arg0, arg1, arg2, arg3, arg4);
    }

    public static com.raylib.Raylib.Image imageTextEx(com.raylib.Raylib.Font arg0, org.bytedeco.javacpp.BytePointer arg1, float arg2, float arg3, com.raylib.Raylib.Color arg4) {
        return Raylib.ImageTextEx(arg0, arg1, arg2, arg3, arg4);
    }

    public static void unloadImage(com.raylib.Raylib.Image arg0) {
        Raylib.UnloadImage(arg0);
    }

    public static void imageAlphaClear(com.raylib.Raylib.Image arg0, com.raylib.Raylib.Color arg1, float arg2) {
        Raylib.ImageAlphaClear(arg0, arg1, arg2);
    }

    public static void imageBlurGaussian(com.raylib.Raylib.Image arg0, int arg1) {
        Raylib.ImageBlurGaussian(arg0, arg1);
    }

    public static void imageResizeNN(com.raylib.Raylib.Image arg0, int arg1, int arg2) {
        Raylib.ImageResizeNN(arg0, arg1, arg2);
    }

    public static void unloadImagePalette(com.raylib.Raylib.Color arg0) {
        Raylib.UnloadImagePalette(arg0);
    }

    public static com.raylib.Raylib.Image loadImageAnim(org.bytedeco.javacpp.BytePointer arg0, int[] arg1) {
        return Raylib.LoadImageAnim(arg0, arg1);
    }

    public static com.raylib.Raylib.Image loadImageAnim(org.bytedeco.javacpp.BytePointer arg0, java.nio.IntBuffer arg1) {
        return Raylib.LoadImageAnim(arg0, arg1);
    }

    public static com.raylib.Raylib.Image loadImageAnim(java.lang.String arg0, org.bytedeco.javacpp.IntPointer arg1) {
        return Raylib.LoadImageAnim(arg0, arg1);
    }

    public static com.raylib.Raylib.Image loadImageAnim(org.bytedeco.javacpp.BytePointer arg0, org.bytedeco.javacpp.IntPointer arg1) {
        return Raylib.LoadImageAnim(arg0, arg1);
    }

    public static com.raylib.Raylib.Image loadImageAnim(java.lang.String arg0, java.nio.IntBuffer arg1) {
        return Raylib.LoadImageAnim(arg0, arg1);
    }

    public static com.raylib.Raylib.Image loadImageAnim(java.lang.String arg0, int[] arg1) {
        return Raylib.LoadImageAnim(arg0, arg1);
    }

    public static com.raylib.Raylib.Color getImageColor(com.raylib.Raylib.Image arg0, int arg1, int arg2) {
        return Raylib.GetImageColor(arg0, arg1, arg2);
    }

    public static void imageDrawPixel(com.raylib.Raylib.Image arg0, int arg1, int arg2, com.raylib.Raylib.Color arg3) {
        Raylib.ImageDrawPixel(arg0, arg1, arg2, arg3);
    }

    public static void imageDither(com.raylib.Raylib.Image arg0, int arg1, int arg2, int arg3, int arg4) {
        Raylib.ImageDither(arg0, arg1, arg2, arg3, arg4);
    }

    public static void imageDrawCircleV(com.raylib.Raylib.Image arg0, com.raylib.Raylib.Vector2 arg1, int arg2, com.raylib.Raylib.Color arg3) {
        Raylib.ImageDrawCircleV(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.Texture loadTextureCubemap(com.raylib.Raylib.Image arg0, int arg1) {
        return Raylib.LoadTextureCubemap(arg0, arg1);
    }

    public static void imageFlipVertical(com.raylib.Raylib.Image arg0) {
        Raylib.ImageFlipVertical(arg0);
    }

    public static boolean isTextureValid(com.raylib.Raylib.Texture arg0) {
        return Raylib.IsTextureValid(arg0);
    }

    public static void imageColorReplace(com.raylib.Raylib.Image arg0, com.raylib.Raylib.Color arg1, com.raylib.Raylib.Color arg2) {
        Raylib.ImageColorReplace(arg0, arg1, arg2);
    }

    public static void imageRotateCCW(com.raylib.Raylib.Image arg0) {
        Raylib.ImageRotateCCW(arg0);
    }

    public static void imageDrawRectangle(com.raylib.Raylib.Image arg0, int arg1, int arg2, int arg3, int arg4, com.raylib.Raylib.Color arg5) {
        Raylib.ImageDrawRectangle(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static com.raylib.Raylib.Image imageFromImage(com.raylib.Raylib.Image arg0, com.raylib.Raylib.Rectangle arg1) {
        return Raylib.ImageFromImage(arg0, arg1);
    }

    public static void unloadTexture(com.raylib.Raylib.Texture arg0) {
        Raylib.UnloadTexture(arg0);
    }

    public static void drawModelWiresEx(com.raylib.Raylib.Model arg0, com.raylib.Raylib.Vector3 arg1, com.raylib.Raylib.Vector3 arg2, float arg3, com.raylib.Raylib.Vector3 arg4, com.raylib.Raylib.Color arg5) {
        Raylib.DrawModelWiresEx(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void unloadSoundAlias(com.raylib.Raylib.Sound arg0) {
        Raylib.UnloadSoundAlias(arg0);
    }

    public static void setSoundPan(com.raylib.Raylib.Sound arg0, float arg1) {
        Raylib.SetSoundPan(arg0, arg1);
    }

    public static boolean isMusicValid(com.raylib.Raylib.Music arg0) {
        return Raylib.IsMusicValid(arg0);
    }

    public static void unloadMusicStream(com.raylib.Raylib.Music arg0) {
        Raylib.UnloadMusicStream(arg0);
    }

    public static void pauseMusicStream(com.raylib.Raylib.Music arg0) {
        Raylib.PauseMusicStream(arg0);
    }

    public static void setMusicVolume(com.raylib.Raylib.Music arg0, float arg1) {
        Raylib.SetMusicVolume(arg0, arg1);
    }

    public static void setMusicPitch(com.raylib.Raylib.Music arg0, float arg1) {
        Raylib.SetMusicPitch(arg0, arg1);
    }

    public static float getMusicTimeLength(com.raylib.Raylib.Music arg0) {
        return Raylib.GetMusicTimeLength(arg0);
    }

    public static void drawModelPointsEx(com.raylib.Raylib.Model arg0, com.raylib.Raylib.Vector3 arg1, com.raylib.Raylib.Vector3 arg2, float arg3, com.raylib.Raylib.Vector3 arg4, com.raylib.Raylib.Color arg5) {
        Raylib.DrawModelPointsEx(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static com.raylib.Raylib.Mesh genMeshCylinder(float arg0, float arg1, int arg2) {
        return Raylib.GenMeshCylinder(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Material loadMaterials(org.bytedeco.javacpp.BytePointer arg0, org.bytedeco.javacpp.IntPointer arg1) {
        return Raylib.LoadMaterials(arg0, arg1);
    }

    public static com.raylib.Raylib.Material loadMaterials(java.lang.String arg0, java.nio.IntBuffer arg1) {
        return Raylib.LoadMaterials(arg0, arg1);
    }

    public static com.raylib.Raylib.Material loadMaterials(java.lang.String arg0, org.bytedeco.javacpp.IntPointer arg1) {
        return Raylib.LoadMaterials(arg0, arg1);
    }

    public static com.raylib.Raylib.Material loadMaterials(org.bytedeco.javacpp.BytePointer arg0, java.nio.IntBuffer arg1) {
        return Raylib.LoadMaterials(arg0, arg1);
    }

    public static com.raylib.Raylib.Material loadMaterials(org.bytedeco.javacpp.BytePointer arg0, int[] arg1) {
        return Raylib.LoadMaterials(arg0, arg1);
    }

    public static com.raylib.Raylib.Material loadMaterials(java.lang.String arg0, int[] arg1) {
        return Raylib.LoadMaterials(arg0, arg1);
    }

    public static boolean isMaterialValid(com.raylib.Raylib.Material arg0) {
        return Raylib.IsMaterialValid(arg0);
    }

    public static com.raylib.Raylib.BoundingBox getMeshBoundingBox(com.raylib.Raylib.Mesh arg0) {
        return Raylib.GetMeshBoundingBox(arg0);
    }

    public static void drawModelPoints(com.raylib.Raylib.Model arg0, com.raylib.Raylib.Vector3 arg1, float arg2, com.raylib.Raylib.Color arg3) {
        Raylib.DrawModelPoints(arg0, arg1, arg2, arg3);
    }

    public static void unloadMaterial(com.raylib.Raylib.Material arg0) {
        Raylib.UnloadMaterial(arg0);
    }

    public static com.raylib.Raylib.Sound loadSoundFromWave(com.raylib.Raylib.Wave arg0) {
        return Raylib.LoadSoundFromWave(arg0);
    }

    public static void unloadWaveSamples(java.nio.FloatBuffer arg0) {
        Raylib.UnloadWaveSamples(arg0);
    }

    public static void unloadWaveSamples(float[] arg0) {
        Raylib.UnloadWaveSamples(arg0);
    }

    public static void unloadWaveSamples(org.bytedeco.javacpp.FloatPointer arg0) {
        Raylib.UnloadWaveSamples(arg0);
    }

    public static com.raylib.Raylib.Mesh genMeshTorus(float arg0, float arg1, int arg2, int arg3) {
        return Raylib.GenMeshTorus(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.Music loadMusicStream(org.bytedeco.javacpp.BytePointer arg0) {
        return Raylib.LoadMusicStream(arg0);
    }

    public static com.raylib.Raylib.Music loadMusicStream(java.lang.String arg0) {
        return Raylib.LoadMusicStream(arg0);
    }

    public static void playMusicStream(com.raylib.Raylib.Music arg0) {
        Raylib.PlayMusicStream(arg0);
    }

    public static void drawBillboardPro(com.raylib.Raylib.Camera3D arg0, com.raylib.Raylib.Texture arg1, com.raylib.Raylib.Rectangle arg2, com.raylib.Raylib.Vector3 arg3, com.raylib.Raylib.Vector3 arg4, com.raylib.Raylib.Vector2 arg5, com.raylib.Raylib.Vector2 arg6, float arg7, com.raylib.Raylib.Color arg8) {
        Raylib.DrawBillboardPro(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    public static float getMasterVolume() {
        return Raylib.GetMasterVolume();
    }

    public static void closeAudioDevice() {
        Raylib.CloseAudioDevice();
    }

    public static boolean isSoundValid(com.raylib.Raylib.Sound arg0) {
        return Raylib.IsSoundValid(arg0);
    }

    public static void updateMusicStream(com.raylib.Raylib.Music arg0) {
        Raylib.UpdateMusicStream(arg0);
    }

    public static org.bytedeco.javacpp.FloatPointer loadWaveSamples(com.raylib.Raylib.Wave arg0) {
        return Raylib.LoadWaveSamples(arg0);
    }

    public static com.raylib.Raylib.Wave loadWaveFromMemory(java.lang.String arg0, java.nio.ByteBuffer arg1, int arg2) {
        return Raylib.LoadWaveFromMemory(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Wave loadWaveFromMemory(org.bytedeco.javacpp.BytePointer arg0, java.nio.ByteBuffer arg1, int arg2) {
        return Raylib.LoadWaveFromMemory(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Wave loadWaveFromMemory(java.lang.String arg0, byte[] arg1, int arg2) {
        return Raylib.LoadWaveFromMemory(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Wave loadWaveFromMemory(org.bytedeco.javacpp.BytePointer arg0, org.bytedeco.javacpp.BytePointer arg1, int arg2) {
        return Raylib.LoadWaveFromMemory(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Wave loadWaveFromMemory(org.bytedeco.javacpp.BytePointer arg0, byte[] arg1, int arg2) {
        return Raylib.LoadWaveFromMemory(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Wave loadWaveFromMemory(java.lang.String arg0, org.bytedeco.javacpp.BytePointer arg1, int arg2) {
        return Raylib.LoadWaveFromMemory(arg0, arg1, arg2);
    }

    public static void stopMusicStream(com.raylib.Raylib.Music arg0) {
        Raylib.StopMusicStream(arg0);
    }

    public static void resumeMusicStream(com.raylib.Raylib.Music arg0) {
        Raylib.ResumeMusicStream(arg0);
    }

    public static com.raylib.Raylib.Mesh genMeshCone(float arg0, float arg1, int arg2) {
        return Raylib.GenMeshCone(arg0, arg1, arg2);
    }

    public static void seekMusicStream(com.raylib.Raylib.Music arg0, float arg1) {
        Raylib.SeekMusicStream(arg0, arg1);
    }

    public static void setMusicPan(com.raylib.Raylib.Music arg0, float arg1) {
        Raylib.SetMusicPan(arg0, arg1);
    }

    public static boolean exportMeshAsCode(com.raylib.Raylib.Mesh arg0, java.lang.String arg1) {
        return Raylib.ExportMeshAsCode(arg0, arg1);
    }

    public static boolean exportMeshAsCode(com.raylib.Raylib.Mesh arg0, org.bytedeco.javacpp.BytePointer arg1) {
        return Raylib.ExportMeshAsCode(arg0, arg1);
    }

    public static void setSoundPitch(com.raylib.Raylib.Sound arg0, float arg1) {
        Raylib.SetSoundPitch(arg0, arg1);
    }

    public static float getMusicTimePlayed(com.raylib.Raylib.Music arg0) {
        return Raylib.GetMusicTimePlayed(arg0);
    }

    public static void drawBoundingBox(com.raylib.Raylib.BoundingBox arg0, com.raylib.Raylib.Color arg1) {
        Raylib.DrawBoundingBox(arg0, arg1);
    }

    public static void genMeshTangents(com.raylib.Raylib.Mesh arg0) {
        Raylib.GenMeshTangents(arg0);
    }

    public static com.raylib.Raylib.Mesh genMeshPoly(int arg0, float arg1) {
        return Raylib.GenMeshPoly(arg0, arg1);
    }

    public static com.raylib.Raylib.Mesh genMeshSphere(float arg0, int arg1, int arg2) {
        return Raylib.GenMeshSphere(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Mesh genMeshHemiSphere(float arg0, int arg1, int arg2) {
        return Raylib.GenMeshHemiSphere(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Mesh genMeshHeightmap(com.raylib.Raylib.Image arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.GenMeshHeightmap(arg0, arg1);
    }

    public static com.raylib.Raylib.RayCollision getRayCollisionBox(com.raylib.Raylib.Ray arg0, com.raylib.Raylib.BoundingBox arg1) {
        return Raylib.GetRayCollisionBox(arg0, arg1);
    }

    public static void drawBillboard(com.raylib.Raylib.Camera3D arg0, com.raylib.Raylib.Texture arg1, com.raylib.Raylib.Vector3 arg2, float arg3, com.raylib.Raylib.Color arg4) {
        Raylib.DrawBillboard(arg0, arg1, arg2, arg3, arg4);
    }

    public static boolean isWaveValid(com.raylib.Raylib.Wave arg0) {
        return Raylib.IsWaveValid(arg0);
    }

    public static com.raylib.Raylib.Mesh genMeshKnot(float arg0, float arg1, int arg2, int arg3) {
        return Raylib.GenMeshKnot(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.Mesh genMeshCubicmap(com.raylib.Raylib.Image arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.GenMeshCubicmap(arg0, arg1);
    }

    public static com.raylib.Raylib.Sound loadSoundAlias(com.raylib.Raylib.Sound arg0) {
        return Raylib.LoadSoundAlias(arg0);
    }

    public static com.raylib.Raylib.Mesh genMeshPlane(float arg0, float arg1, int arg2, int arg3) {
        return Raylib.GenMeshPlane(arg0, arg1, arg2, arg3);
    }

    public static boolean isAudioDeviceReady() {
        return Raylib.IsAudioDeviceReady();
    }

    public static void setMasterVolume(float arg0) {
        Raylib.SetMasterVolume(arg0);
    }

    public static void drawBillboardRec(com.raylib.Raylib.Camera3D arg0, com.raylib.Raylib.Texture arg1, com.raylib.Raylib.Rectangle arg2, com.raylib.Raylib.Vector3 arg3, com.raylib.Raylib.Vector2 arg4, com.raylib.Raylib.Color arg5) {
        Raylib.DrawBillboardRec(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void setMaterialTexture(com.raylib.Raylib.Material arg0, int arg1, com.raylib.Raylib.Texture arg2) {
        Raylib.SetMaterialTexture(arg0, arg1, arg2);
    }

    public static void drawModelWires(com.raylib.Raylib.Model arg0, com.raylib.Raylib.Vector3 arg1, float arg2, com.raylib.Raylib.Color arg3) {
        Raylib.DrawModelWires(arg0, arg1, arg2, arg3);
    }

    public static void initAudioDevice() {
        Raylib.InitAudioDevice();
    }

    public static void updateSound(com.raylib.Raylib.Sound arg0, org.bytedeco.javacpp.Pointer arg1, int arg2) {
        Raylib.UpdateSound(arg0, arg1, arg2);
    }

    public static void unloadSound(com.raylib.Raylib.Sound arg0) {
        Raylib.UnloadSound(arg0);
    }

    public static boolean exportWaveAsCode(com.raylib.Raylib.Wave arg0, org.bytedeco.javacpp.BytePointer arg1) {
        return Raylib.ExportWaveAsCode(arg0, arg1);
    }

    public static boolean exportWaveAsCode(com.raylib.Raylib.Wave arg0, java.lang.String arg1) {
        return Raylib.ExportWaveAsCode(arg0, arg1);
    }

    public static void resumeSound(com.raylib.Raylib.Sound arg0) {
        Raylib.ResumeSound(arg0);
    }

    public static boolean isSoundPlaying(com.raylib.Raylib.Sound arg0) {
        return Raylib.IsSoundPlaying(arg0);
    }

    public static void updateMeshBuffer(com.raylib.Raylib.Mesh arg0, int arg1, org.bytedeco.javacpp.Pointer arg2, int arg3, int arg4) {
        Raylib.UpdateMeshBuffer(arg0, arg1, arg2, arg3, arg4);
    }

    public static void drawMeshInstanced(com.raylib.Raylib.Mesh arg0, com.raylib.Raylib.Material arg1, com.raylib.Raylib.Matrix arg2, int arg3) {
        Raylib.DrawMeshInstanced(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.Mesh genMeshCube(float arg0, float arg1, float arg2) {
        return Raylib.GenMeshCube(arg0, arg1, arg2);
    }

    public static void setSoundVolume(com.raylib.Raylib.Sound arg0, float arg1) {
        Raylib.SetSoundVolume(arg0, arg1);
    }

    public static float rlGetLineWidth() {
        return Raylib.rlGetLineWidth();
    }

    public static void rlClearColor(byte arg0, byte arg1, byte arg2, byte arg3) {
        Raylib.rlClearColor(arg0, arg1, arg2, arg3);
    }

    public static void rlPopMatrix() {
        Raylib.rlPopMatrix();
    }

    public static void rlMultMatrixf(float[] arg0) {
        Raylib.rlMultMatrixf(arg0);
    }

    public static void rlMultMatrixf(org.bytedeco.javacpp.FloatPointer arg0) {
        Raylib.rlMultMatrixf(arg0);
    }

    public static void rlMultMatrixf(java.nio.FloatBuffer arg0) {
        Raylib.rlMultMatrixf(arg0);
    }

    public static com.raylib.Raylib.rlRenderBatch rlLoadRenderBatch(int arg0, int arg1) {
        return Raylib.rlLoadRenderBatch(arg0, arg1);
    }

    public static void rlDrawRenderBatch(com.raylib.Raylib.rlRenderBatch arg0) {
        Raylib.rlDrawRenderBatch(arg0);
    }

    public static void rlDrawVertexArray(int arg0, int arg1) {
        Raylib.rlDrawVertexArray(arg0, arg1);
    }

    public static void rlEnablePointMode() {
        Raylib.rlEnablePointMode();
    }

    public static void updateAudioStream(com.raylib.Raylib.AudioStream arg0, org.bytedeco.javacpp.Pointer arg1, int arg2) {
        Raylib.UpdateAudioStream(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.AudioStream loadAudioStream(int arg0, int arg1, int arg2) {
        return Raylib.LoadAudioStream(arg0, arg1, arg2);
    }

    public static void rlColorMask(boolean arg0, boolean arg1, boolean arg2, boolean arg3) {
        Raylib.rlColorMask(arg0, arg1, arg2, arg3);
    }

    public static void rlCheckErrors() {
        Raylib.rlCheckErrors();
    }

    public static void rlSetBlendMode(int arg0) {
        Raylib.rlSetBlendMode(arg0);
    }

    public static int rlLoadVertexBuffer(org.bytedeco.javacpp.Pointer arg0, int arg1, boolean arg2) {
        return Raylib.rlLoadVertexBuffer(arg0, arg1, arg2);
    }

    public static int rlGetVersion() {
        return Raylib.rlGetVersion();
    }

    public static void rlUnloadTexture(int arg0) {
        Raylib.rlUnloadTexture(arg0);
    }

    public static int rlLoadVertexArray() {
        return Raylib.rlLoadVertexArray();
    }

    public static org.bytedeco.javacpp.BytePointer rlReadScreenPixels(int arg0, int arg1) {
        return Raylib.rlReadScreenPixels(arg0, arg1);
    }

    public static int rlLoadFramebuffer() {
        return Raylib.rlLoadFramebuffer();
    }

    public static void rlSetClipPlanes(double arg0, double arg1) {
        Raylib.rlSetClipPlanes(arg0, arg1);
    }

    public static int rlLoadShaderCode(java.lang.String arg0, java.lang.String arg1) {
        return Raylib.rlLoadShaderCode(arg0, arg1);
    }

    public static int rlLoadShaderCode(org.bytedeco.javacpp.BytePointer arg0, org.bytedeco.javacpp.BytePointer arg1) {
        return Raylib.rlLoadShaderCode(arg0, arg1);
    }

    public static void rlSetUniform(int arg0, org.bytedeco.javacpp.Pointer arg1, int arg2, int arg3) {
        Raylib.rlSetUniform(arg0, arg1, arg2, arg3);
    }

    public static void rlLoadExtensions(org.bytedeco.javacpp.Pointer arg0) {
        Raylib.rlLoadExtensions(arg0);
    }

    public static void rlSetTexture(int arg0) {
        Raylib.rlSetTexture(arg0);
    }

    public static void rlSetUniformMatrix(int arg0, com.raylib.Raylib.Matrix arg1) {
        Raylib.rlSetUniformMatrix(arg0, arg1);
    }

    public static void rlSetShader(int arg0, int[] arg1) {
        Raylib.rlSetShader(arg0, arg1);
    }

    public static void rlSetShader(int arg0, org.bytedeco.javacpp.IntPointer arg1) {
        Raylib.rlSetShader(arg0, arg1);
    }

    public static void rlSetShader(int arg0, java.nio.IntBuffer arg1) {
        Raylib.rlSetShader(arg0, arg1);
    }

    public static int rlCompileShader(java.lang.String arg0, int arg1) {
        return Raylib.rlCompileShader(arg0, arg1);
    }

    public static int rlCompileShader(org.bytedeco.javacpp.BytePointer arg0, int arg1) {
        return Raylib.rlCompileShader(arg0, arg1);
    }

    public static int rlLoadShaderBuffer(int arg0, org.bytedeco.javacpp.Pointer arg1, int arg2) {
        return Raylib.rlLoadShaderBuffer(arg0, arg1, arg2);
    }

    public static void playAudioStream(com.raylib.Raylib.AudioStream arg0) {
        Raylib.PlayAudioStream(arg0);
    }

    public static void rlBindShaderBuffer(int arg0, int arg1) {
        Raylib.rlBindShaderBuffer(arg0, arg1);
    }

    public static void rlMatrixMode(int arg0) {
        Raylib.rlMatrixMode(arg0);
    }

    public static void rlDisableTexture() {
        Raylib.rlDisableTexture();
    }

    public static void rlEnableDepthTest() {
        Raylib.rlEnableDepthTest();
    }

    public static void rlSetBlendFactors(int arg0, int arg1, int arg2) {
        Raylib.rlSetBlendFactors(arg0, arg1, arg2);
    }

    public static void unloadAudioStream(com.raylib.Raylib.AudioStream arg0) {
        Raylib.UnloadAudioStream(arg0);
    }

    public static void rlDisableDepthTest() {
        Raylib.rlDisableDepthTest();
    }

    public static int rlLoadTexture(org.bytedeco.javacpp.Pointer arg0, int arg1, int arg2, int arg3, int arg4) {
        return Raylib.rlLoadTexture(arg0, arg1, arg2, arg3, arg4);
    }

    public static void stopAudioStream(com.raylib.Raylib.AudioStream arg0) {
        Raylib.StopAudioStream(arg0);
    }

    public static void rlEnableTexture(int arg0) {
        Raylib.rlEnableTexture(arg0);
    }

    public static void rlBindFramebuffer(int arg0, int arg1) {
        Raylib.rlBindFramebuffer(arg0, arg1);
    }

    public static void rlSetCullFace(int arg0) {
        Raylib.rlSetCullFace(arg0);
    }

    public static void pauseAudioStream(com.raylib.Raylib.AudioStream arg0) {
        Raylib.PauseAudioStream(arg0);
    }

    public static void rlTranslatef(float arg0, float arg1, float arg2) {
        Raylib.rlTranslatef(arg0, arg1, arg2);
    }

    public static void rlTexCoord2f(float arg0, float arg1) {
        Raylib.rlTexCoord2f(arg0, arg1);
    }

    public static void rlDisableShader() {
        Raylib.rlDisableShader();
    }

    public static void rlEnableColorBlend() {
        Raylib.rlEnableColorBlend();
    }

    public static void rlEnableShader(int arg0) {
        Raylib.rlEnableShader(arg0);
    }

    public static void rlDisableDepthMask() {
        Raylib.rlDisableDepthMask();
    }

    public static boolean isAudioStreamValid(com.raylib.Raylib.AudioStream arg0) {
        return Raylib.IsAudioStreamValid(arg0);
    }

    public static int rlLoadTextureDepth(int arg0, int arg1, boolean arg2) {
        return Raylib.rlLoadTextureDepth(arg0, arg1, arg2);
    }

    public static void rlDisableWireMode() {
        Raylib.rlDisableWireMode();
    }

    public static void rlSetLineWidth(float arg0) {
        Raylib.rlSetLineWidth(arg0);
    }

    public static void rlUpdateTexture(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, org.bytedeco.javacpp.Pointer arg6) {
        Raylib.rlUpdateTexture(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static void rlPushMatrix() {
        Raylib.rlPushMatrix();
    }

    public static void rlEnableDepthMask() {
        Raylib.rlEnableDepthMask();
    }

    public static void rlEnableWireMode() {
        Raylib.rlEnableWireMode();
    }

    public static void resumeAudioStream(com.raylib.Raylib.AudioStream arg0) {
        Raylib.ResumeAudioStream(arg0);
    }

    public static void setAudioStreamPan(com.raylib.Raylib.AudioStream arg0, float arg1) {
        Raylib.SetAudioStreamPan(arg0, arg1);
    }

    public static void rlLoadIdentity() {
        Raylib.rlLoadIdentity();
    }

    public static void rlBlitFramebuffer(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        Raylib.rlBlitFramebuffer(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    public static int rlGetActiveFramebuffer() {
        return Raylib.rlGetActiveFramebuffer();
    }

    public static double rlGetCullDistanceFar() {
        return Raylib.rlGetCullDistanceFar();
    }

    public static boolean rlIsStereoRenderEnabled() {
        return Raylib.rlIsStereoRenderEnabled();
    }

    public static void rlEnableVertexBuffer(int arg0) {
        Raylib.rlEnableVertexBuffer(arg0);
    }

    public static void rlSetFramebufferWidth(int arg0) {
        Raylib.rlSetFramebufferWidth(arg0);
    }

    public static void rlDrawVertexArrayElements(int arg0, int arg1, org.bytedeco.javacpp.Pointer arg2) {
        Raylib.rlDrawVertexArrayElements(arg0, arg1, arg2);
    }

    public static void rlTextureParameters(int arg0, int arg1, int arg2) {
        Raylib.rlTextureParameters(arg0, arg1, arg2);
    }

    public static void rlClearScreenBuffers() {
        Raylib.rlClearScreenBuffers();
    }

    public static int rlGetFramebufferWidth() {
        return Raylib.rlGetFramebufferWidth();
    }

    public static void rlEnableTextureCubemap(int arg0) {
        Raylib.rlEnableTextureCubemap(arg0);
    }

    public static void rlActiveDrawBuffers(int arg0) {
        Raylib.rlActiveDrawBuffers(arg0);
    }

    public static void rlDrawRenderBatchActive() {
        Raylib.rlDrawRenderBatchActive();
    }

    public static int rlLoadVertexBufferElement(org.bytedeco.javacpp.Pointer arg0, int arg1, boolean arg2) {
        return Raylib.rlLoadVertexBufferElement(arg0, arg1, arg2);
    }

    public static void rlUnloadVertexArray(int arg0) {
        Raylib.rlUnloadVertexArray(arg0);
    }

    public static void rlUnloadVertexBuffer(int arg0) {
        Raylib.rlUnloadVertexBuffer(arg0);
    }

    public static int rlLoadTextureCubemap(org.bytedeco.javacpp.Pointer arg0, int arg1, int arg2, int arg3) {
        return Raylib.rlLoadTextureCubemap(arg0, arg1, arg2, arg3);
    }

    public static void rlGetGlTextureFormats(int arg0, org.bytedeco.javacpp.IntPointer arg1, org.bytedeco.javacpp.IntPointer arg2, org.bytedeco.javacpp.IntPointer arg3) {
        Raylib.rlGetGlTextureFormats(arg0, arg1, arg2, arg3);
    }

    public static void rlGetGlTextureFormats(int arg0, int[] arg1, int[] arg2, int[] arg3) {
        Raylib.rlGetGlTextureFormats(arg0, arg1, arg2, arg3);
    }

    public static void rlGetGlTextureFormats(int arg0, java.nio.IntBuffer arg1, java.nio.IntBuffer arg2, java.nio.IntBuffer arg3) {
        Raylib.rlGetGlTextureFormats(arg0, arg1, arg2, arg3);
    }

    public static org.bytedeco.javacpp.BytePointer rlGetPixelFormatName(int arg0) {
        return Raylib.rlGetPixelFormatName(arg0);
    }

    public static void rlDisableBackfaceCulling() {
        Raylib.rlDisableBackfaceCulling();
    }

    public static org.bytedeco.javacpp.Pointer rlReadTexturePixels(int arg0, int arg1, int arg2, int arg3) {
        return Raylib.rlReadTexturePixels(arg0, arg1, arg2, arg3);
    }

    public static void rlFramebufferAttach(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Raylib.rlFramebufferAttach(arg0, arg1, arg2, arg3, arg4);
    }

    public static boolean rlFramebufferComplete(int arg0) {
        return Raylib.rlFramebufferComplete(arg0);
    }

    public static int rlLoadShaderProgram(int arg0, int arg1) {
        return Raylib.rlLoadShaderProgram(arg0, arg1);
    }

    public static void rlSetVertexAttribute(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        Raylib.rlSetVertexAttribute(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void rlDisableSmoothLines() {
        Raylib.rlDisableSmoothLines();
    }

    public static void rlUnloadShaderProgram(int arg0) {
        Raylib.rlUnloadShaderProgram(arg0);
    }

    public static double rlGetCullDistanceNear() {
        return Raylib.rlGetCullDistanceNear();
    }

    public static void rlEnableSmoothLines() {
        Raylib.rlEnableSmoothLines();
    }

    public static boolean rlCheckRenderBatchLimit(int arg0) {
        return Raylib.rlCheckRenderBatchLimit(arg0);
    }

    public static boolean rlEnableVertexArray(int arg0) {
        return Raylib.rlEnableVertexArray(arg0);
    }

    public static int rlGetLocationUniform(int arg0, java.lang.String arg1) {
        return Raylib.rlGetLocationUniform(arg0, arg1);
    }

    public static int rlGetLocationUniform(int arg0, org.bytedeco.javacpp.BytePointer arg1) {
        return Raylib.rlGetLocationUniform(arg0, arg1);
    }

    public static int rlGetLocationAttrib(int arg0, org.bytedeco.javacpp.BytePointer arg1) {
        return Raylib.rlGetLocationAttrib(arg0, arg1);
    }

    public static int rlGetLocationAttrib(int arg0, java.lang.String arg1) {
        return Raylib.rlGetLocationAttrib(arg0, arg1);
    }

    public static void rlSetFramebufferHeight(int arg0) {
        Raylib.rlSetFramebufferHeight(arg0);
    }

    public static void rlEnableStereoRender() {
        Raylib.rlEnableStereoRender();
    }

    public static void rlCubemapParameters(int arg0, int arg1, int arg2) {
        Raylib.rlCubemapParameters(arg0, arg1, arg2);
    }

    public static void detachAudioMixedProcessor(com.raylib.Raylib.AudioCallback arg0) {
        Raylib.DetachAudioMixedProcessor(arg0);
    }

    public static void rlEnableVertexAttribute(int arg0) {
        Raylib.rlEnableVertexAttribute(arg0);
    }

    public static void rlActiveTextureSlot(int arg0) {
        Raylib.rlActiveTextureSlot(arg0);
    }

    public static void rlEnableBackfaceCulling() {
        Raylib.rlEnableBackfaceCulling();
    }

    public static void rlDisableColorBlend() {
        Raylib.rlDisableColorBlend();
    }

    public static void rlDisableVertexArray() {
        Raylib.rlDisableVertexArray();
    }

    public static void rlUnloadFramebuffer(int arg0) {
        Raylib.rlUnloadFramebuffer(arg0);
    }

    public static void rlSetUniformSampler(int arg0, int arg1) {
        Raylib.rlSetUniformSampler(arg0, arg1);
    }

    public static org.bytedeco.javacpp.IntPointer rlGetShaderLocsDefault() {
        return Raylib.rlGetShaderLocsDefault();
    }

    public static void rlUnloadRenderBatch(com.raylib.Raylib.rlRenderBatch arg0) {
        Raylib.rlUnloadRenderBatch(arg0);
    }

    public static void rlDisableScissorTest() {
        Raylib.rlDisableScissorTest();
    }

    public static void rlEnableScissorTest() {
        Raylib.rlEnableScissorTest();
    }

    public static void rlSetRenderBatchActive(com.raylib.Raylib.rlRenderBatch arg0) {
        Raylib.rlSetRenderBatchActive(arg0);
    }

    public static void rlSetUniformMatrices(int arg0, com.raylib.Raylib.Matrix arg1, int arg2) {
        Raylib.rlSetUniformMatrices(arg0, arg1, arg2);
    }

    public static int rlLoadComputeShaderProgram(int arg0) {
        return Raylib.rlLoadComputeShaderProgram(arg0);
    }

    public static void rlDisableVertexBuffer() {
        Raylib.rlDisableVertexBuffer();
    }

    public static void rlDrawVertexArrayInstanced(int arg0, int arg1, int arg2) {
        Raylib.rlDrawVertexArrayInstanced(arg0, arg1, arg2);
    }

    public static void rlUpdateVertexBuffer(int arg0, org.bytedeco.javacpp.Pointer arg1, int arg2, int arg3) {
        Raylib.rlUpdateVertexBuffer(arg0, arg1, arg2, arg3);
    }

    public static void rlDisableVertexAttribute(int arg0) {
        Raylib.rlDisableVertexAttribute(arg0);
    }

    public static void rlDisableTextureCubemap() {
        Raylib.rlDisableTextureCubemap();
    }

    public static void rlEnableFramebuffer(int arg0) {
        Raylib.rlEnableFramebuffer(arg0);
    }

    public static void rlDisableFramebuffer() {
        Raylib.rlDisableFramebuffer();
    }

    public static void rlDisableStereoRender() {
        Raylib.rlDisableStereoRender();
    }

    public static void rlSetBlendFactorsSeparate(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        Raylib.rlSetBlendFactorsSeparate(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static int rlGetFramebufferHeight() {
        return Raylib.rlGetFramebufferHeight();
    }

    public static int rlGetTextureIdDefault() {
        return Raylib.rlGetTextureIdDefault();
    }

    public static int rlGetShaderIdDefault() {
        return Raylib.rlGetShaderIdDefault();
    }

    public static void rlGenTextureMipmaps(int arg0, int arg1, int arg2, int arg3, org.bytedeco.javacpp.IntPointer arg4) {
        Raylib.rlGenTextureMipmaps(arg0, arg1, arg2, arg3, arg4);
    }

    public static void rlGenTextureMipmaps(int arg0, int arg1, int arg2, int arg3, java.nio.IntBuffer arg4) {
        Raylib.rlGenTextureMipmaps(arg0, arg1, arg2, arg3, arg4);
    }

    public static void rlGenTextureMipmaps(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        Raylib.rlGenTextureMipmaps(arg0, arg1, arg2, arg3, arg4);
    }

    public static void quaternionToAxisAngle(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector3 arg1, java.nio.FloatBuffer arg2) {
        Raylib.QuaternionToAxisAngle(arg0, arg1, arg2);
    }

    public static void quaternionToAxisAngle(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector3 arg1, org.bytedeco.javacpp.FloatPointer arg2) {
        Raylib.QuaternionToAxisAngle(arg0, arg1, arg2);
    }

    public static void quaternionToAxisAngle(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector3 arg1, float[] arg2) {
        Raylib.QuaternionToAxisAngle(arg0, arg1, arg2);
    }

    public static void guiLoadStyleDefault() {
        Raylib.GuiLoadStyleDefault();
    }

    public static com.raylib.Raylib.Vector4 vector4SubtractValue(com.raylib.Raylib.Vector4 arg0, float arg1) {
        return Raylib.Vector4SubtractValue(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 vector3CrossProduct(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.Vector3CrossProduct(arg0, arg1);
    }

    public static void rlUpdateShaderBuffer(int arg0, org.bytedeco.javacpp.Pointer arg1, int arg2, int arg3) {
        Raylib.rlUpdateShaderBuffer(arg0, arg1, arg2, arg3);
    }

    public static void vector3OrthoNormalize(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        Raylib.Vector3OrthoNormalize(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 quaternionFromMatrix(com.raylib.Raylib.Matrix arg0) {
        return Raylib.QuaternionFromMatrix(arg0);
    }

    public static com.raylib.Raylib.PhysicsBody createPhysicsBodyPolygon(com.raylib.Raylib.Vector2 arg0, float arg1, int arg2, float arg3) {
        return Raylib.CreatePhysicsBodyPolygon(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.Matrix rlGetMatrixModelview() {
        return Raylib.rlGetMatrixModelview();
    }

    public static com.raylib.Raylib.Vector4 quaternionSubtractValue(com.raylib.Raylib.Vector4 arg0, float arg1) {
        return Raylib.QuaternionSubtractValue(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 vector3SubtractValue(com.raylib.Raylib.Vector3 arg0, float arg1) {
        return Raylib.Vector3SubtractValue(arg0, arg1);
    }

    public static com.raylib.Raylib.Matrix rlGetMatrixTransform() {
        return Raylib.rlGetMatrixTransform();
    }

    public static com.raylib.Raylib.Vector3 vector3RotateByAxisAngle(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1, float arg2) {
        return Raylib.Vector3RotateByAxisAngle(arg0, arg1, arg2);
    }

    public static void rlSetMatrixProjection(com.raylib.Raylib.Matrix arg0) {
        Raylib.rlSetMatrixProjection(arg0);
    }

    public static int rlGetShaderBufferSize(int arg0) {
        return Raylib.rlGetShaderBufferSize(arg0);
    }

    public static com.raylib.Raylib.Vector3 vector3Perpendicular(com.raylib.Raylib.Vector3 arg0) {
        return Raylib.Vector3Perpendicular(arg0);
    }

    public static com.raylib.Raylib.Matrix rlGetMatrixProjection() {
        return Raylib.rlGetMatrixProjection();
    }

    public static com.raylib.Raylib.Vector4 quaternionNormalize(com.raylib.Raylib.Vector4 arg0) {
        return Raylib.QuaternionNormalize(arg0);
    }

    public static void rlUnloadShaderBuffer(int arg0) {
        Raylib.rlUnloadShaderBuffer(arg0);
    }

    public static void setPhysicsBodyRotation(com.raylib.Raylib.PhysicsBody arg0, float arg1) {
        Raylib.SetPhysicsBodyRotation(arg0, arg1);
    }

    public static void rlSetMatrixModelview(com.raylib.Raylib.Matrix arg0) {
        Raylib.rlSetMatrixModelview(arg0);
    }

    public static int getPhysicsShapeType(int arg0) {
        return Raylib.GetPhysicsShapeType(arg0);
    }

    public static com.raylib.Raylib.Vector4 quaternionFromAxisAngle(com.raylib.Raylib.Vector3 arg0, float arg1) {
        return Raylib.QuaternionFromAxisAngle(arg0, arg1);
    }

    public static void rlComputeShaderDispatch(int arg0, int arg1, int arg2) {
        Raylib.rlComputeShaderDispatch(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Vector2 getPhysicsShapeVertex(com.raylib.Raylib.PhysicsBody arg0, int arg1) {
        return Raylib.GetPhysicsShapeVertex(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 vector2SubtractValue(com.raylib.Raylib.Vector2 arg0, float arg1) {
        return Raylib.Vector2SubtractValue(arg0, arg1);
    }

    public static com.raylib.Raylib.PhysicsBody createPhysicsBodyCircle(com.raylib.Raylib.Vector2 arg0, float arg1, float arg2) {
        return Raylib.CreatePhysicsBodyCircle(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Vector3 vector3RotateByQuaternion(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.Vector3RotateByQuaternion(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 quaternionTransform(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Matrix arg1) {
        return Raylib.QuaternionTransform(arg0, arg1);
    }

    public static com.raylib.Raylib.PhysicsBody createPhysicsBodyRectangle(com.raylib.Raylib.Vector2 arg0, float arg1, float arg2, float arg3) {
        return Raylib.CreatePhysicsBodyRectangle(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.Vector3 vector3CubicHermite(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1, com.raylib.Raylib.Vector3 arg2, com.raylib.Raylib.Vector3 arg3, float arg4) {
        return Raylib.Vector3CubicHermite(arg0, arg1, arg2, arg3, arg4);
    }

    public static com.raylib.Raylib.Vector4 quaternionFromEuler(float arg0, float arg1, float arg2) {
        return Raylib.QuaternionFromEuler(arg0, arg1, arg2);
    }

    public static int getPhysicsBodiesCount() {
        return Raylib.GetPhysicsBodiesCount();
    }

    public static float vector2LengthSqr(com.raylib.Raylib.Vector2 arg0) {
        return Raylib.Vector2LengthSqr(arg0);
    }

    public static com.raylib.Raylib.Vector2 vector2Refract(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1, float arg2) {
        return Raylib.Vector2Refract(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Vector3 vector3Lerp(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1, float arg2) {
        return Raylib.Vector3Lerp(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Vector3 vector3Reflect(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.Vector3Reflect(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 vector3Multiply(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.Vector3Multiply(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 vector3Barycenter(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1, com.raylib.Raylib.Vector3 arg2, com.raylib.Raylib.Vector3 arg3) {
        return Raylib.Vector3Barycenter(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.Vector2 vector2AddValue(com.raylib.Raylib.Vector2 arg0, float arg1) {
        return Raylib.Vector2AddValue(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 vector3Invert(com.raylib.Raylib.Vector3 arg0) {
        return Raylib.Vector3Invert(arg0);
    }

    public static com.raylib.Raylib.Vector2 vector2MoveTowards(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1, float arg2) {
        return Raylib.Vector2MoveTowards(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Vector2 vector2Transform(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Matrix arg1) {
        return Raylib.Vector2Transform(arg0, arg1);
    }

    public static float vector2DotProduct(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.Vector2DotProduct(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 vector3Scale(com.raylib.Raylib.Vector3 arg0, float arg1) {
        return Raylib.Vector3Scale(arg0, arg1);
    }

    public static float vector2Distance(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.Vector2Distance(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 vector3Negate(com.raylib.Raylib.Vector3 arg0) {
        return Raylib.Vector3Negate(arg0);
    }

    public static com.raylib.Raylib.Vector3 vector3Normalize(com.raylib.Raylib.Vector3 arg0) {
        return Raylib.Vector3Normalize(arg0);
    }

    public static com.raylib.Raylib.Vector3 vector3Transform(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Matrix arg1) {
        return Raylib.Vector3Transform(arg0, arg1);
    }

    public static float vector3Distance(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.Vector3Distance(arg0, arg1);
    }

    public static com.raylib.Raylib.float3 vector3ToFloatV(com.raylib.Raylib.Vector3 arg0) {
        return Raylib.Vector3ToFloatV(arg0);
    }

    public static com.raylib.Raylib.Vector2 vector2Normalize(com.raylib.Raylib.Vector2 arg0) {
        return Raylib.Vector2Normalize(arg0);
    }

    public static com.raylib.Raylib.Vector3 vector3Clamp(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1, com.raylib.Raylib.Vector3 arg2) {
        return Raylib.Vector3Clamp(arg0, arg1, arg2);
    }

    public static float vector3LengthSqr(com.raylib.Raylib.Vector3 arg0) {
        return Raylib.Vector3LengthSqr(arg0);
    }

    public static com.raylib.Raylib.Vector3 vector3ClampValue(com.raylib.Raylib.Vector3 arg0, float arg1, float arg2) {
        return Raylib.Vector3ClampValue(arg0, arg1, arg2);
    }

    public static int vector3Equals(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.Vector3Equals(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 vector3Refract(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1, float arg2) {
        return Raylib.Vector3Refract(arg0, arg1, arg2);
    }

    public static void rlBindImageTexture(int arg0, int arg1, int arg2, boolean arg3) {
        Raylib.rlBindImageTexture(arg0, arg1, arg2, arg3);
    }

    public static float vector3Angle(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.Vector3Angle(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 vector2ClampValue(com.raylib.Raylib.Vector2 arg0, float arg1, float arg2) {
        return Raylib.Vector2ClampValue(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Vector3 vector3Divide(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.Vector3Divide(arg0, arg1);
    }

    public static void rlLoadDrawCube() {
        Raylib.rlLoadDrawCube();
    }

    public static com.raylib.Raylib.Vector3 vector3Unproject(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Matrix arg1, com.raylib.Raylib.Matrix arg2) {
        return Raylib.Vector3Unproject(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Vector4 vector4Zero() {
        return Raylib.Vector4Zero();
    }

    public static com.raylib.Raylib.Vector4 vector4AddValue(com.raylib.Raylib.Vector4 arg0, float arg1) {
        return Raylib.Vector4AddValue(arg0, arg1);
    }

    public static int vector2Equals(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.Vector2Equals(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 vector4Subtract(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.Vector4Subtract(arg0, arg1);
    }

    public static float vector4Length(com.raylib.Raylib.Vector4 arg0) {
        return Raylib.Vector4Length(arg0);
    }

    public static int floatEquals(float arg0, float arg1) {
        return Raylib.FloatEquals(arg0, arg1);
    }

    public static void rlReadShaderBuffer(int arg0, org.bytedeco.javacpp.Pointer arg1, int arg2, int arg3) {
        Raylib.rlReadShaderBuffer(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.Vector2 vector2Scale(com.raylib.Raylib.Vector2 arg0, float arg1) {
        return Raylib.Vector2Scale(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 vector2Multiply(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.Vector2Multiply(arg0, arg1);
    }

    public static float vector2DistanceSqr(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.Vector2DistanceSqr(arg0, arg1);
    }

    public static void rlLoadDrawQuad() {
        Raylib.rlLoadDrawQuad();
    }

    public static com.raylib.Raylib.Vector2 vector2Zero() {
        return Raylib.Vector2Zero();
    }

    public static float vector2LineAngle(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.Vector2LineAngle(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 vector2Divide(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.Vector2Divide(arg0, arg1);
    }

    public static float vector2Angle(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.Vector2Angle(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 vector2Lerp(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1, float arg2) {
        return Raylib.Vector2Lerp(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Vector2 vector2Reflect(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.Vector2Reflect(arg0, arg1);
    }

    public static float vector3Length(com.raylib.Raylib.Vector3 arg0) {
        return Raylib.Vector3Length(arg0);
    }

    public static float vector3DotProduct(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.Vector3DotProduct(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 vector2Subtract(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.Vector2Subtract(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 vector3Project(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.Vector3Project(arg0, arg1);
    }

    public static float vector3DistanceSqr(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.Vector3DistanceSqr(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 vector3Subtract(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.Vector3Subtract(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 vector2Invert(com.raylib.Raylib.Vector2 arg0) {
        return Raylib.Vector2Invert(arg0);
    }

    public static com.raylib.Raylib.Vector2 vector2Clamp(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1, com.raylib.Raylib.Vector2 arg2) {
        return Raylib.Vector2Clamp(arg0, arg1, arg2);
    }

    public static float vector2Length(com.raylib.Raylib.Vector2 arg0) {
        return Raylib.Vector2Length(arg0);
    }

    public static com.raylib.Raylib.Vector2 vector2Rotate(com.raylib.Raylib.Vector2 arg0, float arg1) {
        return Raylib.Vector2Rotate(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 vector2Negate(com.raylib.Raylib.Vector2 arg0) {
        return Raylib.Vector2Negate(arg0);
    }

    public static com.raylib.Raylib.Vector3 vector3Zero() {
        return Raylib.Vector3Zero();
    }

    public static com.raylib.Raylib.Vector3 vector3AddValue(com.raylib.Raylib.Vector3 arg0, float arg1) {
        return Raylib.Vector3AddValue(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 vector3Reject(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.Vector3Reject(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 vector3MoveTowards(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1, float arg2) {
        return Raylib.Vector3MoveTowards(arg0, arg1, arg2);
    }

    public static void rlCopyShaderBuffer(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Raylib.rlCopyShaderBuffer(arg0, arg1, arg2, arg3, arg4);
    }

    public static com.raylib.Raylib.Vector4 quaternionDivide(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.QuaternionDivide(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 multiplyPut(com.raylib.Raylib.Vector4 arg0, float arg1) {
        return Raylib.multiplyPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 multiplyPut(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Matrix arg1) {
        return Raylib.multiplyPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 multiplyPut(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.multiplyPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 multiplyPut(com.raylib.Raylib.Vector3 arg0, float arg1) {
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

    public static com.raylib.Raylib.Vector4 multiplyPut(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.multiplyPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Matrix matrixInvert(com.raylib.Raylib.Matrix arg0) {
        return Raylib.MatrixInvert(arg0);
    }

    public static com.raylib.Raylib.Matrix matrixPerspective(double arg0, double arg1, double arg2, double arg3) {
        return Raylib.MatrixPerspective(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.float16 matrixToFloatV(com.raylib.Raylib.Matrix arg0) {
        return Raylib.MatrixToFloatV(arg0);
    }

    public static com.raylib.Raylib.Vector2 vector2UnitX() {
        return Raylib.Vector2UnitX();
    }

    public static com.raylib.Raylib.Matrix matrixRotateZYX(com.raylib.Raylib.Vector3 arg0) {
        return Raylib.MatrixRotateZYX(arg0);
    }

    public static com.raylib.Raylib.Vector4 vector4Lerp(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1, float arg2) {
        return Raylib.Vector4Lerp(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Vector4 vector4Normalize(com.raylib.Raylib.Vector4 arg0) {
        return Raylib.Vector4Normalize(arg0);
    }

    public static com.raylib.Raylib.Vector4 subtractPut(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.subtractPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 subtractPut(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Matrix arg1) {
        return Raylib.subtractPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Matrix subtractPut(com.raylib.Raylib.Matrix arg0, com.raylib.Raylib.Matrix arg1) {
        return Raylib.subtractPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 subtractPut(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Matrix arg1) {
        return Raylib.subtractPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 subtractPut(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.subtractPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 subtractPut(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.subtractPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 subtractPut(com.raylib.Raylib.Vector4 arg0, float arg1) {
        return Raylib.subtractPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Matrix matrixScale(float arg0, float arg1, float arg2) {
        return Raylib.MatrixScale(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Vector4 quaternionIdentity() {
        return Raylib.QuaternionIdentity();
    }

    public static float matrixDeterminant(com.raylib.Raylib.Matrix arg0) {
        return Raylib.MatrixDeterminant(arg0);
    }

    public static com.raylib.Raylib.Matrix matrixTranslate(float arg0, float arg1, float arg2) {
        return Raylib.MatrixTranslate(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Matrix matrixOrtho(double arg0, double arg1, double arg2, double arg3, double arg4, double arg5) {
        return Raylib.MatrixOrtho(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static com.raylib.Raylib.Matrix matrixSubtract(com.raylib.Raylib.Matrix arg0, com.raylib.Raylib.Matrix arg1) {
        return Raylib.MatrixSubtract(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 quaternionAddValue(com.raylib.Raylib.Vector4 arg0, float arg1) {
        return Raylib.QuaternionAddValue(arg0, arg1);
    }

    public static float quaternionLength(com.raylib.Raylib.Vector4 arg0) {
        return Raylib.QuaternionLength(arg0);
    }

    public static com.raylib.Raylib.Vector4 quaternionMultiply(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.QuaternionMultiply(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 quaternionLerp(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1, float arg2) {
        return Raylib.QuaternionLerp(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Vector4 quaternionNlerp(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1, float arg2) {
        return Raylib.QuaternionNlerp(arg0, arg1, arg2);
    }

    public static float vector4Distance(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.Vector4Distance(arg0, arg1);
    }

    public static float vector4LengthSqr(com.raylib.Raylib.Vector4 arg0) {
        return Raylib.Vector4LengthSqr(arg0);
    }

    public static com.raylib.Raylib.Matrix matrixFrustum(double arg0, double arg1, double arg2, double arg3, double arg4, double arg5) {
        return Raylib.MatrixFrustum(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static com.raylib.Raylib.Vector3 quaternionToEuler(com.raylib.Raylib.Vector4 arg0) {
        return Raylib.QuaternionToEuler(arg0);
    }

    public static com.raylib.Raylib.Matrix matrixRotateXYZ(com.raylib.Raylib.Vector3 arg0) {
        return Raylib.MatrixRotateXYZ(arg0);
    }

    public static com.raylib.Raylib.Vector4 vector4Negate(com.raylib.Raylib.Vector4 arg0) {
        return Raylib.Vector4Negate(arg0);
    }

    public static float vector4DistanceSqr(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.Vector4DistanceSqr(arg0, arg1);
    }

    public static void matrixDecompose(com.raylib.Raylib.Matrix arg0, com.raylib.Raylib.Vector3 arg1, com.raylib.Raylib.Vector4 arg2, com.raylib.Raylib.Vector3 arg3) {
        Raylib.MatrixDecompose(arg0, arg1, arg2, arg3);
    }

    public static com.raylib.Raylib.Matrix matrixLookAt(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1, com.raylib.Raylib.Vector3 arg2) {
        return Raylib.MatrixLookAt(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Vector4 vector4Divide(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.Vector4Divide(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 vector4Invert(com.raylib.Raylib.Vector4 arg0) {
        return Raylib.Vector4Invert(arg0);
    }

    public static com.raylib.Raylib.Matrix matrixRotateX(float arg0) {
        return Raylib.MatrixRotateX(arg0);
    }

    public static com.raylib.Raylib.Vector4 quaternionSlerp(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1, float arg2) {
        return Raylib.QuaternionSlerp(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Vector3 vector3Zeros() {
        return Raylib.Vector3Zeros();
    }

    public static float matrixTrace(com.raylib.Raylib.Matrix arg0) {
        return Raylib.MatrixTrace(arg0);
    }

    public static com.raylib.Raylib.Matrix matrixTranspose(com.raylib.Raylib.Matrix arg0) {
        return Raylib.MatrixTranspose(arg0);
    }

    public static com.raylib.Raylib.Matrix matrixRotateZ(float arg0) {
        return Raylib.MatrixRotateZ(arg0);
    }

    public static com.raylib.Raylib.Vector4 vector4Scale(com.raylib.Raylib.Vector4 arg0, float arg1) {
        return Raylib.Vector4Scale(arg0, arg1);
    }

    public static com.raylib.Raylib.Matrix quaternionToMatrix(com.raylib.Raylib.Vector4 arg0) {
        return Raylib.QuaternionToMatrix(arg0);
    }

    public static int quaternionEquals(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.QuaternionEquals(arg0, arg1);
    }

    public static float vector4DotProduct(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.Vector4DotProduct(arg0, arg1);
    }

    public static com.raylib.Raylib.Matrix matrixMultiply(com.raylib.Raylib.Matrix arg0, com.raylib.Raylib.Matrix arg1) {
        return Raylib.MatrixMultiply(arg0, arg1);
    }

    public static com.raylib.Raylib.Matrix matrixRotate(com.raylib.Raylib.Vector3 arg0, float arg1) {
        return Raylib.MatrixRotate(arg0, arg1);
    }

    public static int vector4Equals(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.Vector4Equals(arg0, arg1);
    }

    public static com.raylib.Raylib.Matrix matrixRotateY(float arg0) {
        return Raylib.MatrixRotateY(arg0);
    }

    public static com.raylib.Raylib.Vector4 quaternionInvert(com.raylib.Raylib.Vector4 arg0) {
        return Raylib.QuaternionInvert(arg0);
    }

    public static com.raylib.Raylib.Matrix matrixIdentity() {
        return Raylib.MatrixIdentity();
    }

    public static com.raylib.Raylib.Vector4 quaternionScale(com.raylib.Raylib.Vector4 arg0, float arg1) {
        return Raylib.QuaternionScale(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 quaternionSubtract(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.QuaternionSubtract(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 vector2Zeros() {
        return Raylib.Vector2Zeros();
    }

    public static com.raylib.Raylib.Vector2 vector2Ones() {
        return Raylib.Vector2Ones();
    }

    public static com.raylib.Raylib.Vector4 vector4Multiply(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.Vector4Multiply(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 vector4MoveTowards(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1, float arg2) {
        return Raylib.Vector4MoveTowards(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Vector4 quaternionAdd(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.QuaternionAdd(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 vector2UnitY() {
        return Raylib.Vector2UnitY();
    }

    public static int guiColorPanelHSV(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, com.raylib.Raylib.Vector3 arg2) {
        return Raylib.GuiColorPanelHSV(arg0, arg1, arg2);
    }

    public static int guiColorPanelHSV(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, com.raylib.Raylib.Vector3 arg2) {
        return Raylib.GuiColorPanelHSV(arg0, arg1, arg2);
    }

    public static int guiColorBarHue(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, org.bytedeco.javacpp.FloatPointer arg2) {
        return Raylib.GuiColorBarHue(arg0, arg1, arg2);
    }

    public static int guiColorBarHue(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, float[] arg2) {
        return Raylib.GuiColorBarHue(arg0, arg1, arg2);
    }

    public static int guiColorBarHue(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, java.nio.FloatBuffer arg2) {
        return Raylib.GuiColorBarHue(arg0, arg1, arg2);
    }

    public static int guiColorBarHue(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, org.bytedeco.javacpp.FloatPointer arg2) {
        return Raylib.GuiColorBarHue(arg0, arg1, arg2);
    }

    public static int guiColorBarHue(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, java.nio.FloatBuffer arg2) {
        return Raylib.GuiColorBarHue(arg0, arg1, arg2);
    }

    public static int guiColorBarHue(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, float[] arg2) {
        return Raylib.GuiColorBarHue(arg0, arg1, arg2);
    }

    public static int guiColorPickerHSV(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, com.raylib.Raylib.Vector3 arg2) {
        return Raylib.GuiColorPickerHSV(arg0, arg1, arg2);
    }

    public static int guiColorPickerHSV(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, com.raylib.Raylib.Vector3 arg2) {
        return Raylib.GuiColorPickerHSV(arg0, arg1, arg2);
    }

    public static int guiStatusBar(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1) {
        return Raylib.GuiStatusBar(arg0, arg1);
    }

    public static int guiStatusBar(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1) {
        return Raylib.GuiStatusBar(arg0, arg1);
    }

    public static int guiDummyRec(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1) {
        return Raylib.GuiDummyRec(arg0, arg1);
    }

    public static int guiDummyRec(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1) {
        return Raylib.GuiDummyRec(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 vector4UnitY() {
        return Raylib.Vector4UnitY();
    }

    public static org.bytedeco.javacpp.IntPointer guiGetIcons() {
        return Raylib.GuiGetIcons();
    }

    public static void guiSetTooltip(org.bytedeco.javacpp.BytePointer arg0) {
        Raylib.GuiSetTooltip(arg0);
    }

    public static void guiSetTooltip(java.lang.String arg0) {
        Raylib.GuiSetTooltip(arg0);
    }

    public static int guiListView(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, java.nio.IntBuffer arg2, java.nio.IntBuffer arg3) {
        return Raylib.GuiListView(arg0, arg1, arg2, arg3);
    }

    public static int guiListView(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, int[] arg2, int[] arg3) {
        return Raylib.GuiListView(arg0, arg1, arg2, arg3);
    }

    public static int guiListView(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, java.nio.IntBuffer arg2, java.nio.IntBuffer arg3) {
        return Raylib.GuiListView(arg0, arg1, arg2, arg3);
    }

    public static int guiListView(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, org.bytedeco.javacpp.IntPointer arg2, org.bytedeco.javacpp.IntPointer arg3) {
        return Raylib.GuiListView(arg0, arg1, arg2, arg3);
    }

    public static int guiListView(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, int[] arg2, int[] arg3) {
        return Raylib.GuiListView(arg0, arg1, arg2, arg3);
    }

    public static int guiListView(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, org.bytedeco.javacpp.IntPointer arg2, org.bytedeco.javacpp.IntPointer arg3) {
        return Raylib.GuiListView(arg0, arg1, arg2, arg3);
    }

    public static void closePhysics() {
        Raylib.ClosePhysics();
    }

    public static int guiGetStyle(int arg0, int arg1) {
        return Raylib.GuiGetStyle(arg0, arg1);
    }

    public static void updatePhysics() {
        Raylib.UpdatePhysics();
    }

    public static void guiLoadStyle(org.bytedeco.javacpp.BytePointer arg0) {
        Raylib.GuiLoadStyle(arg0);
    }

    public static void guiLoadStyle(java.lang.String arg0) {
        Raylib.GuiLoadStyle(arg0);
    }

    public static org.bytedeco.javacpp.PointerPointer guiLoadIcons(org.bytedeco.javacpp.BytePointer arg0, boolean arg1) {
        return Raylib.GuiLoadIcons(arg0, arg1);
    }

    public static java.nio.ByteBuffer guiLoadIcons(java.lang.String arg0, boolean arg1) {
        return Raylib.GuiLoadIcons(arg0, arg1);
    }

    public static void destroyPhysicsBody(com.raylib.Raylib.PhysicsBody arg0) {
        Raylib.DestroyPhysicsBody(arg0);
    }

    public static void guiSetIconScale(int arg0) {
        Raylib.GuiSetIconScale(arg0);
    }

    public static int guiScrollPanel(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, com.raylib.Raylib.Rectangle arg2, com.raylib.Raylib.Vector2 arg3, com.raylib.Raylib.Rectangle arg4) {
        return Raylib.GuiScrollPanel(arg0, arg1, arg2, arg3, arg4);
    }

    public static int guiScrollPanel(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, com.raylib.Raylib.Rectangle arg2, com.raylib.Raylib.Vector2 arg3, com.raylib.Raylib.Rectangle arg4) {
        return Raylib.GuiScrollPanel(arg0, arg1, arg2, arg3, arg4);
    }

    public static int guiDropdownBox(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, org.bytedeco.javacpp.IntPointer arg2, boolean arg3) {
        return Raylib.GuiDropdownBox(arg0, arg1, arg2, arg3);
    }

    public static int guiDropdownBox(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, java.nio.IntBuffer arg2, boolean arg3) {
        return Raylib.GuiDropdownBox(arg0, arg1, arg2, arg3);
    }

    public static int guiDropdownBox(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, org.bytedeco.javacpp.IntPointer arg2, boolean arg3) {
        return Raylib.GuiDropdownBox(arg0, arg1, arg2, arg3);
    }

    public static int guiDropdownBox(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, int[] arg2, boolean arg3) {
        return Raylib.GuiDropdownBox(arg0, arg1, arg2, arg3);
    }

    public static int guiDropdownBox(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, int[] arg2, boolean arg3) {
        return Raylib.GuiDropdownBox(arg0, arg1, arg2, arg3);
    }

    public static int guiDropdownBox(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, java.nio.IntBuffer arg2, boolean arg3) {
        return Raylib.GuiDropdownBox(arg0, arg1, arg2, arg3);
    }

    public static int guiGroupBox(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1) {
        return Raylib.GuiGroupBox(arg0, arg1);
    }

    public static int guiGroupBox(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1) {
        return Raylib.GuiGroupBox(arg0, arg1);
    }

    public static int guiSliderBar(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, java.lang.String arg2, java.nio.FloatBuffer arg3, float arg4, float arg5) {
        return Raylib.GuiSliderBar(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static int guiSliderBar(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, java.lang.String arg2, org.bytedeco.javacpp.FloatPointer arg3, float arg4, float arg5) {
        return Raylib.GuiSliderBar(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static int guiSliderBar(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, org.bytedeco.javacpp.BytePointer arg2, java.nio.FloatBuffer arg3, float arg4, float arg5) {
        return Raylib.GuiSliderBar(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static int guiSliderBar(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, java.lang.String arg2, float[] arg3, float arg4, float arg5) {
        return Raylib.GuiSliderBar(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static int guiSliderBar(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, org.bytedeco.javacpp.BytePointer arg2, float[] arg3, float arg4, float arg5) {
        return Raylib.GuiSliderBar(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static int guiSliderBar(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, org.bytedeco.javacpp.BytePointer arg2, org.bytedeco.javacpp.FloatPointer arg3, float arg4, float arg5) {
        return Raylib.GuiSliderBar(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static com.raylib.Raylib.PhysicsBody getPhysicsBody(int arg0) {
        return Raylib.GetPhysicsBody(arg0);
    }

    public static int guiListViewEx(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, int arg2, org.bytedeco.javacpp.IntPointer arg3, org.bytedeco.javacpp.IntPointer arg4, org.bytedeco.javacpp.IntPointer arg5) {
        return Raylib.GuiListViewEx(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static int guiListViewEx(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.PointerPointer arg1, int arg2, org.bytedeco.javacpp.IntPointer arg3, org.bytedeco.javacpp.IntPointer arg4, org.bytedeco.javacpp.IntPointer arg5) {
        return Raylib.GuiListViewEx(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static int guiListViewEx(com.raylib.Raylib.Rectangle arg0, byte[] arg1, int arg2, int[] arg3, int[] arg4, int[] arg5) {
        return Raylib.GuiListViewEx(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static int guiListViewEx(com.raylib.Raylib.Rectangle arg0, java.nio.ByteBuffer arg1, int arg2, java.nio.IntBuffer arg3, java.nio.IntBuffer arg4, java.nio.IntBuffer arg5) {
        return Raylib.GuiListViewEx(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static int guiWindowBox(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1) {
        return Raylib.GuiWindowBox(arg0, arg1);
    }

    public static int guiWindowBox(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1) {
        return Raylib.GuiWindowBox(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 vector4UnitW() {
        return Raylib.Vector4UnitW();
    }

    public static int guiMessageBox(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, org.bytedeco.javacpp.BytePointer arg2, org.bytedeco.javacpp.BytePointer arg3) {
        return Raylib.GuiMessageBox(arg0, arg1, arg2, arg3);
    }

    public static int guiMessageBox(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) {
        return Raylib.GuiMessageBox(arg0, arg1, arg2, arg3);
    }

    public static int guiTextInputBox(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, org.bytedeco.javacpp.BytePointer arg2, org.bytedeco.javacpp.BytePointer arg3, java.nio.ByteBuffer arg4, int arg5, org.bytedeco.javacpp.BoolPointer arg6) {
        return Raylib.GuiTextInputBox(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static int guiTextInputBox(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, byte[] arg4, int arg5, boolean[] arg6) {
        return Raylib.GuiTextInputBox(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static int guiTextInputBox(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.nio.ByteBuffer arg4, int arg5, boolean[] arg6) {
        return Raylib.GuiTextInputBox(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static int guiTextInputBox(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, org.bytedeco.javacpp.BytePointer arg4, int arg5, boolean[] arg6) {
        return Raylib.GuiTextInputBox(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static int guiTextInputBox(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, org.bytedeco.javacpp.BytePointer arg2, org.bytedeco.javacpp.BytePointer arg3, byte[] arg4, int arg5, org.bytedeco.javacpp.BoolPointer arg6) {
        return Raylib.GuiTextInputBox(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static int guiTextInputBox(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, org.bytedeco.javacpp.BytePointer arg2, org.bytedeco.javacpp.BytePointer arg3, org.bytedeco.javacpp.BytePointer arg4, int arg5, org.bytedeco.javacpp.BoolPointer arg6) {
        return Raylib.GuiTextInputBox(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static void guiSetState(int arg0) {
        Raylib.GuiSetState(arg0);
    }

    public static int guiColorPicker(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, com.raylib.Raylib.Color arg2) {
        return Raylib.GuiColorPicker(arg0, arg1, arg2);
    }

    public static int guiColorPicker(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, com.raylib.Raylib.Color arg2) {
        return Raylib.GuiColorPicker(arg0, arg1, arg2);
    }

    public static void guiSetAlpha(float arg0) {
        Raylib.GuiSetAlpha(arg0);
    }

    public static int guiColorPanel(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, com.raylib.Raylib.Color arg2) {
        return Raylib.GuiColorPanel(arg0, arg1, arg2);
    }

    public static int guiColorPanel(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, com.raylib.Raylib.Color arg2) {
        return Raylib.GuiColorPanel(arg0, arg1, arg2);
    }

    public static int guiColorBarAlpha(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, org.bytedeco.javacpp.FloatPointer arg2) {
        return Raylib.GuiColorBarAlpha(arg0, arg1, arg2);
    }

    public static int guiColorBarAlpha(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, java.nio.FloatBuffer arg2) {
        return Raylib.GuiColorBarAlpha(arg0, arg1, arg2);
    }

    public static int guiColorBarAlpha(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, float[] arg2) {
        return Raylib.GuiColorBarAlpha(arg0, arg1, arg2);
    }

    public static int guiColorBarAlpha(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, org.bytedeco.javacpp.FloatPointer arg2) {
        return Raylib.GuiColorBarAlpha(arg0, arg1, arg2);
    }

    public static int guiColorBarAlpha(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, java.nio.FloatBuffer arg2) {
        return Raylib.GuiColorBarAlpha(arg0, arg1, arg2);
    }

    public static int guiColorBarAlpha(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, float[] arg2) {
        return Raylib.GuiColorBarAlpha(arg0, arg1, arg2);
    }

    public static com.raylib.Raylib.Vector4 vector4Ones() {
        return Raylib.Vector4Ones();
    }

    public static int guiCheckBox(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, org.bytedeco.javacpp.BoolPointer arg2) {
        return Raylib.GuiCheckBox(arg0, arg1, arg2);
    }

    public static int guiCheckBox(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, boolean[] arg2) {
        return Raylib.GuiCheckBox(arg0, arg1, arg2);
    }

    public static void guiEnableTooltip() {
        Raylib.GuiEnableTooltip();
    }

    public static com.raylib.Raylib.Vector3 vector3UnitY() {
        return Raylib.Vector3UnitY();
    }

    public static com.raylib.Raylib.Vector3 vector3UnitZ() {
        return Raylib.Vector3UnitZ();
    }

    public static void initPhysics() {
        Raylib.InitPhysics();
    }

    public static com.raylib.Raylib.Vector4 quaternionOnes() {
        return Raylib.QuaternionOnes();
    }

    public static com.raylib.Raylib.Vector4 quaternionZeros() {
        return Raylib.QuaternionZeros();
    }

    public static void setPhysicsTimeStep(double arg0) {
        Raylib.SetPhysicsTimeStep(arg0);
    }

    public static void physicsAddTorque(com.raylib.Raylib.PhysicsBody arg0, float arg1) {
        Raylib.PhysicsAddTorque(arg0, arg1);
    }

    public static int guiGetState() {
        return Raylib.GuiGetState();
    }

    public static com.raylib.Raylib.Vector3 vector3Ones() {
        return Raylib.Vector3Ones();
    }

    public static com.raylib.Raylib.Vector4 vector4UnitX() {
        return Raylib.Vector4UnitX();
    }

    public static com.raylib.Raylib.Vector4 vector4Zeros() {
        return Raylib.Vector4Zeros();
    }

    public static com.raylib.Raylib.Vector4 quaternionUnitX() {
        return Raylib.QuaternionUnitX();
    }

    public static void guiDrawIcon(int arg0, int arg1, int arg2, int arg3, com.raylib.Raylib.Color arg4) {
        Raylib.GuiDrawIcon(arg0, arg1, arg2, arg3, arg4);
    }

    public static void physicsAddForce(com.raylib.Raylib.PhysicsBody arg0, com.raylib.Raylib.Vector2 arg1) {
        Raylib.PhysicsAddForce(arg0, arg1);
    }

    public static int guiToggleGroup(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, org.bytedeco.javacpp.IntPointer arg2) {
        return Raylib.GuiToggleGroup(arg0, arg1, arg2);
    }

    public static int guiToggleGroup(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, int[] arg2) {
        return Raylib.GuiToggleGroup(arg0, arg1, arg2);
    }

    public static int guiToggleGroup(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, java.nio.IntBuffer arg2) {
        return Raylib.GuiToggleGroup(arg0, arg1, arg2);
    }

    public static int guiToggleGroup(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, org.bytedeco.javacpp.IntPointer arg2) {
        return Raylib.GuiToggleGroup(arg0, arg1, arg2);
    }

    public static int guiToggleGroup(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, int[] arg2) {
        return Raylib.GuiToggleGroup(arg0, arg1, arg2);
    }

    public static int guiToggleGroup(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, java.nio.IntBuffer arg2) {
        return Raylib.GuiToggleGroup(arg0, arg1, arg2);
    }

    public static int guiLabelButton(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1) {
        return Raylib.GuiLabelButton(arg0, arg1);
    }

    public static int guiLabelButton(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1) {
        return Raylib.GuiLabelButton(arg0, arg1);
    }

    public static int guiToggleSlider(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, java.nio.IntBuffer arg2) {
        return Raylib.GuiToggleSlider(arg0, arg1, arg2);
    }

    public static int guiToggleSlider(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, int[] arg2) {
        return Raylib.GuiToggleSlider(arg0, arg1, arg2);
    }

    public static int guiToggleSlider(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, org.bytedeco.javacpp.IntPointer arg2) {
        return Raylib.GuiToggleSlider(arg0, arg1, arg2);
    }

    public static int guiToggleSlider(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, org.bytedeco.javacpp.IntPointer arg2) {
        return Raylib.GuiToggleSlider(arg0, arg1, arg2);
    }

    public static int guiToggleSlider(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, int[] arg2) {
        return Raylib.GuiToggleSlider(arg0, arg1, arg2);
    }

    public static int guiToggleSlider(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, java.nio.IntBuffer arg2) {
        return Raylib.GuiToggleSlider(arg0, arg1, arg2);
    }

    public static void setPhysicsGravity(float arg0, float arg1) {
        Raylib.SetPhysicsGravity(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 vector3UnitX() {
        return Raylib.Vector3UnitX();
    }

    public static com.raylib.Raylib.Vector4 vector4UnitZ() {
        return Raylib.Vector4UnitZ();
    }

    public static org.bytedeco.javacpp.BytePointer guiIconText(int arg0, org.bytedeco.javacpp.BytePointer arg1) {
        return Raylib.GuiIconText(arg0, arg1);
    }

    public static java.lang.String guiIconText(int arg0, java.lang.String arg1) {
        return Raylib.GuiIconText(arg0, arg1);
    }

    public static void resetPhysics() {
        Raylib.ResetPhysics();
    }

    public static int guiComboBox(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, java.nio.IntBuffer arg2) {
        return Raylib.GuiComboBox(arg0, arg1, arg2);
    }

    public static int guiComboBox(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, int[] arg2) {
        return Raylib.GuiComboBox(arg0, arg1, arg2);
    }

    public static int guiComboBox(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, int[] arg2) {
        return Raylib.GuiComboBox(arg0, arg1, arg2);
    }

    public static int guiComboBox(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, org.bytedeco.javacpp.IntPointer arg2) {
        return Raylib.GuiComboBox(arg0, arg1, arg2);
    }

    public static int guiComboBox(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, org.bytedeco.javacpp.IntPointer arg2) {
        return Raylib.GuiComboBox(arg0, arg1, arg2);
    }

    public static int guiComboBox(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, java.nio.IntBuffer arg2) {
        return Raylib.GuiComboBox(arg0, arg1, arg2);
    }

    public static boolean guiIsLocked() {
        return Raylib.GuiIsLocked();
    }

    public static void physicsShatter(com.raylib.Raylib.PhysicsBody arg0, com.raylib.Raylib.Vector2 arg1, float arg2) {
        Raylib.PhysicsShatter(arg0, arg1, arg2);
    }

    public static void guiSetStyle(int arg0, int arg1, int arg2) {
        Raylib.GuiSetStyle(arg0, arg1, arg2);
    }

    public static void guiDisableTooltip() {
        Raylib.GuiDisableTooltip();
    }

    public static int guiValueBox(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, org.bytedeco.javacpp.IntPointer arg2, int arg3, int arg4, boolean arg5) {
        return Raylib.GuiValueBox(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static int guiValueBox(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, java.nio.IntBuffer arg2, int arg3, int arg4, boolean arg5) {
        return Raylib.GuiValueBox(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static int guiValueBox(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, java.nio.IntBuffer arg2, int arg3, int arg4, boolean arg5) {
        return Raylib.GuiValueBox(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static int guiValueBox(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, org.bytedeco.javacpp.IntPointer arg2, int arg3, int arg4, boolean arg5) {
        return Raylib.GuiValueBox(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static int guiValueBox(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, int[] arg2, int arg3, int arg4, boolean arg5) {
        return Raylib.GuiValueBox(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static int guiValueBox(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, int[] arg2, int arg3, int arg4, boolean arg5) {
        return Raylib.GuiValueBox(arg0, arg1, arg2, arg3, arg4, arg5);
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

    public static int guiValueBoxFloat(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, byte[] arg2, float[] arg3, boolean arg4) {
        return Raylib.GuiValueBoxFloat(arg0, arg1, arg2, arg3, arg4);
    }

    public static int guiValueBoxFloat(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, java.nio.ByteBuffer arg2, java.nio.FloatBuffer arg3, boolean arg4) {
        return Raylib.GuiValueBoxFloat(arg0, arg1, arg2, arg3, arg4);
    }

    public static int guiValueBoxFloat(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, org.bytedeco.javacpp.BytePointer arg2, org.bytedeco.javacpp.FloatPointer arg3, boolean arg4) {
        return Raylib.GuiValueBoxFloat(arg0, arg1, arg2, arg3, arg4);
    }

    public static int guiProgressBar(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, java.lang.String arg2, org.bytedeco.javacpp.FloatPointer arg3, float arg4, float arg5) {
        return Raylib.GuiProgressBar(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static int guiProgressBar(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, java.lang.String arg2, float[] arg3, float arg4, float arg5) {
        return Raylib.GuiProgressBar(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static int guiProgressBar(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, org.bytedeco.javacpp.BytePointer arg2, float[] arg3, float arg4, float arg5) {
        return Raylib.GuiProgressBar(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static int guiProgressBar(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, java.lang.String arg2, java.nio.FloatBuffer arg3, float arg4, float arg5) {
        return Raylib.GuiProgressBar(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static int guiProgressBar(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, org.bytedeco.javacpp.BytePointer arg2, org.bytedeco.javacpp.FloatPointer arg3, float arg4, float arg5) {
        return Raylib.GuiProgressBar(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static int guiProgressBar(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, org.bytedeco.javacpp.BytePointer arg2, java.nio.FloatBuffer arg3, float arg4, float arg5) {
        return Raylib.GuiProgressBar(arg0, arg1, arg2, arg3, arg4, arg5);
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
