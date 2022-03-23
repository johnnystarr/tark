DEFAULT_GOAL: build
.PHONY: build

build:
	./gradlew build

migrate:
	./gradlew generateExposedCode
	./gradlew build

run:
	./gradlew run

clean:
	./gradlew clean