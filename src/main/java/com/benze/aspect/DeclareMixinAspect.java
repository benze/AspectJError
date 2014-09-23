package com.benze.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareMixin;


@Aspect
public class DeclareMixinAspect {
    @DeclareMixin("com.benze.bo.ApplyAspect")
    public CreatedBean auditableBeanMixin(){
        return new CreatedBeanImpl();
    }
}
