package _05Collection._00List;

/*
List 集合因为支持索引，所以多了很多与索引相关的方法，当然，Collection 的功能 List 也都继承了。
    方法名称	                        说明
    void add(int index,E element)	在此集合中的指定位置插入指定的元素
    E remove(int index)	            删除指定索引处的元素，返回被删除的元素
    E set(int index,E element)	    修改指定索引处的元素，返回被修改的元素
    E get(int index)	            返回指定索引处的元素
 */

public class ArrayList_LinkedList {
/*
    ArrayList 基于数组存储数据
        - 查询速度快（注意：是根据索引查询数据快）：查询数据通过地址值和索引定位，查询任意数据耗时相同。
        - 增删数据效率低：可能需要把后面很多的数据进行前移。
    LinkedList 基于双链表存储数据
        - 链表的特点1：查询慢，无论查询哪个数据都要从头开始找。
        - 链表的特点2：链表增删相对快
 */
}

