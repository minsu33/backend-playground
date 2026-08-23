# Hello Docker

Dockerfile로 이미지를 만들고 컨테이너로 실행해보는 첫 실습.

## 실행

이 폴더(`docker/hello-docker`)에서 실행한다.

```bash
# 이미지 생성
docker build -t hello-docker .
# 컨테이너 실행
docker run hello-docker
```
