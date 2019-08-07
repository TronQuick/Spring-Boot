## 返回JSON

```java
public class User {
    private String name;
	
    // 不添加至JSON序列
    @JsonIgnore
    private String password;

    private Integer age;
	
    // 日期格式化
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss a",locale = "zh",timezone = "GMT+8")
    private Date birthday;
	
    // 为空的时候不添加至JSON
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String desc;
}
```



## 整合mybatis

**Spring Boot 集成 MyBatis, 分页插件 PageHelper, 通用 Mapper：**

https://github.com/TronQuick/MyBatis-Spring-Boot





