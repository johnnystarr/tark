DEFAULT_GOAL: build
.PHONY: build

build:
	./gradlew build

migrate:
	./gradlew generateExposedCode
	./gradlew build

run:
	java -jar tark/build/libs/tark-?.?.?-all.jar

clean:
	./gradlew clean