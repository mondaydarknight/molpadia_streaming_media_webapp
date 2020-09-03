package-build:
	./gradlew clean build

docker-build:
	docker build . -t molpadia_streaming_media_webapp

docker-run:
	docker-compose up --build
