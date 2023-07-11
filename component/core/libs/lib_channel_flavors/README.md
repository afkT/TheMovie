
# About

App 多渠道

# 依赖信息

```groovy
dependencies {

    // 核心基础依赖库 ( 编译但不参与打包 )
    compileOnly project(':core_base_lib')
}
```

# AndroidManifest

```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest package="afkt.movie.core.lib.channel" />
```

# main/java 目录结构

```
- java                              
   - afkt                           
      - movie                       
         - core                     
            - lib                   
               - channel            
```