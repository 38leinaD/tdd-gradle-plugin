## Continuous-mode clear-screen

The continuous-mode (-t) of Gradle allows to immediately rerun test on each code-change.
Unfortunately, it just appends to the terminal and thus it is sometimes hard for the brain to immediately find the output of the current test-run.

This plugin for Gradle clears the screen before each run of the continuous-mode-build.


## Usage

Add the following to the top of your `build.gradle`:

```
plugins {
	id "de.dplatz.clear" version "0.3"
}

```

Run your build in continuous-mode. 

```
gradle test -t
```

Change your source-code so your tests are re-executed. The screen should be cleared before output of the test-run appears.