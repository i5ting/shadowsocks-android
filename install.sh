#! /bin/bash

./build.sh
sbt clean android:package-release
adb install -r target/android-bin/shadowsocks-release.apk