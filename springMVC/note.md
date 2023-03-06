### SpringMVC流程图
![img.png](img.png)
解释
![img_5.png](img_5.png)
![img_4.png](img_4.png)
====================================================
![img_2.png](img_2.png)
![img_3.png](img_3.png) 
- 注解开发web流程
![img_1.png](img_1.png)

@Component、@Repository、@Sevice、@Controller
它们注册到spring容器的作用都一样，按照MVC三层架构分层

### Restful风格
- 使用@PathVariable注解让参数的值绑定到一个URL模板变量上面,例如localhost:8080/hello?a/b
- 使用getMapping

### 乱码问题
- 过滤器org.springframework.web.filter.CharacterEncodingFilter解决了字符乱码
- json乱码使用