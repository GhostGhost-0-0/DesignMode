package com.zzx.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @BelongProject: Java
 * @BelongPackage: com.zzx.combination
 * @Author: 那个小楠瓜
 * @CreateTime: 2022-07-29 16:39
 * @Description: 目录类，目录包含多个文件或文件夹
 * @Version: 1.0
 */
public class Directory extends Component{

    // 目录子组件，即文件或文件夹
    List<Component> child = new ArrayList<>();

    @Override
    public void addComponent(Component component) {
        child.add(component);
    }

    @Override
    public void removeComponent(Component component) {
        child.remove(component);
    }

    @Override
    public Component getChild(int child) {
        return this.child.get(child);
    }

    @Override
    public void test() {
        child.forEach(Component::test);
    }
}
