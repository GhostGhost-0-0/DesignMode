package com.zzx.combination;

/**
 * @BelongProject: Java
 * @BelongPackage: com.zzx.combination
 * @Author: 那个小楠瓜
 * @CreateTime: 2022-07-29 16:36
 * @Description: 组件抽象类
 * @Version: 1.0
 */
public abstract class Component {

    /**
     * 添加子组件
     * @param component 组件
     */
    public abstract void addComponent(Component component);

    /**
     * 删除子组件
     * @param component 组件
     */
    public abstract void removeComponent(Component component);

    /**
     * 获取子组件
     * @param child 坐标
     * @return 组件
     */
    public abstract Component getChild(int child);

    /**
     * 执行对应业务方法，比如修改文件名称
     */
    public abstract void test();
}
