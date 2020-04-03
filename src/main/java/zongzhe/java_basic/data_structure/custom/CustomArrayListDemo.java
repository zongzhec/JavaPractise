package zongzhe.java_basic.data_structure.custom;

public class CustomArrayListDemo {

    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();

        // 增：自定义容器必须可以添加元素
        myList.add("Zongzhe");
        myList.add("Czz");
        myList.add(null);

        // 删：自定义容器必须可以删除元素
        myList.remove(null);

        // 查：自定义容器必须可以查看元素数量
        System.out.println("size: " + myList.size());

        // 查：必须可以以数组的形式返回所有有效元素
        Object[] all = myList.toArray();
        for (Object obj : all) {
            System.out.println("element: " + obj);
        }

        // 查：必须可以返回指定位置的元素
        System.out.println("get(1): " + myList.get(1));

        // 改：自定义容器必须可以修改元素
        myList.set("Czz", "Czzzz");

        // 需要可以查找obj在当前容器中的索引，如果没有，返回-1
        System.out.println("indexOf(): " + myList.indexOf("Czz"));
    }
}
