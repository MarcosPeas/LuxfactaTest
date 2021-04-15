package com.luxfacta;

import java.nio.file.InvalidPathException;
import java.util.Arrays;
import java.util.Stack;

public class Path {

    Stack<String> stack = new Stack<>();


    Path() {
    }

    Path(String root) {
        boolean matches = root.matches("(/[a-zA-Z]+([/]?))*");
        if (!matches) {
            throw new InvalidPathException(root, "o caminho está incorreto. Utilize o padrão /a/b ou /a/b/");
        }
        root = root.substring(1);
        String[] split = root.split("/");
        Arrays.stream(split).forEach(s -> {
            stack.add("/");
            stack.add(s);
        });
    }

}
