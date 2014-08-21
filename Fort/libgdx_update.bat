
wget http://libgdx.badlogicgames.com/nightlies/libgdx-nightly-latest.zip

unzip -o libgdx-nightly-latest.zip gdx.jar gdx-natives.jar gdx-backend-lwjgl.jar gdx-backend-lwjgl-natives.jar extensions/gdx-tools/gdx-tools.jar extensions/gdx-tools/sources/gdx-tools-sources.jar
rm -v libgdx-nightly-latest.zip

mv -v gdx.jar libs/
mv -v gdx-natives.jar gdx-backend-lwjgl.jar gdx-backend-lwjgl-natives.jar libs/
cp -vR --parents extensions/* libs 


rm -rf extensions