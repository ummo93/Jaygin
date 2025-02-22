// GENERATED FILE ;

package com.raylib;

public class Jaylib {
    private final Raylib target;

    public Jaylib(Raylib target) {
        this.target = target;
    }

    public static boolean equals(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.equals(arg0, arg1);
    }

    public static boolean equals(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.equals(arg0, arg1);
    }

    public static boolean equals(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.equals(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 add(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.add(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 add(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.add(arg0, arg1);
    }

    public static com.raylib.Raylib.Matrix add(com.raylib.Raylib.Matrix arg0, com.raylib.Raylib.Matrix arg1) {
        return Raylib.add(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 add(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.add(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 add(com.raylib.Raylib.Vector4 arg0, float arg1) {
        return Raylib.add(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 multiply(com.raylib.Raylib.Vector2 arg0, float arg1) {
        return Raylib.multiply(arg0, arg1);
    }

    public static com.raylib.Raylib.Matrix multiply(com.raylib.Raylib.Matrix arg0, com.raylib.Raylib.Matrix arg1) {
        return Raylib.multiply(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 multiply(com.raylib.Raylib.Vector4 arg0, float arg1) {
        return Raylib.multiply(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 multiply(com.raylib.Raylib.Vector3 arg0, float arg1) {
        return Raylib.multiply(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 multiply(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.multiply(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 multiply(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Matrix arg1) {
        return Raylib.multiply(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 multiply(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.multiply(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 multiply(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Matrix arg1) {
        return Raylib.multiply(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 multiply(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Matrix arg1) {
        return Raylib.multiply(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 multiply(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.multiply(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 subtract(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.subtract(arg0, arg1);
    }

    public static com.raylib.Raylib.Matrix subtract(com.raylib.Raylib.Matrix arg0, com.raylib.Raylib.Matrix arg1) {
        return Raylib.subtract(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 subtract(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.subtract(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 subtract(com.raylib.Raylib.Vector4 arg0, float arg1) {
        return Raylib.subtract(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 subtract(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.subtract(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 divide(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.divide(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 divide(com.raylib.Raylib.Vector4 arg0, float arg1) {
        return Raylib.divide(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 divide(com.raylib.Raylib.Vector3 arg0, float arg1) {
        return Raylib.divide(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 divide(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.divide(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 divide(com.raylib.Raylib.Vector2 arg0, float arg1) {
        return Raylib.divide(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 divide(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.divide(arg0, arg1);
    }

    /**
     * Get color multiplied with another color
     */
    public static com.raylib.Raylib.Color colorTint(com.raylib.Raylib.Color color, com.raylib.Raylib.Color tint) {
        return Raylib.ColorTint(color, tint);
    }

    /**
     * Crop an image to a defined rectangle
     */
    public static void imageCrop(com.raylib.Raylib.Image image, com.raylib.Raylib.Rectangle crop) {
        Raylib.ImageCrop(image, crop);
    }

    /**
     * Draw a source image within a destination image (tint applied to source)
     */
    public static void imageDraw(com.raylib.Raylib.Image dst, com.raylib.Raylib.Image src, com.raylib.Raylib.Rectangle srcRec, com.raylib.Raylib.Rectangle dstRec, com.raylib.Raylib.Color tint) {
        Raylib.ImageDraw(dst, src, srcRec, dstRec, tint);
    }

    /**
     * Get color with alpha applied, alpha goes from 0.0f to 1.0f
     */
    public static com.raylib.Raylib.Color fade(com.raylib.Raylib.Color color, float alpha) {
        return Raylib.Fade(color, alpha);
    }

    /**
     * Get hexadecimal value for a Color (0xRRGGBBAA)
     */
    public static int colorToInt(com.raylib.Raylib.Color color) {
        return Raylib.ColorToInt(color);
    }

    /**
     * Get HSV values for a Color, hue [0..360], saturation/value [0..1]
     */
    public static com.raylib.Raylib.Vector3 colorToHSV(com.raylib.Raylib.Color color) {
        return Raylib.ColorToHSV(color);
    }

    /**
     * Unload filepaths
     */
    public static void unloadDirectoryFiles(com.raylib.Raylib.FilePathList files) {
        Raylib.UnloadDirectoryFiles(files);
    }

    /**
     * Get specified monitor physical width in millimetres
     */
    public static int getMonitorPhysicalWidth(int monitor) {
        return Raylib.GetMonitorPhysicalWidth(monitor);
    }

    /**
     * Set custom file binary data saver
     */
    public static void setSaveFileDataCallback(com.raylib.Raylib.SaveFileDataCallback callback) {
        Raylib.SetSaveFileDataCallback(callback);
    }

    /**
     * Set automation event list to record to
     */
    public static void setAutomationEventList(com.raylib.Raylib.AutomationEventList list) {
        Raylib.SetAutomationEventList(list);
    }

    /**
     * Check if a gamepad button is being pressed
     */
    public static boolean isGamepadButtonDown(int gamepad, int button) {
        return Raylib.IsGamepadButtonDown(gamepad, button);
    }

    /**
     * Check if a mouse button has been pressed once
     */
    public static boolean isMouseButtonPressed(int button) {
        return Raylib.IsMouseButtonPressed(button);
    }

    /**
     * Check if a mouse button has been released once
     */
    public static boolean isMouseButtonReleased(int button) {
        return Raylib.IsMouseButtonReleased(button);
    }

    /**
     * Get gesture hold time in seconds
     */
    public static float getGestureHoldDuration() {
        return Raylib.GetGestureHoldDuration();
    }

    /**
     * Get gesture drag vector
     */
    public static com.raylib.Raylib.Vector2 getGestureDragVector() {
        return Raylib.GetGestureDragVector();
    }

    /**
     * Unload VR stereo config
     */
    public static void unloadVrStereoConfig(com.raylib.Raylib.VrStereoConfig config) {
        Raylib.UnloadVrStereoConfig(config);
    }

    /**
     * Get gesture drag angle
     */
    public static float getGestureDragAngle() {
        return Raylib.GetGestureDragAngle();
    }

    /**
     * Get gesture pinch delta
     */
    public static com.raylib.Raylib.Vector2 getGesturePinchVector() {
        return Raylib.GetGesturePinchVector();
    }

    /**
     * Get texture source rectangle that is used for shapes drawing
     */
    public static com.raylib.Raylib.Rectangle getShapesTextureRectangle() {
        return Raylib.GetShapesTextureRectangle();
    }

    /**
     * Draw circle sector outline
     */
    public static void drawCircleSectorLines(com.raylib.Raylib.Vector2 center, float radius, float startAngle, float endAngle, int segments, com.raylib.Raylib.Color color) {
        Raylib.DrawCircleSectorLines(center, radius, startAngle, endAngle, segments, color);
    }

    /**
     * Get gesture pinch angle
     */
    public static float getGesturePinchAngle() {
        return Raylib.GetGesturePinchAngle();
    }

    /**
     * Get specified monitor physical height in millimetres
     */
    public static int getMonitorPhysicalHeight(int monitor) {
        return Raylib.GetMonitorPhysicalHeight(monitor);
    }

    /**
     * Toggle window state: borderless windowed, resizes window to match monitor resolution
     */
    public static void toggleBorderlessWindowed() {
        Raylib.ToggleBorderlessWindowed();
    }

    /**
     * Export automation events list as text file
     */
    public static boolean exportAutomationEventList(com.raylib.Raylib.AutomationEventList list, org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.ExportAutomationEventList(list, fileName);
    }

    /**
     * Export automation events list as text file
     */
    public static boolean exportAutomationEventList(com.raylib.Raylib.AutomationEventList list, java.lang.String fileName) {
        return Raylib.ExportAutomationEventList(list, fileName);
    }

    /**
     * Load shader from code strings and bind default locations
     */
    public static com.raylib.Raylib.Shader loadShaderFromMemory(org.bytedeco.javacpp.BytePointer vsCode, org.bytedeco.javacpp.BytePointer fsCode) {
        return Raylib.LoadShaderFromMemory(vsCode, fsCode);
    }

    /**
     * Load shader from code strings and bind default locations
     */
    public static com.raylib.Raylib.Shader loadShaderFromMemory(java.lang.String vsCode, java.lang.String fsCode) {
        return Raylib.LoadShaderFromMemory(vsCode, fsCode);
    }

    /**
     * Get shader attribute location
     */
    public static int getShaderLocationAttrib(com.raylib.Raylib.Shader shader, java.lang.String attribName) {
        return Raylib.GetShaderLocationAttrib(shader, attribName);
    }

    /**
     * Get shader attribute location
     */
    public static int getShaderLocationAttrib(com.raylib.Raylib.Shader shader, org.bytedeco.javacpp.BytePointer attribName) {
        return Raylib.GetShaderLocationAttrib(shader, attribName);
    }

    /**
     * Set shader uniform value (matrix 4x4)
     */
    public static void setShaderValueMatrix(com.raylib.Raylib.Shader shader, int locIndex, com.raylib.Raylib.Matrix mat) {
        Raylib.SetShaderValueMatrix(shader, locIndex, mat);
    }

    /**
     * Get filename string without extension (uses static string)
     */
    public static java.lang.String getFileNameWithoutExt(java.lang.String filePath) {
        return Raylib.GetFileNameWithoutExt(filePath);
    }

    /**
     * Get filename string without extension (uses static string)
     */
    public static org.bytedeco.javacpp.BytePointer getFileNameWithoutExt(org.bytedeco.javacpp.BytePointer filePath) {
        return Raylib.GetFileNameWithoutExt(filePath);
    }

    /**
     * Check if a gamepad button has been released once
     */
    public static boolean isGamepadButtonReleased(int gamepad, int button) {
        return Raylib.IsGamepadButtonReleased(gamepad, button);
    }

    /**
     * Set custom trace log
     */
    public static void setTraceLogCallback(com.raylib.Raylib.TraceLogCallback callback) {
        Raylib.SetTraceLogCallback(callback);
    }

    /**
     * Get the last gamepad button pressed
     */
    public static int getGamepadButtonPressed() {
        return Raylib.GetGamepadButtonPressed();
    }

    /**
     * Get axis movement value for a gamepad axis
     */
    public static float getGamepadAxisMovement(int gamepad, int axis) {
        return Raylib.GetGamepadAxisMovement(gamepad, axis);
    }

    /**
     * Get a ray trace from screen position (i.e mouse) in a viewport
     */
    public static com.raylib.Raylib.Ray getScreenToWorldRayEx(com.raylib.Raylib.Vector2 position, com.raylib.Raylib.Camera3D camera, int width, int height) {
        return Raylib.GetScreenToWorldRayEx(position, camera, width, height);
    }

    /**
     * Set custom file text data saver
     */
    public static void setSaveFileTextCallback(com.raylib.Raylib.SaveFileTextCallback callback) {
        Raylib.SetSaveFileTextCallback(callback);
    }

    /**
     * Disable waiting for events on EndDrawing(), automatic events polling
     */
    public static void disableEventWaiting() {
        Raylib.DisableEventWaiting();
    }

    /**
     * Set shader uniform value for texture (sampler2d)
     */
    public static void setShaderValueTexture(com.raylib.Raylib.Shader shader, int locIndex, com.raylib.Raylib.Texture texture) {
        Raylib.SetShaderValueTexture(shader, locIndex, texture);
    }

    /**
     * Set custom file binary data loader
     */
    public static void setLoadFileDataCallback(com.raylib.Raylib.LoadFileDataCallback callback) {
        Raylib.SetLoadFileDataCallback(callback);
    }

    /**
     * Get specified monitor refresh rate
     */
    public static int getMonitorRefreshRate(int monitor) {
        return Raylib.GetMonitorRefreshRate(monitor);
    }

    /**
     * Get a ray trace from screen position (i.e mouse)
     */
    public static com.raylib.Raylib.Ray getScreenToWorldRay(com.raylib.Raylib.Vector2 position, com.raylib.Raylib.Camera3D camera) {
        return Raylib.GetScreenToWorldRay(position, camera);
    }

    /**
     * Get current working directory (uses static string)
     */
    public static org.bytedeco.javacpp.BytePointer getWorkingDirectory() {
        return Raylib.GetWorkingDirectory();
    }

    /**
     * Get previous directory path for a given path (uses static string)
     */
    public static java.lang.String getPrevDirectoryPath(java.lang.String dirPath) {
        return Raylib.GetPrevDirectoryPath(dirPath);
    }

    /**
     * Get previous directory path for a given path (uses static string)
     */
    public static org.bytedeco.javacpp.BytePointer getPrevDirectoryPath(org.bytedeco.javacpp.BytePointer dirPath) {
        return Raylib.GetPrevDirectoryPath(dirPath);
    }

    /**
     * Load automation events list from file, NULL for empty list, capacity = MAX_AUTOMATION_EVENTS
     */
    public static com.raylib.Raylib.AutomationEventList loadAutomationEventList(org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.LoadAutomationEventList(fileName);
    }

    /**
     * Load automation events list from file, NULL for empty list, capacity = MAX_AUTOMATION_EVENTS
     */
    public static com.raylib.Raylib.AutomationEventList loadAutomationEventList(java.lang.String fileName) {
        return Raylib.LoadAutomationEventList(fileName);
    }

    /**
     * Unload automation events list from file
     */
    public static void unloadAutomationEventList(com.raylib.Raylib.AutomationEventList list) {
        Raylib.UnloadAutomationEventList(list);
    }

    /**
     * Play a recorded automation event
     */
    public static void playAutomationEvent(com.raylib.Raylib.AutomationEvent event) {
        Raylib.PlayAutomationEvent(event);
    }

    /**
     * Load directory filepaths with extension filtering and recursive directory scan. Use 'DIR' in the filter string to include directories in the result
     */
    public static com.raylib.Raylib.FilePathList loadDirectoryFilesEx(org.bytedeco.javacpp.BytePointer basePath, org.bytedeco.javacpp.BytePointer filter, boolean scanSubdirs) {
        return Raylib.LoadDirectoryFilesEx(basePath, filter, scanSubdirs);
    }

    /**
     * Load directory filepaths with extension filtering and recursive directory scan. Use 'DIR' in the filter string to include directories in the result
     */
    public static com.raylib.Raylib.FilePathList loadDirectoryFilesEx(java.lang.String basePath, java.lang.String filter, boolean scanSubdirs) {
        return Raylib.LoadDirectoryFilesEx(basePath, filter, scanSubdirs);
    }

    /**
     * Check if a gamepad button has been pressed once
     */
    public static boolean isGamepadButtonPressed(int gamepad, int button) {
        return Raylib.IsGamepadButtonPressed(gamepad, button);
    }

    /**
     * Unload random values sequence
     */
    public static void unloadRandomSequence(java.nio.IntBuffer sequence) {
        Raylib.UnloadRandomSequence(sequence);
    }

    /**
     * Unload random values sequence
     */
    public static void unloadRandomSequence(int[] sequence) {
        Raylib.UnloadRandomSequence(sequence);
    }

    /**
     * Unload random values sequence
     */
    public static void unloadRandomSequence(org.bytedeco.javacpp.IntPointer sequence) {
        Raylib.UnloadRandomSequence(sequence);
    }

    /**
     * Set custom file text data loader
     */
    public static void setLoadFileTextCallback(com.raylib.Raylib.LoadFileTextCallback callback) {
        Raylib.SetLoadFileTextCallback(callback);
    }

    /**
     * Get the directory of the running application (uses static string)
     */
    public static org.bytedeco.javacpp.BytePointer getApplicationDirectory() {
        return Raylib.GetApplicationDirectory();
    }

    /**
     * Get gamepad axis count for a gamepad
     */
    public static int getGamepadAxisCount(int gamepad) {
        return Raylib.GetGamepadAxisCount(gamepad);
    }

    /**
     * Set gamepad vibration for both motors (duration in seconds)
     */
    public static void setGamepadVibration(int gamepad, float leftMotor, float rightMotor, float duration) {
        Raylib.SetGamepadVibration(gamepad, leftMotor, rightMotor, duration);
    }

    /**
     * Generate image: perlin noise
     */
    public static com.raylib.Raylib.Image genImagePerlinNoise(int width, int height, int offsetX, int offsetY, float scale) {
        return Raylib.GenImagePerlinNoise(width, height, offsetX, offsetY, scale);
    }

    /**
     * Get image alpha border rectangle
     */
    public static com.raylib.Raylib.Rectangle getImageAlphaBorder(com.raylib.Raylib.Image image, float threshold) {
        return Raylib.GetImageAlphaBorder(image, threshold);
    }

    /**
     * Get (evaluate) spline point: Catmull-Rom
     */
    public static com.raylib.Raylib.Vector2 getSplinePointCatmullRom(com.raylib.Raylib.Vector2 p1, com.raylib.Raylib.Vector2 p2, com.raylib.Raylib.Vector2 p3, com.raylib.Raylib.Vector2 p4, float t) {
        return Raylib.GetSplinePointCatmullRom(p1, p2, p3, p4, t);
    }

    /**
     * Load texture from image data
     */
    public static com.raylib.Raylib.Texture loadTextureFromImage(com.raylib.Raylib.Image image) {
        return Raylib.LoadTextureFromImage(image);
    }

    /**
     * Draw a vertical-gradient-filled rectangle
     */
    public static void drawRectangleGradientV(int posX, int posY, int width, int height, com.raylib.Raylib.Color top, com.raylib.Raylib.Color bottom) {
        Raylib.DrawRectangleGradientV(posX, posY, width, height, top, bottom);
    }

    /**
     * Check if point is inside rectangle
     */
    public static boolean checkCollisionPointRec(com.raylib.Raylib.Vector2 point, com.raylib.Raylib.Rectangle rec) {
        return Raylib.CheckCollisionPointRec(point, rec);
    }

    /**
     * Check if point is within a polygon described by array of vertices
     */
    public static boolean checkCollisionPointPoly(com.raylib.Raylib.Vector2 point, com.raylib.Raylib.Vector2 points, int pointCount) {
        return Raylib.CheckCollisionPointPoly(point, points, pointCount);
    }

    /**
     * Draw circle outline within an image
     */
    public static void imageDrawCircleLines(com.raylib.Raylib.Image dst, int centerX, int centerY, int radius, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawCircleLines(dst, centerX, centerY, radius, color);
    }

    /**
     * Get previous codepoint in a UTF-8 encoded string, 0x3f('?') is returned on failure
     */
    public static int getCodepointPrevious(org.bytedeco.javacpp.BytePointer text, int[] codepointSize) {
        return Raylib.GetCodepointPrevious(text, codepointSize);
    }

    /**
     * Get previous codepoint in a UTF-8 encoded string, 0x3f('?') is returned on failure
     */
    public static int getCodepointPrevious(java.lang.String text, int[] codepointSize) {
        return Raylib.GetCodepointPrevious(text, codepointSize);
    }

    /**
     * Get previous codepoint in a UTF-8 encoded string, 0x3f('?') is returned on failure
     */
    public static int getCodepointPrevious(org.bytedeco.javacpp.BytePointer text, java.nio.IntBuffer codepointSize) {
        return Raylib.GetCodepointPrevious(text, codepointSize);
    }

    /**
     * Get previous codepoint in a UTF-8 encoded string, 0x3f('?') is returned on failure
     */
    public static int getCodepointPrevious(java.lang.String text, org.bytedeco.javacpp.IntPointer codepointSize) {
        return Raylib.GetCodepointPrevious(text, codepointSize);
    }

    /**
     * Get previous codepoint in a UTF-8 encoded string, 0x3f('?') is returned on failure
     */
    public static int getCodepointPrevious(java.lang.String text, java.nio.IntBuffer codepointSize) {
        return Raylib.GetCodepointPrevious(text, codepointSize);
    }

    /**
     * Get previous codepoint in a UTF-8 encoded string, 0x3f('?') is returned on failure
     */
    public static int getCodepointPrevious(org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.IntPointer codepointSize) {
        return Raylib.GetCodepointPrevious(text, codepointSize);
    }

    /**
     * Draw a triangle strip defined by points within an image
     */
    public static void imageDrawTriangleStrip(com.raylib.Raylib.Image dst, com.raylib.Raylib.Vector2 points, int pointCount, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawTriangleStrip(dst, points, pointCount, color);
    }

    /**
     * Draw spline: Quadratic Bezier, minimum 3 points (1 control point): [p1, c2, p3, c4...]
     */
    public static void drawSplineBezierQuadratic(com.raylib.Raylib.Vector2 points, int pointCount, float thick, com.raylib.Raylib.Color color) {
        Raylib.DrawSplineBezierQuadratic(points, pointCount, thick, color);
    }

    /**
     * Load image sequence from memory buffer
     */
    public static com.raylib.Raylib.Image loadImageAnimFromMemory(org.bytedeco.javacpp.BytePointer fileType, java.nio.ByteBuffer fileData, int dataSize, java.nio.IntBuffer frames) {
        return Raylib.LoadImageAnimFromMemory(fileType, fileData, dataSize, frames);
    }

    /**
     * Load image sequence from memory buffer
     */
    public static com.raylib.Raylib.Image loadImageAnimFromMemory(java.lang.String fileType, org.bytedeco.javacpp.BytePointer fileData, int dataSize, org.bytedeco.javacpp.IntPointer frames) {
        return Raylib.LoadImageAnimFromMemory(fileType, fileData, dataSize, frames);
    }

    /**
     * Load image sequence from memory buffer
     */
    public static com.raylib.Raylib.Image loadImageAnimFromMemory(java.lang.String fileType, java.nio.ByteBuffer fileData, int dataSize, java.nio.IntBuffer frames) {
        return Raylib.LoadImageAnimFromMemory(fileType, fileData, dataSize, frames);
    }

    /**
     * Load image sequence from memory buffer
     */
    public static com.raylib.Raylib.Image loadImageAnimFromMemory(org.bytedeco.javacpp.BytePointer fileType, org.bytedeco.javacpp.BytePointer fileData, int dataSize, org.bytedeco.javacpp.IntPointer frames) {
        return Raylib.LoadImageAnimFromMemory(fileType, fileData, dataSize, frames);
    }

    /**
     * Load image sequence from memory buffer
     */
    public static com.raylib.Raylib.Image loadImageAnimFromMemory(java.lang.String fileType, byte[] fileData, int dataSize, int[] frames) {
        return Raylib.LoadImageAnimFromMemory(fileType, fileData, dataSize, frames);
    }

    /**
     * Load image sequence from memory buffer
     */
    public static com.raylib.Raylib.Image loadImageAnimFromMemory(org.bytedeco.javacpp.BytePointer fileType, byte[] fileData, int dataSize, int[] frames) {
        return Raylib.LoadImageAnimFromMemory(fileType, fileData, dataSize, frames);
    }

    /**
     * Check if circle collides with a line created betweeen two points [p1] and [p2]
     */
    public static boolean checkCollisionCircleLine(com.raylib.Raylib.Vector2 center, float radius, com.raylib.Raylib.Vector2 p1, com.raylib.Raylib.Vector2 p2) {
        return Raylib.CheckCollisionCircleLine(center, radius, p1, p2);
    }

    /**
     * Check collision between circle and rectangle
     */
    public static boolean checkCollisionCircleRec(com.raylib.Raylib.Vector2 center, float radius, com.raylib.Raylib.Rectangle rec) {
        return Raylib.CheckCollisionCircleRec(center, radius, rec);
    }

    /**
     * Get (evaluate) spline point: Quadratic Bezier
     */
    public static com.raylib.Raylib.Vector2 getSplinePointBezierQuad(com.raylib.Raylib.Vector2 p1, com.raylib.Raylib.Vector2 c2, com.raylib.Raylib.Vector2 p3, float t) {
        return Raylib.GetSplinePointBezierQuad(p1, c2, p3, t);
    }

    /**
     * Draw rectangle lines within an image
     */
    public static void imageDrawRectangleLines(com.raylib.Raylib.Image dst, com.raylib.Raylib.Rectangle rec, int thick, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawRectangleLines(dst, rec, thick, color);
    }

    /**
     * Unload render texture from GPU memory (VRAM)
     */
    public static void unloadRenderTexture(com.raylib.Raylib.RenderTexture target) {
        Raylib.UnloadRenderTexture(target);
    }

    /**
     * Draw a cylinder wires with base at startPos and top at endPos
     */
    public static void drawCylinderWiresEx(com.raylib.Raylib.Vector3 startPos, com.raylib.Raylib.Vector3 endPos, float startRadius, float endRadius, int sides, com.raylib.Raylib.Color color) {
        Raylib.DrawCylinderWiresEx(startPos, endPos, startRadius, endRadius, sides, color);
    }

    /**
     * Draw spline: Cubic Bezier, minimum 4 points (2 control points): [p1, c2, c3, p4, c5, c6...]
     */
    public static void drawSplineBezierCubic(com.raylib.Raylib.Vector2 points, int pointCount, float thick, com.raylib.Raylib.Color color) {
        Raylib.DrawSplineBezierCubic(points, pointCount, thick, color);
    }

    /**
     * Draw spline segment: Linear, 2 points
     */
    public static void drawSplineSegmentLinear(com.raylib.Raylib.Vector2 p1, com.raylib.Raylib.Vector2 p2, float thick, com.raylib.Raylib.Color color) {
        Raylib.DrawSplineSegmentLinear(p1, p2, thick, color);
    }

    /**
     * Draw spline segment: B-Spline, 4 points
     */
    public static void drawSplineSegmentBasis(com.raylib.Raylib.Vector2 p1, com.raylib.Raylib.Vector2 p2, com.raylib.Raylib.Vector2 p3, com.raylib.Raylib.Vector2 p4, float thick, com.raylib.Raylib.Color color) {
        Raylib.DrawSplineSegmentBasis(p1, p2, p3, p4, thick, color);
    }

    /**
     * Get (evaluate) spline point: Cubic Bezier
     */
    public static com.raylib.Raylib.Vector2 getSplinePointBezierCubic(com.raylib.Raylib.Vector2 p1, com.raylib.Raylib.Vector2 c2, com.raylib.Raylib.Vector2 c3, com.raylib.Raylib.Vector2 p4, float t) {
        return Raylib.GetSplinePointBezierCubic(p1, c2, c3, p4, t);
    }

    /**
     * Load image from memory buffer, fileType refers to extension: i.e. '.png'
     */
    public static com.raylib.Raylib.Image loadImageFromMemory(org.bytedeco.javacpp.BytePointer fileType, java.nio.ByteBuffer fileData, int dataSize) {
        return Raylib.LoadImageFromMemory(fileType, fileData, dataSize);
    }

    /**
     * Load image from memory buffer, fileType refers to extension: i.e. '.png'
     */
    public static com.raylib.Raylib.Image loadImageFromMemory(org.bytedeco.javacpp.BytePointer fileType, org.bytedeco.javacpp.BytePointer fileData, int dataSize) {
        return Raylib.LoadImageFromMemory(fileType, fileData, dataSize);
    }

    /**
     * Load image from memory buffer, fileType refers to extension: i.e. '.png'
     */
    public static com.raylib.Raylib.Image loadImageFromMemory(java.lang.String fileType, java.nio.ByteBuffer fileData, int dataSize) {
        return Raylib.LoadImageFromMemory(fileType, fileData, dataSize);
    }

    /**
     * Load image from memory buffer, fileType refers to extension: i.e. '.png'
     */
    public static com.raylib.Raylib.Image loadImageFromMemory(org.bytedeco.javacpp.BytePointer fileType, byte[] fileData, int dataSize) {
        return Raylib.LoadImageFromMemory(fileType, fileData, dataSize);
    }

    /**
     * Load image from memory buffer, fileType refers to extension: i.e. '.png'
     */
    public static com.raylib.Raylib.Image loadImageFromMemory(java.lang.String fileType, org.bytedeco.javacpp.BytePointer fileData, int dataSize) {
        return Raylib.LoadImageFromMemory(fileType, fileData, dataSize);
    }

    /**
     * Load image from memory buffer, fileType refers to extension: i.e. '.png'
     */
    public static com.raylib.Raylib.Image loadImageFromMemory(java.lang.String fileType, byte[] fileData, int dataSize) {
        return Raylib.LoadImageFromMemory(fileType, fileData, dataSize);
    }

    /**
     * Generate image: radial gradient
     */
    public static com.raylib.Raylib.Image genImageGradientRadial(int width, int height, float density, com.raylib.Raylib.Color inner, com.raylib.Raylib.Color outer) {
        return Raylib.GenImageGradientRadial(width, height, density, inner, outer);
    }

    /**
     * Draw rectangle within an image (Vector version)
     */
    public static void imageDrawRectangleV(com.raylib.Raylib.Image dst, com.raylib.Raylib.Vector2 position, com.raylib.Raylib.Vector2 size, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawRectangleV(dst, position, size, color);
    }

    /**
     * Load image from screen buffer and (screenshot)
     */
    public static com.raylib.Raylib.Image loadImageFromScreen() {
        return Raylib.LoadImageFromScreen();
    }

    /**
     * Apply custom square convolution kernel to image
     */
    public static void imageKernelConvolution(com.raylib.Raylib.Image image, float[] kernel, int kernelSize) {
        Raylib.ImageKernelConvolution(image, kernel, kernelSize);
    }

    /**
     * Apply custom square convolution kernel to image
     */
    public static void imageKernelConvolution(com.raylib.Raylib.Image image, java.nio.FloatBuffer kernel, int kernelSize) {
        Raylib.ImageKernelConvolution(image, kernel, kernelSize);
    }

    /**
     * Apply custom square convolution kernel to image
     */
    public static void imageKernelConvolution(com.raylib.Raylib.Image image, org.bytedeco.javacpp.FloatPointer kernel, int kernelSize) {
        Raylib.ImageKernelConvolution(image, kernel, kernelSize);
    }

    /**
     * Generate image: linear gradient, direction in degrees [0..360], 0=Vertical gradient
     */
    public static com.raylib.Raylib.Image genImageGradientLinear(int width, int height, int direction, com.raylib.Raylib.Color start, com.raylib.Raylib.Color end) {
        return Raylib.GenImageGradientLinear(width, height, direction, start, end);
    }

    /**
     * Draw triangle outline within an image
     */
    public static void imageDrawTriangleLines(com.raylib.Raylib.Image dst, com.raylib.Raylib.Vector2 v1, com.raylib.Raylib.Vector2 v2, com.raylib.Raylib.Vector2 v3, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawTriangleLines(dst, v1, v2, v3, color);
    }

    /**
     * Check if point is inside circle
     */
    public static boolean checkCollisionPointCircle(com.raylib.Raylib.Vector2 point, com.raylib.Raylib.Vector2 center, float radius) {
        return Raylib.CheckCollisionPointCircle(point, center, radius);
    }

    /**
     * Draw a triangle fan defined by points within an image (first vertex is the center)
     */
    public static void imageDrawTriangleFan(com.raylib.Raylib.Image dst, com.raylib.Raylib.Vector2 points, int pointCount, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawTriangleFan(dst, points, pointCount, color);
    }

    /**
     * Draw a gradient-filled rectangle with custom vertex colors
     */
    public static void drawRectangleGradientEx(com.raylib.Raylib.Rectangle rec, com.raylib.Raylib.Color topLeft, com.raylib.Raylib.Color bottomLeft, com.raylib.Raylib.Color topRight, com.raylib.Raylib.Color bottomRight) {
        Raylib.DrawRectangleGradientEx(rec, topLeft, bottomLeft, topRight, bottomRight);
    }

    /**
     * Load image from GPU texture data
     */
    public static com.raylib.Raylib.Image loadImageFromTexture(com.raylib.Raylib.Texture texture) {
        return Raylib.LoadImageFromTexture(texture);
    }

    /**
     * Draw a horizontal-gradient-filled rectangle
     */
    public static void drawRectangleGradientH(int posX, int posY, int width, int height, com.raylib.Raylib.Color left, com.raylib.Raylib.Color right) {
        Raylib.DrawRectangleGradientH(posX, posY, width, height, left, right);
    }

    /**
     * Get (evaluate) spline point: B-Spline
     */
    public static com.raylib.Raylib.Vector2 getSplinePointBasis(com.raylib.Raylib.Vector2 p1, com.raylib.Raylib.Vector2 p2, com.raylib.Raylib.Vector2 p3, com.raylib.Raylib.Vector2 p4, float t) {
        return Raylib.GetSplinePointBasis(p1, p2, p3, p4, t);
    }

    /**
     * Premultiply alpha channel
     */
    public static void imageAlphaPremultiply(com.raylib.Raylib.Image image) {
        Raylib.ImageAlphaPremultiply(image);
    }

    /**
     * Draw rectangle within an image
     */
    public static void imageDrawRectangleRec(com.raylib.Raylib.Image dst, com.raylib.Raylib.Rectangle rec, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawRectangleRec(dst, rec, color);
    }

    /**
     * Get Color from normalized values [0..1]
     */
    public static com.raylib.Raylib.Color colorFromNormalized(com.raylib.Raylib.Vector4 normalized) {
        return Raylib.ColorFromNormalized(normalized);
    }

    /**
     * Draw triangle with interpolated colors within an image
     */
    public static void imageDrawTriangleEx(com.raylib.Raylib.Image dst, com.raylib.Raylib.Vector2 v1, com.raylib.Raylib.Vector2 v2, com.raylib.Raylib.Vector2 v3, com.raylib.Raylib.Color c1, com.raylib.Raylib.Color c2, com.raylib.Raylib.Color c3) {
        Raylib.ImageDrawTriangleEx(dst, v1, v2, v3, c1, c2, c3);
    }

    /**
     * Get (evaluate) spline point: Linear
     */
    public static com.raylib.Raylib.Vector2 getSplinePointLinear(com.raylib.Raylib.Vector2 startPos, com.raylib.Raylib.Vector2 endPos, float t) {
        return Raylib.GetSplinePointLinear(startPos, endPos, t);
    }

    /**
     * Draw circle outline within an image (Vector version)
     */
    public static void imageDrawCircleLinesV(com.raylib.Raylib.Image dst, com.raylib.Raylib.Vector2 center, int radius, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawCircleLinesV(dst, center, radius, color);
    }

    /**
     * Check if point belongs to line created between two points [p1] and [p2] with defined margin in pixels [threshold]
     */
    public static boolean checkCollisionPointLine(com.raylib.Raylib.Vector2 point, com.raylib.Raylib.Vector2 p1, com.raylib.Raylib.Vector2 p2, int threshold) {
        return Raylib.CheckCollisionPointLine(point, p1, p2, threshold);
    }

    /**
     * Draw rectangle lines with rounded edges
     */
    public static void drawRectangleRoundedLines(com.raylib.Raylib.Rectangle rec, float roundness, int segments, com.raylib.Raylib.Color color) {
        Raylib.DrawRectangleRoundedLines(rec, roundness, segments, color);
    }

    /**
     * Generate image: square gradient
     */
    public static com.raylib.Raylib.Image genImageGradientSquare(int width, int height, float density, com.raylib.Raylib.Color inner, com.raylib.Raylib.Color outer) {
        return Raylib.GenImageGradientSquare(width, height, density, inner, outer);
    }

    /**
     * Flip image horizontally
     */
    public static void imageFlipHorizontal(com.raylib.Raylib.Image image) {
        Raylib.ImageFlipHorizontal(image);
    }

    /**
     * Modify image color: brightness (-255 to 255)
     */
    public static void imageColorBrightness(com.raylib.Raylib.Image image, int brightness) {
        Raylib.ImageColorBrightness(image, brightness);
    }

    /**
     * Modify image color: grayscale
     */
    public static void imageColorGrayscale(com.raylib.Raylib.Image image) {
        Raylib.ImageColorGrayscale(image);
    }

    /**
     * Check collision between two circles
     */
    public static boolean checkCollisionCircles(com.raylib.Raylib.Vector2 center1, float radius1, com.raylib.Raylib.Vector2 center2, float radius2) {
        return Raylib.CheckCollisionCircles(center1, radius1, center2, radius2);
    }

    /**
     * Clear image background with given color
     */
    public static void imageClearBackground(com.raylib.Raylib.Image dst, com.raylib.Raylib.Color color) {
        Raylib.ImageClearBackground(dst, color);
    }

    /**
     * Draw a triangle strip defined by points
     */
    public static void drawTriangleStrip3D(com.raylib.Raylib.Vector3 points, int pointCount, com.raylib.Raylib.Color color) {
        Raylib.DrawTriangleStrip3D(points, pointCount, color);
    }

    /**
     * Export image to memory buffer
     */
    public static byte[] exportImageToMemory(com.raylib.Raylib.Image image, org.bytedeco.javacpp.BytePointer fileType, int[] fileSize) {
        return Raylib.ExportImageToMemory(image, fileType, fileSize);
    }

    /**
     * Export image to memory buffer
     */
    public static org.bytedeco.javacpp.BytePointer exportImageToMemory(com.raylib.Raylib.Image image, org.bytedeco.javacpp.BytePointer fileType, org.bytedeco.javacpp.IntPointer fileSize) {
        return Raylib.ExportImageToMemory(image, fileType, fileSize);
    }

    /**
     * Export image to memory buffer
     */
    public static byte[] exportImageToMemory(com.raylib.Raylib.Image image, java.lang.String fileType, int[] fileSize) {
        return Raylib.ExportImageToMemory(image, fileType, fileSize);
    }

    /**
     * Export image to memory buffer
     */
    public static java.nio.ByteBuffer exportImageToMemory(com.raylib.Raylib.Image image, org.bytedeco.javacpp.BytePointer fileType, java.nio.IntBuffer fileSize) {
        return Raylib.ExportImageToMemory(image, fileType, fileSize);
    }

    /**
     * Export image to memory buffer
     */
    public static java.nio.ByteBuffer exportImageToMemory(com.raylib.Raylib.Image image, java.lang.String fileType, java.nio.IntBuffer fileSize) {
        return Raylib.ExportImageToMemory(image, fileType, fileSize);
    }

    /**
     * Export image to memory buffer
     */
    public static org.bytedeco.javacpp.BytePointer exportImageToMemory(com.raylib.Raylib.Image image, java.lang.String fileType, org.bytedeco.javacpp.IntPointer fileSize) {
        return Raylib.ExportImageToMemory(image, fileType, fileSize);
    }

    /**
     * Check if a render texture is valid (loaded in GPU)
     */
    public static boolean isRenderTextureValid(com.raylib.Raylib.RenderTexture target) {
        return Raylib.IsRenderTextureValid(target);
    }

    /**
     * Compute model bounding box limits (considers all meshes)
     */
    public static com.raylib.Raylib.BoundingBox getModelBoundingBox(com.raylib.Raylib.Model model) {
        return Raylib.GetModelBoundingBox(model);
    }

    /**
     * Load default material (Supports: DIFFUSE, SPECULAR, NORMAL maps)
     */
    public static com.raylib.Raylib.Material loadMaterialDefault() {
        return Raylib.LoadMaterialDefault();
    }

    /**
     * Draw rectangle with rounded edges
     */
    public static void drawRectangleRounded(com.raylib.Raylib.Rectangle rec, float roundness, int segments, com.raylib.Raylib.Color color) {
        Raylib.DrawRectangleRounded(rec, roundness, segments, color);
    }

    /**
     * Draw spline: Catmull-Rom, minimum 4 points
     */
    public static void drawSplineCatmullRom(com.raylib.Raylib.Vector2 points, int pointCount, float thick, com.raylib.Raylib.Color color) {
        Raylib.DrawSplineCatmullRom(points, pointCount, thick, color);
    }

    /**
     * Draw rectangle outline with extended parameters
     */
    public static void drawRectangleLinesEx(com.raylib.Raylib.Rectangle rec, float lineThick, com.raylib.Raylib.Color color) {
        Raylib.DrawRectangleLinesEx(rec, lineThick, color);
    }

    /**
     * Check the collision between two lines defined by two points each, returns collision point by reference
     */
    public static boolean checkCollisionLines(com.raylib.Raylib.Vector2 startPos1, com.raylib.Raylib.Vector2 endPos1, com.raylib.Raylib.Vector2 startPos2, com.raylib.Raylib.Vector2 endPos2, com.raylib.Raylib.Vector2 collisionPoint) {
        return Raylib.CheckCollisionLines(startPos1, endPos1, startPos2, endPos2, collisionPoint);
    }

    /**
     * Load model animations from file
     */
    public static com.raylib.Raylib.ModelAnimation loadModelAnimations(org.bytedeco.javacpp.BytePointer fileName, org.bytedeco.javacpp.IntPointer animCount) {
        return Raylib.LoadModelAnimations(fileName, animCount);
    }

    /**
     * Load model animations from file
     */
    public static com.raylib.Raylib.ModelAnimation loadModelAnimations(java.lang.String fileName, java.nio.IntBuffer animCount) {
        return Raylib.LoadModelAnimations(fileName, animCount);
    }

    /**
     * Load model animations from file
     */
    public static com.raylib.Raylib.ModelAnimation loadModelAnimations(java.lang.String fileName, int[] animCount) {
        return Raylib.LoadModelAnimations(fileName, animCount);
    }

    /**
     * Load model animations from file
     */
    public static com.raylib.Raylib.ModelAnimation loadModelAnimations(java.lang.String fileName, org.bytedeco.javacpp.IntPointer animCount) {
        return Raylib.LoadModelAnimations(fileName, animCount);
    }

    /**
     * Load model animations from file
     */
    public static com.raylib.Raylib.ModelAnimation loadModelAnimations(org.bytedeco.javacpp.BytePointer fileName, int[] animCount) {
        return Raylib.LoadModelAnimations(fileName, animCount);
    }

    /**
     * Load model animations from file
     */
    public static com.raylib.Raylib.ModelAnimation loadModelAnimations(org.bytedeco.javacpp.BytePointer fileName, java.nio.IntBuffer animCount) {
        return Raylib.LoadModelAnimations(fileName, animCount);
    }

    /**
     * Get default framebuffer height
     */
    public static int rlGetFramebufferHeight() {
        return Raylib.rlGetFramebufferHeight();
    }

    /**
     * Update model animation mesh bone matrices (GPU skinning)
     */
    public static void updateModelAnimationBones(com.raylib.Raylib.Model model, com.raylib.Raylib.ModelAnimation anim, int frame) {
        Raylib.UpdateModelAnimationBones(model, anim, frame);
    }

    /**
     * Get default shader id
     */
    public static int rlGetShaderIdDefault() {
        return Raylib.rlGetShaderIdDefault();
    }

    /**
     * Enable texture cubemap
     */
    public static void rlEnableTextureCubemap(int id) {
        Raylib.rlEnableTextureCubemap(id);
    }

    /**
     * Get default shader locations
     */
    public static org.bytedeco.javacpp.IntPointer rlGetShaderLocsDefault() {
        return Raylib.rlGetShaderLocsDefault();
    }

    /**
     * Enable stereo rendering
     */
    public static void rlEnableStereoRender() {
        Raylib.rlEnableStereoRender();
    }

    /**
     * Unload render batch system
     */
    public static void rlUnloadRenderBatch(com.raylib.Raylib.rlRenderBatch batch) {
        Raylib.rlUnloadRenderBatch(batch);
    }

    /**
     * Disable scissor test
     */
    public static void rlDisableScissorTest() {
        Raylib.rlDisableScissorTest();
    }

    /**
     * Set the active render batch for rlgl (NULL for default internal)
     */
    public static void rlSetRenderBatchActive(com.raylib.Raylib.rlRenderBatch batch) {
        Raylib.rlSetRenderBatchActive(batch);
    }

    /**
     * Check if any audio stream buffers requires refill
     */
    public static boolean isAudioStreamProcessed(com.raylib.Raylib.AudioStream stream) {
        return Raylib.IsAudioStreamProcessed(stream);
    }

    /**
     * Detach audio stream processor from the entire audio pipeline
     */
    public static void detachAudioMixedProcessor(com.raylib.Raylib.AudioCallback processor) {
        Raylib.DetachAudioMixedProcessor(processor);
    }

    /**
     * Disable line aliasing
     */
    public static void rlDisableSmoothLines() {
        Raylib.rlDisableSmoothLines();
    }

    /**
     * Check collision between two bounding boxes
     */
    public static boolean checkCollisionBoxes(com.raylib.Raylib.BoundingBox box1, com.raylib.Raylib.BoundingBox box2) {
        return Raylib.CheckCollisionBoxes(box1, box2);
    }

    /**
     * Set cubemap parameters (filter, wrap)
     */
    public static void rlCubemapParameters(int id, int param, int value) {
        Raylib.rlCubemapParameters(id, param, value);
    }

    /**
     * Set pitch for audio stream (1.0 is base level)
     */
    public static void setAudioStreamPitch(com.raylib.Raylib.AudioStream stream, float pitch) {
        Raylib.SetAudioStreamPitch(stream, pitch);
    }

    /**
     * Detach audio stream processor from stream
     */
    public static void detachAudioStreamProcessor(com.raylib.Raylib.AudioStream stream, com.raylib.Raylib.AudioCallback processor) {
        Raylib.DetachAudioStreamProcessor(stream, processor);
    }

    /**
     * Disable texture cubemap
     */
    public static void rlDisableTextureCubemap() {
        Raylib.rlDisableTextureCubemap();
    }

    /**
     * Attach audio stream processor to the entire audio pipeline, receives the samples as 'float'
     */
    public static void attachAudioMixedProcessor(com.raylib.Raylib.AudioCallback processor) {
        Raylib.AttachAudioMixedProcessor(processor);
    }

    /**
     * Enable line aliasing
     */
    public static void rlEnableSmoothLines() {
        Raylib.rlEnableSmoothLines();
    }

    /**
     * Check if audio stream is playing
     */
    public static boolean isAudioStreamPlaying(com.raylib.Raylib.AudioStream stream) {
        return Raylib.IsAudioStreamPlaying(stream);
    }

    /**
     * Activate multiple draw color buffers
     */
    public static void rlActiveDrawBuffers(int count) {
        Raylib.rlActiveDrawBuffers(count);
    }

    /**
     * Check if stereo render is enabled
     */
    public static boolean rlIsStereoRenderEnabled() {
        return Raylib.rlIsStereoRenderEnabled();
    }

    /**
     * Disable vertex attribute index
     */
    public static void rlDisableVertexAttribute(int index) {
        Raylib.rlDisableVertexAttribute(index);
    }

    /**
     * Disable backface culling
     */
    public static void rlDisableBackfaceCulling() {
        Raylib.rlDisableBackfaceCulling();
    }

    /**
     * Set blending mode factors and equations separately (using OpenGL factors)
     */
    public static void rlSetBlendFactorsSeparate(int glSrcRGB, int glDstRGB, int glSrcAlpha, int glDstAlpha, int glEqRGB, int glEqAlpha) {
        Raylib.rlSetBlendFactorsSeparate(glSrcRGB, glDstRGB, glSrcAlpha, glDstAlpha, glEqRGB, glEqAlpha);
    }

    /**
     * Get default framebuffer width
     */
    public static int rlGetFramebufferWidth() {
        return Raylib.rlGetFramebufferWidth();
    }

    /**
     * Get default texture id
     */
    public static int rlGetTextureIdDefault() {
        return Raylib.rlGetTextureIdDefault();
    }

    /**
     * Get cull plane distance far
     */
    public static double rlGetCullDistanceFar() {
        return Raylib.rlGetCullDistanceFar();
    }

    /**
     * Set texture parameters (filter, wrap)
     */
    public static void rlTextureParameters(int id, int param, int value) {
        Raylib.rlTextureParameters(id, param, value);
    }

    /**
     * Clear used screen buffers (color and depth)
     */
    public static void rlClearScreenBuffers() {
        Raylib.rlClearScreenBuffers();
    }

    /**
     * Disable color blending
     */
    public static void rlDisableColorBlend() {
        Raylib.rlDisableColorBlend();
    }

    /**
     * Check model animation skeleton match
     */
    public static boolean isModelAnimationValid(com.raylib.Raylib.Model model, com.raylib.Raylib.ModelAnimation anim) {
        return Raylib.IsModelAnimationValid(model, anim);
    }

    /**
     * Get collision info between ray and triangle
     */
    public static com.raylib.Raylib.RayCollision getRayCollisionTriangle(com.raylib.Raylib.Ray ray, com.raylib.Raylib.Vector3 p1, com.raylib.Raylib.Vector3 p2, com.raylib.Raylib.Vector3 p3) {
        return Raylib.GetRayCollisionTriangle(ray, p1, p2, p3);
    }

    /**
     * Unload animation array data
     */
    public static void unloadModelAnimations(com.raylib.Raylib.ModelAnimation animations, int animCount) {
        Raylib.UnloadModelAnimations(animations, animCount);
    }

    /**
     * Attach audio stream processor to stream, receives the samples as 'float'
     */
    public static void attachAudioStreamProcessor(com.raylib.Raylib.AudioStream stream, com.raylib.Raylib.AudioCallback processor) {
        Raylib.AttachAudioStreamProcessor(stream, processor);
    }

    /**
     * Disable render texture (fbo), return to default framebuffer
     */
    public static void rlDisableFramebuffer() {
        Raylib.rlDisableFramebuffer();
    }

    /**
     * Enable vertex buffer (VBO)
     */
    public static void rlEnableVertexBuffer(int id) {
        Raylib.rlEnableVertexBuffer(id);
    }

    /**
     * Select and active a texture slot
     */
    public static void rlActiveTextureSlot(int slot) {
        Raylib.rlActiveTextureSlot(slot);
    }

    /**
     * Enable render texture (fbo)
     */
    public static void rlEnableFramebuffer(int id) {
        Raylib.rlEnableFramebuffer(id);
    }

    /**
     * Set material for a mesh
     */
    public static void setModelMeshMaterial(com.raylib.Raylib.Model model, int meshId, int materialId) {
        Raylib.SetModelMeshMaterial(model, meshId, materialId);
    }

    /**
     * Get collision info between ray and quad
     */
    public static com.raylib.Raylib.RayCollision getRayCollisionQuad(com.raylib.Raylib.Ray ray, com.raylib.Raylib.Vector3 p1, com.raylib.Raylib.Vector3 p2, com.raylib.Raylib.Vector3 p3, com.raylib.Raylib.Vector3 p4) {
        return Raylib.GetRayCollisionQuad(ray, p1, p2, p3, p4);
    }

    /**
     * Enable vertex array (VAO, if supported)
     */
    public static boolean rlEnableVertexArray(int vaoId) {
        return Raylib.rlEnableVertexArray(vaoId);
    }

    /**
     * Disable vertex buffer (VBO)
     */
    public static void rlDisableVertexBuffer() {
        Raylib.rlDisableVertexBuffer();
    }

    /**
     * Get collision info between ray and mesh
     */
    public static com.raylib.Raylib.RayCollision getRayCollisionMesh(com.raylib.Raylib.Ray ray, com.raylib.Raylib.Mesh mesh, com.raylib.Raylib.Matrix transform) {
        return Raylib.GetRayCollisionMesh(ray, mesh, transform);
    }

    /**
     * Set volume for audio stream (1.0 is max level)
     */
    public static void setAudioStreamVolume(com.raylib.Raylib.AudioStream stream, float volume) {
        Raylib.SetAudioStreamVolume(stream, volume);
    }

    /**
     * Load music stream from data
     */
    public static com.raylib.Raylib.Music loadMusicStreamFromMemory(org.bytedeco.javacpp.BytePointer fileType, byte[] data, int dataSize) {
        return Raylib.LoadMusicStreamFromMemory(fileType, data, dataSize);
    }

    /**
     * Load music stream from data
     */
    public static com.raylib.Raylib.Music loadMusicStreamFromMemory(org.bytedeco.javacpp.BytePointer fileType, java.nio.ByteBuffer data, int dataSize) {
        return Raylib.LoadMusicStreamFromMemory(fileType, data, dataSize);
    }

    /**
     * Load music stream from data
     */
    public static com.raylib.Raylib.Music loadMusicStreamFromMemory(java.lang.String fileType, java.nio.ByteBuffer data, int dataSize) {
        return Raylib.LoadMusicStreamFromMemory(fileType, data, dataSize);
    }

    /**
     * Load music stream from data
     */
    public static com.raylib.Raylib.Music loadMusicStreamFromMemory(org.bytedeco.javacpp.BytePointer fileType, org.bytedeco.javacpp.BytePointer data, int dataSize) {
        return Raylib.LoadMusicStreamFromMemory(fileType, data, dataSize);
    }

    /**
     * Load music stream from data
     */
    public static com.raylib.Raylib.Music loadMusicStreamFromMemory(java.lang.String fileType, org.bytedeco.javacpp.BytePointer data, int dataSize) {
        return Raylib.LoadMusicStreamFromMemory(fileType, data, dataSize);
    }

    /**
     * Load music stream from data
     */
    public static com.raylib.Raylib.Music loadMusicStreamFromMemory(java.lang.String fileType, byte[] data, int dataSize) {
        return Raylib.LoadMusicStreamFromMemory(fileType, data, dataSize);
    }

    /**
     * Get cull plane distance near
     */
    public static double rlGetCullDistanceNear() {
        return Raylib.rlGetCullDistanceNear();
    }

    /**
     * Update model animation pose (CPU)
     */
    public static void updateModelAnimation(com.raylib.Raylib.Model model, com.raylib.Raylib.ModelAnimation anim, int frame) {
        Raylib.UpdateModelAnimation(model, anim, frame);
    }

    /**
     * Unload animation data
     */
    public static void unloadModelAnimation(com.raylib.Raylib.ModelAnimation anim) {
        Raylib.UnloadModelAnimation(anim);
    }

    /**
     * Enable vertex attribute index
     */
    public static void rlEnableVertexAttribute(int index) {
        Raylib.rlEnableVertexAttribute(index);
    }

    /**
     * Get the currently active render texture (fbo), 0 for default framebuffer
     */
    public static int rlGetActiveFramebuffer() {
        return Raylib.rlGetActiveFramebuffer();
    }

    /**
     * Enable backface culling
     */
    public static void rlEnableBackfaceCulling() {
        Raylib.rlEnableBackfaceCulling();
    }

    /**
     * Get collision info between ray and sphere
     */
    public static com.raylib.Raylib.RayCollision getRayCollisionSphere(com.raylib.Raylib.Ray ray, com.raylib.Raylib.Vector3 center, float radius) {
        return Raylib.GetRayCollisionSphere(ray, center, radius);
    }

    /**
     * Check collision between two spheres
     */
    public static boolean checkCollisionSpheres(com.raylib.Raylib.Vector3 center1, float radius1, com.raylib.Raylib.Vector3 center2, float radius2) {
        return Raylib.CheckCollisionSpheres(center1, radius1, center2, radius2);
    }

    /**
     * Check if music is playing
     */
    public static boolean isMusicStreamPlaying(com.raylib.Raylib.Music music) {
        return Raylib.IsMusicStreamPlaying(music);
    }

    /**
     * Check collision between box and sphere
     */
    public static boolean checkCollisionBoxSphere(com.raylib.Raylib.BoundingBox box, com.raylib.Raylib.Vector3 center, float radius) {
        return Raylib.CheckCollisionBoxSphere(box, center, radius);
    }

    /**
     * Audio thread callback to request new data
     */
    public static void setAudioStreamCallback(com.raylib.Raylib.AudioStream stream, com.raylib.Raylib.AudioCallback callback) {
        Raylib.SetAudioStreamCallback(stream, callback);
    }

    /**
     * Enable scissor test
     */
    public static void rlEnableScissorTest() {
        Raylib.rlEnableScissorTest();
    }

    /**
     * Disable stereo rendering
     */
    public static void rlDisableStereoRender() {
        Raylib.rlDisableStereoRender();
    }

    /**
     * Disable vertex array (VAO, if supported)
     */
    public static void rlDisableVertexArray() {
        Raylib.rlDisableVertexArray();
    }

    /**
     * Set current framebuffer width
     */
    public static void rlSetFramebufferWidth(int width) {
        Raylib.rlSetFramebufferWidth(width);
    }

    /**
     * Set current framebuffer height
     */
    public static void rlSetFramebufferHeight(int height) {
        Raylib.rlSetFramebufferHeight(height);
    }

    public static com.raylib.Raylib.Vector3 vector3RotateByQuaternion(com.raylib.Raylib.Vector3 v, com.raylib.Raylib.Vector4 q) {
        return Raylib.Vector3RotateByQuaternion(v, q);
    }

    /**
     * Get name string for pixel format
     */
    public static org.bytedeco.javacpp.BytePointer rlGetPixelFormatName(int format) {
        return Raylib.rlGetPixelFormatName(format);
    }

    public static com.raylib.Raylib.PhysicsBody createPhysicsBodyRectangle(com.raylib.Raylib.Vector2 arg0, float arg1, float arg2, float arg3) {
        return Raylib.CreatePhysicsBodyRectangle(arg0, arg1, arg2, arg3);
    }

    public static int getPhysicsBodiesCount() {
        return Raylib.GetPhysicsBodiesCount();
    }

    /**
     * Set a custom modelview matrix (replaces internal modelview matrix)
     */
    public static void rlSetMatrixModelview(com.raylib.Raylib.Matrix view) {
        Raylib.rlSetMatrixModelview(view);
    }

    /**
     * Draw vertex array elements
     */
    public static void rlDrawVertexArrayElements(int offset, int count, org.bytedeco.javacpp.Pointer buffer) {
        Raylib.rlDrawVertexArrayElements(offset, count, buffer);
    }

    /**
     * Read texture pixel data
     */
    public static org.bytedeco.javacpp.Pointer rlReadTexturePixels(int id, int width, int height, int format) {
        return Raylib.rlReadTexturePixels(id, width, height, format);
    }

    /**
     * Unload shader storage buffer object (SSBO)
     */
    public static void rlUnloadShaderBuffer(int ssboId) {
        Raylib.rlUnloadShaderBuffer(ssboId);
    }

    public static com.raylib.Raylib.Vector2 vector2SubtractValue(com.raylib.Raylib.Vector2 v, float sub) {
        return Raylib.Vector2SubtractValue(v, sub);
    }

    /**
     * Get shader location attribute
     */
    public static int rlGetLocationAttrib(int shaderId, java.lang.String attribName) {
        return Raylib.rlGetLocationAttrib(shaderId, attribName);
    }

    /**
     * Get shader location attribute
     */
    public static int rlGetLocationAttrib(int shaderId, org.bytedeco.javacpp.BytePointer attribName) {
        return Raylib.rlGetLocationAttrib(shaderId, attribName);
    }

    public static com.raylib.Raylib.Vector4 quaternionFromMatrix(com.raylib.Raylib.Matrix mat) {
        return Raylib.QuaternionFromMatrix(mat);
    }

    public static int getPhysicsShapeType(int arg0) {
        return Raylib.GetPhysicsShapeType(arg0);
    }

    public static com.raylib.Raylib.Vector2 getPhysicsShapeVertex(com.raylib.Raylib.PhysicsBody arg0, int arg1) {
        return Raylib.GetPhysicsShapeVertex(arg0, arg1);
    }

    /**
     * Generate mipmap data for selected texture
     */
    public static void rlGenTextureMipmaps(int id, int width, int height, int format, java.nio.IntBuffer mipmaps) {
        Raylib.rlGenTextureMipmaps(id, width, height, format, mipmaps);
    }

    /**
     * Generate mipmap data for selected texture
     */
    public static void rlGenTextureMipmaps(int id, int width, int height, int format, org.bytedeco.javacpp.IntPointer mipmaps) {
        Raylib.rlGenTextureMipmaps(id, width, height, format, mipmaps);
    }

    /**
     * Generate mipmap data for selected texture
     */
    public static void rlGenTextureMipmaps(int id, int width, int height, int format, int[] mipmaps) {
        Raylib.rlGenTextureMipmaps(id, width, height, format, mipmaps);
    }

    public static com.raylib.Raylib.Vector4 quaternionNormalize(com.raylib.Raylib.Vector4 q) {
        return Raylib.QuaternionNormalize(q);
    }

    /**
     * Load style default over global style
     */
    public static void guiLoadStyleDefault() {
        Raylib.GuiLoadStyleDefault();
    }

    /**
     * Verify framebuffer is complete
     */
    public static boolean rlFramebufferComplete(int id) {
        return Raylib.rlFramebufferComplete(id);
    }

    public static com.raylib.Raylib.Vector3 vector3CubicHermite(com.raylib.Raylib.Vector3 v1, com.raylib.Raylib.Vector3 tangent1, com.raylib.Raylib.Vector3 v2, com.raylib.Raylib.Vector3 tangent2, float amount) {
        return Raylib.Vector3CubicHermite(v1, tangent1, v2, tangent2, amount);
    }

    /**
     * Get internal accumulated transform matrix
     */
    public static com.raylib.Raylib.Matrix rlGetMatrixTransform() {
        return Raylib.rlGetMatrixTransform();
    }

    public static com.raylib.Raylib.Vector3 vector3SubtractValue(com.raylib.Raylib.Vector3 v, float sub) {
        return Raylib.Vector3SubtractValue(v, sub);
    }

    public static com.raylib.Raylib.Vector3 vector3Perpendicular(com.raylib.Raylib.Vector3 v) {
        return Raylib.Vector3Perpendicular(v);
    }

    public static com.raylib.Raylib.Vector4 quaternionTransform(com.raylib.Raylib.Vector4 q, com.raylib.Raylib.Matrix mat) {
        return Raylib.QuaternionTransform(q, mat);
    }

    /**
     * Update SSBO buffer data
     */
    public static void rlUpdateShaderBuffer(int id, org.bytedeco.javacpp.Pointer data, int dataSize, int offset) {
        Raylib.rlUpdateShaderBuffer(id, data, dataSize, offset);
    }

    /**
     * Load vertex buffer elements object
     */
    public static int rlLoadVertexBufferElement(org.bytedeco.javacpp.Pointer buffer, int size, boolean dynamic) {
        return Raylib.rlLoadVertexBufferElement(buffer, size, dynamic);
    }

    /**
     * Attach texture/renderbuffer to a framebuffer
     */
    public static void rlFramebufferAttach(int fboId, int texId, int attachType, int texType, int mipLevel) {
        Raylib.rlFramebufferAttach(fboId, texId, attachType, texType, mipLevel);
    }

    /**
     * Unload vertex array (vao)
     */
    public static void rlUnloadVertexArray(int vaoId) {
        Raylib.rlUnloadVertexArray(vaoId);
    }

    /**
     * Get shader location uniform
     */
    public static int rlGetLocationUniform(int shaderId, java.lang.String uniformName) {
        return Raylib.rlGetLocationUniform(shaderId, uniformName);
    }

    /**
     * Get shader location uniform
     */
    public static int rlGetLocationUniform(int shaderId, org.bytedeco.javacpp.BytePointer uniformName) {
        return Raylib.rlGetLocationUniform(shaderId, uniformName);
    }

    public static com.raylib.Raylib.Vector4 quaternionFromEuler(float pitch, float yaw, float roll) {
        return Raylib.QuaternionFromEuler(pitch, yaw, roll);
    }

    /**
     * Draw vertex array (currently active vao) with instancing
     */
    public static void rlDrawVertexArrayInstanced(int offset, int count, int instances) {
        Raylib.rlDrawVertexArrayInstanced(offset, count, instances);
    }

    /**
     * Update and draw internal render batch
     */
    public static void rlDrawRenderBatchActive() {
        Raylib.rlDrawRenderBatchActive();
    }

    /**
     * Get internal projection matrix
     */
    public static com.raylib.Raylib.Matrix rlGetMatrixProjection() {
        return Raylib.rlGetMatrixProjection();
    }

    public static com.raylib.Raylib.PhysicsBody createPhysicsBodyCircle(com.raylib.Raylib.Vector2 arg0, float arg1, float arg2) {
        return Raylib.CreatePhysicsBodyCircle(arg0, arg1, arg2);
    }

    /**
     * Delete framebuffer from GPU
     */
    public static void rlUnloadFramebuffer(int id) {
        Raylib.rlUnloadFramebuffer(id);
    }

    /**
     * Set a custom projection matrix (replaces internal projection matrix)
     */
    public static void rlSetMatrixProjection(com.raylib.Raylib.Matrix proj) {
        Raylib.rlSetMatrixProjection(proj);
    }

    /**
     * Load compute shader program
     */
    public static int rlLoadComputeShaderProgram(int shaderId) {
        return Raylib.rlLoadComputeShaderProgram(shaderId);
    }

    /**
     * Load custom shader program
     */
    public static int rlLoadShaderProgram(int vShaderId, int fShaderId) {
        return Raylib.rlLoadShaderProgram(vShaderId, fShaderId);
    }

    public static com.raylib.Raylib.Vector4 quaternionSubtractValue(com.raylib.Raylib.Vector4 q, float sub) {
        return Raylib.QuaternionSubtractValue(q, sub);
    }

    public static com.raylib.Raylib.PhysicsBody createPhysicsBodyPolygon(com.raylib.Raylib.Vector2 arg0, float arg1, int arg2, float arg3) {
        return Raylib.CreatePhysicsBodyPolygon(arg0, arg1, arg2, arg3);
    }

    public static void quaternionToAxisAngle(com.raylib.Raylib.Vector4 q, com.raylib.Raylib.Vector3 outAxis, java.nio.FloatBuffer outAngle) {
        Raylib.QuaternionToAxisAngle(q, outAxis, outAngle);
    }

    public static void quaternionToAxisAngle(com.raylib.Raylib.Vector4 q, com.raylib.Raylib.Vector3 outAxis, org.bytedeco.javacpp.FloatPointer outAngle) {
        Raylib.QuaternionToAxisAngle(q, outAxis, outAngle);
    }

    public static void quaternionToAxisAngle(com.raylib.Raylib.Vector4 q, com.raylib.Raylib.Vector3 outAxis, float[] outAngle) {
        Raylib.QuaternionToAxisAngle(q, outAxis, outAngle);
    }

    /**
     * Load texture cubemap data
     */
    public static int rlLoadTextureCubemap(org.bytedeco.javacpp.Pointer data, int size, int format, int mipmapCount) {
        return Raylib.rlLoadTextureCubemap(data, size, format, mipmapCount);
    }

    /**
     * Check internal buffer overflow for a given number of vertex
     */
    public static boolean rlCheckRenderBatchLimit(int vCount) {
        return Raylib.rlCheckRenderBatchLimit(vCount);
    }

    public static com.raylib.Raylib.Vector3 vector3RotateByAxisAngle(com.raylib.Raylib.Vector3 v, com.raylib.Raylib.Vector3 axis, float angle) {
        return Raylib.Vector3RotateByAxisAngle(v, axis, angle);
    }

    /**
     * Get SSBO buffer size
     */
    public static int rlGetShaderBufferSize(int id) {
        return Raylib.rlGetShaderBufferSize(id);
    }

    /**
     * Unload vertex buffer object
     */
    public static void rlUnloadVertexBuffer(int vboId) {
        Raylib.rlUnloadVertexBuffer(vboId);
    }

    /**
     * Update vertex buffer object data on GPU buffer
     */
    public static void rlUpdateVertexBuffer(int bufferId, org.bytedeco.javacpp.Pointer data, int dataSize, int offset) {
        Raylib.rlUpdateVertexBuffer(bufferId, data, dataSize, offset);
    }

    /**
     * Set vertex attribute data configuration
     */
    public static void rlSetVertexAttribute(int index, int compSize, int type, boolean normalized, int stride, int offset) {
        Raylib.rlSetVertexAttribute(index, compSize, type, normalized, stride, offset);
    }

    /**
     * Set shader value sampler
     */
    public static void rlSetUniformSampler(int locIndex, int textureId) {
        Raylib.rlSetUniformSampler(locIndex, textureId);
    }

    /**
     * Set shader value matrices
     */
    public static void rlSetUniformMatrices(int locIndex, com.raylib.Raylib.Matrix mat, int count) {
        Raylib.rlSetUniformMatrices(locIndex, mat, count);
    }

    /**
     * Get OpenGL internal formats
     */
    public static void rlGetGlTextureFormats(int format, java.nio.IntBuffer glInternalFormat, java.nio.IntBuffer glFormat, java.nio.IntBuffer glType) {
        Raylib.rlGetGlTextureFormats(format, glInternalFormat, glFormat, glType);
    }

    /**
     * Get OpenGL internal formats
     */
    public static void rlGetGlTextureFormats(int format, org.bytedeco.javacpp.IntPointer glInternalFormat, org.bytedeco.javacpp.IntPointer glFormat, org.bytedeco.javacpp.IntPointer glType) {
        Raylib.rlGetGlTextureFormats(format, glInternalFormat, glFormat, glType);
    }

    /**
     * Get OpenGL internal formats
     */
    public static void rlGetGlTextureFormats(int format, int[] glInternalFormat, int[] glFormat, int[] glType) {
        Raylib.rlGetGlTextureFormats(format, glInternalFormat, glFormat, glType);
    }

    /**
     * Dispatch compute shader (equivalent to *draw* for graphics pipeline)
     */
    public static void rlComputeShaderDispatch(int groupX, int groupY, int groupZ) {
        Raylib.rlComputeShaderDispatch(groupX, groupY, groupZ);
    }

    /**
     * Get internal modelview matrix
     */
    public static com.raylib.Raylib.Matrix rlGetMatrixModelview() {
        return Raylib.rlGetMatrixModelview();
    }

    public static com.raylib.Raylib.Vector3 vector3CrossProduct(com.raylib.Raylib.Vector3 v1, com.raylib.Raylib.Vector3 v2) {
        return Raylib.Vector3CrossProduct(v1, v2);
    }

    /**
     * Unload shader program
     */
    public static void rlUnloadShaderProgram(int id) {
        Raylib.rlUnloadShaderProgram(id);
    }

    public static void vector3OrthoNormalize(com.raylib.Raylib.Vector3 v1, com.raylib.Raylib.Vector3 v2) {
        Raylib.Vector3OrthoNormalize(v1, v2);
    }

    public static com.raylib.Raylib.Vector4 vector4SubtractValue(com.raylib.Raylib.Vector4 v, float add) {
        return Raylib.Vector4SubtractValue(v, add);
    }

    public static com.raylib.Raylib.Vector4 quaternionFromAxisAngle(com.raylib.Raylib.Vector3 axis, float angle) {
        return Raylib.QuaternionFromAxisAngle(axis, angle);
    }

    public static void setPhysicsBodyRotation(com.raylib.Raylib.PhysicsBody arg0, float arg1) {
        Raylib.SetPhysicsBodyRotation(arg0, arg1);
    }

    /**
     * Color Panel control that returns HSV color value, used by GuiColorPickerHSV()
     */
    public static int guiColorPanelHSV(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, com.raylib.Raylib.Vector3 colorHsv) {
        return Raylib.GuiColorPanelHSV(bounds, text, colorHsv);
    }

    /**
     * Color Panel control that returns HSV color value, used by GuiColorPickerHSV()
     */
    public static int guiColorPanelHSV(com.raylib.Raylib.Rectangle bounds, java.lang.String text, com.raylib.Raylib.Vector3 colorHsv) {
        return Raylib.GuiColorPanelHSV(bounds, text, colorHsv);
    }

    /**
     * List View control, returns selected list item index
     */
    public static int guiListView(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, java.nio.IntBuffer scrollIndex, java.nio.IntBuffer active) {
        return Raylib.GuiListView(bounds, text, scrollIndex, active);
    }

    /**
     * List View control, returns selected list item index
     */
    public static int guiListView(com.raylib.Raylib.Rectangle bounds, java.lang.String text, int[] scrollIndex, int[] active) {
        return Raylib.GuiListView(bounds, text, scrollIndex, active);
    }

    /**
     * List View control, returns selected list item index
     */
    public static int guiListView(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.IntPointer scrollIndex, org.bytedeco.javacpp.IntPointer active) {
        return Raylib.GuiListView(bounds, text, scrollIndex, active);
    }

    /**
     * List View control, returns selected list item index
     */
    public static int guiListView(com.raylib.Raylib.Rectangle bounds, java.lang.String text, java.nio.IntBuffer scrollIndex, java.nio.IntBuffer active) {
        return Raylib.GuiListView(bounds, text, scrollIndex, active);
    }

    /**
     * List View control, returns selected list item index
     */
    public static int guiListView(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, int[] scrollIndex, int[] active) {
        return Raylib.GuiListView(bounds, text, scrollIndex, active);
    }

    /**
     * List View control, returns selected list item index
     */
    public static int guiListView(com.raylib.Raylib.Rectangle bounds, java.lang.String text, org.bytedeco.javacpp.IntPointer scrollIndex, org.bytedeco.javacpp.IntPointer active) {
        return Raylib.GuiListView(bounds, text, scrollIndex, active);
    }

    /**
     * Status Bar control, shows info text
     */
    public static int guiStatusBar(com.raylib.Raylib.Rectangle bounds, java.lang.String text) {
        return Raylib.GuiStatusBar(bounds, text);
    }

    /**
     * Status Bar control, shows info text
     */
    public static int guiStatusBar(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text) {
        return Raylib.GuiStatusBar(bounds, text);
    }

    /**
     * Dummy control for placeholders
     */
    public static int guiDummyRec(com.raylib.Raylib.Rectangle bounds, java.lang.String text) {
        return Raylib.GuiDummyRec(bounds, text);
    }

    /**
     * Dummy control for placeholders
     */
    public static int guiDummyRec(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text) {
        return Raylib.GuiDummyRec(bounds, text);
    }

    /**
     * Color Picker control (multiple color controls)
     */
    public static int guiColorPicker(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, com.raylib.Raylib.Color color) {
        return Raylib.GuiColorPicker(bounds, text, color);
    }

    /**
     * Color Picker control (multiple color controls)
     */
    public static int guiColorPicker(com.raylib.Raylib.Rectangle bounds, java.lang.String text, com.raylib.Raylib.Color color) {
        return Raylib.GuiColorPicker(bounds, text, color);
    }

    /**
     * Color Panel control
     */
    public static int guiColorPanel(com.raylib.Raylib.Rectangle bounds, java.lang.String text, com.raylib.Raylib.Color color) {
        return Raylib.GuiColorPanel(bounds, text, color);
    }

    /**
     * Color Panel control
     */
    public static int guiColorPanel(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, com.raylib.Raylib.Color color) {
        return Raylib.GuiColorPanel(bounds, text, color);
    }

    /**
     * Color Picker control that avoids conversion to RGB on each call (multiple color controls)
     */
    public static int guiColorPickerHSV(com.raylib.Raylib.Rectangle bounds, java.lang.String text, com.raylib.Raylib.Vector3 colorHsv) {
        return Raylib.GuiColorPickerHSV(bounds, text, colorHsv);
    }

    /**
     * Color Picker control that avoids conversion to RGB on each call (multiple color controls)
     */
    public static int guiColorPickerHSV(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, com.raylib.Raylib.Vector3 colorHsv) {
        return Raylib.GuiColorPickerHSV(bounds, text, colorHsv);
    }

    /**
     * Text Input Box control, ask for text, supports secret
     */
    public static int guiTextInputBox(com.raylib.Raylib.Rectangle bounds, java.lang.String title, java.lang.String message, java.lang.String buttons, byte[] text, int textMaxSize, boolean[] secretViewActive) {
        return Raylib.GuiTextInputBox(bounds, title, message, buttons, text, textMaxSize, secretViewActive);
    }

    /**
     * Text Input Box control, ask for text, supports secret
     */
    public static int guiTextInputBox(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer title, org.bytedeco.javacpp.BytePointer message, org.bytedeco.javacpp.BytePointer buttons, byte[] text, int textMaxSize, org.bytedeco.javacpp.BoolPointer secretViewActive) {
        return Raylib.GuiTextInputBox(bounds, title, message, buttons, text, textMaxSize, secretViewActive);
    }

    /**
     * Text Input Box control, ask for text, supports secret
     */
    public static int guiTextInputBox(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer title, org.bytedeco.javacpp.BytePointer message, org.bytedeco.javacpp.BytePointer buttons, java.nio.ByteBuffer text, int textMaxSize, org.bytedeco.javacpp.BoolPointer secretViewActive) {
        return Raylib.GuiTextInputBox(bounds, title, message, buttons, text, textMaxSize, secretViewActive);
    }

    /**
     * Text Input Box control, ask for text, supports secret
     */
    public static int guiTextInputBox(com.raylib.Raylib.Rectangle bounds, java.lang.String title, java.lang.String message, java.lang.String buttons, java.nio.ByteBuffer text, int textMaxSize, boolean[] secretViewActive) {
        return Raylib.GuiTextInputBox(bounds, title, message, buttons, text, textMaxSize, secretViewActive);
    }

    /**
     * Text Input Box control, ask for text, supports secret
     */
    public static int guiTextInputBox(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer title, org.bytedeco.javacpp.BytePointer message, org.bytedeco.javacpp.BytePointer buttons, org.bytedeco.javacpp.BytePointer text, int textMaxSize, org.bytedeco.javacpp.BoolPointer secretViewActive) {
        return Raylib.GuiTextInputBox(bounds, title, message, buttons, text, textMaxSize, secretViewActive);
    }

    /**
     * Text Input Box control, ask for text, supports secret
     */
    public static int guiTextInputBox(com.raylib.Raylib.Rectangle bounds, java.lang.String title, java.lang.String message, java.lang.String buttons, org.bytedeco.javacpp.BytePointer text, int textMaxSize, boolean[] secretViewActive) {
        return Raylib.GuiTextInputBox(bounds, title, message, buttons, text, textMaxSize, secretViewActive);
    }

    /**
     * Color Bar Alpha control
     */
    public static int guiColorBarAlpha(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.FloatPointer alpha) {
        return Raylib.GuiColorBarAlpha(bounds, text, alpha);
    }

    /**
     * Color Bar Alpha control
     */
    public static int guiColorBarAlpha(com.raylib.Raylib.Rectangle bounds, java.lang.String text, float[] alpha) {
        return Raylib.GuiColorBarAlpha(bounds, text, alpha);
    }

    /**
     * Color Bar Alpha control
     */
    public static int guiColorBarAlpha(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, float[] alpha) {
        return Raylib.GuiColorBarAlpha(bounds, text, alpha);
    }

    /**
     * Color Bar Alpha control
     */
    public static int guiColorBarAlpha(com.raylib.Raylib.Rectangle bounds, java.lang.String text, java.nio.FloatBuffer alpha) {
        return Raylib.GuiColorBarAlpha(bounds, text, alpha);
    }

    /**
     * Color Bar Alpha control
     */
    public static int guiColorBarAlpha(com.raylib.Raylib.Rectangle bounds, java.lang.String text, org.bytedeco.javacpp.FloatPointer alpha) {
        return Raylib.GuiColorBarAlpha(bounds, text, alpha);
    }

    /**
     * Color Bar Alpha control
     */
    public static int guiColorBarAlpha(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, java.nio.FloatBuffer alpha) {
        return Raylib.GuiColorBarAlpha(bounds, text, alpha);
    }

    /**
     * List View with extended parameters
     */
    public static int guiListViewEx(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, int count, org.bytedeco.javacpp.IntPointer scrollIndex, org.bytedeco.javacpp.IntPointer active, org.bytedeco.javacpp.IntPointer focus) {
        return Raylib.GuiListViewEx(bounds, text, count, scrollIndex, active, focus);
    }

    /**
     * List View with extended parameters
     */
    public static int guiListViewEx(com.raylib.Raylib.Rectangle bounds, byte[] text, int count, int[] scrollIndex, int[] active, int[] focus) {
        return Raylib.GuiListViewEx(bounds, text, count, scrollIndex, active, focus);
    }

    /**
     * List View with extended parameters
     */
    public static int guiListViewEx(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.PointerPointer text, int count, org.bytedeco.javacpp.IntPointer scrollIndex, org.bytedeco.javacpp.IntPointer active, org.bytedeco.javacpp.IntPointer focus) {
        return Raylib.GuiListViewEx(bounds, text, count, scrollIndex, active, focus);
    }

    /**
     * List View with extended parameters
     */
    public static int guiListViewEx(com.raylib.Raylib.Rectangle bounds, java.nio.ByteBuffer text, int count, java.nio.IntBuffer scrollIndex, java.nio.IntBuffer active, java.nio.IntBuffer focus) {
        return Raylib.GuiListViewEx(bounds, text, count, scrollIndex, active, focus);
    }

    /**
     * Color Bar Hue control
     */
    public static int guiColorBarHue(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, float[] value) {
        return Raylib.GuiColorBarHue(bounds, text, value);
    }

    /**
     * Color Bar Hue control
     */
    public static int guiColorBarHue(com.raylib.Raylib.Rectangle bounds, java.lang.String text, org.bytedeco.javacpp.FloatPointer value) {
        return Raylib.GuiColorBarHue(bounds, text, value);
    }

    /**
     * Color Bar Hue control
     */
    public static int guiColorBarHue(com.raylib.Raylib.Rectangle bounds, java.lang.String text, float[] value) {
        return Raylib.GuiColorBarHue(bounds, text, value);
    }

    /**
     * Color Bar Hue control
     */
    public static int guiColorBarHue(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, java.nio.FloatBuffer value) {
        return Raylib.GuiColorBarHue(bounds, text, value);
    }

    /**
     * Color Bar Hue control
     */
    public static int guiColorBarHue(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.FloatPointer value) {
        return Raylib.GuiColorBarHue(bounds, text, value);
    }

    /**
     * Color Bar Hue control
     */
    public static int guiColorBarHue(com.raylib.Raylib.Rectangle bounds, java.lang.String text, java.nio.FloatBuffer value) {
        return Raylib.GuiColorBarHue(bounds, text, value);
    }

    /**
     * Message Box control, displays a message
     */
    public static int guiMessageBox(com.raylib.Raylib.Rectangle bounds, java.lang.String title, java.lang.String message, java.lang.String buttons) {
        return Raylib.GuiMessageBox(bounds, title, message, buttons);
    }

    /**
     * Message Box control, displays a message
     */
    public static int guiMessageBox(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer title, org.bytedeco.javacpp.BytePointer message, org.bytedeco.javacpp.BytePointer buttons) {
        return Raylib.GuiMessageBox(bounds, title, message, buttons);
    }

    /**
     * Check if one specific window flag is enabled
     */
    public static boolean isWindowState(int flag) {
        return Raylib.IsWindowState(flag);
    }

    /**
     * Set window state: maximized, if resizable
     */
    public static void maximizeWindow() {
        Raylib.MaximizeWindow();
    }

    /**
     * Set window state: minimized, if resizable
     */
    public static void minimizeWindow() {
        Raylib.MinimizeWindow();
    }

    /**
     * Close window and unload OpenGL context
     */
    public static void closeWindow() {
        Raylib.CloseWindow();
    }

    /**
     * Check if window is currently hidden
     */
    public static boolean isWindowHidden() {
        return Raylib.IsWindowHidden();
    }

    /**
     * Set window state: not minimized/maximized
     */
    public static void restoreWindow() {
        Raylib.RestoreWindow();
    }

    /**
     * Check if window is currently fullscreen
     */
    public static boolean isWindowFullscreen() {
        return Raylib.IsWindowFullscreen();
    }

    /**
     * Check if window is currently focused
     */
    public static boolean isWindowFocused() {
        return Raylib.IsWindowFocused();
    }

    /**
     * Check if window has been resized last frame
     */
    public static boolean isWindowResized() {
        return Raylib.IsWindowResized();
    }

    /**
     * Set icon for window (single image, RGBA 32bit)
     */
    public static void setWindowIcon(com.raylib.Raylib.Image image) {
        Raylib.SetWindowIcon(image);
    }

    /**
     * Set window position on screen
     */
    public static void setWindowPosition(int x, int y) {
        Raylib.SetWindowPosition(x, y);
    }

    /**
     * Set monitor for the current window
     */
    public static void setWindowMonitor(int monitor) {
        Raylib.SetWindowMonitor(monitor);
    }

    /**
     * Set window maximum dimensions (for FLAG_WINDOW_RESIZABLE)
     */
    public static void setWindowMaxSize(int width, int height) {
        Raylib.SetWindowMaxSize(width, height);
    }

    /**
     * Set window dimensions
     */
    public static void setWindowSize(int width, int height) {
        Raylib.SetWindowSize(width, height);
    }

    /**
     * Set window minimum dimensions (for FLAG_WINDOW_RESIZABLE)
     */
    public static void setWindowMinSize(int width, int height) {
        Raylib.SetWindowMinSize(width, height);
    }

    /**
     * Check if application should close (KEY_ESCAPE pressed or windows close icon clicked)
     */
    public static boolean windowShouldClose() {
        return Raylib.WindowShouldClose();
    }

    /**
     * Set title for window
     */
    public static void setWindowTitle(java.lang.String title) {
        Raylib.SetWindowTitle(title);
    }

    /**
     * Set title for window
     */
    public static void setWindowTitle(org.bytedeco.javacpp.BytePointer title) {
        Raylib.SetWindowTitle(title);
    }

    /**
     * Set window opacity [0.0f..1.0f]
     */
    public static void setWindowOpacity(float opacity) {
        Raylib.SetWindowOpacity(opacity);
    }

    /**
     * Check if window is currently maximized
     */
    public static boolean isWindowMaximized() {
        return Raylib.IsWindowMaximized();
    }

    /**
     * Set icon for window (multiple images, RGBA 32bit)
     */
    public static void setWindowIcons(com.raylib.Raylib.Image images, int count) {
        Raylib.SetWindowIcons(images, count);
    }

    /**
     * Check if window is currently minimized
     */
    public static boolean isWindowMinimized() {
        return Raylib.IsWindowMinimized();
    }

    /**
     * Set window focused
     */
    public static void setWindowFocused() {
        Raylib.SetWindowFocused();
    }

    /**
     * Check if window has been initialized successfully
     */
    public static boolean isWindowReady() {
        return Raylib.IsWindowReady();
    }

    /**
     * Clear window configuration state flags
     */
    public static void clearWindowState(int flags) {
        Raylib.ClearWindowState(flags);
    }

    /**
     * Set window configuration state using flags
     */
    public static void setWindowState(int flags) {
        Raylib.SetWindowState(flags);
    }

    /**
     * Toggle window state: fullscreen/windowed, resizes monitor to match window resolution
     */
    public static void toggleFullscreen() {
        Raylib.ToggleFullscreen();
    }

    /**
     * Register all input events
     */
    public static void pollInputEvents() {
        Raylib.PollInputEvents();
    }

    /**
     * Set the current threshold (minimum) log level
     */
    public static void setTraceLogLevel(int logLevel) {
        Raylib.SetTraceLogLevel(logLevel);
    }

    /**
     * Save data to file from byte array (write), returns true on success
     */
    public static boolean saveFileData(org.bytedeco.javacpp.BytePointer fileName, org.bytedeco.javacpp.Pointer data, int dataSize) {
        return Raylib.SaveFileData(fileName, data, dataSize);
    }

    /**
     * Save data to file from byte array (write), returns true on success
     */
    public static boolean saveFileData(java.lang.String fileName, org.bytedeco.javacpp.Pointer data, int dataSize) {
        return Raylib.SaveFileData(fileName, data, dataSize);
    }

    /**
     * Export data to code (.h), returns true on success
     */
    public static boolean exportDataAsCode(java.nio.ByteBuffer data, int dataSize, java.lang.String fileName) {
        return Raylib.ExportDataAsCode(data, dataSize, fileName);
    }

    /**
     * Export data to code (.h), returns true on success
     */
    public static boolean exportDataAsCode(byte[] data, int dataSize, org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.ExportDataAsCode(data, dataSize, fileName);
    }

    /**
     * Export data to code (.h), returns true on success
     */
    public static boolean exportDataAsCode(java.nio.ByteBuffer data, int dataSize, org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.ExportDataAsCode(data, dataSize, fileName);
    }

    /**
     * Export data to code (.h), returns true on success
     */
    public static boolean exportDataAsCode(org.bytedeco.javacpp.BytePointer data, int dataSize, java.lang.String fileName) {
        return Raylib.ExportDataAsCode(data, dataSize, fileName);
    }

    /**
     * Export data to code (.h), returns true on success
     */
    public static boolean exportDataAsCode(byte[] data, int dataSize, java.lang.String fileName) {
        return Raylib.ExportDataAsCode(data, dataSize, fileName);
    }

    /**
     * Export data to code (.h), returns true on success
     */
    public static boolean exportDataAsCode(org.bytedeco.javacpp.BytePointer data, int dataSize, org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.ExportDataAsCode(data, dataSize, fileName);
    }

    /**
     * Load text data from file (read), returns a '\0' terminated string
     */
    public static java.nio.ByteBuffer loadFileText(java.lang.String fileName) {
        return Raylib.LoadFileText(fileName);
    }

    /**
     * Load text data from file (read), returns a '\0' terminated string
     */
    public static org.bytedeco.javacpp.BytePointer loadFileText(org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.LoadFileText(fileName);
    }

    /**
     * Disables cursor (lock cursor)
     */
    public static void disableCursor() {
        Raylib.DisableCursor();
    }

    /**
     * Get current screen height
     */
    public static int getScreenHeight() {
        return Raylib.GetScreenHeight();
    }

    /**
     * Check if cursor is on the screen
     */
    public static boolean isCursorOnScreen() {
        return Raylib.IsCursorOnScreen();
    }

    /**
     * Begin drawing to render texture
     */
    public static void beginTextureMode(com.raylib.Raylib.RenderTexture target) {
        Raylib.BeginTextureMode(target);
    }

    /**
     * Begin scissor mode (define screen area for following drawing)
     */
    public static void beginScissorMode(int x, int y, int width, int height) {
        Raylib.BeginScissorMode(x, y, width, height);
    }

    /**
     * End blending mode (reset to default: alpha blending)
     */
    public static void endBlendMode() {
        Raylib.EndBlendMode();
    }

    /**
     * Load VR stereo config for VR simulator device parameters
     */
    public static com.raylib.Raylib.VrStereoConfig loadVrStereoConfig(com.raylib.Raylib.VrDeviceInfo device) {
        return Raylib.LoadVrStereoConfig(device);
    }

    /**
     * Check if a shader is valid (loaded on GPU)
     */
    public static boolean isShaderValid(com.raylib.Raylib.Shader shader) {
        return Raylib.IsShaderValid(shader);
    }

    /**
     * Set shader uniform value vector
     */
    public static void setShaderValueV(com.raylib.Raylib.Shader shader, int locIndex, org.bytedeco.javacpp.Pointer value, int uniformType, int count) {
        Raylib.SetShaderValueV(shader, locIndex, value, uniformType, count);
    }

    /**
     * Get the world space position for a 2d camera screen space position
     */
    public static com.raylib.Raylib.Vector2 getScreenToWorld2D(com.raylib.Raylib.Vector2 position, com.raylib.Raylib.Camera2D camera) {
        return Raylib.GetScreenToWorld2D(position, camera);
    }

    /**
     * Get current monitor where window is placed
     */
    public static int getCurrentMonitor() {
        return Raylib.GetCurrentMonitor();
    }

    /**
     * Set clipboard text content
     */
    public static void setClipboardText(org.bytedeco.javacpp.BytePointer text) {
        Raylib.SetClipboardText(text);
    }

    /**
     * Set clipboard text content
     */
    public static void setClipboardText(java.lang.String text) {
        Raylib.SetClipboardText(text);
    }

    /**
     * Swap back buffer with front buffer (screen drawing)
     */
    public static void swapScreenBuffer() {
        Raylib.SwapScreenBuffer();
    }

    /**
     * Setup init configuration flags (view FLAGS)
     */
    public static void setConfigFlags(int flags) {
        Raylib.SetConfigFlags(flags);
    }

    /**
     * Begin blending mode (alpha, additive, multiplied, subtract, custom)
     */
    public static void beginBlendMode(int mode) {
        Raylib.BeginBlendMode(mode);
    }

    /**
     * Begin 2D mode with custom camera (2D)
     */
    public static void beginMode2D(com.raylib.Raylib.Camera2D camera) {
        Raylib.BeginMode2D(camera);
    }

    /**
     * Get native window handle
     */
    public static org.bytedeco.javacpp.Pointer getWindowHandle() {
        return Raylib.GetWindowHandle();
    }

    /**
     * Get current screen width
     */
    public static int getScreenWidth() {
        return Raylib.GetScreenWidth();
    }

    /**
     * Begin stereo rendering (requires VR simulator)
     */
    public static void beginVrStereoMode(com.raylib.Raylib.VrStereoConfig config) {
        Raylib.BeginVrStereoMode(config);
    }

    /**
     * Get window position XY on monitor
     */
    public static com.raylib.Raylib.Vector2 getWindowPosition() {
        return Raylib.GetWindowPosition();
    }

    /**
     * Get shader uniform location
     */
    public static int getShaderLocation(com.raylib.Raylib.Shader shader, java.lang.String uniformName) {
        return Raylib.GetShaderLocation(shader, uniformName);
    }

    /**
     * Get shader uniform location
     */
    public static int getShaderLocation(com.raylib.Raylib.Shader shader, org.bytedeco.javacpp.BytePointer uniformName) {
        return Raylib.GetShaderLocation(shader, uniformName);
    }

    /**
     * Get clipboard image content
     */
    public static com.raylib.Raylib.Image getClipboardImage() {
        return Raylib.GetClipboardImage();
    }

    /**
     * Takes a screenshot of current screen (filename extension defines format)
     */
    public static void takeScreenshot(org.bytedeco.javacpp.BytePointer fileName) {
        Raylib.TakeScreenshot(fileName);
    }

    /**
     * Takes a screenshot of current screen (filename extension defines format)
     */
    public static void takeScreenshot(java.lang.String fileName) {
        Raylib.TakeScreenshot(fileName);
    }

    /**
     * Load file data as byte array (read)
     */
    public static byte[] loadFileData(java.lang.String fileName, int[] dataSize) {
        return Raylib.LoadFileData(fileName, dataSize);
    }

    /**
     * Load file data as byte array (read)
     */
    public static org.bytedeco.javacpp.BytePointer loadFileData(org.bytedeco.javacpp.BytePointer fileName, org.bytedeco.javacpp.IntPointer dataSize) {
        return Raylib.LoadFileData(fileName, dataSize);
    }

    /**
     * Load file data as byte array (read)
     */
    public static java.nio.ByteBuffer loadFileData(java.lang.String fileName, java.nio.IntBuffer dataSize) {
        return Raylib.LoadFileData(fileName, dataSize);
    }

    /**
     * Load file data as byte array (read)
     */
    public static byte[] loadFileData(org.bytedeco.javacpp.BytePointer fileName, int[] dataSize) {
        return Raylib.LoadFileData(fileName, dataSize);
    }

    /**
     * Load file data as byte array (read)
     */
    public static org.bytedeco.javacpp.BytePointer loadFileData(java.lang.String fileName, org.bytedeco.javacpp.IntPointer dataSize) {
        return Raylib.LoadFileData(fileName, dataSize);
    }

    /**
     * Load file data as byte array (read)
     */
    public static java.nio.ByteBuffer loadFileData(org.bytedeco.javacpp.BytePointer fileName, java.nio.IntBuffer dataSize) {
        return Raylib.LoadFileData(fileName, dataSize);
    }

    /**
     * Get clipboard text content
     */
    public static org.bytedeco.javacpp.BytePointer getClipboardText() {
        return Raylib.GetClipboardText();
    }

    /**
     * Check if cursor is not visible
     */
    public static boolean isCursorHidden() {
        return Raylib.IsCursorHidden();
    }

    /**
     * End stereo rendering (requires VR simulator)
     */
    public static void endVrStereoMode() {
        Raylib.EndVrStereoMode();
    }

    /**
     * Set background color (framebuffer clear color)
     */
    public static void clearBackground(com.raylib.Raylib.Color color) {
        Raylib.ClearBackground(color);
    }

    /**
     * Begin 3D mode with custom camera (3D)
     */
    public static void beginMode3D(com.raylib.Raylib.Camera3D camera) {
        Raylib.BeginMode3D(camera);
    }

    /**
     * Get current render height (it considers HiDPI)
     */
    public static int getRenderHeight() {
        return Raylib.GetRenderHeight();
    }

    /**
     * Get time in seconds for last frame drawn (delta time)
     */
    public static float getFrameTime() {
        return Raylib.GetFrameTime();
    }

    /**
     * Get current render width (it considers HiDPI)
     */
    public static int getRenderWidth() {
        return Raylib.GetRenderWidth();
    }

    /**
     * Get camera 2d transform matrix
     */
    public static com.raylib.Raylib.Matrix getCameraMatrix2D(com.raylib.Raylib.Camera2D camera) {
        return Raylib.GetCameraMatrix2D(camera);
    }

    /**
     * Get number of connected monitors
     */
    public static int getMonitorCount() {
        return Raylib.GetMonitorCount();
    }

    /**
     * Get specified monitor width (current video mode used by monitor)
     */
    public static int getMonitorWidth(int monitor) {
        return Raylib.GetMonitorWidth(monitor);
    }

    /**
     * Enable waiting for events on EndDrawing(), no automatic event polling
     */
    public static void enableEventWaiting() {
        Raylib.EnableEventWaiting();
    }

    /**
     * Load random values sequence, no values repeated
     */
    public static org.bytedeco.javacpp.IntPointer loadRandomSequence(int count, int min, int max) {
        return Raylib.LoadRandomSequence(count, min, max);
    }

    /**
     * Get specified monitor position
     */
    public static com.raylib.Raylib.Vector2 getMonitorPosition(int monitor) {
        return Raylib.GetMonitorPosition(monitor);
    }

    /**
     * Get specified monitor height (current video mode used by monitor)
     */
    public static int getMonitorHeight(int monitor) {
        return Raylib.GetMonitorHeight(monitor);
    }

    /**
     * Get a random value between min and max (both included)
     */
    public static int getRandomValue(int min, int max) {
        return Raylib.GetRandomValue(min, max);
    }

    /**
     * Enables cursor (unlock cursor)
     */
    public static void enableCursor() {
        Raylib.EnableCursor();
    }

    /**
     * Unload shader from GPU memory (VRAM)
     */
    public static void unloadShader(com.raylib.Raylib.Shader shader) {
        Raylib.UnloadShader(shader);
    }

    /**
     * Set target FPS (maximum)
     */
    public static void setTargetFPS(int fps) {
        Raylib.SetTargetFPS(fps);
    }

    /**
     * Set the seed for the random number generator
     */
    public static void setRandomSeed(int seed) {
        Raylib.SetRandomSeed(seed);
    }

    /**
     * Get size position for a 3d world space position
     */
    public static com.raylib.Raylib.Vector2 getWorldToScreenEx(com.raylib.Raylib.Vector3 position, com.raylib.Raylib.Camera3D camera, int width, int height) {
        return Raylib.GetWorldToScreenEx(position, camera, width, height);
    }

    /**
     * Get the screen space position for a 3d world space position
     */
    public static com.raylib.Raylib.Vector2 getWorldToScreen(com.raylib.Raylib.Vector3 position, com.raylib.Raylib.Camera3D camera) {
        return Raylib.GetWorldToScreen(position, camera);
    }

    /**
     * Get the human-readable, UTF-8 encoded name of the specified monitor
     */
    public static org.bytedeco.javacpp.BytePointer getMonitorName(int monitor) {
        return Raylib.GetMonitorName(monitor);
    }

    /**
     * Get the screen space position for a 2d camera world space position
     */
    public static com.raylib.Raylib.Vector2 getWorldToScreen2D(com.raylib.Raylib.Vector2 position, com.raylib.Raylib.Camera2D camera) {
        return Raylib.GetWorldToScreen2D(position, camera);
    }

    /**
     * Unload file data allocated by LoadFileData()
     */
    public static void unloadFileData(java.nio.ByteBuffer data) {
        Raylib.UnloadFileData(data);
    }

    /**
     * Unload file data allocated by LoadFileData()
     */
    public static void unloadFileData(org.bytedeco.javacpp.BytePointer data) {
        Raylib.UnloadFileData(data);
    }

    /**
     * Unload file data allocated by LoadFileData()
     */
    public static void unloadFileData(byte[] data) {
        Raylib.UnloadFileData(data);
    }

    /**
     * Begin custom shader drawing
     */
    public static void beginShaderMode(com.raylib.Raylib.Shader shader) {
        Raylib.BeginShaderMode(shader);
    }

    /**
     * Get window scale DPI factor
     */
    public static com.raylib.Raylib.Vector2 getWindowScaleDPI() {
        return Raylib.GetWindowScaleDPI();
    }

    /**
     * Ends drawing to render texture
     */
    public static void endTextureMode() {
        Raylib.EndTextureMode();
    }

    /**
     * End custom shader drawing (use default shader)
     */
    public static void endShaderMode() {
        Raylib.EndShaderMode();
    }

    /**
     * End scissor mode
     */
    public static void endScissorMode() {
        Raylib.EndScissorMode();
    }

    /**
     * Setup canvas (framebuffer) to start drawing
     */
    public static void beginDrawing() {
        Raylib.BeginDrawing();
    }

    /**
     * Set shader uniform value
     */
    public static void setShaderValue(com.raylib.Raylib.Shader shader, int locIndex, org.bytedeco.javacpp.Pointer value, int uniformType) {
        Raylib.SetShaderValue(shader, locIndex, value, uniformType);
    }

    /**
     * Get camera transform matrix (view matrix)
     */
    public static com.raylib.Raylib.Matrix getCameraMatrix(com.raylib.Raylib.Camera3D camera) {
        return Raylib.GetCameraMatrix(camera);
    }

    /**
     * Unload dropped filepaths
     */
    public static void unloadDroppedFiles(com.raylib.Raylib.FilePathList files) {
        Raylib.UnloadDroppedFiles(files);
    }

    /**
     * Encode data to Base64 string, memory must be MemFree()
     */
    public static org.bytedeco.javacpp.BytePointer encodeDataBase64(org.bytedeco.javacpp.BytePointer data, int dataSize, org.bytedeco.javacpp.IntPointer outputSize) {
        return Raylib.EncodeDataBase64(data, dataSize, outputSize);
    }

    /**
     * Encode data to Base64 string, memory must be MemFree()
     */
    public static java.nio.ByteBuffer encodeDataBase64(java.nio.ByteBuffer data, int dataSize, java.nio.IntBuffer outputSize) {
        return Raylib.EncodeDataBase64(data, dataSize, outputSize);
    }

    /**
     * Encode data to Base64 string, memory must be MemFree()
     */
    public static byte[] encodeDataBase64(byte[] data, int dataSize, int[] outputSize) {
        return Raylib.EncodeDataBase64(data, dataSize, outputSize);
    }

    /**
     * Get mouse wheel movement for both X and Y
     */
    public static com.raylib.Raylib.Vector2 getMouseWheelMoveV() {
        return Raylib.GetMouseWheelMoveV();
    }

    /**
     * Get latest detected gesture
     */
    public static int getGestureDetected() {
        return Raylib.GetGestureDetected();
    }

    /**
     * Set mouse offset
     */
    public static void setMouseOffset(int offsetX, int offsetY) {
        Raylib.SetMouseOffset(offsetX, offsetY);
    }

    /**
     * Check if a file has been dropped into window
     */
    public static boolean isFileDropped() {
        return Raylib.IsFileDropped();
    }

    /**
     * Get file length in bytes (NOTE: GetFileSize() conflicts with windows.h)
     */
    public static int getFileLength(org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.GetFileLength(fileName);
    }

    /**
     * Get file length in bytes (NOTE: GetFileSize() conflicts with windows.h)
     */
    public static int getFileLength(java.lang.String fileName) {
        return Raylib.GetFileLength(fileName);
    }

    /**
     * Get file modification time (last write time)
     */
    public static long getFileModTime(org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.GetFileModTime(fileName);
    }

    /**
     * Get file modification time (last write time)
     */
    public static long getFileModTime(java.lang.String fileName) {
        return Raylib.GetFileModTime(fileName);
    }

    /**
     * Check if a directory path exists
     */
    public static boolean directoryExists(java.lang.String dirPath) {
        return Raylib.DirectoryExists(dirPath);
    }

    /**
     * Check if a directory path exists
     */
    public static boolean directoryExists(org.bytedeco.javacpp.BytePointer dirPath) {
        return Raylib.DirectoryExists(dirPath);
    }

    /**
     * Check if fileName is valid for the platform/OS
     */
    public static boolean isFileNameValid(java.lang.String fileName) {
        return Raylib.IsFileNameValid(fileName);
    }

    /**
     * Check if fileName is valid for the platform/OS
     */
    public static boolean isFileNameValid(org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.IsFileNameValid(fileName);
    }

    /**
     * Compute SHA1 hash code, returns static int[5] (20 bytes)
     */
    public static java.nio.IntBuffer computeSHA1(java.nio.ByteBuffer data, int dataSize) {
        return Raylib.ComputeSHA1(data, dataSize);
    }

    /**
     * Compute SHA1 hash code, returns static int[5] (20 bytes)
     */
    public static org.bytedeco.javacpp.IntPointer computeSHA1(org.bytedeco.javacpp.BytePointer data, int dataSize) {
        return Raylib.ComputeSHA1(data, dataSize);
    }

    /**
     * Compute SHA1 hash code, returns static int[5] (20 bytes)
     */
    public static int[] computeSHA1(byte[] data, int dataSize) {
        return Raylib.ComputeSHA1(data, dataSize);
    }

    /**
     * Check if a key has been pressed once
     */
    public static boolean isKeyPressed(int key) {
        return Raylib.IsKeyPressed(key);
    }

    /**
     * Check if a gamepad button is NOT being pressed
     */
    public static boolean isGamepadButtonUp(int gamepad, int button) {
        return Raylib.IsGamepadButtonUp(gamepad, button);
    }

    /**
     * Set mouse position XY
     */
    public static void setMousePosition(int x, int y) {
        Raylib.SetMousePosition(x, y);
    }

    /**
     * Check if a key has been pressed again
     */
    public static boolean isKeyPressedRepeat(int key) {
        return Raylib.IsKeyPressedRepeat(key);
    }

    /**
     * Get mouse wheel movement for X or Y, whichever is larger
     */
    public static float getMouseWheelMove() {
        return Raylib.GetMouseWheelMove();
    }

    /**
     * Set mouse cursor
     */
    public static void setMouseCursor(int cursor) {
        Raylib.SetMouseCursor(cursor);
    }

    /**
     * Update camera position for selected mode
     */
    public static void updateCamera(com.raylib.Raylib.Camera3D camera, int mode) {
        Raylib.UpdateCamera(camera, mode);
    }

    /**
     * Get texture that is used for shapes drawing
     */
    public static com.raylib.Raylib.Texture getShapesTexture() {
        return Raylib.GetShapesTexture();
    }

    /**
     * Save text data to file (write), string must be '\0' terminated, returns true on success
     */
    public static boolean saveFileText(org.bytedeco.javacpp.BytePointer fileName, java.nio.ByteBuffer text) {
        return Raylib.SaveFileText(fileName, text);
    }

    /**
     * Save text data to file (write), string must be '\0' terminated, returns true on success
     */
    public static boolean saveFileText(java.lang.String fileName, byte[] text) {
        return Raylib.SaveFileText(fileName, text);
    }

    /**
     * Save text data to file (write), string must be '\0' terminated, returns true on success
     */
    public static boolean saveFileText(java.lang.String fileName, org.bytedeco.javacpp.BytePointer text) {
        return Raylib.SaveFileText(fileName, text);
    }

    /**
     * Save text data to file (write), string must be '\0' terminated, returns true on success
     */
    public static boolean saveFileText(java.lang.String fileName, java.nio.ByteBuffer text) {
        return Raylib.SaveFileText(fileName, text);
    }

    /**
     * Save text data to file (write), string must be '\0' terminated, returns true on success
     */
    public static boolean saveFileText(org.bytedeco.javacpp.BytePointer fileName, byte[] text) {
        return Raylib.SaveFileText(fileName, text);
    }

    /**
     * Save text data to file (write), string must be '\0' terminated, returns true on success
     */
    public static boolean saveFileText(org.bytedeco.javacpp.BytePointer fileName, org.bytedeco.javacpp.BytePointer text) {
        return Raylib.SaveFileText(fileName, text);
    }

    /**
     * Check if a mouse button is NOT being pressed
     */
    public static boolean isMouseButtonUp(int button) {
        return Raylib.IsMouseButtonUp(button);
    }

    /**
     * Get touch point identifier for given index
     */
    public static int getTouchPointId(int index) {
        return Raylib.GetTouchPointId(index);
    }

    /**
     * Set texture and rectangle to be used on shapes drawing
     */
    public static void setShapesTexture(com.raylib.Raylib.Texture texture, com.raylib.Raylib.Rectangle source) {
        Raylib.SetShapesTexture(texture, source);
    }

    /**
     * Draw lines sequence (using gl lines)
     */
    public static void drawLineStrip(com.raylib.Raylib.Vector2 points, int pointCount, com.raylib.Raylib.Color color) {
        Raylib.DrawLineStrip(points, pointCount, color);
    }

    /**
     * Change working directory, return true on success
     */
    public static boolean changeDirectory(java.lang.String dir) {
        return Raylib.ChangeDirectory(dir);
    }

    /**
     * Change working directory, return true on success
     */
    public static boolean changeDirectory(org.bytedeco.javacpp.BytePointer dir) {
        return Raylib.ChangeDirectory(dir);
    }

    /**
     * Compute CRC32 hash code
     */
    public static int computeCRC32(org.bytedeco.javacpp.BytePointer data, int dataSize) {
        return Raylib.ComputeCRC32(data, dataSize);
    }

    /**
     * Compute CRC32 hash code
     */
    public static int computeCRC32(java.nio.ByteBuffer data, int dataSize) {
        return Raylib.ComputeCRC32(data, dataSize);
    }

    /**
     * Compute CRC32 hash code
     */
    public static int computeCRC32(byte[] data, int dataSize) {
        return Raylib.ComputeCRC32(data, dataSize);
    }

    /**
     * Draw line segment cubic-bezier in-out interpolation
     */
    public static void drawLineBezier(com.raylib.Raylib.Vector2 startPos, com.raylib.Raylib.Vector2 endPos, float thick, com.raylib.Raylib.Color color) {
        Raylib.DrawLineBezier(startPos, endPos, thick, color);
    }

    /**
     * Check if a gamepad is available
     */
    public static boolean isGamepadAvailable(int gamepad) {
        return Raylib.IsGamepadAvailable(gamepad);
    }

    /**
     * Draw a piece of a circle
     */
    public static void drawCircleSector(com.raylib.Raylib.Vector2 center, float radius, float startAngle, float endAngle, int segments, com.raylib.Raylib.Color color) {
        Raylib.DrawCircleSector(center, radius, startAngle, endAngle, segments, color);
    }

    /**
     * Draw a gradient-filled circle
     */
    public static void drawCircleGradient(int centerX, int centerY, float radius, com.raylib.Raylib.Color inner, com.raylib.Raylib.Color outer) {
        Raylib.DrawCircleGradient(centerX, centerY, radius, inner, outer);
    }

    /**
     * Draw circle outline
     */
    public static void drawCircleLines(int centerX, int centerY, float radius, com.raylib.Raylib.Color color) {
        Raylib.DrawCircleLines(centerX, centerY, radius, color);
    }

    /**
     * Draw circle outline (Vector version)
     */
    public static void drawCircleLinesV(com.raylib.Raylib.Vector2 center, float radius, com.raylib.Raylib.Color color) {
        Raylib.DrawCircleLinesV(center, radius, color);
    }

    /**
     * Draw a color-filled circle (Vector version)
     */
    public static void drawCircleV(com.raylib.Raylib.Vector2 center, float radius, com.raylib.Raylib.Color color) {
        Raylib.DrawCircleV(center, radius, color);
    }

    /**
     * Get full path for a given fileName with path (uses static string)
     */
    public static org.bytedeco.javacpp.BytePointer getDirectoryPath(org.bytedeco.javacpp.BytePointer filePath) {
        return Raylib.GetDirectoryPath(filePath);
    }

    /**
     * Get full path for a given fileName with path (uses static string)
     */
    public static java.lang.String getDirectoryPath(java.lang.String filePath) {
        return Raylib.GetDirectoryPath(filePath);
    }

    /**
     * Get char pressed (unicode), call it multiple times for chars queued, returns 0 when the queue is empty
     */
    public static int getCharPressed() {
        return Raylib.GetCharPressed();
    }

    /**
     * Unload file text data allocated by LoadFileText()
     */
    public static void unloadFileText(byte[] text) {
        Raylib.UnloadFileText(text);
    }

    /**
     * Unload file text data allocated by LoadFileText()
     */
    public static void unloadFileText(java.nio.ByteBuffer text) {
        Raylib.UnloadFileText(text);
    }

    /**
     * Unload file text data allocated by LoadFileText()
     */
    public static void unloadFileText(org.bytedeco.javacpp.BytePointer text) {
        Raylib.UnloadFileText(text);
    }

    /**
     * Get number of touch points
     */
    public static int getTouchPointCount() {
        return Raylib.GetTouchPointCount();
    }

    /**
     * Draw ellipse
     */
    public static void drawEllipse(int centerX, int centerY, float radiusH, float radiusV, com.raylib.Raylib.Color color) {
        Raylib.DrawEllipse(centerX, centerY, radiusH, radiusV, color);
    }

    /**
     * Decompress data (DEFLATE algorithm), memory must be MemFree()
     */
    public static org.bytedeco.javacpp.BytePointer decompressData(org.bytedeco.javacpp.BytePointer compData, int compDataSize, org.bytedeco.javacpp.IntPointer dataSize) {
        return Raylib.DecompressData(compData, compDataSize, dataSize);
    }

    /**
     * Decompress data (DEFLATE algorithm), memory must be MemFree()
     */
    public static java.nio.ByteBuffer decompressData(java.nio.ByteBuffer compData, int compDataSize, java.nio.IntBuffer dataSize) {
        return Raylib.DecompressData(compData, compDataSize, dataSize);
    }

    /**
     * Decompress data (DEFLATE algorithm), memory must be MemFree()
     */
    public static byte[] decompressData(byte[] compData, int compDataSize, int[] dataSize) {
        return Raylib.DecompressData(compData, compDataSize, dataSize);
    }

    /**
     * Draw ellipse outline
     */
    public static void drawEllipseLines(int centerX, int centerY, float radiusH, float radiusV, com.raylib.Raylib.Color color) {
        Raylib.DrawEllipseLines(centerX, centerY, radiusH, radiusV, color);
    }

    /**
     * Get mouse delta between frames
     */
    public static com.raylib.Raylib.Vector2 getMouseDelta() {
        return Raylib.GetMouseDelta();
    }

    /**
     * Get gamepad internal name id
     */
    public static org.bytedeco.javacpp.BytePointer getGamepadName(int gamepad) {
        return Raylib.GetGamepadName(gamepad);
    }

    /**
     * Check if a gesture have been detected
     */
    public static boolean isGestureDetected(int gesture) {
        return Raylib.IsGestureDetected(gesture);
    }

    /**
     * Draw ring outline
     */
    public static void drawRingLines(com.raylib.Raylib.Vector2 center, float innerRadius, float outerRadius, float startAngle, float endAngle, int segments, com.raylib.Raylib.Color color) {
        Raylib.DrawRingLines(center, innerRadius, outerRadius, startAngle, endAngle, segments, color);
    }

    /**
     * Draw a color-filled rectangle
     */
    public static void drawRectangle(int posX, int posY, int width, int height, com.raylib.Raylib.Color color) {
        Raylib.DrawRectangle(posX, posY, width, height, color);
    }

    /**
     * Get pointer to filename for a path string
     */
    public static org.bytedeco.javacpp.BytePointer getFileName(org.bytedeco.javacpp.BytePointer filePath) {
        return Raylib.GetFileName(filePath);
    }

    /**
     * Get pointer to filename for a path string
     */
    public static java.lang.String getFileName(java.lang.String filePath) {
        return Raylib.GetFileName(filePath);
    }

    /**
     * Get touch position XY for a touch point index (relative to screen size)
     */
    public static com.raylib.Raylib.Vector2 getTouchPosition(int index) {
        return Raylib.GetTouchPosition(index);
    }

    /**
     * Enable a set of gestures using flags
     */
    public static void setGesturesEnabled(int flags) {
        Raylib.SetGesturesEnabled(flags);
    }

    /**
     * Load dropped filepaths
     */
    public static com.raylib.Raylib.FilePathList loadDroppedFiles() {
        return Raylib.LoadDroppedFiles();
    }

    /**
     * Set internal gamepad mappings (SDL_GameControllerDB)
     */
    public static int setGamepadMappings(org.bytedeco.javacpp.BytePointer mappings) {
        return Raylib.SetGamepadMappings(mappings);
    }

    /**
     * Set internal gamepad mappings (SDL_GameControllerDB)
     */
    public static int setGamepadMappings(java.lang.String mappings) {
        return Raylib.SetGamepadMappings(mappings);
    }

    /**
     * Load directory filepaths
     */
    public static com.raylib.Raylib.FilePathList loadDirectoryFiles(java.lang.String dirPath) {
        return Raylib.LoadDirectoryFiles(dirPath);
    }

    /**
     * Load directory filepaths
     */
    public static com.raylib.Raylib.FilePathList loadDirectoryFiles(org.bytedeco.javacpp.BytePointer dirPath) {
        return Raylib.LoadDirectoryFiles(dirPath);
    }

    /**
     * Update camera movement/rotation
     */
    public static void updateCameraPro(com.raylib.Raylib.Camera3D camera, com.raylib.Raylib.Vector3 movement, com.raylib.Raylib.Vector3 rotation, float zoom) {
        Raylib.UpdateCameraPro(camera, movement, rotation, zoom);
    }

    /**
     * Draw a color-filled rectangle (Vector version)
     */
    public static void drawRectangleV(com.raylib.Raylib.Vector2 position, com.raylib.Raylib.Vector2 size, com.raylib.Raylib.Color color) {
        Raylib.DrawRectangleV(position, size, color);
    }

    /**
     * Get key pressed (keycode), call it multiple times for keys queued, returns 0 when the queue is empty
     */
    public static int getKeyPressed() {
        return Raylib.GetKeyPressed();
    }

    /**
     * Check file extension (including point: .png, .wav)
     */
    public static boolean isFileExtension(org.bytedeco.javacpp.BytePointer fileName, org.bytedeco.javacpp.BytePointer ext) {
        return Raylib.IsFileExtension(fileName, ext);
    }

    /**
     * Check file extension (including point: .png, .wav)
     */
    public static boolean isFileExtension(java.lang.String fileName, java.lang.String ext) {
        return Raylib.IsFileExtension(fileName, ext);
    }

    /**
     * Decode Base64 string data, memory must be MemFree()
     */
    public static org.bytedeco.javacpp.BytePointer decodeDataBase64(org.bytedeco.javacpp.BytePointer data, org.bytedeco.javacpp.IntPointer outputSize) {
        return Raylib.DecodeDataBase64(data, outputSize);
    }

    /**
     * Decode Base64 string data, memory must be MemFree()
     */
    public static java.nio.ByteBuffer decodeDataBase64(java.nio.ByteBuffer data, java.nio.IntBuffer outputSize) {
        return Raylib.DecodeDataBase64(data, outputSize);
    }

    /**
     * Decode Base64 string data, memory must be MemFree()
     */
    public static byte[] decodeDataBase64(byte[] data, int[] outputSize) {
        return Raylib.DecodeDataBase64(data, outputSize);
    }

    /**
     * Check if a key has been released once
     */
    public static boolean isKeyReleased(int key) {
        return Raylib.IsKeyReleased(key);
    }

    /**
     * Check if a mouse button is being pressed
     */
    public static boolean isMouseButtonDown(int button) {
        return Raylib.IsMouseButtonDown(button);
    }

    /**
     * Compress data (DEFLATE algorithm), memory must be MemFree()
     */
    public static java.nio.ByteBuffer compressData(java.nio.ByteBuffer data, int dataSize, java.nio.IntBuffer compDataSize) {
        return Raylib.CompressData(data, dataSize, compDataSize);
    }

    /**
     * Compress data (DEFLATE algorithm), memory must be MemFree()
     */
    public static byte[] compressData(byte[] data, int dataSize, int[] compDataSize) {
        return Raylib.CompressData(data, dataSize, compDataSize);
    }

    /**
     * Compress data (DEFLATE algorithm), memory must be MemFree()
     */
    public static org.bytedeco.javacpp.BytePointer compressData(org.bytedeco.javacpp.BytePointer data, int dataSize, org.bytedeco.javacpp.IntPointer compDataSize) {
        return Raylib.CompressData(data, dataSize, compDataSize);
    }

    /**
     * Get mouse position XY
     */
    public static com.raylib.Raylib.Vector2 getMousePosition() {
        return Raylib.GetMousePosition();
    }

    /**
     * Set mouse scaling
     */
    public static void setMouseScale(float scaleX, float scaleY) {
        Raylib.SetMouseScale(scaleX, scaleY);
    }

    /**
     * Get pointer to extension for a filename string (includes dot: '.png')
     */
    public static java.lang.String getFileExtension(java.lang.String fileName) {
        return Raylib.GetFileExtension(fileName);
    }

    /**
     * Get pointer to extension for a filename string (includes dot: '.png')
     */
    public static org.bytedeco.javacpp.BytePointer getFileExtension(org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.GetFileExtension(fileName);
    }

    /**
     * Create directories (including full path requested), returns 0 on success
     */
    public static int makeDirectory(java.lang.String dirPath) {
        return Raylib.MakeDirectory(dirPath);
    }

    /**
     * Create directories (including full path requested), returns 0 on success
     */
    public static int makeDirectory(org.bytedeco.javacpp.BytePointer dirPath) {
        return Raylib.MakeDirectory(dirPath);
    }

    /**
     * Draw text (custom sprite font) within an image (destination)
     */
    public static void imageDrawTextEx(com.raylib.Raylib.Image dst, com.raylib.Raylib.Font font, java.lang.String text, com.raylib.Raylib.Vector2 position, float fontSize, float spacing, com.raylib.Raylib.Color tint) {
        Raylib.ImageDrawTextEx(dst, font, text, position, fontSize, spacing, tint);
    }

    /**
     * Draw text (custom sprite font) within an image (destination)
     */
    public static void imageDrawTextEx(com.raylib.Raylib.Image dst, com.raylib.Raylib.Font font, org.bytedeco.javacpp.BytePointer text, com.raylib.Raylib.Vector2 position, float fontSize, float spacing, com.raylib.Raylib.Color tint) {
        Raylib.ImageDrawTextEx(dst, font, text, position, fontSize, spacing, tint);
    }

    /**
     * Draw a line defining thickness within an image
     */
    public static void imageDrawLineEx(com.raylib.Raylib.Image dst, com.raylib.Raylib.Vector2 start, com.raylib.Raylib.Vector2 end, int thick, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawLineEx(dst, start, end, thick, color);
    }

    /**
     * Draw triangle outline (vertex in counter-clockwise order!)
     */
    public static void drawTriangleLines(com.raylib.Raylib.Vector2 v1, com.raylib.Raylib.Vector2 v2, com.raylib.Raylib.Vector2 v3, com.raylib.Raylib.Color color) {
        Raylib.DrawTriangleLines(v1, v2, v3, color);
    }

    /**
     * Load texture from file into GPU memory (VRAM)
     */
    public static com.raylib.Raylib.Texture loadTexture(org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.LoadTexture(fileName);
    }

    /**
     * Load texture from file into GPU memory (VRAM)
     */
    public static com.raylib.Raylib.Texture loadTexture(java.lang.String fileName) {
        return Raylib.LoadTexture(fileName);
    }

    /**
     * Generate image: checked
     */
    public static com.raylib.Raylib.Image genImageChecked(int width, int height, int checksX, int checksY, com.raylib.Raylib.Color col1, com.raylib.Raylib.Color col2) {
        return Raylib.GenImageChecked(width, height, checksX, checksY, col1, col2);
    }

    /**
     * Resize image (Nearest-Neighbor scaling algorithm)
     */
    public static void imageResizeNN(com.raylib.Raylib.Image image, int newWidth, int newHeight) {
        Raylib.ImageResizeNN(image, newWidth, newHeight);
    }

    /**
     * Load cubemap from image, multiple image cubemap layouts supported
     */
    public static com.raylib.Raylib.Texture loadTextureCubemap(com.raylib.Raylib.Image image, int layout) {
        return Raylib.LoadTextureCubemap(image, layout);
    }

    /**
     * Draw text (using default font) within an image (destination)
     */
    public static void imageDrawText(com.raylib.Raylib.Image dst, java.lang.String text, int posX, int posY, int fontSize, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawText(dst, text, posX, posY, fontSize, color);
    }

    /**
     * Draw text (using default font) within an image (destination)
     */
    public static void imageDrawText(com.raylib.Raylib.Image dst, org.bytedeco.javacpp.BytePointer text, int posX, int posY, int fontSize, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawText(dst, text, posX, posY, fontSize, color);
    }

    /**
     * Compute all mipmap levels for a provided image
     */
    public static void imageMipmaps(com.raylib.Raylib.Image image) {
        Raylib.ImageMipmaps(image);
    }

    /**
     * Create an image from text (custom sprite font)
     */
    public static com.raylib.Raylib.Image imageTextEx(com.raylib.Raylib.Font font, java.lang.String text, float fontSize, float spacing, com.raylib.Raylib.Color tint) {
        return Raylib.ImageTextEx(font, text, fontSize, spacing, tint);
    }

    /**
     * Create an image from text (custom sprite font)
     */
    public static com.raylib.Raylib.Image imageTextEx(com.raylib.Raylib.Font font, org.bytedeco.javacpp.BytePointer text, float fontSize, float spacing, com.raylib.Raylib.Color tint) {
        return Raylib.ImageTextEx(font, text, fontSize, spacing, tint);
    }

    /**
     * Crop image depending on alpha value
     */
    public static void imageAlphaCrop(com.raylib.Raylib.Image image, float threshold) {
        Raylib.ImageAlphaCrop(image, threshold);
    }

    /**
     * Modify image color: contrast (-100 to 100)
     */
    public static void imageColorContrast(com.raylib.Raylib.Image image, float contrast) {
        Raylib.ImageColorContrast(image, contrast);
    }

    /**
     * Draw spline: B-Spline, minimum 4 points
     */
    public static void drawSplineBasis(com.raylib.Raylib.Vector2 points, int pointCount, float thick, com.raylib.Raylib.Color color) {
        Raylib.DrawSplineBasis(points, pointCount, thick, color);
    }

    /**
     * Get collision rectangle for two rectangles collision
     */
    public static com.raylib.Raylib.Rectangle getCollisionRec(com.raylib.Raylib.Rectangle rec1, com.raylib.Raylib.Rectangle rec2) {
        return Raylib.GetCollisionRec(rec1, rec2);
    }

    /**
     * Draw a color-filled rectangle with pro parameters
     */
    public static void drawRectanglePro(com.raylib.Raylib.Rectangle rec, com.raylib.Raylib.Vector2 origin, float rotation, com.raylib.Raylib.Color color) {
        Raylib.DrawRectanglePro(rec, origin, rotation, color);
    }

    /**
     * Load image from RAW file data
     */
    public static com.raylib.Raylib.Image loadImageRaw(org.bytedeco.javacpp.BytePointer fileName, int width, int height, int format, int headerSize) {
        return Raylib.LoadImageRaw(fileName, width, height, format, headerSize);
    }

    /**
     * Load image from RAW file data
     */
    public static com.raylib.Raylib.Image loadImageRaw(java.lang.String fileName, int width, int height, int format, int headerSize) {
        return Raylib.LoadImageRaw(fileName, width, height, format, headerSize);
    }

    /**
     * Rotate image counter-clockwise 90deg
     */
    public static void imageRotateCCW(com.raylib.Raylib.Image image) {
        Raylib.ImageRotateCCW(image);
    }

    /**
     * Get image pixel color at (x, y) position
     */
    public static com.raylib.Raylib.Color getImageColor(com.raylib.Raylib.Image image, int x, int y) {
        return Raylib.GetImageColor(image, x, y);
    }

    /**
     * Draw rectangle outline
     */
    public static void drawRectangleLines(int posX, int posY, int width, int height, com.raylib.Raylib.Color color) {
        Raylib.DrawRectangleLines(posX, posY, width, height, color);
    }

    /**
     * Export image data to file, returns true on success
     */
    public static boolean exportImage(com.raylib.Raylib.Image image, java.lang.String fileName) {
        return Raylib.ExportImage(image, fileName);
    }

    /**
     * Export image data to file, returns true on success
     */
    public static boolean exportImage(com.raylib.Raylib.Image image, org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.ExportImage(image, fileName);
    }

    /**
     * Generate image: cellular algorithm, bigger tileSize means bigger cells
     */
    public static com.raylib.Raylib.Image genImageCellular(int width, int height, int tileSize) {
        return Raylib.GenImageCellular(width, height, tileSize);
    }

    /**
     * Convert image data to desired format
     */
    public static void imageFormat(com.raylib.Raylib.Image image, int newFormat) {
        Raylib.ImageFormat(image, newFormat);
    }

    /**
     * Apply alpha mask to image
     */
    public static void imageAlphaMask(com.raylib.Raylib.Image image, com.raylib.Raylib.Image alphaMask) {
        Raylib.ImageAlphaMask(image, alphaMask);
    }

    /**
     * Apply Gaussian blur using a box blur approximation
     */
    public static void imageBlurGaussian(com.raylib.Raylib.Image image, int blurSize) {
        Raylib.ImageBlurGaussian(image, blurSize);
    }

    /**
     * Generate image: grayscale image from text data
     */
    public static com.raylib.Raylib.Image genImageText(int width, int height, java.lang.String text) {
        return Raylib.GenImageText(width, height, text);
    }

    /**
     * Generate image: grayscale image from text data
     */
    public static com.raylib.Raylib.Image genImageText(int width, int height, org.bytedeco.javacpp.BytePointer text) {
        return Raylib.GenImageText(width, height, text);
    }

    /**
     * Resize image (Bicubic scaling algorithm)
     */
    public static void imageResize(com.raylib.Raylib.Image image, int newWidth, int newHeight) {
        Raylib.ImageResize(image, newWidth, newHeight);
    }

    /**
     * Modify image color: invert
     */
    public static void imageColorInvert(com.raylib.Raylib.Image image) {
        Raylib.ImageColorInvert(image);
    }

    /**
     * Draw a filled circle within an image
     */
    public static void imageDrawCircle(com.raylib.Raylib.Image dst, int centerX, int centerY, int radius, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawCircle(dst, centerX, centerY, radius, color);
    }

    /**
     * Draw spline: Linear, minimum 2 points
     */
    public static void drawSplineLinear(com.raylib.Raylib.Vector2 points, int pointCount, float thick, com.raylib.Raylib.Color color) {
        Raylib.DrawSplineLinear(points, pointCount, thick, color);
    }

    /**
     * Draw a filled circle within an image (Vector version)
     */
    public static void imageDrawCircleV(com.raylib.Raylib.Image dst, com.raylib.Raylib.Vector2 center, int radius, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawCircleV(dst, center, radius, color);
    }

    /**
     * Modify image color: tint
     */
    public static void imageColorTint(com.raylib.Raylib.Image image, com.raylib.Raylib.Color color) {
        Raylib.ImageColorTint(image, color);
    }

    /**
     * Generate image: white noise
     */
    public static com.raylib.Raylib.Image genImageWhiteNoise(int width, int height, float factor) {
        return Raylib.GenImageWhiteNoise(width, height, factor);
    }

    /**
     * Modify image color: replace color
     */
    public static void imageColorReplace(com.raylib.Raylib.Image image, com.raylib.Raylib.Color color, com.raylib.Raylib.Color replace) {
        Raylib.ImageColorReplace(image, color, replace);
    }

    /**
     * Unload colors palette loaded with LoadImagePalette()
     */
    public static void unloadImagePalette(com.raylib.Raylib.Color colors) {
        Raylib.UnloadImagePalette(colors);
    }

    /**
     * Draw a triangle strip defined by points
     */
    public static void drawTriangleStrip(com.raylib.Raylib.Vector2 points, int pointCount, com.raylib.Raylib.Color color) {
        Raylib.DrawTriangleStrip(points, pointCount, color);
    }

    /**
     * Dither image data to 16bpp or lower (Floyd-Steinberg dithering)
     */
    public static void imageDither(com.raylib.Raylib.Image image, int rBpp, int gBpp, int bBpp, int aBpp) {
        Raylib.ImageDither(image, rBpp, gBpp, bBpp, aBpp);
    }

    /**
     * Generate image: plain color
     */
    public static com.raylib.Raylib.Image genImageColor(int width, int height, com.raylib.Raylib.Color color) {
        return Raylib.GenImageColor(width, height, color);
    }

    /**
     * Draw a triangle fan defined by points (first vertex is the center)
     */
    public static void drawTriangleFan(com.raylib.Raylib.Vector2 points, int pointCount, com.raylib.Raylib.Color color) {
        Raylib.DrawTriangleFan(points, pointCount, color);
    }

    /**
     * Check collision between two rectangles
     */
    public static boolean checkCollisionRecs(com.raylib.Raylib.Rectangle rec1, com.raylib.Raylib.Rectangle rec2) {
        return Raylib.CheckCollisionRecs(rec1, rec2);
    }

    /**
     * Flip image vertically
     */
    public static void imageFlipVertical(com.raylib.Raylib.Image image) {
        Raylib.ImageFlipVertical(image);
    }

    /**
     * Rotate image clockwise 90deg
     */
    public static void imageRotateCW(com.raylib.Raylib.Image image) {
        Raylib.ImageRotateCW(image);
    }

    /**
     * Draw pixel within an image (Vector version)
     */
    public static void imageDrawPixelV(com.raylib.Raylib.Image dst, com.raylib.Raylib.Vector2 position, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawPixelV(dst, position, color);
    }

    /**
     * Draw a polygon outline of n sides
     */
    public static void drawPolyLines(com.raylib.Raylib.Vector2 center, int sides, float radius, float rotation, com.raylib.Raylib.Color color) {
        Raylib.DrawPolyLines(center, sides, radius, rotation, color);
    }

    /**
     * Draw a polygon outline of n sides with extended parameters
     */
    public static void drawPolyLinesEx(com.raylib.Raylib.Vector2 center, int sides, float radius, float rotation, float lineThick, com.raylib.Raylib.Color color) {
        Raylib.DrawPolyLinesEx(center, sides, radius, rotation, lineThick, color);
    }

    /**
     * Load image sequence from file (frames appended to image.data)
     */
    public static com.raylib.Raylib.Image loadImageAnim(java.lang.String fileName, java.nio.IntBuffer frames) {
        return Raylib.LoadImageAnim(fileName, frames);
    }

    /**
     * Load image sequence from file (frames appended to image.data)
     */
    public static com.raylib.Raylib.Image loadImageAnim(org.bytedeco.javacpp.BytePointer fileName, java.nio.IntBuffer frames) {
        return Raylib.LoadImageAnim(fileName, frames);
    }

    /**
     * Load image sequence from file (frames appended to image.data)
     */
    public static com.raylib.Raylib.Image loadImageAnim(java.lang.String fileName, int[] frames) {
        return Raylib.LoadImageAnim(fileName, frames);
    }

    /**
     * Load image sequence from file (frames appended to image.data)
     */
    public static com.raylib.Raylib.Image loadImageAnim(org.bytedeco.javacpp.BytePointer fileName, org.bytedeco.javacpp.IntPointer frames) {
        return Raylib.LoadImageAnim(fileName, frames);
    }

    /**
     * Load image sequence from file (frames appended to image.data)
     */
    public static com.raylib.Raylib.Image loadImageAnim(org.bytedeco.javacpp.BytePointer fileName, int[] frames) {
        return Raylib.LoadImageAnim(fileName, frames);
    }

    /**
     * Load image sequence from file (frames appended to image.data)
     */
    public static com.raylib.Raylib.Image loadImageAnim(java.lang.String fileName, org.bytedeco.javacpp.IntPointer frames) {
        return Raylib.LoadImageAnim(fileName, frames);
    }

    /**
     * Draw a color-filled rectangle
     */
    public static void drawRectangleRec(com.raylib.Raylib.Rectangle rec, com.raylib.Raylib.Color color) {
        Raylib.DrawRectangleRec(rec, color);
    }

    /**
     * Check if an image is valid (data and parameters)
     */
    public static boolean isImageValid(com.raylib.Raylib.Image image) {
        return Raylib.IsImageValid(image);
    }

    /**
     * Export image as code file defining an array of bytes, returns true on success
     */
    public static boolean exportImageAsCode(com.raylib.Raylib.Image image, org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.ExportImageAsCode(image, fileName);
    }

    /**
     * Export image as code file defining an array of bytes, returns true on success
     */
    public static boolean exportImageAsCode(com.raylib.Raylib.Image image, java.lang.String fileName) {
        return Raylib.ExportImageAsCode(image, fileName);
    }

    /**
     * Create an image from another image piece
     */
    public static com.raylib.Raylib.Image imageFromImage(com.raylib.Raylib.Image image, com.raylib.Raylib.Rectangle rec) {
        return Raylib.ImageFromImage(image, rec);
    }

    /**
     * Clear alpha channel to desired color
     */
    public static void imageAlphaClear(com.raylib.Raylib.Image image, com.raylib.Raylib.Color color, float threshold) {
        Raylib.ImageAlphaClear(image, color, threshold);
    }

    /**
     * Rotate image by input angle in degrees (-359 to 359)
     */
    public static void imageRotate(com.raylib.Raylib.Image image, int degrees) {
        Raylib.ImageRotate(image, degrees);
    }

    /**
     * Load color data from image as a Color array (RGBA - 32bit)
     */
    public static com.raylib.Raylib.Color loadImageColors(com.raylib.Raylib.Image image) {
        return Raylib.LoadImageColors(image);
    }

    /**
     * Unload color data loaded with LoadImageColors()
     */
    public static void unloadImageColors(com.raylib.Raylib.Color colors) {
        Raylib.UnloadImageColors(colors);
    }

    /**
     * Draw pixel within an image
     */
    public static void imageDrawPixel(com.raylib.Raylib.Image dst, int posX, int posY, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawPixel(dst, posX, posY, color);
    }

    /**
     * Unload image from CPU memory (RAM)
     */
    public static void unloadImage(com.raylib.Raylib.Image image) {
        Raylib.UnloadImage(image);
    }

    /**
     * Resize canvas and fill with color
     */
    public static void imageResizeCanvas(com.raylib.Raylib.Image image, int newWidth, int newHeight, int offsetX, int offsetY, com.raylib.Raylib.Color fill) {
        Raylib.ImageResizeCanvas(image, newWidth, newHeight, offsetX, offsetY, fill);
    }

    /**
     * Create an image from a selected channel of another image (GRAYSCALE)
     */
    public static com.raylib.Raylib.Image imageFromChannel(com.raylib.Raylib.Image image, int selectedChannel) {
        return Raylib.ImageFromChannel(image, selectedChannel);
    }

    /**
     * Load colors palette from image as a Color array (RGBA - 32bit)
     */
    public static com.raylib.Raylib.Color loadImagePalette(com.raylib.Raylib.Image image, int maxPaletteSize, org.bytedeco.javacpp.IntPointer colorCount) {
        return Raylib.LoadImagePalette(image, maxPaletteSize, colorCount);
    }

    /**
     * Load colors palette from image as a Color array (RGBA - 32bit)
     */
    public static com.raylib.Raylib.Color loadImagePalette(com.raylib.Raylib.Image image, int maxPaletteSize, int[] colorCount) {
        return Raylib.LoadImagePalette(image, maxPaletteSize, colorCount);
    }

    /**
     * Load colors palette from image as a Color array (RGBA - 32bit)
     */
    public static com.raylib.Raylib.Color loadImagePalette(com.raylib.Raylib.Image image, int maxPaletteSize, java.nio.IntBuffer colorCount) {
        return Raylib.LoadImagePalette(image, maxPaletteSize, colorCount);
    }

    /**
     * Draw line within an image
     */
    public static void imageDrawLine(com.raylib.Raylib.Image dst, int startPosX, int startPosY, int endPosX, int endPosY, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawLine(dst, startPosX, startPosY, endPosX, endPosY, color);
    }

    /**
     * Draw line within an image (Vector version)
     */
    public static void imageDrawLineV(com.raylib.Raylib.Image dst, com.raylib.Raylib.Vector2 start, com.raylib.Raylib.Vector2 end, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawLineV(dst, start, end, color);
    }

    /**
     * Draw a color-filled triangle (vertex in counter-clockwise order!)
     */
    public static void drawTriangle(com.raylib.Raylib.Vector2 v1, com.raylib.Raylib.Vector2 v2, com.raylib.Raylib.Vector2 v3, com.raylib.Raylib.Color color) {
        Raylib.DrawTriangle(v1, v2, v3, color);
    }

    /**
     * Draw rectangle within an image
     */
    public static void imageDrawRectangle(com.raylib.Raylib.Image dst, int posX, int posY, int width, int height, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawRectangle(dst, posX, posY, width, height, color);
    }

    /**
     * Draw triangle within an image
     */
    public static void imageDrawTriangle(com.raylib.Raylib.Image dst, com.raylib.Raylib.Vector2 v1, com.raylib.Raylib.Vector2 v2, com.raylib.Raylib.Vector2 v3, com.raylib.Raylib.Color color) {
        Raylib.ImageDrawTriangle(dst, v1, v2, v3, color);
    }

    /**
     * Measure string width for default font
     */
    public static int measureText(java.lang.String text, int fontSize) {
        return Raylib.MeasureText(text, fontSize);
    }

    /**
     * Measure string width for default font
     */
    public static int measureText(org.bytedeco.javacpp.BytePointer text, int fontSize) {
        return Raylib.MeasureText(text, fontSize);
    }

    /**
     * Get Snake case notation version of provided string
     */
    public static java.lang.String textToSnake(java.lang.String text) {
        return Raylib.TextToSnake(text);
    }

    /**
     * Get Snake case notation version of provided string
     */
    public static org.bytedeco.javacpp.BytePointer textToSnake(org.bytedeco.javacpp.BytePointer text) {
        return Raylib.TextToSnake(text);
    }

    /**
     * Unload texture from GPU memory (VRAM)
     */
    public static void unloadTexture(com.raylib.Raylib.Texture texture) {
        Raylib.UnloadTexture(texture);
    }

    /**
     * Set color formatted into destination pixel pointer
     */
    public static void setPixelColor(org.bytedeco.javacpp.Pointer dstPtr, com.raylib.Raylib.Color color, int format) {
        Raylib.SetPixelColor(dstPtr, color, format);
    }

    /**
     * Set texture scaling filter mode
     */
    public static void setTextureFilter(com.raylib.Raylib.Texture texture, int filter) {
        Raylib.SetTextureFilter(texture, filter);
    }

    /**
     * Load all codepoints from a UTF-8 text string, codepoints count returned by parameter
     */
    public static int[] loadCodepoints(java.lang.String text, int[] count) {
        return Raylib.LoadCodepoints(text, count);
    }

    /**
     * Load all codepoints from a UTF-8 text string, codepoints count returned by parameter
     */
    public static int[] loadCodepoints(org.bytedeco.javacpp.BytePointer text, int[] count) {
        return Raylib.LoadCodepoints(text, count);
    }

    /**
     * Load all codepoints from a UTF-8 text string, codepoints count returned by parameter
     */
    public static java.nio.IntBuffer loadCodepoints(java.lang.String text, java.nio.IntBuffer count) {
        return Raylib.LoadCodepoints(text, count);
    }

    /**
     * Load all codepoints from a UTF-8 text string, codepoints count returned by parameter
     */
    public static org.bytedeco.javacpp.IntPointer loadCodepoints(java.lang.String text, org.bytedeco.javacpp.IntPointer count) {
        return Raylib.LoadCodepoints(text, count);
    }

    /**
     * Load all codepoints from a UTF-8 text string, codepoints count returned by parameter
     */
    public static org.bytedeco.javacpp.IntPointer loadCodepoints(org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.IntPointer count) {
        return Raylib.LoadCodepoints(text, count);
    }

    /**
     * Load all codepoints from a UTF-8 text string, codepoints count returned by parameter
     */
    public static java.nio.IntBuffer loadCodepoints(org.bytedeco.javacpp.BytePointer text, java.nio.IntBuffer count) {
        return Raylib.LoadCodepoints(text, count);
    }

    /**
     * Get upper case version of provided string
     */
    public static java.lang.String textToUpper(java.lang.String text) {
        return Raylib.TextToUpper(text);
    }

    /**
     * Get upper case version of provided string
     */
    public static org.bytedeco.javacpp.BytePointer textToUpper(org.bytedeco.javacpp.BytePointer text) {
        return Raylib.TextToUpper(text);
    }

    /**
     * Get float value from text (negative values not supported)
     */
    public static float textToFloat(java.lang.String text) {
        return Raylib.TextToFloat(text);
    }

    /**
     * Get float value from text (negative values not supported)
     */
    public static float textToFloat(org.bytedeco.javacpp.BytePointer text) {
        return Raylib.TextToFloat(text);
    }

    /**
     * Set texture wrapping mode
     */
    public static void setTextureWrap(com.raylib.Raylib.Texture texture, int wrap) {
        Raylib.SetTextureWrap(texture, wrap);
    }

    /**
     * Draw a point in 3D space, actually a small line
     */
    public static void drawPoint3D(com.raylib.Raylib.Vector3 position, com.raylib.Raylib.Color color) {
        Raylib.DrawPoint3D(position, color);
    }

    /**
     * Draw text using Font and pro parameters (rotation)
     */
    public static void drawTextPro(com.raylib.Raylib.Font font, org.bytedeco.javacpp.BytePointer text, com.raylib.Raylib.Vector2 position, com.raylib.Raylib.Vector2 origin, float rotation, float fontSize, float spacing, com.raylib.Raylib.Color tint) {
        Raylib.DrawTextPro(font, text, position, origin, rotation, fontSize, spacing, tint);
    }

    /**
     * Draw text using Font and pro parameters (rotation)
     */
    public static void drawTextPro(com.raylib.Raylib.Font font, java.lang.String text, com.raylib.Raylib.Vector2 position, com.raylib.Raylib.Vector2 origin, float rotation, float fontSize, float spacing, com.raylib.Raylib.Color tint) {
        Raylib.DrawTextPro(font, text, position, origin, rotation, fontSize, spacing, tint);
    }

    /**
     * Encode one codepoint into UTF-8 byte array (array length returned as parameter)
     */
    public static org.bytedeco.javacpp.BytePointer codepointToUTF8(int codepoint, int[] utf8Size) {
        return Raylib.CodepointToUTF8(codepoint, utf8Size);
    }

    /**
     * Encode one codepoint into UTF-8 byte array (array length returned as parameter)
     */
    public static org.bytedeco.javacpp.BytePointer codepointToUTF8(int codepoint, org.bytedeco.javacpp.IntPointer utf8Size) {
        return Raylib.CodepointToUTF8(codepoint, utf8Size);
    }

    /**
     * Encode one codepoint into UTF-8 byte array (array length returned as parameter)
     */
    public static java.lang.String codepointToUTF8(int codepoint, java.nio.IntBuffer utf8Size) {
        return Raylib.CodepointToUTF8(codepoint, utf8Size);
    }

    /**
     * Draw a color-filled triangle (vertex in counter-clockwise order!)
     */
    public static void drawTriangle3D(com.raylib.Raylib.Vector3 v1, com.raylib.Raylib.Vector3 v2, com.raylib.Raylib.Vector3 v3, com.raylib.Raylib.Color color) {
        Raylib.DrawTriangle3D(v1, v2, v3, color);
    }

    /**
     * Generate GPU mipmaps for a texture
     */
    public static void genTextureMipmaps(com.raylib.Raylib.Texture texture) {
        Raylib.GenTextureMipmaps(texture);
    }

    /**
     * Draw a circle in 3D world space
     */
    public static void drawCircle3D(com.raylib.Raylib.Vector3 center, float radius, com.raylib.Raylib.Vector3 rotationAxis, float rotationAngle, com.raylib.Raylib.Color color) {
        Raylib.DrawCircle3D(center, radius, rotationAxis, rotationAngle, color);
    }

    /**
     * Get next codepoint in a UTF-8 encoded string, 0x3f('?') is returned on failure
     */
    public static int getCodepoint(java.lang.String text, java.nio.IntBuffer codepointSize) {
        return Raylib.GetCodepoint(text, codepointSize);
    }

    /**
     * Get next codepoint in a UTF-8 encoded string, 0x3f('?') is returned on failure
     */
    public static int getCodepoint(org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.IntPointer codepointSize) {
        return Raylib.GetCodepoint(text, codepointSize);
    }

    /**
     * Get next codepoint in a UTF-8 encoded string, 0x3f('?') is returned on failure
     */
    public static int getCodepoint(org.bytedeco.javacpp.BytePointer text, java.nio.IntBuffer codepointSize) {
        return Raylib.GetCodepoint(text, codepointSize);
    }

    /**
     * Get next codepoint in a UTF-8 encoded string, 0x3f('?') is returned on failure
     */
    public static int getCodepoint(java.lang.String text, org.bytedeco.javacpp.IntPointer codepointSize) {
        return Raylib.GetCodepoint(text, codepointSize);
    }

    /**
     * Get next codepoint in a UTF-8 encoded string, 0x3f('?') is returned on failure
     */
    public static int getCodepoint(org.bytedeco.javacpp.BytePointer text, int[] codepointSize) {
        return Raylib.GetCodepoint(text, codepointSize);
    }

    /**
     * Get next codepoint in a UTF-8 encoded string, 0x3f('?') is returned on failure
     */
    public static int getCodepoint(java.lang.String text, int[] codepointSize) {
        return Raylib.GetCodepoint(text, codepointSize);
    }

    /**
     * Get glyph index position in font for a codepoint (unicode character), fallback to '?' if not found
     */
    public static int getGlyphIndex(com.raylib.Raylib.Font font, int codepoint) {
        return Raylib.GetGlyphIndex(font, codepoint);
    }

    /**
     * Draw cube wires
     */
    public static void drawCubeWires(com.raylib.Raylib.Vector3 position, float width, float height, float length, com.raylib.Raylib.Color color) {
        Raylib.DrawCubeWires(position, width, height, length, color);
    }

    /**
     * Draw cube wires (Vector version)
     */
    public static void drawCubeWiresV(com.raylib.Raylib.Vector3 position, com.raylib.Raylib.Vector3 size, com.raylib.Raylib.Color color) {
        Raylib.DrawCubeWiresV(position, size, color);
    }

    /**
     * Load font data for further use
     */
    public static com.raylib.Raylib.GlyphInfo loadFontData(org.bytedeco.javacpp.BytePointer fileData, int dataSize, int fontSize, org.bytedeco.javacpp.IntPointer codepoints, int codepointCount, int type) {
        return Raylib.LoadFontData(fileData, dataSize, fontSize, codepoints, codepointCount, type);
    }

    /**
     * Load font data for further use
     */
    public static com.raylib.Raylib.GlyphInfo loadFontData(byte[] fileData, int dataSize, int fontSize, int[] codepoints, int codepointCount, int type) {
        return Raylib.LoadFontData(fileData, dataSize, fontSize, codepoints, codepointCount, type);
    }

    /**
     * Load font data for further use
     */
    public static com.raylib.Raylib.GlyphInfo loadFontData(java.nio.ByteBuffer fileData, int dataSize, int fontSize, java.nio.IntBuffer codepoints, int codepointCount, int type) {
        return Raylib.LoadFontData(fileData, dataSize, fontSize, codepoints, codepointCount, type);
    }

    /**
     * Get next codepoint in a UTF-8 encoded string, 0x3f('?') is returned on failure
     */
    public static int getCodepointNext(java.lang.String text, int[] codepointSize) {
        return Raylib.GetCodepointNext(text, codepointSize);
    }

    /**
     * Get next codepoint in a UTF-8 encoded string, 0x3f('?') is returned on failure
     */
    public static int getCodepointNext(java.lang.String text, java.nio.IntBuffer codepointSize) {
        return Raylib.GetCodepointNext(text, codepointSize);
    }

    /**
     * Get next codepoint in a UTF-8 encoded string, 0x3f('?') is returned on failure
     */
    public static int getCodepointNext(org.bytedeco.javacpp.BytePointer text, int[] codepointSize) {
        return Raylib.GetCodepointNext(text, codepointSize);
    }

    /**
     * Get next codepoint in a UTF-8 encoded string, 0x3f('?') is returned on failure
     */
    public static int getCodepointNext(org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.IntPointer codepointSize) {
        return Raylib.GetCodepointNext(text, codepointSize);
    }

    /**
     * Get next codepoint in a UTF-8 encoded string, 0x3f('?') is returned on failure
     */
    public static int getCodepointNext(org.bytedeco.javacpp.BytePointer text, java.nio.IntBuffer codepointSize) {
        return Raylib.GetCodepointNext(text, codepointSize);
    }

    /**
     * Get next codepoint in a UTF-8 encoded string, 0x3f('?') is returned on failure
     */
    public static int getCodepointNext(java.lang.String text, org.bytedeco.javacpp.IntPointer codepointSize) {
        return Raylib.GetCodepointNext(text, codepointSize);
    }

    /**
     * Load font from Image (XNA style)
     */
    public static com.raylib.Raylib.Font loadFontFromImage(com.raylib.Raylib.Image image, com.raylib.Raylib.Color key, int firstChar) {
        return Raylib.LoadFontFromImage(image, key, firstChar);
    }

    /**
     * Draw one character (codepoint)
     */
    public static void drawTextCodepoint(com.raylib.Raylib.Font font, int codepoint, com.raylib.Raylib.Vector2 position, float fontSize, com.raylib.Raylib.Color tint) {
        Raylib.DrawTextCodepoint(font, codepoint, position, fontSize, tint);
    }

    /**
     * Get glyph font info data for a codepoint (unicode character), fallback to '?' if not found
     */
    public static com.raylib.Raylib.GlyphInfo getGlyphInfo(com.raylib.Raylib.Font font, int codepoint) {
        return Raylib.GetGlyphInfo(font, codepoint);
    }

    /**
     * Get Color from a source pixel pointer of certain format
     */
    public static com.raylib.Raylib.Color getPixelColor(org.bytedeco.javacpp.Pointer srcPtr, int format) {
        return Raylib.GetPixelColor(srcPtr, format);
    }

    /**
     * Find first text occurrence within a string
     */
    public static int textFindIndex(java.lang.String text, java.lang.String find) {
        return Raylib.TextFindIndex(text, find);
    }

    /**
     * Find first text occurrence within a string
     */
    public static int textFindIndex(org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.BytePointer find) {
        return Raylib.TextFindIndex(text, find);
    }

    /**
     * Draw a Texture2D with position defined as Vector2
     */
    public static void drawTextureV(com.raylib.Raylib.Texture texture, com.raylib.Raylib.Vector2 position, com.raylib.Raylib.Color tint) {
        Raylib.DrawTextureV(texture, position, tint);
    }

    /**
     * Get Camel case notation version of provided string
     */
    public static org.bytedeco.javacpp.BytePointer textToCamel(org.bytedeco.javacpp.BytePointer text) {
        return Raylib.TextToCamel(text);
    }

    /**
     * Get Camel case notation version of provided string
     */
    public static java.lang.String textToCamel(java.lang.String text) {
        return Raylib.TextToCamel(text);
    }

    /**
     * Load texture for rendering (framebuffer)
     */
    public static com.raylib.Raylib.RenderTexture loadRenderTexture(int width, int height) {
        return Raylib.LoadRenderTexture(width, height);
    }

    /**
     * Unload font chars info data (RAM)
     */
    public static void unloadFontData(com.raylib.Raylib.GlyphInfo glyphs, int glyphCount) {
        Raylib.UnloadFontData(glyphs, glyphCount);
    }

    /**
     * Get integer value from text (negative values not supported)
     */
    public static int textToInteger(java.lang.String text) {
        return Raylib.TextToInteger(text);
    }

    /**
     * Get integer value from text (negative values not supported)
     */
    public static int textToInteger(org.bytedeco.javacpp.BytePointer text) {
        return Raylib.TextToInteger(text);
    }

    /**
     * Update GPU texture with new data
     */
    public static void updateTexture(com.raylib.Raylib.Texture texture, org.bytedeco.javacpp.Pointer pixels) {
        Raylib.UpdateTexture(texture, pixels);
    }

    /**
     * Draw a part of a texture defined by a rectangle
     */
    public static void drawTextureRec(com.raylib.Raylib.Texture texture, com.raylib.Raylib.Rectangle source, com.raylib.Raylib.Vector2 position, com.raylib.Raylib.Color tint) {
        Raylib.DrawTextureRec(texture, source, position, tint);
    }

    /**
     * Check if two colors are equal
     */
    public static boolean colorIsEqual(com.raylib.Raylib.Color col1, com.raylib.Raylib.Color col2) {
        return Raylib.ColorIsEqual(col1, col2);
    }

    /**
     * Get src alpha-blended into dst color with tint
     */
    public static com.raylib.Raylib.Color colorAlphaBlend(com.raylib.Raylib.Color dst, com.raylib.Raylib.Color src, com.raylib.Raylib.Color tint) {
        return Raylib.ColorAlphaBlend(dst, src, tint);
    }

    /**
     * Check if a font is valid (font data loaded, WARNING: GPU texture not checked)
     */
    public static boolean isFontValid(com.raylib.Raylib.Font font) {
        return Raylib.IsFontValid(font);
    }

    /**
     * Export font as code file, returns true on success
     */
    public static boolean exportFontAsCode(com.raylib.Raylib.Font font, org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.ExportFontAsCode(font, fileName);
    }

    /**
     * Export font as code file, returns true on success
     */
    public static boolean exportFontAsCode(com.raylib.Raylib.Font font, java.lang.String fileName) {
        return Raylib.ExportFontAsCode(font, fileName);
    }

    /**
     * Draw multiple character (codepoint)
     */
    public static void drawTextCodepoints(com.raylib.Raylib.Font font, java.nio.IntBuffer codepoints, int codepointCount, com.raylib.Raylib.Vector2 position, float fontSize, float spacing, com.raylib.Raylib.Color tint) {
        Raylib.DrawTextCodepoints(font, codepoints, codepointCount, position, fontSize, spacing, tint);
    }

    /**
     * Draw multiple character (codepoint)
     */
    public static void drawTextCodepoints(com.raylib.Raylib.Font font, int[] codepoints, int codepointCount, com.raylib.Raylib.Vector2 position, float fontSize, float spacing, com.raylib.Raylib.Color tint) {
        Raylib.DrawTextCodepoints(font, codepoints, codepointCount, position, fontSize, spacing, tint);
    }

    /**
     * Draw multiple character (codepoint)
     */
    public static void drawTextCodepoints(com.raylib.Raylib.Font font, org.bytedeco.javacpp.IntPointer codepoints, int codepointCount, com.raylib.Raylib.Vector2 position, float fontSize, float spacing, com.raylib.Raylib.Color tint) {
        Raylib.DrawTextCodepoints(font, codepoints, codepointCount, position, fontSize, spacing, tint);
    }

    /**
     * Measure string size for Font
     */
    public static com.raylib.Raylib.Vector2 measureTextEx(com.raylib.Raylib.Font font, org.bytedeco.javacpp.BytePointer text, float fontSize, float spacing) {
        return Raylib.MeasureTextEx(font, text, fontSize, spacing);
    }

    /**
     * Measure string size for Font
     */
    public static com.raylib.Raylib.Vector2 measureTextEx(com.raylib.Raylib.Font font, java.lang.String text, float fontSize, float spacing) {
        return Raylib.MeasureTextEx(font, text, fontSize, spacing);
    }

    /**
     * Draw a part of a texture defined by a rectangle with 'pro' parameters
     */
    public static void drawTexturePro(com.raylib.Raylib.Texture texture, com.raylib.Raylib.Rectangle source, com.raylib.Raylib.Rectangle dest, com.raylib.Raylib.Vector2 origin, float rotation, com.raylib.Raylib.Color tint) {
        Raylib.DrawTexturePro(texture, source, dest, origin, rotation, tint);
    }

    /**
     * Get total number of codepoints in a UTF-8 encoded string
     */
    public static int getCodepointCount(java.lang.String text) {
        return Raylib.GetCodepointCount(text);
    }

    /**
     * Get total number of codepoints in a UTF-8 encoded string
     */
    public static int getCodepointCount(org.bytedeco.javacpp.BytePointer text) {
        return Raylib.GetCodepointCount(text);
    }

    /**
     * Set vertical line spacing when drawing with line-breaks
     */
    public static void setTextLineSpacing(int spacing) {
        Raylib.SetTextLineSpacing(spacing);
    }

    /**
     * Check if two text string are equal
     */
    public static boolean textIsEqual(java.lang.String text1, java.lang.String text2) {
        return Raylib.TextIsEqual(text1, text2);
    }

    /**
     * Check if two text string are equal
     */
    public static boolean textIsEqual(org.bytedeco.javacpp.BytePointer text1, org.bytedeco.javacpp.BytePointer text2) {
        return Raylib.TextIsEqual(text1, text2);
    }

    /**
     * Draw a Texture2D with extended parameters
     */
    public static void drawTextureEx(com.raylib.Raylib.Texture texture, com.raylib.Raylib.Vector2 position, float rotation, float scale, com.raylib.Raylib.Color tint) {
        Raylib.DrawTextureEx(texture, position, rotation, scale, tint);
    }

    /**
     * Load font from memory buffer, fileType refers to extension: i.e. '.ttf'
     */
    public static com.raylib.Raylib.Font loadFontFromMemory(org.bytedeco.javacpp.BytePointer fileType, java.nio.ByteBuffer fileData, int dataSize, int fontSize, java.nio.IntBuffer codepoints, int codepointCount) {
        return Raylib.LoadFontFromMemory(fileType, fileData, dataSize, fontSize, codepoints, codepointCount);
    }

    /**
     * Load font from memory buffer, fileType refers to extension: i.e. '.ttf'
     */
    public static com.raylib.Raylib.Font loadFontFromMemory(java.lang.String fileType, java.nio.ByteBuffer fileData, int dataSize, int fontSize, java.nio.IntBuffer codepoints, int codepointCount) {
        return Raylib.LoadFontFromMemory(fileType, fileData, dataSize, fontSize, codepoints, codepointCount);
    }

    /**
     * Load font from memory buffer, fileType refers to extension: i.e. '.ttf'
     */
    public static com.raylib.Raylib.Font loadFontFromMemory(org.bytedeco.javacpp.BytePointer fileType, org.bytedeco.javacpp.BytePointer fileData, int dataSize, int fontSize, org.bytedeco.javacpp.IntPointer codepoints, int codepointCount) {
        return Raylib.LoadFontFromMemory(fileType, fileData, dataSize, fontSize, codepoints, codepointCount);
    }

    /**
     * Load font from memory buffer, fileType refers to extension: i.e. '.ttf'
     */
    public static com.raylib.Raylib.Font loadFontFromMemory(java.lang.String fileType, byte[] fileData, int dataSize, int fontSize, int[] codepoints, int codepointCount) {
        return Raylib.LoadFontFromMemory(fileType, fileData, dataSize, fontSize, codepoints, codepointCount);
    }

    /**
     * Load font from memory buffer, fileType refers to extension: i.e. '.ttf'
     */
    public static com.raylib.Raylib.Font loadFontFromMemory(org.bytedeco.javacpp.BytePointer fileType, byte[] fileData, int dataSize, int fontSize, int[] codepoints, int codepointCount) {
        return Raylib.LoadFontFromMemory(fileType, fileData, dataSize, fontSize, codepoints, codepointCount);
    }

    /**
     * Load font from memory buffer, fileType refers to extension: i.e. '.ttf'
     */
    public static com.raylib.Raylib.Font loadFontFromMemory(java.lang.String fileType, org.bytedeco.javacpp.BytePointer fileData, int dataSize, int fontSize, org.bytedeco.javacpp.IntPointer codepoints, int codepointCount) {
        return Raylib.LoadFontFromMemory(fileType, fileData, dataSize, fontSize, codepoints, codepointCount);
    }

    /**
     * Get Color normalized as float [0..1]
     */
    public static com.raylib.Raylib.Vector4 colorNormalize(com.raylib.Raylib.Color color) {
        return Raylib.ColorNormalize(color);
    }

    /**
     * Generate image font atlas using chars info
     */
    public static com.raylib.Raylib.Image genImageFontAtlas(com.raylib.Raylib.GlyphInfo glyphs, org.bytedeco.javacpp.PointerPointer glyphRecs, int glyphCount, int fontSize, int padding, int packMethod) {
        return Raylib.GenImageFontAtlas(glyphs, glyphRecs, glyphCount, fontSize, padding, packMethod);
    }

    /**
     * Generate image font atlas using chars info
     */
    public static com.raylib.Raylib.Image genImageFontAtlas(com.raylib.Raylib.GlyphInfo glyphs, com.raylib.Raylib.Rectangle glyphRecs, int glyphCount, int fontSize, int padding, int packMethod) {
        return Raylib.GenImageFontAtlas(glyphs, glyphRecs, glyphCount, fontSize, padding, packMethod);
    }

    /**
     * Check if a texture is valid (loaded in GPU)
     */
    public static boolean isTextureValid(com.raylib.Raylib.Texture texture) {
        return Raylib.IsTextureValid(texture);
    }

    /**
     * Unload codepoints data from memory
     */
    public static void unloadCodepoints(org.bytedeco.javacpp.IntPointer codepoints) {
        Raylib.UnloadCodepoints(codepoints);
    }

    /**
     * Unload codepoints data from memory
     */
    public static void unloadCodepoints(int[] codepoints) {
        Raylib.UnloadCodepoints(codepoints);
    }

    /**
     * Unload codepoints data from memory
     */
    public static void unloadCodepoints(java.nio.IntBuffer codepoints) {
        Raylib.UnloadCodepoints(codepoints);
    }

    /**
     * Get a piece of a text string
     */
    public static java.lang.String textSubtext(java.lang.String text, int position, int length) {
        return Raylib.TextSubtext(text, position, length);
    }

    /**
     * Get a piece of a text string
     */
    public static org.bytedeco.javacpp.BytePointer textSubtext(org.bytedeco.javacpp.BytePointer text, int position, int length) {
        return Raylib.TextSubtext(text, position, length);
    }

    /**
     * Replace text string (WARNING: memory must be freed!)
     */
    public static java.nio.ByteBuffer textReplace(java.lang.String text, java.lang.String replace, java.lang.String by) {
        return Raylib.TextReplace(text, replace, by);
    }

    /**
     * Replace text string (WARNING: memory must be freed!)
     */
    public static org.bytedeco.javacpp.BytePointer textReplace(org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.BytePointer replace, org.bytedeco.javacpp.BytePointer by) {
        return Raylib.TextReplace(text, replace, by);
    }

    /**
     * Get color with contrast correction, contrast values between -1.0f and 1.0f
     */
    public static com.raylib.Raylib.Color colorContrast(com.raylib.Raylib.Color color, float contrast) {
        return Raylib.ColorContrast(color, contrast);
    }

    /**
     * Draw a Texture2D
     */
    public static void drawTexture(com.raylib.Raylib.Texture texture, int posX, int posY, com.raylib.Raylib.Color tint) {
        Raylib.DrawTexture(texture, posX, posY, tint);
    }

    /**
     * Update GPU texture rectangle with new data
     */
    public static void updateTextureRec(com.raylib.Raylib.Texture texture, com.raylib.Raylib.Rectangle rec, org.bytedeco.javacpp.Pointer pixels) {
        Raylib.UpdateTextureRec(texture, rec, pixels);
    }

    /**
     * Get glyph rectangle in font atlas for a codepoint (unicode character), fallback to '?' if not found
     */
    public static com.raylib.Raylib.Rectangle getGlyphAtlasRec(com.raylib.Raylib.Font font, int codepoint) {
        return Raylib.GetGlyphAtlasRec(font, codepoint);
    }

    /**
     * Get a Color from HSV values, hue [0..360], saturation/value [0..1]
     */
    public static com.raylib.Raylib.Color colorFromHSV(float hue, float saturation, float value) {
        return Raylib.ColorFromHSV(hue, saturation, value);
    }

    /**
     * Get the default Font
     */
    public static com.raylib.Raylib.Font getFontDefault() {
        return Raylib.GetFontDefault();
    }

    /**
     * Get lower case version of provided string
     */
    public static org.bytedeco.javacpp.BytePointer textToLower(org.bytedeco.javacpp.BytePointer text) {
        return Raylib.TextToLower(text);
    }

    /**
     * Get lower case version of provided string
     */
    public static java.lang.String textToLower(java.lang.String text) {
        return Raylib.TextToLower(text);
    }

    /**
     * Get Pascal case notation version of provided string
     */
    public static org.bytedeco.javacpp.BytePointer textToPascal(org.bytedeco.javacpp.BytePointer text) {
        return Raylib.TextToPascal(text);
    }

    /**
     * Get Pascal case notation version of provided string
     */
    public static java.lang.String textToPascal(java.lang.String text) {
        return Raylib.TextToPascal(text);
    }

    /**
     * Get color with brightness correction, brightness factor goes from -1.0f to 1.0f
     */
    public static com.raylib.Raylib.Color colorBrightness(com.raylib.Raylib.Color color, float factor) {
        return Raylib.ColorBrightness(color, factor);
    }

    /**
     * Get pixel data size in bytes for certain format
     */
    public static int getPixelDataSize(int width, int height, int format) {
        return Raylib.GetPixelDataSize(width, height, format);
    }

    /**
     * Draws a texture (or part of it) that stretches or shrinks nicely
     */
    public static void drawTextureNPatch(com.raylib.Raylib.Texture texture, com.raylib.Raylib.NPatchInfo nPatchInfo, com.raylib.Raylib.Rectangle dest, com.raylib.Raylib.Vector2 origin, float rotation, com.raylib.Raylib.Color tint) {
        Raylib.DrawTextureNPatch(texture, nPatchInfo, dest, origin, rotation, tint);
    }

    /**
     * Load samples data from wave as a 32bit float data array
     */
    public static org.bytedeco.javacpp.FloatPointer loadWaveSamples(com.raylib.Raylib.Wave wave) {
        return Raylib.LoadWaveSamples(wave);
    }

    /**
     * Generate plane mesh (with subdivisions)
     */
    public static com.raylib.Raylib.Mesh genMeshPlane(float width, float length, int resX, int resZ) {
        return Raylib.GenMeshPlane(width, length, resX, resZ);
    }

    /**
     * Load materials from model file
     */
    public static com.raylib.Raylib.Material loadMaterials(java.lang.String fileName, int[] materialCount) {
        return Raylib.LoadMaterials(fileName, materialCount);
    }

    /**
     * Load materials from model file
     */
    public static com.raylib.Raylib.Material loadMaterials(java.lang.String fileName, org.bytedeco.javacpp.IntPointer materialCount) {
        return Raylib.LoadMaterials(fileName, materialCount);
    }

    /**
     * Load materials from model file
     */
    public static com.raylib.Raylib.Material loadMaterials(java.lang.String fileName, java.nio.IntBuffer materialCount) {
        return Raylib.LoadMaterials(fileName, materialCount);
    }

    /**
     * Load materials from model file
     */
    public static com.raylib.Raylib.Material loadMaterials(org.bytedeco.javacpp.BytePointer fileName, java.nio.IntBuffer materialCount) {
        return Raylib.LoadMaterials(fileName, materialCount);
    }

    /**
     * Load materials from model file
     */
    public static com.raylib.Raylib.Material loadMaterials(org.bytedeco.javacpp.BytePointer fileName, org.bytedeco.javacpp.IntPointer materialCount) {
        return Raylib.LoadMaterials(fileName, materialCount);
    }

    /**
     * Load materials from model file
     */
    public static com.raylib.Raylib.Material loadMaterials(org.bytedeco.javacpp.BytePointer fileName, int[] materialCount) {
        return Raylib.LoadMaterials(fileName, materialCount);
    }

    /**
     * Unload sound
     */
    public static void unloadSound(com.raylib.Raylib.Sound sound) {
        Raylib.UnloadSound(sound);
    }

    /**
     * Set volume for a sound (1.0 is max level)
     */
    public static void setSoundVolume(com.raylib.Raylib.Sound sound, float volume) {
        Raylib.SetSoundVolume(sound, volume);
    }

    /**
     * Generate half-sphere mesh (no bottom cap)
     */
    public static com.raylib.Raylib.Mesh genMeshHemiSphere(float radius, int rings, int slices) {
        return Raylib.GenMeshHemiSphere(radius, rings, slices);
    }

    /**
     * Draw a cylinder/cone
     */
    public static void drawCylinder(com.raylib.Raylib.Vector3 position, float radiusTop, float radiusBottom, float height, int slices, com.raylib.Raylib.Color color) {
        Raylib.DrawCylinder(position, radiusTop, radiusBottom, height, slices, color);
    }

    /**
     * Unload model (including meshes) from memory (RAM and/or VRAM)
     */
    public static void unloadModel(com.raylib.Raylib.Model model) {
        Raylib.UnloadModel(model);
    }

    /**
     * Unload samples data loaded with LoadWaveSamples()
     */
    public static void unloadWaveSamples(java.nio.FloatBuffer samples) {
        Raylib.UnloadWaveSamples(samples);
    }

    /**
     * Unload samples data loaded with LoadWaveSamples()
     */
    public static void unloadWaveSamples(org.bytedeco.javacpp.FloatPointer samples) {
        Raylib.UnloadWaveSamples(samples);
    }

    /**
     * Unload samples data loaded with LoadWaveSamples()
     */
    public static void unloadWaveSamples(float[] samples) {
        Raylib.UnloadWaveSamples(samples);
    }

    /**
     * Draw a billboard texture
     */
    public static void drawBillboard(com.raylib.Raylib.Camera3D camera, com.raylib.Raylib.Texture texture, com.raylib.Raylib.Vector3 position, float scale, com.raylib.Raylib.Color tint) {
        Raylib.DrawBillboard(camera, texture, position, scale, tint);
    }

    /**
     * Draw sphere wires
     */
    public static void drawSphereWires(com.raylib.Raylib.Vector3 centerPos, float radius, int rings, int slices, com.raylib.Raylib.Color color) {
        Raylib.DrawSphereWires(centerPos, radius, rings, slices, color);
    }

    /**
     * Check if a sound is currently playing
     */
    public static boolean isSoundPlaying(com.raylib.Raylib.Sound sound) {
        return Raylib.IsSoundPlaying(sound);
    }

    /**
     * Load music stream from file
     */
    public static com.raylib.Raylib.Music loadMusicStream(org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.LoadMusicStream(fileName);
    }

    /**
     * Load music stream from file
     */
    public static com.raylib.Raylib.Music loadMusicStream(java.lang.String fileName) {
        return Raylib.LoadMusicStream(fileName);
    }

    /**
     * Generate cuboid mesh
     */
    public static com.raylib.Raylib.Mesh genMeshCube(float width, float height, float length) {
        return Raylib.GenMeshCube(width, height, length);
    }

    /**
     * Checks if a music stream is valid (context and buffers initialized)
     */
    public static boolean isMusicValid(com.raylib.Raylib.Music music) {
        return Raylib.IsMusicValid(music);
    }

    /**
     * Get master volume (listener)
     */
    public static float getMasterVolume() {
        return Raylib.GetMasterVolume();
    }

    /**
     * Unload music stream
     */
    public static void unloadMusicStream(com.raylib.Raylib.Music music) {
        Raylib.UnloadMusicStream(music);
    }

    /**
     * Draw a model as points
     */
    public static void drawModelPoints(com.raylib.Raylib.Model model, com.raylib.Raylib.Vector3 position, float scale, com.raylib.Raylib.Color tint) {
        Raylib.DrawModelPoints(model, position, scale, tint);
    }

    /**
     * Draw multiple mesh instances with material and different transforms
     */
    public static void drawMeshInstanced(com.raylib.Raylib.Mesh mesh, com.raylib.Raylib.Material material, com.raylib.Raylib.Matrix transforms, int instances) {
        Raylib.DrawMeshInstanced(mesh, material, transforms, instances);
    }

    /**
     * Generate heightmap mesh from image data
     */
    public static com.raylib.Raylib.Mesh genMeshHeightmap(com.raylib.Raylib.Image heightmap, com.raylib.Raylib.Vector3 size) {
        return Raylib.GenMeshHeightmap(heightmap, size);
    }

    /**
     * Draw a cylinder with base at startPos and top at endPos
     */
    public static void drawCylinderEx(com.raylib.Raylib.Vector3 startPos, com.raylib.Raylib.Vector3 endPos, float startRadius, float endRadius, int sides, com.raylib.Raylib.Color color) {
        Raylib.DrawCylinderEx(startPos, endPos, startRadius, endRadius, sides, color);
    }

    /**
     * Draw capsule wireframe with the center of its sphere caps at startPos and endPos
     */
    public static void drawCapsuleWires(com.raylib.Raylib.Vector3 startPos, com.raylib.Raylib.Vector3 endPos, float radius, int slices, int rings, com.raylib.Raylib.Color color) {
        Raylib.DrawCapsuleWires(startPos, endPos, radius, slices, rings, color);
    }

    /**
     * Draw a capsule with the center of its sphere caps at startPos and endPos
     */
    public static void drawCapsule(com.raylib.Raylib.Vector3 startPos, com.raylib.Raylib.Vector3 endPos, float radius, int slices, int rings, com.raylib.Raylib.Color color) {
        Raylib.DrawCapsule(startPos, endPos, radius, slices, rings, color);
    }

    /**
     * Load model from generated mesh (default material)
     */
    public static com.raylib.Raylib.Model loadModelFromMesh(com.raylib.Raylib.Mesh mesh) {
        return Raylib.LoadModelFromMesh(mesh);
    }

    /**
     * Check if a model is valid (loaded in GPU, VAO/VBOs)
     */
    public static boolean isModelValid(com.raylib.Raylib.Model model) {
        return Raylib.IsModelValid(model);
    }

    /**
     * Draw bounding box (wires)
     */
    public static void drawBoundingBox(com.raylib.Raylib.BoundingBox box, com.raylib.Raylib.Color color) {
        Raylib.DrawBoundingBox(box, color);
    }

    /**
     * Export mesh as code file (.h) defining multiple arrays of vertex attributes
     */
    public static boolean exportMeshAsCode(com.raylib.Raylib.Mesh mesh, org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.ExportMeshAsCode(mesh, fileName);
    }

    /**
     * Export mesh as code file (.h) defining multiple arrays of vertex attributes
     */
    public static boolean exportMeshAsCode(com.raylib.Raylib.Mesh mesh, java.lang.String fileName) {
        return Raylib.ExportMeshAsCode(mesh, fileName);
    }

    /**
     * Generate sphere mesh (standard sphere)
     */
    public static com.raylib.Raylib.Mesh genMeshSphere(float radius, int rings, int slices) {
        return Raylib.GenMeshSphere(radius, rings, slices);
    }

    /**
     * Generate cone/pyramid mesh
     */
    public static com.raylib.Raylib.Mesh genMeshCone(float radius, float height, int slices) {
        return Raylib.GenMeshCone(radius, height, slices);
    }

    /**
     * Draw a cylinder/cone wires
     */
    public static void drawCylinderWires(com.raylib.Raylib.Vector3 position, float radiusTop, float radiusBottom, float height, int slices, com.raylib.Raylib.Color color) {
        Raylib.DrawCylinderWires(position, radiusTop, radiusBottom, height, slices, color);
    }

    /**
     * Generate trefoil knot mesh
     */
    public static com.raylib.Raylib.Mesh genMeshKnot(float radius, float size, int radSeg, int sides) {
        return Raylib.GenMeshKnot(radius, size, radSeg, sides);
    }

    /**
     * Draw a model as points with extended parameters
     */
    public static void drawModelPointsEx(com.raylib.Raylib.Model model, com.raylib.Raylib.Vector3 position, com.raylib.Raylib.Vector3 rotationAxis, float rotationAngle, com.raylib.Raylib.Vector3 scale, com.raylib.Raylib.Color tint) {
        Raylib.DrawModelPointsEx(model, position, rotationAxis, rotationAngle, scale, tint);
    }

    /**
     * Draw a billboard texture defined by source
     */
    public static void drawBillboardRec(com.raylib.Raylib.Camera3D camera, com.raylib.Raylib.Texture texture, com.raylib.Raylib.Rectangle source, com.raylib.Raylib.Vector3 position, com.raylib.Raylib.Vector2 size, com.raylib.Raylib.Color tint) {
        Raylib.DrawBillboardRec(camera, texture, source, position, size, tint);
    }

    /**
     * Get collision info between ray and box
     */
    public static com.raylib.Raylib.RayCollision getRayCollisionBox(com.raylib.Raylib.Ray ray, com.raylib.Raylib.BoundingBox box) {
        return Raylib.GetRayCollisionBox(ray, box);
    }

    /**
     * Close the audio device and context
     */
    public static void closeAudioDevice() {
        Raylib.CloseAudioDevice();
    }

    /**
     * Draw a model with extended parameters
     */
    public static void drawModelEx(com.raylib.Raylib.Model model, com.raylib.Raylib.Vector3 position, com.raylib.Raylib.Vector3 rotationAxis, float rotationAngle, com.raylib.Raylib.Vector3 scale, com.raylib.Raylib.Color tint) {
        Raylib.DrawModelEx(model, position, rotationAxis, rotationAngle, scale, tint);
    }

    /**
     * Update mesh vertex data in GPU for a specific buffer index
     */
    public static void updateMeshBuffer(com.raylib.Raylib.Mesh mesh, int index, org.bytedeco.javacpp.Pointer data, int dataSize, int offset) {
        Raylib.UpdateMeshBuffer(mesh, index, data, dataSize, offset);
    }

    /**
     * Draw a model wires (with texture if set) with extended parameters
     */
    public static void drawModelWiresEx(com.raylib.Raylib.Model model, com.raylib.Raylib.Vector3 position, com.raylib.Raylib.Vector3 rotationAxis, float rotationAngle, com.raylib.Raylib.Vector3 scale, com.raylib.Raylib.Color tint) {
        Raylib.DrawModelWiresEx(model, position, rotationAxis, rotationAngle, scale, tint);
    }

    /**
     * Generate torus mesh
     */
    public static com.raylib.Raylib.Mesh genMeshTorus(float radius, float size, int radSeg, int sides) {
        return Raylib.GenMeshTorus(radius, size, radSeg, sides);
    }

    /**
     * Generate cubes-based map mesh from image data
     */
    public static com.raylib.Raylib.Mesh genMeshCubicmap(com.raylib.Raylib.Image cubicmap, com.raylib.Raylib.Vector3 cubeSize) {
        return Raylib.GenMeshCubicmap(cubicmap, cubeSize);
    }

    /**
     * Check if audio device has been initialized successfully
     */
    public static boolean isAudioDeviceReady() {
        return Raylib.IsAudioDeviceReady();
    }

    /**
     * Set master volume (listener)
     */
    public static void setMasterVolume(float volume) {
        Raylib.SetMasterVolume(volume);
    }

    /**
     * Checks if wave data is valid (data loaded and parameters)
     */
    public static boolean isWaveValid(com.raylib.Raylib.Wave wave) {
        return Raylib.IsWaveValid(wave);
    }

    /**
     * Create a new sound that shares the same sample data as the source sound, does not own the sound data
     */
    public static com.raylib.Raylib.Sound loadSoundAlias(com.raylib.Raylib.Sound source) {
        return Raylib.LoadSoundAlias(source);
    }

    /**
     * Draw a model wires (with texture if set)
     */
    public static void drawModelWires(com.raylib.Raylib.Model model, com.raylib.Raylib.Vector3 position, float scale, com.raylib.Raylib.Color tint) {
        Raylib.DrawModelWires(model, position, scale, tint);
    }

    /**
     * Compute mesh tangents
     */
    public static void genMeshTangents(com.raylib.Raylib.Mesh mesh) {
        Raylib.GenMeshTangents(mesh);
    }

    /**
     * Generate cylinder mesh
     */
    public static com.raylib.Raylib.Mesh genMeshCylinder(float radius, float height, int slices) {
        return Raylib.GenMeshCylinder(radius, height, slices);
    }

    /**
     * Compute mesh bounding box limits
     */
    public static com.raylib.Raylib.BoundingBox getMeshBoundingBox(com.raylib.Raylib.Mesh mesh) {
        return Raylib.GetMeshBoundingBox(mesh);
    }

    /**
     * Load wave from memory buffer, fileType refers to extension: i.e. '.wav'
     */
    public static com.raylib.Raylib.Wave loadWaveFromMemory(java.lang.String fileType, byte[] fileData, int dataSize) {
        return Raylib.LoadWaveFromMemory(fileType, fileData, dataSize);
    }

    /**
     * Load wave from memory buffer, fileType refers to extension: i.e. '.wav'
     */
    public static com.raylib.Raylib.Wave loadWaveFromMemory(org.bytedeco.javacpp.BytePointer fileType, java.nio.ByteBuffer fileData, int dataSize) {
        return Raylib.LoadWaveFromMemory(fileType, fileData, dataSize);
    }

    /**
     * Load wave from memory buffer, fileType refers to extension: i.e. '.wav'
     */
    public static com.raylib.Raylib.Wave loadWaveFromMemory(org.bytedeco.javacpp.BytePointer fileType, byte[] fileData, int dataSize) {
        return Raylib.LoadWaveFromMemory(fileType, fileData, dataSize);
    }

    /**
     * Load wave from memory buffer, fileType refers to extension: i.e. '.wav'
     */
    public static com.raylib.Raylib.Wave loadWaveFromMemory(java.lang.String fileType, java.nio.ByteBuffer fileData, int dataSize) {
        return Raylib.LoadWaveFromMemory(fileType, fileData, dataSize);
    }

    /**
     * Load wave from memory buffer, fileType refers to extension: i.e. '.wav'
     */
    public static com.raylib.Raylib.Wave loadWaveFromMemory(org.bytedeco.javacpp.BytePointer fileType, org.bytedeco.javacpp.BytePointer fileData, int dataSize) {
        return Raylib.LoadWaveFromMemory(fileType, fileData, dataSize);
    }

    /**
     * Load wave from memory buffer, fileType refers to extension: i.e. '.wav'
     */
    public static com.raylib.Raylib.Wave loadWaveFromMemory(java.lang.String fileType, org.bytedeco.javacpp.BytePointer fileData, int dataSize) {
        return Raylib.LoadWaveFromMemory(fileType, fileData, dataSize);
    }

    /**
     * Generate polygonal mesh
     */
    public static com.raylib.Raylib.Mesh genMeshPoly(int sides, float radius) {
        return Raylib.GenMeshPoly(sides, radius);
    }

    /**
     * Checks if a sound is valid (data loaded and buffers initialized)
     */
    public static boolean isSoundValid(com.raylib.Raylib.Sound sound) {
        return Raylib.IsSoundValid(sound);
    }

    /**
     * Draw a billboard texture defined by source and rotation
     */
    public static void drawBillboardPro(com.raylib.Raylib.Camera3D camera, com.raylib.Raylib.Texture texture, com.raylib.Raylib.Rectangle source, com.raylib.Raylib.Vector3 position, com.raylib.Raylib.Vector3 up, com.raylib.Raylib.Vector2 size, com.raylib.Raylib.Vector2 origin, float rotation, com.raylib.Raylib.Color tint) {
        Raylib.DrawBillboardPro(camera, texture, source, position, up, size, origin, rotation, tint);
    }

    /**
     * Update sound buffer with new data
     */
    public static void updateSound(com.raylib.Raylib.Sound sound, org.bytedeco.javacpp.Pointer data, int sampleCount) {
        Raylib.UpdateSound(sound, data, sampleCount);
    }

    /**
     * Unload material from GPU memory (VRAM)
     */
    public static void unloadMaterial(com.raylib.Raylib.Material material) {
        Raylib.UnloadMaterial(material);
    }

    /**
     * Check if a material is valid (shader assigned, map textures loaded in GPU)
     */
    public static boolean isMaterialValid(com.raylib.Raylib.Material material) {
        return Raylib.IsMaterialValid(material);
    }

    /**
     * Set texture for a material map type (MATERIAL_MAP_DIFFUSE, MATERIAL_MAP_SPECULAR...)
     */
    public static void setMaterialTexture(com.raylib.Raylib.Material material, int mapType, com.raylib.Raylib.Texture texture) {
        Raylib.SetMaterialTexture(material, mapType, texture);
    }

    /**
     * Load sound from wave data
     */
    public static com.raylib.Raylib.Sound loadSoundFromWave(com.raylib.Raylib.Wave wave) {
        return Raylib.LoadSoundFromWave(wave);
    }

    /**
     * Export wave sample data to code (.h), returns true on success
     */
    public static boolean exportWaveAsCode(com.raylib.Raylib.Wave wave, org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.ExportWaveAsCode(wave, fileName);
    }

    /**
     * Export wave sample data to code (.h), returns true on success
     */
    public static boolean exportWaveAsCode(com.raylib.Raylib.Wave wave, java.lang.String fileName) {
        return Raylib.ExportWaveAsCode(wave, fileName);
    }

    /**
     * Draw sphere with extended parameters
     */
    public static void drawSphereEx(com.raylib.Raylib.Vector3 centerPos, float radius, int rings, int slices, com.raylib.Raylib.Color color) {
        Raylib.DrawSphereEx(centerPos, radius, rings, slices, color);
    }

    /**
     * Set pitch for a sound (1.0 is base level)
     */
    public static void setSoundPitch(com.raylib.Raylib.Sound sound, float pitch) {
        Raylib.SetSoundPitch(sound, pitch);
    }

    /**
     * Resume a paused sound
     */
    public static void resumeSound(com.raylib.Raylib.Sound sound) {
        Raylib.ResumeSound(sound);
    }

    /**
     * Unload a sound alias (does not deallocate sample data)
     */
    public static void unloadSoundAlias(com.raylib.Raylib.Sound alias) {
        Raylib.UnloadSoundAlias(alias);
    }

    /**
     * Set pan for a sound (0.5 is center)
     */
    public static void setSoundPan(com.raylib.Raylib.Sound sound, float pan) {
        Raylib.SetSoundPan(sound, pan);
    }

    /**
     * Initialize audio device and context
     */
    public static void initAudioDevice() {
        Raylib.InitAudioDevice();
    }

    /**
     * Enable depth test
     */
    public static void rlEnableDepthTest() {
        Raylib.rlEnableDepthTest();
    }

    /**
     * Disable depth test
     */
    public static void rlDisableDepthTest() {
        Raylib.rlDisableDepthTest();
    }

    /**
     * Enable point mode
     */
    public static void rlEnablePointMode() {
        Raylib.rlEnablePointMode();
    }

    /**
     * Get music time length (in seconds)
     */
    public static float getMusicTimeLength(com.raylib.Raylib.Music music) {
        return Raylib.GetMusicTimeLength(music);
    }

    /**
     * Play audio stream
     */
    public static void playAudioStream(com.raylib.Raylib.AudioStream stream) {
        Raylib.PlayAudioStream(stream);
    }

    /**
     * Seek music to a position (in seconds)
     */
    public static void seekMusicStream(com.raylib.Raylib.Music music, float position) {
        Raylib.SeekMusicStream(music, position);
    }

    /**
     * Pause audio stream
     */
    public static void pauseAudioStream(com.raylib.Raylib.AudioStream stream) {
        Raylib.PauseAudioStream(stream);
    }

    /**
     * Disable shader program
     */
    public static void rlDisableShader() {
        Raylib.rlDisableShader();
    }

    /**
     * Bind framebuffer (FBO)
     */
    public static void rlBindFramebuffer(int target, int framebuffer) {
        Raylib.rlBindFramebuffer(target, framebuffer);
    }

    /**
     * Pause music playing
     */
    public static void pauseMusicStream(com.raylib.Raylib.Music music) {
        Raylib.PauseMusicStream(music);
    }

    /**
     * Set pan for audio stream (0.5 is centered)
     */
    public static void setAudioStreamPan(com.raylib.Raylib.AudioStream stream, float pan) {
        Raylib.SetAudioStreamPan(stream, pan);
    }

    /**
     * Enable color blending
     */
    public static void rlEnableColorBlend() {
        Raylib.rlEnableColorBlend();
    }

    /**
     * Get the line drawing width
     */
    public static float rlGetLineWidth() {
        return Raylib.rlGetLineWidth();
    }

    /**
     * Set face culling mode
     */
    public static void rlSetCullFace(int mode) {
        Raylib.rlSetCullFace(mode);
    }

    /**
     * Enable depth write
     */
    public static void rlEnableDepthMask() {
        Raylib.rlEnableDepthMask();
    }

    /**
     * Clear color buffer with color
     */
    public static void rlClearColor(byte r, byte g, byte b, byte a) {
        Raylib.rlClearColor(r, g, b, a);
    }

    /**
     * Check and log OpenGL error codes
     */
    public static void rlCheckErrors() {
        Raylib.rlCheckErrors();
    }

    /**
     * Set blending mode factor and equation (using OpenGL factors)
     */
    public static void rlSetBlendFactors(int glSrcFactor, int glDstFactor, int glEquation) {
        Raylib.rlSetBlendFactors(glSrcFactor, glDstFactor, glEquation);
    }

    /**
     * Get current OpenGL version
     */
    public static int rlGetVersion() {
        return Raylib.rlGetVersion();
    }

    /**
     * Load a render batch system
     */
    public static com.raylib.Raylib.rlRenderBatch rlLoadRenderBatch(int numBuffers, int bufferElements) {
        return Raylib.rlLoadRenderBatch(numBuffers, bufferElements);
    }

    /**
     * Disable depth write
     */
    public static void rlDisableDepthMask() {
        Raylib.rlDisableDepthMask();
    }

    /**
     * Load OpenGL extensions (loader function required)
     */
    public static void rlLoadExtensions(org.bytedeco.javacpp.Pointer loader) {
        Raylib.rlLoadExtensions(loader);
    }

    /**
     * Update audio stream buffers with data
     */
    public static void updateAudioStream(com.raylib.Raylib.AudioStream stream, org.bytedeco.javacpp.Pointer data, int frameCount) {
        Raylib.UpdateAudioStream(stream, data, frameCount);
    }

    /**
     * Define one vertex (texture coordinate) - 2 float
     */
    public static void rlTexCoord2f(float x, float y) {
        Raylib.rlTexCoord2f(x, y);
    }

    /**
     * Set blending mode
     */
    public static void rlSetBlendMode(int mode) {
        Raylib.rlSetBlendMode(mode);
    }

    /**
     * Set pitch for a music (1.0 is base level)
     */
    public static void setMusicPitch(com.raylib.Raylib.Music music, float pitch) {
        Raylib.SetMusicPitch(music, pitch);
    }

    /**
     * Enable shader program
     */
    public static void rlEnableShader(int id) {
        Raylib.rlEnableShader(id);
    }

    /**
     * Load a vertex buffer object
     */
    public static int rlLoadVertexBuffer(org.bytedeco.javacpp.Pointer buffer, int size, boolean dynamic) {
        return Raylib.rlLoadVertexBuffer(buffer, size, dynamic);
    }

    /**
     * Multiply the current matrix by a translation matrix
     */
    public static void rlTranslatef(float x, float y, float z) {
        Raylib.rlTranslatef(x, y, z);
    }

    /**
     * Set volume for music (1.0 is max level)
     */
    public static void setMusicVolume(com.raylib.Raylib.Music music, float volume) {
        Raylib.SetMusicVolume(music, volume);
    }

    /**
     * Blit active framebuffer to main framebuffer
     */
    public static void rlBlitFramebuffer(int srcX, int srcY, int srcWidth, int srcHeight, int dstX, int dstY, int dstWidth, int dstHeight, int bufferMask) {
        Raylib.rlBlitFramebuffer(srcX, srcY, srcWidth, srcHeight, dstX, dstY, dstWidth, dstHeight, bufferMask);
    }

    /**
     * Reset current matrix to identity matrix
     */
    public static void rlLoadIdentity() {
        Raylib.rlLoadIdentity();
    }

    /**
     * Checks if an audio stream is valid (buffers initialized)
     */
    public static boolean isAudioStreamValid(com.raylib.Raylib.AudioStream stream) {
        return Raylib.IsAudioStreamValid(stream);
    }

    /**
     * Color mask control
     */
    public static void rlColorMask(boolean r, boolean g, boolean b, boolean a) {
        Raylib.rlColorMask(r, g, b, a);
    }

    /**
     * Stop music playing
     */
    public static void stopMusicStream(com.raylib.Raylib.Music music) {
        Raylib.StopMusicStream(music);
    }

    /**
     * Draw render batch data (Update->Draw->Reset)
     */
    public static void rlDrawRenderBatch(com.raylib.Raylib.rlRenderBatch batch) {
        Raylib.rlDrawRenderBatch(batch);
    }

    /**
     * Load vertex array (vao) if supported
     */
    public static int rlLoadVertexArray() {
        return Raylib.rlLoadVertexArray();
    }

    /**
     * Multiply the current matrix by another matrix
     */
    public static void rlMultMatrixf(float[] matf) {
        Raylib.rlMultMatrixf(matf);
    }

    /**
     * Multiply the current matrix by another matrix
     */
    public static void rlMultMatrixf(org.bytedeco.javacpp.FloatPointer matf) {
        Raylib.rlMultMatrixf(matf);
    }

    /**
     * Multiply the current matrix by another matrix
     */
    public static void rlMultMatrixf(java.nio.FloatBuffer matf) {
        Raylib.rlMultMatrixf(matf);
    }

    /**
     * Resume audio stream
     */
    public static void resumeAudioStream(com.raylib.Raylib.AudioStream stream) {
        Raylib.ResumeAudioStream(stream);
    }

    /**
     * Resume playing paused music
     */
    public static void resumeMusicStream(com.raylib.Raylib.Music music) {
        Raylib.ResumeMusicStream(music);
    }

    /**
     * Set the line drawing width
     */
    public static void rlSetLineWidth(float width) {
        Raylib.rlSetLineWidth(width);
    }

    /**
     * Draw vertex array (currently active vao)
     */
    public static void rlDrawVertexArray(int offset, int count) {
        Raylib.rlDrawVertexArray(offset, count);
    }

    /**
     * Set clip planes distances
     */
    public static void rlSetClipPlanes(double nearPlane, double farPlane) {
        Raylib.rlSetClipPlanes(nearPlane, farPlane);
    }

    /**
     * Set current texture for render batch and check buffers limits
     */
    public static void rlSetTexture(int id) {
        Raylib.rlSetTexture(id);
    }

    /**
     * Load texture data
     */
    public static int rlLoadTexture(org.bytedeco.javacpp.Pointer data, int width, int height, int format, int mipmapCount) {
        return Raylib.rlLoadTexture(data, width, height, format, mipmapCount);
    }

    /**
     * Updates buffers for music streaming
     */
    public static void updateMusicStream(com.raylib.Raylib.Music music) {
        Raylib.UpdateMusicStream(music);
    }

    /**
     * Push the current matrix to stack
     */
    public static void rlPushMatrix() {
        Raylib.rlPushMatrix();
    }

    /**
     * Load depth texture/renderbuffer (to be attached to fbo)
     */
    public static int rlLoadTextureDepth(int width, int height, boolean useRenderBuffer) {
        return Raylib.rlLoadTextureDepth(width, height, useRenderBuffer);
    }

    /**
     * Update texture with new data on GPU
     */
    public static void rlUpdateTexture(int id, int offsetX, int offsetY, int width, int height, int format, org.bytedeco.javacpp.Pointer data) {
        Raylib.rlUpdateTexture(id, offsetX, offsetY, width, height, format, data);
    }

    /**
     * Unload texture from GPU memory
     */
    public static void rlUnloadTexture(int id) {
        Raylib.rlUnloadTexture(id);
    }

    /**
     * Disable texture
     */
    public static void rlDisableTexture() {
        Raylib.rlDisableTexture();
    }

    /**
     * Start music playing
     */
    public static void playMusicStream(com.raylib.Raylib.Music music) {
        Raylib.PlayMusicStream(music);
    }

    /**
     * Set pan for a music (0.5 is center)
     */
    public static void setMusicPan(com.raylib.Raylib.Music music, float pan) {
        Raylib.SetMusicPan(music, pan);
    }

    /**
     * Disable wire (and point) mode
     */
    public static void rlDisableWireMode() {
        Raylib.rlDisableWireMode();
    }

    /**
     * Enable texture
     */
    public static void rlEnableTexture(int id) {
        Raylib.rlEnableTexture(id);
    }

    /**
     * Load audio stream (to stream raw audio pcm data)
     */
    public static com.raylib.Raylib.AudioStream loadAudioStream(int sampleRate, int sampleSize, int channels) {
        return Raylib.LoadAudioStream(sampleRate, sampleSize, channels);
    }

    /**
     * Enable wire mode
     */
    public static void rlEnableWireMode() {
        Raylib.rlEnableWireMode();
    }

    /**
     * Stop audio stream
     */
    public static void stopAudioStream(com.raylib.Raylib.AudioStream stream) {
        Raylib.StopAudioStream(stream);
    }

    /**
     * Unload audio stream and free memory
     */
    public static void unloadAudioStream(com.raylib.Raylib.AudioStream stream) {
        Raylib.UnloadAudioStream(stream);
    }

    /**
     * Get current music time played (in seconds)
     */
    public static float getMusicTimePlayed(com.raylib.Raylib.Music music) {
        return Raylib.GetMusicTimePlayed(music);
    }

    /**
     * Choose the current matrix to be transformed
     */
    public static void rlMatrixMode(int mode) {
        Raylib.rlMatrixMode(mode);
    }

    /**
     * Pop latest inserted matrix from stack
     */
    public static void rlPopMatrix() {
        Raylib.rlPopMatrix();
    }

    /**
     * Load shader storage buffer object (SSBO)
     */
    public static int rlLoadShaderBuffer(int size, org.bytedeco.javacpp.Pointer data, int usageHint) {
        return Raylib.rlLoadShaderBuffer(size, data, usageHint);
    }

    public static com.raylib.Raylib.Vector3 vector3Subtract(com.raylib.Raylib.Vector3 v1, com.raylib.Raylib.Vector3 v2) {
        return Raylib.Vector3Subtract(v1, v2);
    }

    /**
     * Compile custom shader and return shader id (type: RL_VERTEX_SHADER, RL_FRAGMENT_SHADER, RL_COMPUTE_SHADER)
     */
    public static int rlCompileShader(org.bytedeco.javacpp.BytePointer shaderCode, int type) {
        return Raylib.rlCompileShader(shaderCode, type);
    }

    /**
     * Compile custom shader and return shader id (type: RL_VERTEX_SHADER, RL_FRAGMENT_SHADER, RL_COMPUTE_SHADER)
     */
    public static int rlCompileShader(java.lang.String shaderCode, int type) {
        return Raylib.rlCompileShader(shaderCode, type);
    }

    public static com.raylib.Raylib.Vector3 vector3MoveTowards(com.raylib.Raylib.Vector3 v, com.raylib.Raylib.Vector3 target, float maxDistance) {
        return Raylib.Vector3MoveTowards(v, target, maxDistance);
    }

    public static com.raylib.Raylib.Vector2 vector2Zero() {
        return Raylib.Vector2Zero();
    }

    public static float vector2Length(com.raylib.Raylib.Vector2 v) {
        return Raylib.Vector2Length(v);
    }

    /**
     * Load and draw a cube
     */
    public static void rlLoadDrawCube() {
        Raylib.rlLoadDrawCube();
    }

    /**
     * Set shader value uniform
     */
    public static void rlSetUniform(int locIndex, org.bytedeco.javacpp.Pointer value, int uniformType, int count) {
        Raylib.rlSetUniform(locIndex, value, uniformType, count);
    }

    public static com.raylib.Raylib.Vector2 vector2Negate(com.raylib.Raylib.Vector2 v) {
        return Raylib.Vector2Negate(v);
    }

    public static com.raylib.Raylib.Vector3 vector3Multiply(com.raylib.Raylib.Vector3 v1, com.raylib.Raylib.Vector3 v2) {
        return Raylib.Vector3Multiply(v1, v2);
    }

    public static com.raylib.Raylib.Vector3 vector3Normalize(com.raylib.Raylib.Vector3 v) {
        return Raylib.Vector3Normalize(v);
    }

    public static com.raylib.Raylib.Vector3 vector3Lerp(com.raylib.Raylib.Vector3 v1, com.raylib.Raylib.Vector3 v2, float amount) {
        return Raylib.Vector3Lerp(v1, v2, amount);
    }

    public static com.raylib.Raylib.Vector2 vector2Scale(com.raylib.Raylib.Vector2 v, float scale) {
        return Raylib.Vector2Scale(v, scale);
    }

    /**
     * Set shader value matrix
     */
    public static void rlSetUniformMatrix(int locIndex, com.raylib.Raylib.Matrix mat) {
        Raylib.rlSetUniformMatrix(locIndex, mat);
    }

    public static com.raylib.Raylib.Vector3 vector3Transform(com.raylib.Raylib.Vector3 v, com.raylib.Raylib.Matrix mat) {
        return Raylib.Vector3Transform(v, mat);
    }

    public static com.raylib.Raylib.Vector3 vector3Unproject(com.raylib.Raylib.Vector3 source, com.raylib.Raylib.Matrix projection, com.raylib.Raylib.Matrix view) {
        return Raylib.Vector3Unproject(source, projection, view);
    }

    public static float vector3DistanceSqr(com.raylib.Raylib.Vector3 v1, com.raylib.Raylib.Vector3 v2) {
        return Raylib.Vector3DistanceSqr(v1, v2);
    }

    /**
     * Read screen pixel data (color buffer)
     */
    public static org.bytedeco.javacpp.BytePointer rlReadScreenPixels(int width, int height) {
        return Raylib.rlReadScreenPixels(width, height);
    }

    public static com.raylib.Raylib.Vector2 vector2Reflect(com.raylib.Raylib.Vector2 v, com.raylib.Raylib.Vector2 normal) {
        return Raylib.Vector2Reflect(v, normal);
    }

    public static float vector2Distance(com.raylib.Raylib.Vector2 v1, com.raylib.Raylib.Vector2 v2) {
        return Raylib.Vector2Distance(v1, v2);
    }

    public static com.raylib.Raylib.Vector2 vector2MoveTowards(com.raylib.Raylib.Vector2 v, com.raylib.Raylib.Vector2 target, float maxDistance) {
        return Raylib.Vector2MoveTowards(v, target, maxDistance);
    }

    public static com.raylib.Raylib.Vector2 vector2AddValue(com.raylib.Raylib.Vector2 v, float add) {
        return Raylib.Vector2AddValue(v, add);
    }

    public static com.raylib.Raylib.Vector2 vector2ClampValue(com.raylib.Raylib.Vector2 v, float min, float max) {
        return Raylib.Vector2ClampValue(v, min, max);
    }

    public static int vector2Equals(com.raylib.Raylib.Vector2 p, com.raylib.Raylib.Vector2 q) {
        return Raylib.Vector2Equals(p, q);
    }

    public static float vector2Angle(com.raylib.Raylib.Vector2 v1, com.raylib.Raylib.Vector2 v2) {
        return Raylib.Vector2Angle(v1, v2);
    }

    public static int floatEquals(float x, float y) {
        return Raylib.FloatEquals(x, y);
    }

    public static com.raylib.Raylib.Vector3 vector3Zero() {
        return Raylib.Vector3Zero();
    }

    public static com.raylib.Raylib.Vector3 vector3Negate(com.raylib.Raylib.Vector3 v) {
        return Raylib.Vector3Negate(v);
    }

    /**
     * Read SSBO buffer data (GPU->CPU)
     */
    public static void rlReadShaderBuffer(int id, org.bytedeco.javacpp.Pointer dest, int count, int offset) {
        Raylib.rlReadShaderBuffer(id, dest, count, offset);
    }

    public static com.raylib.Raylib.Vector2 vector2Clamp(com.raylib.Raylib.Vector2 v, com.raylib.Raylib.Vector2 min, com.raylib.Raylib.Vector2 max) {
        return Raylib.Vector2Clamp(v, min, max);
    }

    public static com.raylib.Raylib.Vector2 vector2Refract(com.raylib.Raylib.Vector2 v, com.raylib.Raylib.Vector2 n, float r) {
        return Raylib.Vector2Refract(v, n, r);
    }

    public static float vector3Angle(com.raylib.Raylib.Vector3 v1, com.raylib.Raylib.Vector3 v2) {
        return Raylib.Vector3Angle(v1, v2);
    }

    /**
     * Set shader currently active (id and locations)
     */
    public static void rlSetShader(int id, org.bytedeco.javacpp.IntPointer locs) {
        Raylib.rlSetShader(id, locs);
    }

    /**
     * Set shader currently active (id and locations)
     */
    public static void rlSetShader(int id, java.nio.IntBuffer locs) {
        Raylib.rlSetShader(id, locs);
    }

    /**
     * Set shader currently active (id and locations)
     */
    public static void rlSetShader(int id, int[] locs) {
        Raylib.rlSetShader(id, locs);
    }

    public static float vector2LineAngle(com.raylib.Raylib.Vector2 start, com.raylib.Raylib.Vector2 end) {
        return Raylib.Vector2LineAngle(start, end);
    }

    /**
     * Load an empty framebuffer
     */
    public static int rlLoadFramebuffer() {
        return Raylib.rlLoadFramebuffer();
    }

    public static float vector3Length(com.raylib.Raylib.Vector3 v) {
        return Raylib.Vector3Length(v);
    }

    public static float vector3LengthSqr(com.raylib.Raylib.Vector3 v) {
        return Raylib.Vector3LengthSqr(v);
    }

    public static float vector3Distance(com.raylib.Raylib.Vector3 v1, com.raylib.Raylib.Vector3 v2) {
        return Raylib.Vector3Distance(v1, v2);
    }

    /**
     * Load shader from code strings
     */
    public static int rlLoadShaderCode(java.lang.String vsCode, java.lang.String fsCode) {
        return Raylib.rlLoadShaderCode(vsCode, fsCode);
    }

    /**
     * Load shader from code strings
     */
    public static int rlLoadShaderCode(org.bytedeco.javacpp.BytePointer vsCode, org.bytedeco.javacpp.BytePointer fsCode) {
        return Raylib.rlLoadShaderCode(vsCode, fsCode);
    }

    /**
     * Load and draw a quad
     */
    public static void rlLoadDrawQuad() {
        Raylib.rlLoadDrawQuad();
    }

    /**
     * Bind image texture
     */
    public static void rlBindImageTexture(int id, int index, int format, boolean readonly) {
        Raylib.rlBindImageTexture(id, index, format, readonly);
    }

    public static com.raylib.Raylib.Vector3 vector3Scale(com.raylib.Raylib.Vector3 v, float scalar) {
        return Raylib.Vector3Scale(v, scalar);
    }

    /**
     * Copy SSBO data between buffers
     */
    public static void rlCopyShaderBuffer(int destId, int srcId, int destOffset, int srcOffset, int count) {
        Raylib.rlCopyShaderBuffer(destId, srcId, destOffset, srcOffset, count);
    }

    public static com.raylib.Raylib.Vector3 vector3Reject(com.raylib.Raylib.Vector3 v1, com.raylib.Raylib.Vector3 v2) {
        return Raylib.Vector3Reject(v1, v2);
    }

    public static com.raylib.Raylib.Vector3 vector3Barycenter(com.raylib.Raylib.Vector3 p, com.raylib.Raylib.Vector3 a, com.raylib.Raylib.Vector3 b, com.raylib.Raylib.Vector3 c) {
        return Raylib.Vector3Barycenter(p, a, b, c);
    }

    public static com.raylib.Raylib.Vector2 vector2Subtract(com.raylib.Raylib.Vector2 v1, com.raylib.Raylib.Vector2 v2) {
        return Raylib.Vector2Subtract(v1, v2);
    }

    public static com.raylib.Raylib.Vector3 vector3AddValue(com.raylib.Raylib.Vector3 v, float add) {
        return Raylib.Vector3AddValue(v, add);
    }

    public static float vector2DistanceSqr(com.raylib.Raylib.Vector2 v1, com.raylib.Raylib.Vector2 v2) {
        return Raylib.Vector2DistanceSqr(v1, v2);
    }

    public static float vector3DotProduct(com.raylib.Raylib.Vector3 v1, com.raylib.Raylib.Vector3 v2) {
        return Raylib.Vector3DotProduct(v1, v2);
    }

    public static com.raylib.Raylib.Vector3 vector3Project(com.raylib.Raylib.Vector3 v1, com.raylib.Raylib.Vector3 v2) {
        return Raylib.Vector3Project(v1, v2);
    }

    public static com.raylib.Raylib.Vector3 vector3Divide(com.raylib.Raylib.Vector3 v1, com.raylib.Raylib.Vector3 v2) {
        return Raylib.Vector3Divide(v1, v2);
    }

    public static com.raylib.Raylib.Vector3 vector3Reflect(com.raylib.Raylib.Vector3 v, com.raylib.Raylib.Vector3 normal) {
        return Raylib.Vector3Reflect(v, normal);
    }

    public static com.raylib.Raylib.Vector2 vector2Multiply(com.raylib.Raylib.Vector2 v1, com.raylib.Raylib.Vector2 v2) {
        return Raylib.Vector2Multiply(v1, v2);
    }

    public static com.raylib.Raylib.float3 vector3ToFloatV(com.raylib.Raylib.Vector3 v) {
        return Raylib.Vector3ToFloatV(v);
    }

    public static com.raylib.Raylib.Vector2 vector2Transform(com.raylib.Raylib.Vector2 v, com.raylib.Raylib.Matrix mat) {
        return Raylib.Vector2Transform(v, mat);
    }

    public static com.raylib.Raylib.Vector2 vector2Divide(com.raylib.Raylib.Vector2 v1, com.raylib.Raylib.Vector2 v2) {
        return Raylib.Vector2Divide(v1, v2);
    }

    public static com.raylib.Raylib.Vector2 vector2Normalize(com.raylib.Raylib.Vector2 v) {
        return Raylib.Vector2Normalize(v);
    }

    public static com.raylib.Raylib.Vector2 vector2Lerp(com.raylib.Raylib.Vector2 v1, com.raylib.Raylib.Vector2 v2, float amount) {
        return Raylib.Vector2Lerp(v1, v2, amount);
    }

    public static com.raylib.Raylib.Vector2 vector2Rotate(com.raylib.Raylib.Vector2 v, float angle) {
        return Raylib.Vector2Rotate(v, angle);
    }

    public static com.raylib.Raylib.Vector2 vector2Invert(com.raylib.Raylib.Vector2 v) {
        return Raylib.Vector2Invert(v);
    }

    public static float vector2LengthSqr(com.raylib.Raylib.Vector2 v) {
        return Raylib.Vector2LengthSqr(v);
    }

    /**
     * Bind SSBO buffer
     */
    public static void rlBindShaderBuffer(int id, int index) {
        Raylib.rlBindShaderBuffer(id, index);
    }

    public static float vector2DotProduct(com.raylib.Raylib.Vector2 v1, com.raylib.Raylib.Vector2 v2) {
        return Raylib.Vector2DotProduct(v1, v2);
    }

    public static com.raylib.Raylib.Matrix matrixPerspective(double fovY, double aspect, double nearPlane, double farPlane) {
        return Raylib.MatrixPerspective(fovY, aspect, nearPlane, farPlane);
    }

    public static com.raylib.Raylib.Vector3 vector3Invert(com.raylib.Raylib.Vector3 v) {
        return Raylib.Vector3Invert(v);
    }

    public static float matrixTrace(com.raylib.Raylib.Matrix mat) {
        return Raylib.MatrixTrace(mat);
    }

    public static com.raylib.Raylib.float16 matrixToFloatV(com.raylib.Raylib.Matrix mat) {
        return Raylib.MatrixToFloatV(mat);
    }

    public static com.raylib.Raylib.Vector4 quaternionScale(com.raylib.Raylib.Vector4 q, float mul) {
        return Raylib.QuaternionScale(q, mul);
    }

    public static com.raylib.Raylib.Vector4 quaternionDivide(com.raylib.Raylib.Vector4 q1, com.raylib.Raylib.Vector4 q2) {
        return Raylib.QuaternionDivide(q1, q2);
    }

    public static com.raylib.Raylib.Vector4 quaternionLerp(com.raylib.Raylib.Vector4 q1, com.raylib.Raylib.Vector4 q2, float amount) {
        return Raylib.QuaternionLerp(q1, q2, amount);
    }

    public static float vector4DotProduct(com.raylib.Raylib.Vector4 v1, com.raylib.Raylib.Vector4 v2) {
        return Raylib.Vector4DotProduct(v1, v2);
    }

    public static float vector4Distance(com.raylib.Raylib.Vector4 v1, com.raylib.Raylib.Vector4 v2) {
        return Raylib.Vector4Distance(v1, v2);
    }

    public static float vector4LengthSqr(com.raylib.Raylib.Vector4 v) {
        return Raylib.Vector4LengthSqr(v);
    }

    public static com.raylib.Raylib.Vector4 quaternionNlerp(com.raylib.Raylib.Vector4 q1, com.raylib.Raylib.Vector4 q2, float amount) {
        return Raylib.QuaternionNlerp(q1, q2, amount);
    }

    public static com.raylib.Raylib.Vector4 quaternionSlerp(com.raylib.Raylib.Vector4 q1, com.raylib.Raylib.Vector4 q2, float amount) {
        return Raylib.QuaternionSlerp(q1, q2, amount);
    }

    public static com.raylib.Raylib.Vector3 quaternionToEuler(com.raylib.Raylib.Vector4 q) {
        return Raylib.QuaternionToEuler(q);
    }

    public static com.raylib.Raylib.Matrix matrixTranslate(float x, float y, float z) {
        return Raylib.MatrixTranslate(x, y, z);
    }

    public static int quaternionEquals(com.raylib.Raylib.Vector4 p, com.raylib.Raylib.Vector4 q) {
        return Raylib.QuaternionEquals(p, q);
    }

    public static void matrixDecompose(com.raylib.Raylib.Matrix mat, com.raylib.Raylib.Vector3 translation, com.raylib.Raylib.Vector4 rotation, com.raylib.Raylib.Vector3 scale) {
        Raylib.MatrixDecompose(mat, translation, rotation, scale);
    }

    public static com.raylib.Raylib.Vector2 vector2Zeros() {
        return Raylib.Vector2Zeros();
    }

    public static com.raylib.Raylib.Vector2 vector2Ones() {
        return Raylib.Vector2Ones();
    }

    public static com.raylib.Raylib.Vector2 vector2UnitX() {
        return Raylib.Vector2UnitX();
    }

    public static com.raylib.Raylib.Matrix matrixIdentity() {
        return Raylib.MatrixIdentity();
    }

    public static com.raylib.Raylib.Vector2 vector2UnitY() {
        return Raylib.Vector2UnitY();
    }

    public static com.raylib.Raylib.Vector4 vector4Lerp(com.raylib.Raylib.Vector4 v1, com.raylib.Raylib.Vector4 v2, float amount) {
        return Raylib.Vector4Lerp(v1, v2, amount);
    }

    public static com.raylib.Raylib.Vector4 quaternionSubtract(com.raylib.Raylib.Vector4 q1, com.raylib.Raylib.Vector4 q2) {
        return Raylib.QuaternionSubtract(q1, q2);
    }

    public static com.raylib.Raylib.Vector4 vector4Zero() {
        return Raylib.Vector4Zero();
    }

    public static com.raylib.Raylib.Vector4 vector4MoveTowards(com.raylib.Raylib.Vector4 v, com.raylib.Raylib.Vector4 target, float maxDistance) {
        return Raylib.Vector4MoveTowards(v, target, maxDistance);
    }

    public static com.raylib.Raylib.Vector4 subtractPut(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.subtractPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Matrix subtractPut(com.raylib.Raylib.Matrix arg0, com.raylib.Raylib.Matrix arg1) {
        return Raylib.subtractPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 subtractPut(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Matrix arg1) {
        return Raylib.subtractPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 subtractPut(com.raylib.Raylib.Vector4 arg0, float arg1) {
        return Raylib.subtractPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 subtractPut(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Matrix arg1) {
        return Raylib.subtractPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 subtractPut(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.subtractPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 subtractPut(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.subtractPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 vector4Divide(com.raylib.Raylib.Vector4 v1, com.raylib.Raylib.Vector4 v2) {
        return Raylib.Vector4Divide(v1, v2);
    }

    public static com.raylib.Raylib.Matrix matrixRotateY(float angle) {
        return Raylib.MatrixRotateY(angle);
    }

    public static int vector4Equals(com.raylib.Raylib.Vector4 p, com.raylib.Raylib.Vector4 q) {
        return Raylib.Vector4Equals(p, q);
    }

    public static com.raylib.Raylib.Matrix quaternionToMatrix(com.raylib.Raylib.Vector4 q) {
        return Raylib.QuaternionToMatrix(q);
    }

    public static float vector4Length(com.raylib.Raylib.Vector4 v) {
        return Raylib.Vector4Length(v);
    }

    public static float quaternionLength(com.raylib.Raylib.Vector4 q) {
        return Raylib.QuaternionLength(q);
    }

    public static com.raylib.Raylib.Vector4 vector4Scale(com.raylib.Raylib.Vector4 v, float scale) {
        return Raylib.Vector4Scale(v, scale);
    }

    public static com.raylib.Raylib.Vector3 vector3Refract(com.raylib.Raylib.Vector3 v, com.raylib.Raylib.Vector3 n, float r) {
        return Raylib.Vector3Refract(v, n, r);
    }

    public static com.raylib.Raylib.Vector3 vector3ClampValue(com.raylib.Raylib.Vector3 v, float min, float max) {
        return Raylib.Vector3ClampValue(v, min, max);
    }

    public static com.raylib.Raylib.Vector4 vector4Negate(com.raylib.Raylib.Vector4 v) {
        return Raylib.Vector4Negate(v);
    }

    public static com.raylib.Raylib.Matrix matrixInvert(com.raylib.Raylib.Matrix mat) {
        return Raylib.MatrixInvert(mat);
    }

    public static com.raylib.Raylib.Matrix matrixRotateZYX(com.raylib.Raylib.Vector3 angle) {
        return Raylib.MatrixRotateZYX(angle);
    }

    public static com.raylib.Raylib.Vector4 vector4AddValue(com.raylib.Raylib.Vector4 v, float add) {
        return Raylib.Vector4AddValue(v, add);
    }

    public static com.raylib.Raylib.Matrix matrixMultiply(com.raylib.Raylib.Matrix left, com.raylib.Raylib.Matrix right) {
        return Raylib.MatrixMultiply(left, right);
    }

    public static com.raylib.Raylib.Vector4 vector4Normalize(com.raylib.Raylib.Vector4 v) {
        return Raylib.Vector4Normalize(v);
    }

    public static com.raylib.Raylib.Vector4 vector4Subtract(com.raylib.Raylib.Vector4 v1, com.raylib.Raylib.Vector4 v2) {
        return Raylib.Vector4Subtract(v1, v2);
    }

    public static com.raylib.Raylib.Vector3 vector3Clamp(com.raylib.Raylib.Vector3 v, com.raylib.Raylib.Vector3 min, com.raylib.Raylib.Vector3 max) {
        return Raylib.Vector3Clamp(v, min, max);
    }

    public static com.raylib.Raylib.Matrix matrixFrustum(double left, double right, double bottom, double top, double nearPlane, double farPlane) {
        return Raylib.MatrixFrustum(left, right, bottom, top, nearPlane, farPlane);
    }

    public static com.raylib.Raylib.Matrix matrixRotateXYZ(com.raylib.Raylib.Vector3 angle) {
        return Raylib.MatrixRotateXYZ(angle);
    }

    public static com.raylib.Raylib.Matrix matrixOrtho(double left, double right, double bottom, double top, double nearPlane, double farPlane) {
        return Raylib.MatrixOrtho(left, right, bottom, top, nearPlane, farPlane);
    }

    public static com.raylib.Raylib.Matrix matrixScale(float x, float y, float z) {
        return Raylib.MatrixScale(x, y, z);
    }

    public static com.raylib.Raylib.Matrix matrixLookAt(com.raylib.Raylib.Vector3 eye, com.raylib.Raylib.Vector3 target, com.raylib.Raylib.Vector3 up) {
        return Raylib.MatrixLookAt(eye, target, up);
    }

    public static float matrixDeterminant(com.raylib.Raylib.Matrix mat) {
        return Raylib.MatrixDeterminant(mat);
    }

    public static com.raylib.Raylib.Matrix matrixTranspose(com.raylib.Raylib.Matrix mat) {
        return Raylib.MatrixTranspose(mat);
    }

    public static com.raylib.Raylib.Vector4 quaternionAdd(com.raylib.Raylib.Vector4 q1, com.raylib.Raylib.Vector4 q2) {
        return Raylib.QuaternionAdd(q1, q2);
    }

    public static com.raylib.Raylib.Vector4 quaternionAddValue(com.raylib.Raylib.Vector4 q, float add) {
        return Raylib.QuaternionAddValue(q, add);
    }

    public static int vector3Equals(com.raylib.Raylib.Vector3 p, com.raylib.Raylib.Vector3 q) {
        return Raylib.Vector3Equals(p, q);
    }

    public static float vector4DistanceSqr(com.raylib.Raylib.Vector4 v1, com.raylib.Raylib.Vector4 v2) {
        return Raylib.Vector4DistanceSqr(v1, v2);
    }

    public static com.raylib.Raylib.Vector4 vector4Multiply(com.raylib.Raylib.Vector4 v1, com.raylib.Raylib.Vector4 v2) {
        return Raylib.Vector4Multiply(v1, v2);
    }

    public static com.raylib.Raylib.Matrix matrixSubtract(com.raylib.Raylib.Matrix left, com.raylib.Raylib.Matrix right) {
        return Raylib.MatrixSubtract(left, right);
    }

    public static com.raylib.Raylib.Matrix matrixRotate(com.raylib.Raylib.Vector3 axis, float angle) {
        return Raylib.MatrixRotate(axis, angle);
    }

    public static com.raylib.Raylib.Matrix matrixRotateX(float angle) {
        return Raylib.MatrixRotateX(angle);
    }

    public static com.raylib.Raylib.Vector4 quaternionIdentity() {
        return Raylib.QuaternionIdentity();
    }

    public static com.raylib.Raylib.Vector4 quaternionInvert(com.raylib.Raylib.Vector4 q) {
        return Raylib.QuaternionInvert(q);
    }

    public static com.raylib.Raylib.Vector4 quaternionMultiply(com.raylib.Raylib.Vector4 q1, com.raylib.Raylib.Vector4 q2) {
        return Raylib.QuaternionMultiply(q1, q2);
    }

    public static com.raylib.Raylib.Vector4 vector4Invert(com.raylib.Raylib.Vector4 v) {
        return Raylib.Vector4Invert(v);
    }

    public static com.raylib.Raylib.Matrix matrixRotateZ(float angle) {
        return Raylib.MatrixRotateZ(angle);
    }

    /**
     * Get text with icon id prepended (if supported)
     */
    public static java.lang.String guiIconText(int iconId, java.lang.String text) {
        return Raylib.GuiIconText(iconId, text);
    }

    /**
     * Get text with icon id prepended (if supported)
     */
    public static org.bytedeco.javacpp.BytePointer guiIconText(int iconId, org.bytedeco.javacpp.BytePointer text) {
        return Raylib.GuiIconText(iconId, text);
    }

    public static com.raylib.Raylib.Vector3 vector3Zeros() {
        return Raylib.Vector3Zeros();
    }

    /**
     * Check Box control, returns true when active
     */
    public static int guiCheckBox(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.BoolPointer checked) {
        return Raylib.GuiCheckBox(bounds, text, checked);
    }

    /**
     * Check Box control, returns true when active
     */
    public static int guiCheckBox(com.raylib.Raylib.Rectangle bounds, java.lang.String text, boolean[] checked) {
        return Raylib.GuiCheckBox(bounds, text, checked);
    }

    /**
     * Get gui state (global state)
     */
    public static int guiGetState() {
        return Raylib.GuiGetState();
    }

    public static int guiValueBoxFloat(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, byte[] arg2, float[] arg3, boolean arg4) {
        return Raylib.GuiValueBoxFloat(arg0, arg1, arg2, arg3, arg4);
    }

    public static int guiValueBoxFloat(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, java.nio.ByteBuffer arg2, java.nio.FloatBuffer arg3, boolean arg4) {
        return Raylib.GuiValueBoxFloat(arg0, arg1, arg2, arg3, arg4);
    }

    public static int guiValueBoxFloat(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, java.nio.ByteBuffer arg2, java.nio.FloatBuffer arg3, boolean arg4) {
        return Raylib.GuiValueBoxFloat(arg0, arg1, arg2, arg3, arg4);
    }

    public static int guiValueBoxFloat(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, org.bytedeco.javacpp.BytePointer arg2, org.bytedeco.javacpp.FloatPointer arg3, boolean arg4) {
        return Raylib.GuiValueBoxFloat(arg0, arg1, arg2, arg3, arg4);
    }

    public static int guiValueBoxFloat(com.raylib.Raylib.Rectangle arg0, java.lang.String arg1, byte[] arg2, float[] arg3, boolean arg4) {
        return Raylib.GuiValueBoxFloat(arg0, arg1, arg2, arg3, arg4);
    }

    public static int guiValueBoxFloat(com.raylib.Raylib.Rectangle arg0, org.bytedeco.javacpp.BytePointer arg1, org.bytedeco.javacpp.BytePointer arg2, org.bytedeco.javacpp.FloatPointer arg3, boolean arg4) {
        return Raylib.GuiValueBoxFloat(arg0, arg1, arg2, arg3, arg4);
    }

    /**
     * Slider Bar control, returns selected value
     */
    public static int guiSliderBar(com.raylib.Raylib.Rectangle bounds, java.lang.String textLeft, java.lang.String textRight, float[] value, float minValue, float maxValue) {
        return Raylib.GuiSliderBar(bounds, textLeft, textRight, value, minValue, maxValue);
    }

    /**
     * Slider Bar control, returns selected value
     */
    public static int guiSliderBar(com.raylib.Raylib.Rectangle bounds, java.lang.String textLeft, java.lang.String textRight, java.nio.FloatBuffer value, float minValue, float maxValue) {
        return Raylib.GuiSliderBar(bounds, textLeft, textRight, value, minValue, maxValue);
    }

    /**
     * Slider Bar control, returns selected value
     */
    public static int guiSliderBar(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer textLeft, org.bytedeco.javacpp.BytePointer textRight, org.bytedeco.javacpp.FloatPointer value, float minValue, float maxValue) {
        return Raylib.GuiSliderBar(bounds, textLeft, textRight, value, minValue, maxValue);
    }

    /**
     * Slider Bar control, returns selected value
     */
    public static int guiSliderBar(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer textLeft, org.bytedeco.javacpp.BytePointer textRight, float[] value, float minValue, float maxValue) {
        return Raylib.GuiSliderBar(bounds, textLeft, textRight, value, minValue, maxValue);
    }

    /**
     * Slider Bar control, returns selected value
     */
    public static int guiSliderBar(com.raylib.Raylib.Rectangle bounds, java.lang.String textLeft, java.lang.String textRight, org.bytedeco.javacpp.FloatPointer value, float minValue, float maxValue) {
        return Raylib.GuiSliderBar(bounds, textLeft, textRight, value, minValue, maxValue);
    }

    /**
     * Slider Bar control, returns selected value
     */
    public static int guiSliderBar(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer textLeft, org.bytedeco.javacpp.BytePointer textRight, java.nio.FloatBuffer value, float minValue, float maxValue) {
        return Raylib.GuiSliderBar(bounds, textLeft, textRight, value, minValue, maxValue);
    }

    public static com.raylib.Raylib.Vector4 quaternionUnitX() {
        return Raylib.QuaternionUnitX();
    }

    /**
     * Set default icon drawing size
     */
    public static void guiSetIconScale(int scale) {
        Raylib.GuiSetIconScale(scale);
    }

    /**
     * Get one style property
     */
    public static int guiGetStyle(int control, int property) {
        return Raylib.GuiGetStyle(control, property);
    }

    /**
     * Get raygui icons data pointer
     */
    public static org.bytedeco.javacpp.IntPointer guiGetIcons() {
        return Raylib.GuiGetIcons();
    }

    public static com.raylib.Raylib.Vector4 multiplyPut(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Matrix arg1) {
        return Raylib.multiplyPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 multiplyPut(com.raylib.Raylib.Vector2 arg0, float arg1) {
        return Raylib.multiplyPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 multiplyPut(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.multiplyPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 multiplyPut(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.multiplyPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 multiplyPut(com.raylib.Raylib.Vector3 arg0, float arg1) {
        return Raylib.multiplyPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Matrix multiplyPut(com.raylib.Raylib.Matrix arg0, com.raylib.Raylib.Matrix arg1) {
        return Raylib.multiplyPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 multiplyPut(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.multiplyPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 multiplyPut(com.raylib.Raylib.Vector4 arg0, float arg1) {
        return Raylib.multiplyPut(arg0, arg1);
    }

    /**
     * Progress Bar control, shows current progress value
     */
    public static int guiProgressBar(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer textLeft, org.bytedeco.javacpp.BytePointer textRight, org.bytedeco.javacpp.FloatPointer value, float minValue, float maxValue) {
        return Raylib.GuiProgressBar(bounds, textLeft, textRight, value, minValue, maxValue);
    }

    /**
     * Progress Bar control, shows current progress value
     */
    public static int guiProgressBar(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer textLeft, org.bytedeco.javacpp.BytePointer textRight, java.nio.FloatBuffer value, float minValue, float maxValue) {
        return Raylib.GuiProgressBar(bounds, textLeft, textRight, value, minValue, maxValue);
    }

    /**
     * Progress Bar control, shows current progress value
     */
    public static int guiProgressBar(com.raylib.Raylib.Rectangle bounds, java.lang.String textLeft, java.lang.String textRight, float[] value, float minValue, float maxValue) {
        return Raylib.GuiProgressBar(bounds, textLeft, textRight, value, minValue, maxValue);
    }

    /**
     * Progress Bar control, shows current progress value
     */
    public static int guiProgressBar(com.raylib.Raylib.Rectangle bounds, java.lang.String textLeft, java.lang.String textRight, org.bytedeco.javacpp.FloatPointer value, float minValue, float maxValue) {
        return Raylib.GuiProgressBar(bounds, textLeft, textRight, value, minValue, maxValue);
    }

    /**
     * Progress Bar control, shows current progress value
     */
    public static int guiProgressBar(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer textLeft, org.bytedeco.javacpp.BytePointer textRight, float[] value, float minValue, float maxValue) {
        return Raylib.GuiProgressBar(bounds, textLeft, textRight, value, minValue, maxValue);
    }

    /**
     * Progress Bar control, shows current progress value
     */
    public static int guiProgressBar(com.raylib.Raylib.Rectangle bounds, java.lang.String textLeft, java.lang.String textRight, java.nio.FloatBuffer value, float minValue, float maxValue) {
        return Raylib.GuiProgressBar(bounds, textLeft, textRight, value, minValue, maxValue);
    }

    public static com.raylib.Raylib.Vector4 vector4UnitZ() {
        return Raylib.Vector4UnitZ();
    }

    public static void closePhysics() {
        Raylib.ClosePhysics();
    }

    public static void physicsShatter(com.raylib.Raylib.PhysicsBody arg0, com.raylib.Raylib.Vector2 arg1, float arg2) {
        Raylib.PhysicsShatter(arg0, arg1, arg2);
    }

    /**
     * Window Box control, shows a window that can be closed
     */
    public static int guiWindowBox(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer title) {
        return Raylib.GuiWindowBox(bounds, title);
    }

    /**
     * Window Box control, shows a window that can be closed
     */
    public static int guiWindowBox(com.raylib.Raylib.Rectangle bounds, java.lang.String title) {
        return Raylib.GuiWindowBox(bounds, title);
    }

    /**
     * Toggle Slider control, returns true when clicked
     */
    public static int guiToggleSlider(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, java.nio.IntBuffer active) {
        return Raylib.GuiToggleSlider(bounds, text, active);
    }

    /**
     * Toggle Slider control, returns true when clicked
     */
    public static int guiToggleSlider(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, int[] active) {
        return Raylib.GuiToggleSlider(bounds, text, active);
    }

    /**
     * Toggle Slider control, returns true when clicked
     */
    public static int guiToggleSlider(com.raylib.Raylib.Rectangle bounds, java.lang.String text, int[] active) {
        return Raylib.GuiToggleSlider(bounds, text, active);
    }

    /**
     * Toggle Slider control, returns true when clicked
     */
    public static int guiToggleSlider(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.IntPointer active) {
        return Raylib.GuiToggleSlider(bounds, text, active);
    }

    /**
     * Toggle Slider control, returns true when clicked
     */
    public static int guiToggleSlider(com.raylib.Raylib.Rectangle bounds, java.lang.String text, java.nio.IntBuffer active) {
        return Raylib.GuiToggleSlider(bounds, text, active);
    }

    /**
     * Toggle Slider control, returns true when clicked
     */
    public static int guiToggleSlider(com.raylib.Raylib.Rectangle bounds, java.lang.String text, org.bytedeco.javacpp.IntPointer active) {
        return Raylib.GuiToggleSlider(bounds, text, active);
    }

    public static void physicsAddForce(com.raylib.Raylib.PhysicsBody arg0, com.raylib.Raylib.Vector2 arg1) {
        Raylib.PhysicsAddForce(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 quaternionZeros() {
        return Raylib.QuaternionZeros();
    }

    public static com.raylib.Raylib.Vector4 quaternionOnes() {
        return Raylib.QuaternionOnes();
    }

    /**
     * Set gui controls alpha (global state), alpha goes from 0.0f to 1.0f
     */
    public static void guiSetAlpha(float alpha) {
        Raylib.GuiSetAlpha(alpha);
    }

    /**
     * Set tooltip string
     */
    public static void guiSetTooltip(org.bytedeco.javacpp.BytePointer tooltip) {
        Raylib.GuiSetTooltip(tooltip);
    }

    /**
     * Set tooltip string
     */
    public static void guiSetTooltip(java.lang.String tooltip) {
        Raylib.GuiSetTooltip(tooltip);
    }

    /**
     * Combo Box control, returns selected item index
     */
    public static int guiComboBox(com.raylib.Raylib.Rectangle bounds, java.lang.String text, int[] active) {
        return Raylib.GuiComboBox(bounds, text, active);
    }

    /**
     * Combo Box control, returns selected item index
     */
    public static int guiComboBox(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.IntPointer active) {
        return Raylib.GuiComboBox(bounds, text, active);
    }

    /**
     * Combo Box control, returns selected item index
     */
    public static int guiComboBox(com.raylib.Raylib.Rectangle bounds, java.lang.String text, java.nio.IntBuffer active) {
        return Raylib.GuiComboBox(bounds, text, active);
    }

    /**
     * Combo Box control, returns selected item index
     */
    public static int guiComboBox(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, java.nio.IntBuffer active) {
        return Raylib.GuiComboBox(bounds, text, active);
    }

    /**
     * Combo Box control, returns selected item index
     */
    public static int guiComboBox(com.raylib.Raylib.Rectangle bounds, java.lang.String text, org.bytedeco.javacpp.IntPointer active) {
        return Raylib.GuiComboBox(bounds, text, active);
    }

    /**
     * Combo Box control, returns selected item index
     */
    public static int guiComboBox(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, int[] active) {
        return Raylib.GuiComboBox(bounds, text, active);
    }

    /**
     * Dropdown Box control, returns selected item
     */
    public static int guiDropdownBox(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, java.nio.IntBuffer active, boolean editMode) {
        return Raylib.GuiDropdownBox(bounds, text, active, editMode);
    }

    /**
     * Dropdown Box control, returns selected item
     */
    public static int guiDropdownBox(com.raylib.Raylib.Rectangle bounds, java.lang.String text, int[] active, boolean editMode) {
        return Raylib.GuiDropdownBox(bounds, text, active, editMode);
    }

    /**
     * Dropdown Box control, returns selected item
     */
    public static int guiDropdownBox(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.IntPointer active, boolean editMode) {
        return Raylib.GuiDropdownBox(bounds, text, active, editMode);
    }

    /**
     * Dropdown Box control, returns selected item
     */
    public static int guiDropdownBox(com.raylib.Raylib.Rectangle bounds, java.lang.String text, java.nio.IntBuffer active, boolean editMode) {
        return Raylib.GuiDropdownBox(bounds, text, active, editMode);
    }

    /**
     * Dropdown Box control, returns selected item
     */
    public static int guiDropdownBox(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, int[] active, boolean editMode) {
        return Raylib.GuiDropdownBox(bounds, text, active, editMode);
    }

    /**
     * Dropdown Box control, returns selected item
     */
    public static int guiDropdownBox(com.raylib.Raylib.Rectangle bounds, java.lang.String text, org.bytedeco.javacpp.IntPointer active, boolean editMode) {
        return Raylib.GuiDropdownBox(bounds, text, active, editMode);
    }

    public static com.raylib.Raylib.Vector4 vector4UnitX() {
        return Raylib.Vector4UnitX();
    }

    /**
     * Check if gui is locked (global state)
     */
    public static boolean guiIsLocked() {
        return Raylib.GuiIsLocked();
    }

    public static com.raylib.Raylib.Vector3 vector3UnitY() {
        return Raylib.Vector3UnitY();
    }

    public static com.raylib.Raylib.Vector3 vector3UnitZ() {
        return Raylib.Vector3UnitZ();
    }

    public static void updatePhysics() {
        Raylib.UpdatePhysics();
    }

    public static com.raylib.Raylib.Vector3 vector3UnitX() {
        return Raylib.Vector3UnitX();
    }

    public static com.raylib.Raylib.Vector3 vector3Ones() {
        return Raylib.Vector3Ones();
    }

    public static void initPhysics() {
        Raylib.InitPhysics();
    }

    public static void resetPhysics() {
        Raylib.ResetPhysics();
    }

    public static com.raylib.Raylib.PhysicsBody getPhysicsBody(int arg0) {
        return Raylib.GetPhysicsBody(arg0);
    }

    /**
     * Load style file over global style variable (.rgs)
     */
    public static void guiLoadStyle(org.bytedeco.javacpp.BytePointer fileName) {
        Raylib.GuiLoadStyle(fileName);
    }

    /**
     * Load style file over global style variable (.rgs)
     */
    public static void guiLoadStyle(java.lang.String fileName) {
        Raylib.GuiLoadStyle(fileName);
    }

    public static com.raylib.Raylib.Vector4 vector4Zeros() {
        return Raylib.Vector4Zeros();
    }

    public static void setPhysicsTimeStep(double arg0) {
        Raylib.SetPhysicsTimeStep(arg0);
    }

    public static com.raylib.Raylib.Vector4 vector4UnitY() {
        return Raylib.Vector4UnitY();
    }

    public static void destroyPhysicsBody(com.raylib.Raylib.PhysicsBody arg0) {
        Raylib.DestroyPhysicsBody(arg0);
    }

    /**
     * Load raygui icons file (.rgi) into internal icons data
     */
    public static java.nio.ByteBuffer guiLoadIcons(java.lang.String fileName, boolean loadIconsName) {
        return Raylib.GuiLoadIcons(fileName, loadIconsName);
    }

    /**
     * Load raygui icons file (.rgi) into internal icons data
     */
    public static org.bytedeco.javacpp.PointerPointer guiLoadIcons(org.bytedeco.javacpp.BytePointer fileName, boolean loadIconsName) {
        return Raylib.GuiLoadIcons(fileName, loadIconsName);
    }

    public static com.raylib.Raylib.Vector4 vector4Ones() {
        return Raylib.Vector4Ones();
    }

    /**
     * Draw icon using pixel size at specified position
     */
    public static void guiDrawIcon(int iconId, int posX, int posY, int pixelSize, com.raylib.Raylib.Color color) {
        Raylib.GuiDrawIcon(iconId, posX, posY, pixelSize, color);
    }

    /**
     * Scroll Panel control
     */
    public static int guiScrollPanel(com.raylib.Raylib.Rectangle bounds, java.lang.String text, com.raylib.Raylib.Rectangle content, com.raylib.Raylib.Vector2 scroll, com.raylib.Raylib.Rectangle view) {
        return Raylib.GuiScrollPanel(bounds, text, content, scroll, view);
    }

    /**
     * Scroll Panel control
     */
    public static int guiScrollPanel(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, com.raylib.Raylib.Rectangle content, com.raylib.Raylib.Vector2 scroll, com.raylib.Raylib.Rectangle view) {
        return Raylib.GuiScrollPanel(bounds, text, content, scroll, view);
    }

    /**
     * Label button control, show true when clicked
     */
    public static int guiLabelButton(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text) {
        return Raylib.GuiLabelButton(bounds, text);
    }

    /**
     * Label button control, show true when clicked
     */
    public static int guiLabelButton(com.raylib.Raylib.Rectangle bounds, java.lang.String text) {
        return Raylib.GuiLabelButton(bounds, text);
    }

    public static void physicsAddTorque(com.raylib.Raylib.PhysicsBody arg0, float arg1) {
        Raylib.PhysicsAddTorque(arg0, arg1);
    }

    /**
     * Toggle Group control, returns active toggle index
     */
    public static int guiToggleGroup(com.raylib.Raylib.Rectangle bounds, java.lang.String text, org.bytedeco.javacpp.IntPointer active) {
        return Raylib.GuiToggleGroup(bounds, text, active);
    }

    /**
     * Toggle Group control, returns active toggle index
     */
    public static int guiToggleGroup(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, java.nio.IntBuffer active) {
        return Raylib.GuiToggleGroup(bounds, text, active);
    }

    /**
     * Toggle Group control, returns active toggle index
     */
    public static int guiToggleGroup(com.raylib.Raylib.Rectangle bounds, java.lang.String text, int[] active) {
        return Raylib.GuiToggleGroup(bounds, text, active);
    }

    /**
     * Toggle Group control, returns active toggle index
     */
    public static int guiToggleGroup(com.raylib.Raylib.Rectangle bounds, java.lang.String text, java.nio.IntBuffer active) {
        return Raylib.GuiToggleGroup(bounds, text, active);
    }

    /**
     * Toggle Group control, returns active toggle index
     */
    public static int guiToggleGroup(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.IntPointer active) {
        return Raylib.GuiToggleGroup(bounds, text, active);
    }

    /**
     * Toggle Group control, returns active toggle index
     */
    public static int guiToggleGroup(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, int[] active) {
        return Raylib.GuiToggleGroup(bounds, text, active);
    }

    /**
     * Set gui state (global state)
     */
    public static void guiSetState(int state) {
        Raylib.GuiSetState(state);
    }

    /**
     * Value Box control, updates input text with numbers
     */
    public static int guiValueBox(com.raylib.Raylib.Rectangle bounds, java.lang.String text, org.bytedeco.javacpp.IntPointer value, int minValue, int maxValue, boolean editMode) {
        return Raylib.GuiValueBox(bounds, text, value, minValue, maxValue, editMode);
    }

    /**
     * Value Box control, updates input text with numbers
     */
    public static int guiValueBox(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, java.nio.IntBuffer value, int minValue, int maxValue, boolean editMode) {
        return Raylib.GuiValueBox(bounds, text, value, minValue, maxValue, editMode);
    }

    /**
     * Value Box control, updates input text with numbers
     */
    public static int guiValueBox(com.raylib.Raylib.Rectangle bounds, java.lang.String text, java.nio.IntBuffer value, int minValue, int maxValue, boolean editMode) {
        return Raylib.GuiValueBox(bounds, text, value, minValue, maxValue, editMode);
    }

    /**
     * Value Box control, updates input text with numbers
     */
    public static int guiValueBox(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.IntPointer value, int minValue, int maxValue, boolean editMode) {
        return Raylib.GuiValueBox(bounds, text, value, minValue, maxValue, editMode);
    }

    /**
     * Value Box control, updates input text with numbers
     */
    public static int guiValueBox(com.raylib.Raylib.Rectangle bounds, java.lang.String text, int[] value, int minValue, int maxValue, boolean editMode) {
        return Raylib.GuiValueBox(bounds, text, value, minValue, maxValue, editMode);
    }

    /**
     * Value Box control, updates input text with numbers
     */
    public static int guiValueBox(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, int[] value, int minValue, int maxValue, boolean editMode) {
        return Raylib.GuiValueBox(bounds, text, value, minValue, maxValue, editMode);
    }

    /**
     * Set one style property
     */
    public static void guiSetStyle(int control, int property, int value) {
        Raylib.GuiSetStyle(control, property, value);
    }

    /**
     * Group Box control with text name
     */
    public static int guiGroupBox(com.raylib.Raylib.Rectangle bounds, java.lang.String text) {
        return Raylib.GuiGroupBox(bounds, text);
    }

    /**
     * Group Box control with text name
     */
    public static int guiGroupBox(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text) {
        return Raylib.GuiGroupBox(bounds, text);
    }

    /**
     * Disable gui tooltips (global state)
     */
    public static void guiDisableTooltip() {
        Raylib.GuiDisableTooltip();
    }

    public static com.raylib.Raylib.Vector4 vector4UnitW() {
        return Raylib.Vector4UnitW();
    }

    public static void setPhysicsGravity(float arg0, float arg1) {
        Raylib.SetPhysicsGravity(arg0, arg1);
    }

    /**
     * Enable gui tooltips (global state)
     */
    public static void guiEnableTooltip() {
        Raylib.GuiEnableTooltip();
    }

    /**
     * Initialize window and OpenGL context
     */
    public static void initWindow(int width, int height, java.lang.String title) {
        Raylib.InitWindow(width, height, title);
    }

    /**
     * Initialize window and OpenGL context
     */
    public static void initWindow(int width, int height, org.bytedeco.javacpp.BytePointer title) {
        Raylib.InitWindow(width, height, title);
    }

    /**
     * Ends 3D mode and returns to default 2D orthographic mode
     */
    public static void endMode3D() {
        Raylib.EndMode3D();
    }

    /**
     * Get elapsed time in seconds since InitWindow()
     */
    public static double getTime() {
        return Raylib.GetTime();
    }

    /**
     * Get current FPS
     */
    public static int getFPS() {
        return Raylib.GetFPS();
    }

    /**
     * End canvas drawing and swap buffers (double buffering)
     */
    public static void endDrawing() {
        Raylib.EndDrawing();
    }

    /**
     * Show trace log messages (LOG_DEBUG, LOG_INFO, LOG_WARNING, LOG_ERROR...)
     */
    public static void traceLog(int logLevel, java.lang.String text) {
        Raylib.TraceLog(logLevel, text);
    }

    /**
     * Show trace log messages (LOG_DEBUG, LOG_INFO, LOG_WARNING, LOG_ERROR...)
     */
    public static void traceLog(int logLevel, org.bytedeco.javacpp.BytePointer text) {
        Raylib.TraceLog(logLevel, text);
    }

    /**
     * Check if file exists
     */
    public static boolean fileExists(java.lang.String fileName) {
        return Raylib.FileExists(fileName);
    }

    /**
     * Check if file exists
     */
    public static boolean fileExists(org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.FileExists(fileName);
    }

    /**
     * Load shader from files and bind default locations
     */
    public static com.raylib.Raylib.Shader loadShader(org.bytedeco.javacpp.BytePointer vsFileName, org.bytedeco.javacpp.BytePointer fsFileName) {
        return Raylib.LoadShader(vsFileName, fsFileName);
    }

    /**
     * Load shader from files and bind default locations
     */
    public static com.raylib.Raylib.Shader loadShader(java.lang.String vsFileName, java.lang.String fsFileName) {
        return Raylib.LoadShader(vsFileName, fsFileName);
    }

    /**
     * Hides cursor
     */
    public static void hideCursor() {
        Raylib.HideCursor();
    }

    /**
     * Ends 2D mode with custom camera
     */
    public static void endMode2D() {
        Raylib.EndMode2D();
    }

    /**
     * Internal memory allocator
     */
    public static org.bytedeco.javacpp.Pointer memAlloc(int size) {
        return Raylib.MemAlloc(size);
    }

    /**
     * Internal memory free
     */
    public static void memFree(org.bytedeco.javacpp.Pointer ptr) {
        Raylib.MemFree(ptr);
    }

    /**
     * Compute MD5 hash code, returns static int[4] (16 bytes)
     */
    public static int[] computeMD5(byte[] data, int dataSize) {
        return Raylib.ComputeMD5(data, dataSize);
    }

    /**
     * Compute MD5 hash code, returns static int[4] (16 bytes)
     */
    public static java.nio.IntBuffer computeMD5(java.nio.ByteBuffer data, int dataSize) {
        return Raylib.ComputeMD5(data, dataSize);
    }

    /**
     * Compute MD5 hash code, returns static int[4] (16 bytes)
     */
    public static org.bytedeco.javacpp.IntPointer computeMD5(org.bytedeco.javacpp.BytePointer data, int dataSize) {
        return Raylib.ComputeMD5(data, dataSize);
    }

    /**
     * Check if a key is being pressed
     */
    public static boolean isKeyDown(int key) {
        return Raylib.IsKeyDown(key);
    }

    /**
     * Check if a key is NOT being pressed
     */
    public static boolean isKeyUp(int key) {
        return Raylib.IsKeyUp(key);
    }

    /**
     * Shows cursor
     */
    public static void showCursor() {
        Raylib.ShowCursor();
    }

    /**
     * Open URL with default system browser (if available)
     */
    public static void openURL(java.lang.String url) {
        Raylib.OpenURL(url);
    }

    /**
     * Open URL with default system browser (if available)
     */
    public static void openURL(org.bytedeco.javacpp.BytePointer url) {
        Raylib.OpenURL(url);
    }

    /**
     * Wait for some time (halt program execution)
     */
    public static void waitTime(double seconds) {
        Raylib.WaitTime(seconds);
    }

    /**
     * Internal memory reallocator
     */
    public static org.bytedeco.javacpp.Pointer memRealloc(org.bytedeco.javacpp.Pointer ptr, int size) {
        return Raylib.MemRealloc(ptr, size);
    }

    /**
     * Check if a given path is a file or a directory
     */
    public static boolean isPathFile(java.lang.String path) {
        return Raylib.IsPathFile(path);
    }

    /**
     * Check if a given path is a file or a directory
     */
    public static boolean isPathFile(org.bytedeco.javacpp.BytePointer path) {
        return Raylib.IsPathFile(path);
    }

    /**
     * Get mouse position Y
     */
    public static int getMouseY() {
        return Raylib.GetMouseY();
    }

    /**
     * Get touch position Y for touch point 0 (relative to screen size)
     */
    public static int getTouchY() {
        return Raylib.GetTouchY();
    }

    /**
     * Draw a line (using triangles/quads)
     */
    public static void drawLineEx(com.raylib.Raylib.Vector2 startPos, com.raylib.Raylib.Vector2 endPos, float thick, com.raylib.Raylib.Color color) {
        Raylib.DrawLineEx(startPos, endPos, thick, color);
    }

    /**
     * Draw a color-filled circle
     */
    public static void drawCircle(int centerX, int centerY, float radius, com.raylib.Raylib.Color color) {
        Raylib.DrawCircle(centerX, centerY, radius, color);
    }

    /**
     * Draw a regular polygon (Vector version)
     */
    public static void drawPoly(com.raylib.Raylib.Vector2 center, int sides, float radius, float rotation, com.raylib.Raylib.Color color) {
        Raylib.DrawPoly(center, sides, radius, rotation, color);
    }

    /**
     * Draw ring
     */
    public static void drawRing(com.raylib.Raylib.Vector2 center, float innerRadius, float outerRadius, float startAngle, float endAngle, int segments, com.raylib.Raylib.Color color) {
        Raylib.DrawRing(center, innerRadius, outerRadius, startAngle, endAngle, segments, color);
    }

    /**
     * Load image from file into CPU memory (RAM)
     */
    public static com.raylib.Raylib.Image loadImage(org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.LoadImage(fileName);
    }

    /**
     * Load image from file into CPU memory (RAM)
     */
    public static com.raylib.Raylib.Image loadImage(java.lang.String fileName) {
        return Raylib.LoadImage(fileName);
    }

    /**
     * Create an image duplicate (useful for transformations)
     */
    public static com.raylib.Raylib.Image imageCopy(com.raylib.Raylib.Image image) {
        return Raylib.ImageCopy(image);
    }

    /**
     * Create an image from text (default font)
     */
    public static com.raylib.Raylib.Image imageText(org.bytedeco.javacpp.BytePointer text, int fontSize, com.raylib.Raylib.Color color) {
        return Raylib.ImageText(text, fontSize, color);
    }

    /**
     * Create an image from text (default font)
     */
    public static com.raylib.Raylib.Image imageText(java.lang.String text, int fontSize, com.raylib.Raylib.Color color) {
        return Raylib.ImageText(text, fontSize, color);
    }

    /**
     * Get mouse position X
     */
    public static int getMouseX() {
        return Raylib.GetMouseX();
    }

    /**
     * Get touch position X for touch point 0 (relative to screen size)
     */
    public static int getTouchX() {
        return Raylib.GetTouchX();
    }

    /**
     * Convert image to POT (power-of-two)
     */
    public static void imageToPOT(com.raylib.Raylib.Image image, com.raylib.Raylib.Color fill) {
        Raylib.ImageToPOT(image, fill);
    }

    /**
     * Draw a pixel using geometry [Can be slow, use with care]
     */
    public static void drawPixel(int posX, int posY, com.raylib.Raylib.Color color) {
        Raylib.DrawPixel(posX, posY, color);
    }

    /**
     * Draw a line (using gl lines)
     */
    public static void drawLineV(com.raylib.Raylib.Vector2 startPos, com.raylib.Raylib.Vector2 endPos, com.raylib.Raylib.Color color) {
        Raylib.DrawLineV(startPos, endPos, color);
    }

    /**
     * Set a custom key to exit program (default is ESC)
     */
    public static void setExitKey(int key) {
        Raylib.SetExitKey(key);
    }

    /**
     * Draw a pixel using geometry (Vector version) [Can be slow, use with care]
     */
    public static void drawPixelV(com.raylib.Raylib.Vector2 position, com.raylib.Raylib.Color color) {
        Raylib.DrawPixelV(position, color);
    }

    /**
     * Draw a line
     */
    public static void drawLine(int startPosX, int startPosY, int endPosX, int endPosY, com.raylib.Raylib.Color color) {
        Raylib.DrawLine(startPosX, startPosY, endPosX, endPosY, color);
    }

    /**
     * Set automation event internal base frame to start recording
     */
    public static void setAutomationEventBaseFrame(int frame) {
        Raylib.SetAutomationEventBaseFrame(frame);
    }

    /**
     * Start recording automation events (AutomationEventList must be set)
     */
    public static void startAutomationEventRecording() {
        Raylib.StartAutomationEventRecording();
    }

    /**
     * Stop recording automation events
     */
    public static void stopAutomationEventRecording() {
        Raylib.StopAutomationEventRecording();
    }

    /**
     * Default size for new audio streams
     */
    public static void setAudioStreamBufferSizeDefault(int size) {
        Raylib.SetAudioStreamBufferSizeDefault(size);
    }

    /**
     * Enable vertex buffer element (VBO element)
     */
    public static void rlEnableVertexBufferElement(int id) {
        Raylib.rlEnableVertexBufferElement(id);
    }

    /**
     * Update vertex buffer elements data on GPU buffer
     */
    public static void rlUpdateVertexBufferElements(int id, org.bytedeco.javacpp.Pointer data, int dataSize, int offset) {
        Raylib.rlUpdateVertexBufferElements(id, data, dataSize, offset);
    }

    /**
     * Set vertex attribute data divisor
     */
    public static void rlSetVertexAttributeDivisor(int index, int divisor) {
        Raylib.rlSetVertexAttributeDivisor(index, divisor);
    }

    /**
     * Set vertex attribute default value, when attribute to provided
     */
    public static void rlSetVertexAttributeDefault(int locIndex, org.bytedeco.javacpp.Pointer value, int attribType, int count) {
        Raylib.rlSetVertexAttributeDefault(locIndex, value, attribType, count);
    }

    /**
     * Draw spline segment: Cubic Bezier, 2 points, 2 control points
     */
    public static void drawSplineSegmentBezierCubic(com.raylib.Raylib.Vector2 p1, com.raylib.Raylib.Vector2 c2, com.raylib.Raylib.Vector2 c3, com.raylib.Raylib.Vector2 p4, float thick, com.raylib.Raylib.Color color) {
        Raylib.DrawSplineSegmentBezierCubic(p1, c2, c3, p4, thick, color);
    }

    /**
     * Draw rectangle with rounded edges outline
     */
    public static void drawRectangleRoundedLinesEx(com.raylib.Raylib.Rectangle rec, float roundness, int segments, float lineThick, com.raylib.Raylib.Color color) {
        Raylib.DrawRectangleRoundedLinesEx(rec, roundness, segments, lineThick, color);
    }

    /**
     * Check if point is inside a triangle
     */
    public static boolean checkCollisionPointTriangle(com.raylib.Raylib.Vector2 point, com.raylib.Raylib.Vector2 p1, com.raylib.Raylib.Vector2 p2, com.raylib.Raylib.Vector2 p3) {
        return Raylib.CheckCollisionPointTriangle(point, p1, p2, p3);
    }

    /**
     * Disable vertex buffer element (VBO element)
     */
    public static void rlDisableVertexBufferElement() {
        Raylib.rlDisableVertexBufferElement();
    }

    /**
     * Draw vertex array elements with instancing
     */
    public static void rlDrawVertexArrayElementsInstanced(int offset, int count, org.bytedeco.javacpp.Pointer buffer, int instances) {
        Raylib.rlDrawVertexArrayElementsInstanced(offset, count, buffer, instances);
    }

    /**
     * Draw spline segment: Quadratic Bezier, 2 points, 1 control point
     */
    public static void drawSplineSegmentBezierQuadratic(com.raylib.Raylib.Vector2 p1, com.raylib.Raylib.Vector2 c2, com.raylib.Raylib.Vector2 p3, float thick, com.raylib.Raylib.Color color) {
        Raylib.DrawSplineSegmentBezierQuadratic(p1, c2, p3, thick, color);
    }

    /**
     * Draw spline segment: Catmull-Rom, 4 points
     */
    public static void drawSplineSegmentCatmullRom(com.raylib.Raylib.Vector2 p1, com.raylib.Raylib.Vector2 p2, com.raylib.Raylib.Vector2 p3, com.raylib.Raylib.Vector2 p4, float thick, com.raylib.Raylib.Color color) {
        Raylib.DrawSplineSegmentCatmullRom(p1, p2, p3, p4, thick, color);
    }

    public static com.raylib.Raylib.Vector4 quaternionFromVector3ToVector3(com.raylib.Raylib.Vector3 from, com.raylib.Raylib.Vector3 to) {
        return Raylib.QuaternionFromVector3ToVector3(from, to);
    }

    /**
     * Get internal projection matrix for stereo render (selected eye)
     */
    public static com.raylib.Raylib.Matrix rlGetMatrixProjectionStereo(int eye) {
        return Raylib.rlGetMatrixProjectionStereo(eye);
    }

    public static com.raylib.Raylib.Vector4 quaternionCubicHermiteSpline(com.raylib.Raylib.Vector4 q1, com.raylib.Raylib.Vector4 outTangent1, com.raylib.Raylib.Vector4 q2, com.raylib.Raylib.Vector4 inTangent2, float t) {
        return Raylib.QuaternionCubicHermiteSpline(q1, outTangent1, q2, inTangent2, t);
    }

    /**
     * Set eyes view offsets matrices for stereo rendering
     */
    public static void rlSetMatrixViewOffsetStereo(com.raylib.Raylib.Matrix right, com.raylib.Raylib.Matrix left) {
        Raylib.rlSetMatrixViewOffsetStereo(right, left);
    }

    /**
     * Get internal view offset matrix for stereo render (selected eye)
     */
    public static com.raylib.Raylib.Matrix rlGetMatrixViewOffsetStereo(int eye) {
        return Raylib.rlGetMatrixViewOffsetStereo(eye);
    }

    /**
     * Set eyes projection matrices for stereo rendering
     */
    public static void rlSetMatrixProjectionStereo(com.raylib.Raylib.Matrix right, com.raylib.Raylib.Matrix left) {
        Raylib.rlSetMatrixProjectionStereo(right, left);
    }

    public static int getPhysicsShapeVerticesCount(int arg0) {
        return Raylib.GetPhysicsShapeVerticesCount(arg0);
    }

    /**
     * Draw a 3d mesh with material and transform
     */
    public static void drawMesh(com.raylib.Raylib.Mesh mesh, com.raylib.Raylib.Material material, com.raylib.Raylib.Matrix transform) {
        Raylib.DrawMesh(mesh, material, transform);
    }

    /**
     * Initialize drawing mode (how to organize vertex)
     */
    public static void rlBegin(int mode) {
        Raylib.rlBegin(mode);
    }

    /**
     * Unload font from GPU memory (VRAM)
     */
    public static void unloadFont(com.raylib.Raylib.Font font) {
        Raylib.UnloadFont(font);
    }

    /**
     * Load wave data from file
     */
    public static com.raylib.Raylib.Wave loadWave(org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.LoadWave(fileName);
    }

    /**
     * Load wave data from file
     */
    public static com.raylib.Raylib.Wave loadWave(java.lang.String fileName) {
        return Raylib.LoadWave(fileName);
    }

    /**
     * Load UTF-8 text encoded from codepoints array
     */
    public static org.bytedeco.javacpp.BytePointer loadUTF8(org.bytedeco.javacpp.IntPointer codepoints, int length) {
        return Raylib.LoadUTF8(codepoints, length);
    }

    /**
     * Load UTF-8 text encoded from codepoints array
     */
    public static byte[] loadUTF8(int[] codepoints, int length) {
        return Raylib.LoadUTF8(codepoints, length);
    }

    /**
     * Load UTF-8 text encoded from codepoints array
     */
    public static java.nio.ByteBuffer loadUTF8(java.nio.IntBuffer codepoints, int length) {
        return Raylib.LoadUTF8(codepoints, length);
    }

    /**
     * Draw a line in 3D world space
     */
    public static void drawLine3D(com.raylib.Raylib.Vector3 startPos, com.raylib.Raylib.Vector3 endPos, com.raylib.Raylib.Color color) {
        Raylib.DrawLine3D(startPos, endPos, color);
    }

    /**
     * Multiply the current matrix by a scaling matrix
     */
    public static void rlScalef(float x, float y, float z) {
        Raylib.rlScalef(x, y, z);
    }

    /**
     * Define one vertex (position) - 2 int
     */
    public static void rlVertex2i(int x, int y) {
        Raylib.rlVertex2i(x, y);
    }

    /**
     * Define one vertex (color) - 4 byte
     */
    public static void rlColor4ub(byte r, byte g, byte b, byte a) {
        Raylib.rlColor4ub(r, g, b, a);
    }

    /**
     * Define one vertex (position) - 2 float
     */
    public static void rlVertex2f(float x, float y) {
        Raylib.rlVertex2f(x, y);
    }

    /**
     * Define one vertex (color) - 3 float
     */
    public static void rlColor3f(float x, float y, float z) {
        Raylib.rlColor3f(x, y, z);
    }

    /**
     * Scissor test
     */
    public static void rlScissor(int x, int y, int width, int height) {
        Raylib.rlScissor(x, y, width, height);
    }

    /**
     * Insert text in a position (WARNING: memory must be freed!)
     */
    public static org.bytedeco.javacpp.BytePointer textInsert(org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.BytePointer insert, int position) {
        return Raylib.TextInsert(text, insert, position);
    }

    /**
     * Insert text in a position (WARNING: memory must be freed!)
     */
    public static java.nio.ByteBuffer textInsert(java.lang.String text, java.lang.String insert, int position) {
        return Raylib.TextInsert(text, insert, position);
    }

    /**
     * Finish vertex providing
     */
    public static void rlEnd() {
        Raylib.rlEnd();
    }

    /**
     * Define one vertex (color) - 4 float
     */
    public static void rlColor4f(float x, float y, float z, float w) {
        Raylib.rlColor4f(x, y, z, w);
    }

    /**
     * Initialize rlgl (buffers, shaders, textures, states)
     */
    public static void rlglInit(int width, int height) {
        Raylib.rlglInit(width, height);
    }

    /**
     * De-initialize rlgl (buffers, shaders, textures)
     */
    public static void rlglClose() {
        Raylib.rlglClose();
    }

    /**
     * Draw a ray line
     */
    public static void drawRay(com.raylib.Raylib.Ray ray, com.raylib.Raylib.Color color) {
        Raylib.DrawRay(ray, color);
    }

    /**
     * Join text strings with delimiter
     */
    public static java.lang.String textJoin(java.nio.ByteBuffer textList, int count, java.lang.String delimiter) {
        return Raylib.TextJoin(textList, count, delimiter);
    }

    /**
     * Join text strings with delimiter
     */
    public static org.bytedeco.javacpp.BytePointer textJoin(java.nio.ByteBuffer textList, int count, org.bytedeco.javacpp.BytePointer delimiter) {
        return Raylib.TextJoin(textList, count, delimiter);
    }

    /**
     * Join text strings with delimiter
     */
    public static org.bytedeco.javacpp.BytePointer textJoin(byte[] textList, int count, org.bytedeco.javacpp.BytePointer delimiter) {
        return Raylib.TextJoin(textList, count, delimiter);
    }

    /**
     * Join text strings with delimiter
     */
    public static java.lang.String textJoin(org.bytedeco.javacpp.BytePointer textList, int count, java.lang.String delimiter) {
        return Raylib.TextJoin(textList, count, delimiter);
    }

    /**
     * Join text strings with delimiter
     */
    public static org.bytedeco.javacpp.BytePointer textJoin(org.bytedeco.javacpp.BytePointer textList, int count, org.bytedeco.javacpp.BytePointer delimiter) {
        return Raylib.TextJoin(textList, count, delimiter);
    }

    /**
     * Join text strings with delimiter
     */
    public static org.bytedeco.javacpp.BytePointer textJoin(org.bytedeco.javacpp.PointerPointer textList, int count, org.bytedeco.javacpp.BytePointer delimiter) {
        return Raylib.TextJoin(textList, count, delimiter);
    }

    /**
     * Join text strings with delimiter
     */
    public static java.lang.String textJoin(byte[] textList, int count, java.lang.String delimiter) {
        return Raylib.TextJoin(textList, count, delimiter);
    }

    /**
     * Load model from files (meshes and materials)
     */
    public static com.raylib.Raylib.Model loadModel(org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.LoadModel(fileName);
    }

    /**
     * Load model from files (meshes and materials)
     */
    public static com.raylib.Raylib.Model loadModel(java.lang.String fileName) {
        return Raylib.LoadModel(fileName);
    }

    /**
     * Pause a sound
     */
    public static void pauseSound(com.raylib.Raylib.Sound sound) {
        Raylib.PauseSound(sound);
    }

    /**
     * Get Color structure from hexadecimal value
     */
    public static com.raylib.Raylib.Color getColor(int hexValue) {
        return Raylib.GetColor(hexValue);
    }

    /**
     * Unload wave data
     */
    public static void unloadWave(com.raylib.Raylib.Wave wave) {
        Raylib.UnloadWave(wave);
    }

    /**
     * Unload UTF-8 text encoded from codepoints array
     */
    public static void unloadUTF8(byte[] text) {
        Raylib.UnloadUTF8(text);
    }

    /**
     * Unload UTF-8 text encoded from codepoints array
     */
    public static void unloadUTF8(org.bytedeco.javacpp.BytePointer text) {
        Raylib.UnloadUTF8(text);
    }

    /**
     * Unload UTF-8 text encoded from codepoints array
     */
    public static void unloadUTF8(java.nio.ByteBuffer text) {
        Raylib.UnloadUTF8(text);
    }

    /**
     * Define one vertex (position) - 3 float
     */
    public static void rlVertex3f(float x, float y, float z) {
        Raylib.rlVertex3f(x, y, z);
    }

    /**
     * Define one vertex (normal) - 3 float
     */
    public static void rlNormal3f(float x, float y, float z) {
        Raylib.rlNormal3f(x, y, z);
    }

    /**
     * Multiply the current matrix by a rotation matrix
     */
    public static void rlRotatef(float angle, float x, float y, float z) {
        Raylib.rlRotatef(angle, x, y, z);
    }

    /**
     * Copy one string to another, returns bytes copied
     */
    public static int textCopy(org.bytedeco.javacpp.BytePointer dst, java.lang.String src) {
        return Raylib.TextCopy(dst, src);
    }

    /**
     * Copy one string to another, returns bytes copied
     */
    public static int textCopy(java.nio.ByteBuffer dst, java.lang.String src) {
        return Raylib.TextCopy(dst, src);
    }

    /**
     * Copy one string to another, returns bytes copied
     */
    public static int textCopy(byte[] dst, org.bytedeco.javacpp.BytePointer src) {
        return Raylib.TextCopy(dst, src);
    }

    /**
     * Copy one string to another, returns bytes copied
     */
    public static int textCopy(org.bytedeco.javacpp.BytePointer dst, org.bytedeco.javacpp.BytePointer src) {
        return Raylib.TextCopy(dst, src);
    }

    /**
     * Copy one string to another, returns bytes copied
     */
    public static int textCopy(byte[] dst, java.lang.String src) {
        return Raylib.TextCopy(dst, src);
    }

    /**
     * Copy one string to another, returns bytes copied
     */
    public static int textCopy(java.nio.ByteBuffer dst, org.bytedeco.javacpp.BytePointer src) {
        return Raylib.TextCopy(dst, src);
    }

    /**
     * Load font from file into GPU memory (VRAM)
     */
    public static com.raylib.Raylib.Font loadFont(org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.LoadFont(fileName);
    }

    /**
     * Load font from file into GPU memory (VRAM)
     */
    public static com.raylib.Raylib.Font loadFont(java.lang.String fileName) {
        return Raylib.LoadFont(fileName);
    }

    /**
     * Get text length, checks for '\0' ending
     */
    public static int textLength(java.lang.String text) {
        return Raylib.TextLength(text);
    }

    /**
     * Get text length, checks for '\0' ending
     */
    public static int textLength(org.bytedeco.javacpp.BytePointer text) {
        return Raylib.TextLength(text);
    }

    /**
     * Text formatting with variables (sprintf() style)
     */
    public static java.lang.String textFormat(java.lang.String text) {
        return Raylib.TextFormat(text);
    }

    /**
     * Text formatting with variables (sprintf() style)
     */
    public static org.bytedeco.javacpp.BytePointer textFormat(org.bytedeco.javacpp.BytePointer text) {
        return Raylib.TextFormat(text);
    }

    /**
     * Crop a wave to defined frames range
     */
    public static void waveCrop(com.raylib.Raylib.Wave wave, int initFrame, int finalFrame) {
        Raylib.WaveCrop(wave, initFrame, finalFrame);
    }

    /**
     * Draw a grid (centered at (0, 0, 0))
     */
    public static void drawGrid(int slices, float spacing) {
        Raylib.DrawGrid(slices, spacing);
    }

    /**
     * Draw a model (with texture if set)
     */
    public static void drawModel(com.raylib.Raylib.Model model, com.raylib.Raylib.Vector3 position, float scale, com.raylib.Raylib.Color tint) {
        Raylib.DrawModel(model, position, scale, tint);
    }

    /**
     * Export mesh data to file, returns true on success
     */
    public static boolean exportMesh(com.raylib.Raylib.Mesh mesh, java.lang.String fileName) {
        return Raylib.ExportMesh(mesh, fileName);
    }

    /**
     * Export mesh data to file, returns true on success
     */
    public static boolean exportMesh(com.raylib.Raylib.Mesh mesh, org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.ExportMesh(mesh, fileName);
    }

    /**
     * Append text at specific position and move cursor!
     */
    public static void textAppend(byte[] text, java.lang.String append, int[] position) {
        Raylib.TextAppend(text, append, position);
    }

    /**
     * Append text at specific position and move cursor!
     */
    public static void textAppend(java.nio.ByteBuffer text, org.bytedeco.javacpp.BytePointer append, java.nio.IntBuffer position) {
        Raylib.TextAppend(text, append, position);
    }

    /**
     * Append text at specific position and move cursor!
     */
    public static void textAppend(org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.BytePointer append, org.bytedeco.javacpp.IntPointer position) {
        Raylib.TextAppend(text, append, position);
    }

    /**
     * Append text at specific position and move cursor!
     */
    public static void textAppend(java.nio.ByteBuffer text, java.lang.String append, java.nio.IntBuffer position) {
        Raylib.TextAppend(text, append, position);
    }

    /**
     * Append text at specific position and move cursor!
     */
    public static void textAppend(byte[] text, org.bytedeco.javacpp.BytePointer append, int[] position) {
        Raylib.TextAppend(text, append, position);
    }

    /**
     * Append text at specific position and move cursor!
     */
    public static void textAppend(org.bytedeco.javacpp.BytePointer text, java.lang.String append, org.bytedeco.javacpp.IntPointer position) {
        Raylib.TextAppend(text, append, position);
    }

    /**
     * Get color lerp interpolation between two colors, factor [0.0f..1.0f]
     */
    public static com.raylib.Raylib.Color colorLerp(com.raylib.Raylib.Color color1, com.raylib.Raylib.Color color2, float factor) {
        return Raylib.ColorLerp(color1, color2, factor);
    }

    /**
     * Convert wave data to desired format
     */
    public static void waveFormat(com.raylib.Raylib.Wave wave, int sampleRate, int sampleSize, int channels) {
        Raylib.WaveFormat(wave, sampleRate, sampleSize, channels);
    }

    /**
     * Draw current FPS
     */
    public static void drawFPS(int posX, int posY) {
        Raylib.DrawFPS(posX, posY);
    }

    /**
     * Draw text (using default font)
     */
    public static void drawText(java.lang.String text, int posX, int posY, int fontSize, com.raylib.Raylib.Color color) {
        Raylib.DrawText(text, posX, posY, fontSize, color);
    }

    /**
     * Draw text (using default font)
     */
    public static void drawText(org.bytedeco.javacpp.BytePointer text, int posX, int posY, int fontSize, com.raylib.Raylib.Color color) {
        Raylib.DrawText(text, posX, posY, fontSize, color);
    }

    /**
     * Draw text using font and additional parameters
     */
    public static void drawTextEx(com.raylib.Raylib.Font font, org.bytedeco.javacpp.BytePointer text, com.raylib.Raylib.Vector2 position, float fontSize, float spacing, com.raylib.Raylib.Color tint) {
        Raylib.DrawTextEx(font, text, position, fontSize, spacing, tint);
    }

    /**
     * Draw text using font and additional parameters
     */
    public static void drawTextEx(com.raylib.Raylib.Font font, java.lang.String text, com.raylib.Raylib.Vector2 position, float fontSize, float spacing, com.raylib.Raylib.Color tint) {
        Raylib.DrawTextEx(font, text, position, fontSize, spacing, tint);
    }

    /**
     * Draw cube (Vector version)
     */
    public static void drawCubeV(com.raylib.Raylib.Vector3 position, com.raylib.Raylib.Vector3 size, com.raylib.Raylib.Color color) {
        Raylib.DrawCubeV(position, size, color);
    }

    /**
     * Get color with alpha applied, alpha goes from 0.0f to 1.0f
     */
    public static com.raylib.Raylib.Color colorAlpha(com.raylib.Raylib.Color color, float alpha) {
        return Raylib.ColorAlpha(color, alpha);
    }

    /**
     * Draw a plane XZ
     */
    public static void drawPlane(com.raylib.Raylib.Vector3 centerPos, com.raylib.Raylib.Vector2 size, com.raylib.Raylib.Color color) {
        Raylib.DrawPlane(centerPos, size, color);
    }

    /**
     * Unload mesh data from CPU and GPU
     */
    public static void unloadMesh(com.raylib.Raylib.Mesh mesh) {
        Raylib.UnloadMesh(mesh);
    }

    /**
     * Load sound from file
     */
    public static com.raylib.Raylib.Sound loadSound(org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.LoadSound(fileName);
    }

    /**
     * Load sound from file
     */
    public static com.raylib.Raylib.Sound loadSound(java.lang.String fileName) {
        return Raylib.LoadSound(fileName);
    }

    /**
     * Copy a wave to a new wave
     */
    public static com.raylib.Raylib.Wave waveCopy(com.raylib.Raylib.Wave wave) {
        return Raylib.WaveCopy(wave);
    }

    public static void rlFrustum(double left, double right, double bottom, double top, double znear, double zfar) {
        Raylib.rlFrustum(left, right, bottom, top, znear, zfar);
    }

    /**
     * Draw cube
     */
    public static void drawCube(com.raylib.Raylib.Vector3 position, float width, float height, float length, com.raylib.Raylib.Color color) {
        Raylib.DrawCube(position, width, height, length, color);
    }

    /**
     * Draw sphere
     */
    public static void drawSphere(com.raylib.Raylib.Vector3 centerPos, float radius, com.raylib.Raylib.Color color) {
        Raylib.DrawSphere(centerPos, radius, color);
    }

    public static void rlOrtho(double left, double right, double bottom, double top, double znear, double zfar) {
        Raylib.rlOrtho(left, right, bottom, top, znear, zfar);
    }

    /**
     * Export wave data to file, returns true on success
     */
    public static boolean exportWave(com.raylib.Raylib.Wave wave, java.lang.String fileName) {
        return Raylib.ExportWave(wave, fileName);
    }

    /**
     * Export wave data to file, returns true on success
     */
    public static boolean exportWave(com.raylib.Raylib.Wave wave, org.bytedeco.javacpp.BytePointer fileName) {
        return Raylib.ExportWave(wave, fileName);
    }

    /**
     * Upload mesh vertex data in GPU and provide VAO/VBO ids
     */
    public static void uploadMesh(com.raylib.Raylib.Mesh mesh, boolean dynamic) {
        Raylib.UploadMesh(mesh, dynamic);
    }

    /**
     * Load font from file with extended parameters, use NULL for codepoints and 0 for codepointCount to load the default character set, font size is provided in pixels height
     */
    public static com.raylib.Raylib.Font loadFontEx(org.bytedeco.javacpp.BytePointer fileName, int fontSize, org.bytedeco.javacpp.IntPointer codepoints, int codepointCount) {
        return Raylib.LoadFontEx(fileName, fontSize, codepoints, codepointCount);
    }

    /**
     * Load font from file with extended parameters, use NULL for codepoints and 0 for codepointCount to load the default character set, font size is provided in pixels height
     */
    public static com.raylib.Raylib.Font loadFontEx(java.lang.String fileName, int fontSize, int[] codepoints, int codepointCount) {
        return Raylib.LoadFontEx(fileName, fontSize, codepoints, codepointCount);
    }

    /**
     * Load font from file with extended parameters, use NULL for codepoints and 0 for codepointCount to load the default character set, font size is provided in pixels height
     */
    public static com.raylib.Raylib.Font loadFontEx(org.bytedeco.javacpp.BytePointer fileName, int fontSize, java.nio.IntBuffer codepoints, int codepointCount) {
        return Raylib.LoadFontEx(fileName, fontSize, codepoints, codepointCount);
    }

    /**
     * Load font from file with extended parameters, use NULL for codepoints and 0 for codepointCount to load the default character set, font size is provided in pixels height
     */
    public static com.raylib.Raylib.Font loadFontEx(org.bytedeco.javacpp.BytePointer fileName, int fontSize, int[] codepoints, int codepointCount) {
        return Raylib.LoadFontEx(fileName, fontSize, codepoints, codepointCount);
    }

    /**
     * Load font from file with extended parameters, use NULL for codepoints and 0 for codepointCount to load the default character set, font size is provided in pixels height
     */
    public static com.raylib.Raylib.Font loadFontEx(java.lang.String fileName, int fontSize, java.nio.IntBuffer codepoints, int codepointCount) {
        return Raylib.LoadFontEx(fileName, fontSize, codepoints, codepointCount);
    }

    /**
     * Load font from file with extended parameters, use NULL for codepoints and 0 for codepointCount to load the default character set, font size is provided in pixels height
     */
    public static com.raylib.Raylib.Font loadFontEx(java.lang.String fileName, int fontSize, org.bytedeco.javacpp.IntPointer codepoints, int codepointCount) {
        return Raylib.LoadFontEx(fileName, fontSize, codepoints, codepointCount);
    }

    /**
     * Play a sound
     */
    public static void playSound(com.raylib.Raylib.Sound sound) {
        Raylib.PlaySound(sound);
    }

    /**
     * Split text into multiple strings
     */
    public static byte[] textSplit(org.bytedeco.javacpp.BytePointer text, byte delimiter, int[] count) {
        return Raylib.TextSplit(text, delimiter, count);
    }

    /**
     * Split text into multiple strings
     */
    public static byte[] textSplit(java.lang.String text, byte delimiter, int[] count) {
        return Raylib.TextSplit(text, delimiter, count);
    }

    /**
     * Split text into multiple strings
     */
    public static java.nio.ByteBuffer textSplit(org.bytedeco.javacpp.BytePointer text, byte delimiter, java.nio.IntBuffer count) {
        return Raylib.TextSplit(text, delimiter, count);
    }

    /**
     * Split text into multiple strings
     */
    public static org.bytedeco.javacpp.BytePointer textSplit(java.lang.String text, byte delimiter, org.bytedeco.javacpp.IntPointer count) {
        return Raylib.TextSplit(text, delimiter, count);
    }

    /**
     * Split text into multiple strings
     */
    public static org.bytedeco.javacpp.PointerPointer textSplit(org.bytedeco.javacpp.BytePointer text, byte delimiter, org.bytedeco.javacpp.IntPointer count) {
        return Raylib.TextSplit(text, delimiter, count);
    }

    /**
     * Split text into multiple strings
     */
    public static java.nio.ByteBuffer textSplit(java.lang.String text, byte delimiter, java.nio.IntBuffer count) {
        return Raylib.TextSplit(text, delimiter, count);
    }

    /**
     * Stop playing a sound
     */
    public static void stopSound(com.raylib.Raylib.Sound sound) {
        Raylib.StopSound(sound);
    }

    /**
     * Set the viewport area
     */
    public static void rlViewport(int x, int y, int width, int height) {
        Raylib.rlViewport(x, y, width, height);
    }

    public static com.raylib.Raylib.Vector4 vector4Max(com.raylib.Raylib.Vector4 v1, com.raylib.Raylib.Vector4 v2) {
        return Raylib.Vector4Max(v1, v2);
    }

    public static float normalize(float value, float start, float end) {
        return Raylib.Normalize(value, start, end);
    }

    public static com.raylib.Raylib.Vector2 vector2Max(com.raylib.Raylib.Vector2 v1, com.raylib.Raylib.Vector2 v2) {
        return Raylib.Vector2Max(v1, v2);
    }

    /**
     * Lock gui controls (global state)
     */
    public static void guiLock() {
        Raylib.GuiLock();
    }

    /**
     * Enable gui controls (global state)
     */
    public static void guiEnable() {
        Raylib.GuiEnable();
    }

    public static com.raylib.Raylib.Vector2 vector2Min(com.raylib.Raylib.Vector2 v1, com.raylib.Raylib.Vector2 v2) {
        return Raylib.Vector2Min(v1, v2);
    }

    public static float wrap(float value, float min, float max) {
        return Raylib.Wrap(value, min, max);
    }

    /**
     * Toggle Button control, returns true when active
     */
    public static int guiToggle(com.raylib.Raylib.Rectangle bounds, java.lang.String text, boolean[] active) {
        return Raylib.GuiToggle(bounds, text, active);
    }

    /**
     * Toggle Button control, returns true when active
     */
    public static int guiToggle(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.BoolPointer active) {
        return Raylib.GuiToggle(bounds, text, active);
    }

    public static float remap(float value, float inputStart, float inputEnd, float outputStart, float outputEnd) {
        return Raylib.Remap(value, inputStart, inputEnd, outputStart, outputEnd);
    }

    public static com.raylib.Raylib.Vector4 vector4Add(com.raylib.Raylib.Vector4 v1, com.raylib.Raylib.Vector4 v2) {
        return Raylib.Vector4Add(v1, v2);
    }

    /**
     * Tab Bar control, returns TAB to be closed or -1
     */
    public static int guiTabBar(com.raylib.Raylib.Rectangle bounds, byte[] text, int count, int[] active) {
        return Raylib.GuiTabBar(bounds, text, count, active);
    }

    /**
     * Tab Bar control, returns TAB to be closed or -1
     */
    public static int guiTabBar(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.PointerPointer text, int count, org.bytedeco.javacpp.IntPointer active) {
        return Raylib.GuiTabBar(bounds, text, count, active);
    }

    /**
     * Tab Bar control, returns TAB to be closed or -1
     */
    public static int guiTabBar(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, int count, org.bytedeco.javacpp.IntPointer active) {
        return Raylib.GuiTabBar(bounds, text, count, active);
    }

    /**
     * Tab Bar control, returns TAB to be closed or -1
     */
    public static int guiTabBar(com.raylib.Raylib.Rectangle bounds, java.nio.ByteBuffer text, int count, java.nio.IntBuffer active) {
        return Raylib.GuiTabBar(bounds, text, count, active);
    }

    /**
     * Spinner control, returns selected value
     */
    public static int guiSpinner(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, java.nio.IntBuffer value, int minValue, int maxValue, boolean editMode) {
        return Raylib.GuiSpinner(bounds, text, value, minValue, maxValue, editMode);
    }

    /**
     * Spinner control, returns selected value
     */
    public static int guiSpinner(com.raylib.Raylib.Rectangle bounds, java.lang.String text, int[] value, int minValue, int maxValue, boolean editMode) {
        return Raylib.GuiSpinner(bounds, text, value, minValue, maxValue, editMode);
    }

    /**
     * Spinner control, returns selected value
     */
    public static int guiSpinner(com.raylib.Raylib.Rectangle bounds, java.lang.String text, java.nio.IntBuffer value, int minValue, int maxValue, boolean editMode) {
        return Raylib.GuiSpinner(bounds, text, value, minValue, maxValue, editMode);
    }

    /**
     * Spinner control, returns selected value
     */
    public static int guiSpinner(com.raylib.Raylib.Rectangle bounds, java.lang.String text, org.bytedeco.javacpp.IntPointer value, int minValue, int maxValue, boolean editMode) {
        return Raylib.GuiSpinner(bounds, text, value, minValue, maxValue, editMode);
    }

    /**
     * Spinner control, returns selected value
     */
    public static int guiSpinner(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, int[] value, int minValue, int maxValue, boolean editMode) {
        return Raylib.GuiSpinner(bounds, text, value, minValue, maxValue, editMode);
    }

    /**
     * Spinner control, returns selected value
     */
    public static int guiSpinner(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, org.bytedeco.javacpp.IntPointer value, int minValue, int maxValue, boolean editMode) {
        return Raylib.GuiSpinner(bounds, text, value, minValue, maxValue, editMode);
    }

    public static com.raylib.Raylib.Vector3 vector3Add(com.raylib.Raylib.Vector3 v1, com.raylib.Raylib.Vector3 v2) {
        return Raylib.Vector3Add(v1, v2);
    }

    /**
     * Unlock gui controls (global state)
     */
    public static void guiUnlock() {
        Raylib.GuiUnlock();
    }

    /**
     * Text Box control, updates input text
     */
    public static int guiTextBox(com.raylib.Raylib.Rectangle bounds, byte[] text, int textSize, boolean editMode) {
        return Raylib.GuiTextBox(bounds, text, textSize, editMode);
    }

    /**
     * Text Box control, updates input text
     */
    public static int guiTextBox(com.raylib.Raylib.Rectangle bounds, java.nio.ByteBuffer text, int textSize, boolean editMode) {
        return Raylib.GuiTextBox(bounds, text, textSize, editMode);
    }

    /**
     * Text Box control, updates input text
     */
    public static int guiTextBox(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, int textSize, boolean editMode) {
        return Raylib.GuiTextBox(bounds, text, textSize, editMode);
    }

    /**
     * Label control, shows text
     */
    public static int guiLabel(com.raylib.Raylib.Rectangle bounds, java.lang.String text) {
        return Raylib.GuiLabel(bounds, text);
    }

    /**
     * Label control, shows text
     */
    public static int guiLabel(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text) {
        return Raylib.GuiLabel(bounds, text);
    }

    public static boolean notEquals(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.notEquals(arg0, arg1);
    }

    public static boolean notEquals(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.notEquals(arg0, arg1);
    }

    public static boolean notEquals(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.notEquals(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 vector2Add(com.raylib.Raylib.Vector2 v1, com.raylib.Raylib.Vector2 v2) {
        return Raylib.Vector2Add(v1, v2);
    }

    public static com.raylib.Raylib.Vector4 vector4One() {
        return Raylib.Vector4One();
    }

    public static com.raylib.Raylib.Matrix matrixAdd(com.raylib.Raylib.Matrix left, com.raylib.Raylib.Matrix right) {
        return Raylib.MatrixAdd(left, right);
    }

    public static com.raylib.Raylib.Vector3 vector3One() {
        return Raylib.Vector3One();
    }

    public static com.raylib.Raylib.Vector2 vector2One() {
        return Raylib.Vector2One();
    }

    /**
     * Line separator control, could contain text
     */
    public static int guiLine(com.raylib.Raylib.Rectangle bounds, java.lang.String text) {
        return Raylib.GuiLine(bounds, text);
    }

    /**
     * Line separator control, could contain text
     */
    public static int guiLine(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text) {
        return Raylib.GuiLine(bounds, text);
    }

    /**
     * Disable gui controls (global state)
     */
    public static void guiDisable() {
        Raylib.GuiDisable();
    }

    /**
     * Panel control, useful to group controls
     */
    public static int guiPanel(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text) {
        return Raylib.GuiPanel(bounds, text);
    }

    /**
     * Panel control, useful to group controls
     */
    public static int guiPanel(com.raylib.Raylib.Rectangle bounds, java.lang.String text) {
        return Raylib.GuiPanel(bounds, text);
    }

    /**
     * Button control, returns true when clicked
     */
    public static int guiButton(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text) {
        return Raylib.GuiButton(bounds, text);
    }

    /**
     * Button control, returns true when clicked
     */
    public static int guiButton(com.raylib.Raylib.Rectangle bounds, java.lang.String text) {
        return Raylib.GuiButton(bounds, text);
    }

    /**
     * Slider control, returns selected value
     */
    public static int guiSlider(com.raylib.Raylib.Rectangle bounds, java.lang.String textLeft, java.lang.String textRight, float[] value, float minValue, float maxValue) {
        return Raylib.GuiSlider(bounds, textLeft, textRight, value, minValue, maxValue);
    }

    /**
     * Slider control, returns selected value
     */
    public static int guiSlider(com.raylib.Raylib.Rectangle bounds, java.lang.String textLeft, java.lang.String textRight, org.bytedeco.javacpp.FloatPointer value, float minValue, float maxValue) {
        return Raylib.GuiSlider(bounds, textLeft, textRight, value, minValue, maxValue);
    }

    /**
     * Slider control, returns selected value
     */
    public static int guiSlider(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer textLeft, org.bytedeco.javacpp.BytePointer textRight, java.nio.FloatBuffer value, float minValue, float maxValue) {
        return Raylib.GuiSlider(bounds, textLeft, textRight, value, minValue, maxValue);
    }

    /**
     * Slider control, returns selected value
     */
    public static int guiSlider(com.raylib.Raylib.Rectangle bounds, java.lang.String textLeft, java.lang.String textRight, java.nio.FloatBuffer value, float minValue, float maxValue) {
        return Raylib.GuiSlider(bounds, textLeft, textRight, value, minValue, maxValue);
    }

    /**
     * Slider control, returns selected value
     */
    public static int guiSlider(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer textLeft, org.bytedeco.javacpp.BytePointer textRight, float[] value, float minValue, float maxValue) {
        return Raylib.GuiSlider(bounds, textLeft, textRight, value, minValue, maxValue);
    }

    /**
     * Slider control, returns selected value
     */
    public static int guiSlider(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer textLeft, org.bytedeco.javacpp.BytePointer textRight, org.bytedeco.javacpp.FloatPointer value, float minValue, float maxValue) {
        return Raylib.GuiSlider(bounds, textLeft, textRight, value, minValue, maxValue);
    }

    public static com.raylib.Raylib.Vector3 vector3Max(com.raylib.Raylib.Vector3 v1, com.raylib.Raylib.Vector3 v2) {
        return Raylib.Vector3Max(v1, v2);
    }

    public static com.raylib.Raylib.Vector3 vector3Min(com.raylib.Raylib.Vector3 v1, com.raylib.Raylib.Vector3 v2) {
        return Raylib.Vector3Min(v1, v2);
    }

    /**
     * Set gui custom font (global state)
     */
    public static void guiSetFont(com.raylib.Raylib.Font font) {
        Raylib.GuiSetFont(font);
    }

    /**
     * Grid control, returns mouse cell position
     */
    public static int guiGrid(com.raylib.Raylib.Rectangle bounds, java.lang.String text, float spacing, int subdivs, com.raylib.Raylib.Vector2 mouseCell) {
        return Raylib.GuiGrid(bounds, text, spacing, subdivs, mouseCell);
    }

    /**
     * Grid control, returns mouse cell position
     */
    public static int guiGrid(com.raylib.Raylib.Rectangle bounds, org.bytedeco.javacpp.BytePointer text, float spacing, int subdivs, com.raylib.Raylib.Vector2 mouseCell) {
        return Raylib.GuiGrid(bounds, text, spacing, subdivs, mouseCell);
    }

    public static float lerp(float start, float end, float amount) {
        return Raylib.Lerp(start, end, amount);
    }

    public static com.raylib.Raylib.Vector4 vector4Min(com.raylib.Raylib.Vector4 v1, com.raylib.Raylib.Vector4 v2) {
        return Raylib.Vector4Min(v1, v2);
    }

    public static float clamp(float value, float min, float max) {
        return Raylib.Clamp(value, min, max);
    }

    public static com.raylib.Raylib.Vector3 addPut(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.addPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 addPut(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.addPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Matrix addPut(com.raylib.Raylib.Matrix arg0, com.raylib.Raylib.Matrix arg1) {
        return Raylib.addPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 addPut(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.addPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 addPut(com.raylib.Raylib.Vector4 arg0, float arg1) {
        return Raylib.addPut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 dividePut(com.raylib.Raylib.Vector3 arg0, float arg1) {
        return Raylib.dividePut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 dividePut(com.raylib.Raylib.Vector2 arg0, float arg1) {
        return Raylib.dividePut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 dividePut(com.raylib.Raylib.Vector4 arg0, com.raylib.Raylib.Vector4 arg1) {
        return Raylib.dividePut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector4 dividePut(com.raylib.Raylib.Vector4 arg0, float arg1) {
        return Raylib.dividePut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector2 dividePut(com.raylib.Raylib.Vector2 arg0, com.raylib.Raylib.Vector2 arg1) {
        return Raylib.dividePut(arg0, arg1);
    }

    public static com.raylib.Raylib.Vector3 dividePut(com.raylib.Raylib.Vector3 arg0, com.raylib.Raylib.Vector3 arg1) {
        return Raylib.dividePut(arg0, arg1);
    }

    /**
     * Get gui custom font (global state)
     */
    public static com.raylib.Raylib.Font guiGetFont() {
        return Raylib.GuiGetFont();
    }

}
