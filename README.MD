# How To Setup For Local Dev Live Reload if Using IntelliJ IDEA for Spring Boot

_If using [IntelliJ IDEA](https://www.jetbrains.com/idea/download/?section=windows)_, after open the project (and stop local server if running):

1. Add [DevTools Dependency](https://docs.spring.io/spring-boot/reference/using/devtools.html)
2. In IntelliJ IDEA `Settings...`, under tab `Build, Execution, Deployment`, see `Compiler`, tick **Build project automatically**.
3. In IntelliJ IDEA `Settings...`, in `Advanced Settings`, under section _Compiler_, tick **Allow auto-make to start even if .... currently running**.
4. In browser Chrome, **Download Extentions [RemoteLiveReload](https://chromewebstore.google.com/detail/jlppknnillhjgiengoigajegdpieppei?hl=en-GB)**, after download, **Pin** the extension and visit _localhost url_ and **click on the extention icon to make it turn from Red Dot to Green Dot**.
