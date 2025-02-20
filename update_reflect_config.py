import json
import os

CONFIG_PATH = "src/main/resources/META-INF/native-image/reflect-config.json"

if os.path.exists(CONFIG_PATH):
    with open(CONFIG_PATH, "r", encoding="utf-8") as f:
        data = json.load(f)

    modified = False
    for entry in data:
        if "name" in entry and entry["name"].startswith("com.raylib"):
            if "unsafeAllocated" not in entry:
                entry["unsafeAllocated"] = True
                modified = True

    if modified:
        with open(CONFIG_PATH, "w", encoding="utf-8") as f:
            json.dump(data, f, indent=2)

    print("Updated reflect-config.json: Added `unsafeAllocated: true` for Raylib classes")
else:
    print("reflect-config.json not found")
