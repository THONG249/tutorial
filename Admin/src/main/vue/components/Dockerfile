FROM ubuntu:latest
LABEL authors="Thong Ngo"

ENTRYPOINT ["top", "-b"]
FROM node:20.11.0 AS build

WORKDIR /app

RUN git clone https://github.com/THONG249/tutorial.git

COPY package*.json ./


RUN npm install

COPY . .

RUN npm run build
FROM nginx:alpine

COPY --from=build /app/dist /usr/share/nginx/html

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
