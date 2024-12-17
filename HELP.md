# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.4.0/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.4.0/maven-plugin/build-image.html)
* [Ollama](https://docs.spring.io/spring-ai/reference/api/chat/ollama-chat.html)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the
parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

Added in Temperature property:

AI temperature refers to a parameter that controls the level of randomness or creativity in an AI's responses. It influences how deterministic or unpredictable the output is.

Here’s how it works:

    Low Temperature (e.g., 0 or close to 0):
    The AI becomes more deterministic, choosing the most probable or safe response. This is ideal for tasks that require precision, like factual answers or technical information.

    High Temperature (e.g., 0.7 to 1.5):
    The AI becomes more creative and diverse in its output. It explores less probable words or ideas, making responses more varied but potentially less accurate or focused.
