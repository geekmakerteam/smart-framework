package org.smart4j.framework.mvc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 定义请求
 * <br/>
 * 已废弃（计划在 2.5 版本里删除）
 * <br/>
 * 建议使用：{@link GET} 、{@link POST}、{@link PUT}、{@link DELETE}
 *
 * @author huangyong
 * @since 1.0
 */
@Deprecated
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Request {

    @Deprecated
    String value();

    /**
     * 定义 GET 请求
     *
     * @author huangyong
     * @since 2.1
     */
    @Deprecated
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Get {

        String value();
    }

    /**
     * 定义 POST 请求
     *
     * @author huangyong
     * @since 2.1
     */
    @Deprecated
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Post {

        String value();
    }

    /**
     * 定义 PUT 请求
     *
     * @author huangyong
     * @since 2.1
     */
    @Deprecated
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Put {

        String value();
    }

    /**
     * 定义 DELETE 请求
     *
     * @author huangyong
     * @since 2.1
     */
    @Deprecated
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Delete {

        String value();
    }
}
