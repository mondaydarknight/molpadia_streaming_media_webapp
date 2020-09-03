# molpadia_streaming_media_webapp

## Prerequisites
|                                             |                  |
|---------------------------------------------|------------------|
| **Docker** | Docker enables to build, develop, run your environments. Please install the latest for your platform. [Docker](https://docs.docker.com/install). |
| **bash**   | Build and run scripts require bash and have been tested on systems. Most users shouldn't need to update their version but if you run into issues please install the latest for your platform. Instructions for macOS&reg;* users [here](docs/installing_bash_macos.md). |
| **curl**   | Use `curl` command line program to issue standard HTTP requests to the microservice. Please install the latest for your platform. Note: any other tool or utility that can issue standard HTTP requests can be used in place of `curl`. |

## Setup dev environment
1. Refer to [doc](https://docs.docker.com/docker-for-mac/install/) to install docker on your mac.
2. Build web application with `make package-build`
3. Build and run docker image `make docker-build`
4. Run docker container `make docker-run` 
