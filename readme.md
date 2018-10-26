# SpringBoot Web with H2


### Running on OpenShift

- Login OpenShift
```bash
oc login -u <username> -p <password> <hostname>
```

- Create project
```bash
oc new-project <project-name>
```

- Import openjdk to openshift
```bash
oc import-image my-redhat-openjdk-18/openjdk18-openshift --from=registry.access.redhat.com/redhat-openjdk-18/openjdk18-openshift --confirm
```

- Check if the image is in the Docker 
```bash
docker images
```

- Create the application 
```bash
oc new-app --name=myapp --env=UNAME="SAMMER VALGAS" --docker-image="registry.access.redhat.com/redhat-openjdk-18/openjdk18-openshift:latest"  https://github.com/sammervalgas/spring-web-h2.git
```

- Follow process
```bash
oc logs -f bc/myapp
```

- Expose service and route
```bash
oc expose service myapp
```