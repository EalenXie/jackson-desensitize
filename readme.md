基于Jackson序列化实现数据脱敏
=============

### 快速开始

1. maven依赖引入

```xml

<dependency>
    <groupId>io.github.ealenxie</groupId>
    <artifactId>jackson-desensitize</artifactId>
    <version>1.0</version>
</dependency>

```

2. 直接在想要进行脱敏的对象属性上使用相关注解即可

```java

import com.github.annotation.*;
import lombok.Data;

/**
 * Created by EalenXie on 2021/9/24 17:24
 */
@Data
public class TestVO {

    @EmailDesensitize
    private String email;

    @PhoneDesensitize
    private String phone;

    @StringDesensitize
    private String password;

    @IDCardDesensitize
    private String idCard;
}
```

调用接口返回此VO,效果如下 :

![image.png](https://p3-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/da5ba31a83d84239a3d52eff051ec74b~tplv-k3u1fbpfcp-watermark.image?)




