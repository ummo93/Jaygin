import json
import os

CONFIG_PATH = "general/src/main/resources/META-INF/native-image/reachability-metadata.json"

if os.path.exists(CONFIG_PATH):
    with open(CONFIG_PATH, "r", encoding="utf-8") as f:
        data = json.load(f)

    modified = False
    for entry in data["reflection"]:
        if "type" in entry and entry["type"].startswith("com.github.ummo93"):
            if "allDeclaredConstructors" not in entry:
                entry["allDeclaredConstructors"] = True
                modified = True

    if modified:
        with open(CONFIG_PATH, "w", encoding="utf-8") as f:
            json.dump(data, f, indent=2)

    print("Updated reachability-metadata.json: Added allDeclaredConstructors to framework classes")
else:
    print("reachability-metadata.json not found")
