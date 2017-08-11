# SampleJUnitProject
Starting state for an Android Studio project with JUnit tests that check for the existence of a class and its method.

Android Command Line Testing Docs
--
https://developer.android.com/studio/test/command-line.html

Test Command
--
./gradlew -q test


XML Output
--
XML test result files: EmptyTestProject/app/build/test-results/testDebugUnitTest/

Configuration Steps
--
None, an empty Android Studio project already has JUnit set up.

Steps to Pass Included Tests
--
1. Create an Activity called DetailActivity.
2. Create a `public int add(int, int)` method in DetailActivity.
