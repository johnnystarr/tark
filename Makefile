DEFAULT_GOAL: build
.PHONY: build

build:
	./gradlew build

migrate:
	./gradlew generateExposedCode
	./gradlew build

run:
	@docker-compose up -d
	@sleep 5
	@java -jar tark/build/libs/tark-?.?.?-all.jar

clean:
	./gradlew clean
	docker-compose down