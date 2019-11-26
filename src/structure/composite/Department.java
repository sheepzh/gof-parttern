package structure.composite;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * 部门构件
 * @author zhyyy 2019/11/8
 **/
public class Department implements OrganizationComponent {

    private int id;

    private Set<OrganizationComponent> staffs = new HashSet<>();

    public Department(int id) {
        this.id = id;
    }

    public void remove(OrganizationComponent name) {
        staffs.remove(name);
    }

    public void add(OrganizationComponent toAdd) {
        staffs.add(toAdd);
    }

    public Collection<OrganizationComponent> getChildren() {
        return staffs;
    }

    @Override
    public void name() {
        staffs.forEach(OrganizationComponent::name);
        System.out.println("部门" + id + "全体到场。");
    }
}
