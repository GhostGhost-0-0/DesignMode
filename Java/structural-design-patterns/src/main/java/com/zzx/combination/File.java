package com.zzx.combination;

/**
 * @BelongProject: Java
 * @BelongPackage: com.zzx.combination
 * @Author: 那个小楠瓜
 * @CreateTime: 2022-07-29 16:42
 * @Description: 文件类，文件就相当于树叶，无法添加子组件
 * @Version: 1.0
 */
public class File extends Component{
    @Override
    public void addComponent(Component component) {
        throw new UnsupportedOperationException();  // 不支持添加删除子组件这些操作了
    }

    @Override
    public void removeComponent(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Component getChild(int child) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void test() {
        // 具体的名称修改操作
        System.out.println("修改文件名称成功" + this);
    }
}
