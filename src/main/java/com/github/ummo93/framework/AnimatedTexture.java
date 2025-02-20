package com.github.ummo93.framework;

import com.raylib.*;
import lombok.*;

import static com.github.ummo93.utils.RaylibUtils.rectangle;
import static com.raylib.Raylib.*;

@Getter
@Setter
@RequiredArgsConstructor
public class AnimatedTexture {
    @NonNull
    private Texture texture;
    @NonNull
    private int frameWidth;
    @NonNull
    private int frameHeight;
    @NonNull
    private int currentFrame;
    @NonNull
    private int totalFrames;
    @NonNull
    private int frameTimeInterval;
    @NonNull
    private float scale;

    private int framesCounter = 0;

    public void drawCurrentFrame(int posX, int posY) {
        int framesPerRow = texture.width() / frameWidth;
        int currentRow = currentFrame / framesPerRow;
        int currentColumn = currentFrame % framesPerRow;
        Rectangle sourceRec = rectangle(
            (float)currentColumn * frameWidth,
            (float)currentRow * frameHeight,
            (float)frameWidth,
            (float)frameHeight
        );
        Rectangle destRec = rectangle(posX, posY, frameWidth * scale, frameHeight * scale);
        drawTexturePro(texture, sourceRec, destRec, new Vector2(), 0.0f, WHITE);
    }

    public void drawAnimation(int posX, int posY) {
        drawAnimation(posX, posY, true);
    }

    public void drawAnimation(int posX, int posY, boolean repeat) {
        drawCurrentFrame(posX, posY);
        if (!isSyncedWithFps())
            return;
        if (!repeat && currentFrame == totalFrames - 1) {
            return;
        }
        currentFrame++;
        if (currentFrame > totalFrames - 1) {
            currentFrame = 0;
        }
    }

    private boolean isSyncedWithFps() {
        framesCounter++;
        if (framesCounter < frameTimeInterval) {
            return false;
        }
        framesCounter = 0;
        return true;
    }
}
