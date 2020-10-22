package com.google.gson;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collection;

final class UpperCaseNamingPolicy extends RecursiveFieldNamingPolicy {
    UpperCaseNamingPolicy() {
    }

    /* Access modifiers changed, original: protected */
    public String translateName(String target, Type fieldType, Collection<Annotation> collection) {
        return target.toUpperCase();
    }
}
