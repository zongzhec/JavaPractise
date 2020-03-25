package zongzhe.design_pattern;

/**
 * 需求：计算add()的运行时间
 */
public class ProxyDemo {
    public static void main(String[] args) {
        // 使用代理类和被代理类来完成工作
        UserDAO dao = new UserDAO();
        UserDAOProxy proxy = new UserDAOProxy(dao);
        proxy.add();
    }
}

interface DAO {
    void add();
}

// 被代理者
class UserDAO implements DAO {
    @Override
    public void add() {
        System.out.println("添加用户");
    }
}

// 代理者
class UserDAOProxy implements DAO {
    private DAO target;//代表被代理者

    public UserDAOProxy(DAO target) {
        super();
        this.target = target;
    }

    @Override
    public void add() {
        System.out.println("add方法开始执行");
        long startTime = System.currentTimeMillis();

        // 核心业务逻辑要交还给被代理者
        target.add();

        long endTime = System.currentTimeMillis();
        System.out.println("add() 方法结束，耗时： " + (endTime - startTime));
    }
}
