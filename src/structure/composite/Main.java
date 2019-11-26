package structure.composite;

/**
 * 组合模式
 * 将对象组合成树状的层次结构的模式，用来表示“部分-整体”的关系，使用户对单个对象和组合对象具有一致的访问性
 * 常用于：
 * 1.需要表示一个对象整体与部分的层次结构的场合
 * 2.要求对用户隐藏组合对象与单个对象的不同，用户可以用统一的接口使用组合结构中的所有对象的场合
 * <p>
 * 本例采用安全模式实现一个点名功能
 * 安全式：单节点和组合节点分离，定义不同的操作接口。类间关系更复杂。
 * 透明式：所有节点继承相同的接口，但会在单节点中引起不安全的操作。
 *
 * @author zhyyy 2019/11/8
 **/
public class Main {
    public static void main(String[] a) {
        // 部门1
        Department department1 = new Department(1);
        // 部门2
        Department department2 = new Department(2);

        // 公司职员
        OrganizationComponent staff1 = new Staff("张三");
        OrganizationComponent staff2 = new Staff("李四");
        OrganizationComponent staff3 = new Staff("王五");

        // 挂属层级关系
        // 安全式的组合模式
        department1.add(staff1);
        department1.add(staff2);
        department2.add(staff3);

        // 业务操作，点名
        // 部门1点名
        department1.name();
        // 部门2职员点名
        department2.getChildren().forEach(OrganizationComponent::name);
    }
}
