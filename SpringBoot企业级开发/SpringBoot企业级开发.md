# SpringBoot企业级开发



## Thymeleaf

- `<span th:text="...">`
- `<span data-th-text="...">`



**Thymeleaf：**

- Java 模板引擎。能够处理HTML、XML、JavaScript、CSS 甚至纯文本。类似JSP、Freemarker。
- 自然模板。原型即页面。
- 语法优雅易懂。OGNL、SpringEL
- 遵从Web标准。支持HTML5



### 标准方言

- 标准表达式
- 设置属性值
- 迭代器
- 条件语句
- 模板布局
- 属性优先级
- 注释
- 内联
- 基本对象
- 工具对象
- ...



### 语法

**变量表达式**

**`${...}`**

```html
<span th:text="${book.author.name}">...</span>
```



**消息表达式**

**`#{...}`**

- 也称为 文本外部化、国际化或者i18n

```html
<span th:text="#{header.address.city}">...</span>
```





**选择表达式**

**`*{...}`**

- 与变量表达式区别：他们是在**当前选择的对象**而不是整个上下文变量映射上执行，性能更好

```html
<div th:object="${book}">
	...
	<span th:text="*{title}">...</span>
	...
</div>
```



**链接表达式**

**`@{...}`**

可以是相对也可以是绝对的



**分段表达式**

`th:insert`或`th:replace`

```html
<div th:fragment="copy"> FOOTER</div>

引用这个footer
<div th:insert="~{footer :: copy}"></div>
```



**字面量**

`th:text="..."`



### 设置属性值

**设置任意属性值**

**`th:attr`**

```html
<form th:attr="action=@{/sub}"></form>

<input th:attr="value=#{subcribe.submit}"></input>
```



**设置值到指定的属性**

```html
<form th:attr="action=@{/sub}"></form>
=> th:action="@{/sub}"

<input th:attr="value=#{subcribe.submit}"></input>
=> th:value="#{subcribe.submit}"
```



**固定值布尔属性**





### 迭代器

**基本的迭代**:

**`th:each`**

```html
<li th:each="book : ${books}" th:text="${book.title}"></li>
```



**迭代器状态变量**

| 变量名   | 含义           |
| -------- | -------------- |
| index    | 索引从0开始    |
| count    | 索引从1开始    |
| size     | 元素总数       |
| current  | 当前变量       |
| even/odd | 基数还是偶数   |
| first    | 是否是第一个   |
| last     | 是否是最后一个 |





### 条件语句

`th:if `

`th:unless`

```html
<a th:if="${条件}"view></a>
```



`switch`

```html
<div th:switch="${user.role}">
    <p th:case="'admin'">...</p>
    <p th:case="'manager'">...</p>
    <p th:case="'*'">...</p>
</div>
```

