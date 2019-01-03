package com.wbb.dp.chapter19;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体枝干节点
 *
 * @author vico
 * @date 2018-12-30
 */
public class Composite extends Component {

    /**
     * 存储节点的容器
     */
    private List<Component> components = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println(name);
        if (null != components) {
            for (Component c : components) {
                c.doSomething();
            }
        }
    }

    /**
     * 添加子节点
     *
     * @param child 子节点
     */
    public void addChild(Component child) {
        components.add(child);
    }

    /**
     * 移除子节点
     * @param child 子节点
     */
    public void removeChild(Component child){
        components.remove(child);
    }

    /**
     * 获取子节点
     * @param index 子节点对于下标
     * @return 子节点
     */
    public Component getChildren(int index){
        return components.get(index);
    }
}
