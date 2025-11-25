# CS50 C to JavaScript Practice

This repository is a personal practice space to convert **C programs from CS50** into **JavaScript**.  
The main goal is to understand the logic of C programs and get familiar with JavaScript syntax and structures.

## Project Structure

- `c_code/` - Folder containing original C programs.
- `js_code/` - Folder containing translated JavaScript programs.
- `README.md` - Project description and documentation.
- `Dockerfile` - Docker configuration for development environment.

## Objectives

1. Learn C programming basics from CS50.
2. Convert simple C programs into JavaScript.
3. Compare the differences and similarities between C and JavaScript.
4. Build familiarity with JavaScript syntax and behavior using C logic as reference.

## Requirements / Dependencies

To compile and run programs in this repository you need:

- **GCC** (for C programs)
- **GDB** (optional, for debugging C programs)
- **Java JDK 17+** (for Java programs)
- **Node.js** (for running JavaScript programs)
- **Docker** (optional, recommended for a reproducible development environment)

> If you use Docker, all dependencies are installed automatically.

## Build and Run Docker Container

```bash
# Build the Docker image
docker build -t cs50-dev .

# Run the container interactively, mounting current folder
docker run -it -v $(pwd):/workspace cs50-dev
```
