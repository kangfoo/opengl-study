# 简要说明

## Maven命令下载源码和javadocs
当在IDE中使用Maven时如果想要看引用的jar包中类的源码和javadoc需要通过maven命令下载这些源码，然后再进行引入，通过mvn命令能够容易的达到这个目的：
```
mvn dependency:sources
mvn dependency:resolve -Dclassifier=javadoc
```