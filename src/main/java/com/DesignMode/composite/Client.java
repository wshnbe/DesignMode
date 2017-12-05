package com.DesignMode.composite;

import java.util.ArrayList;

/**
 * 场景类
 * @author wulinli
 *
 */
public class Client {

	public static void main(String[] args) {
		Branch root = compositeCorpTree();
		System.out.println(root.getInfo());
		System.out.println(getTreeInfo(root));
	}
	
	public static Branch compositeCorpTree(){
		Branch root = new Branch("zhangsan","zongjinli",100000);
		Branch saler = new Branch("lisi","xiaoshou",50000);
		Branch develper = new Branch("wangwu","develper",50000);
		
		Branch coder1 = new Branch("zhaoliu","kaifa1",5000);
		Branch coder2 = new Branch("zhuqi","kaifa2",5000);
		
		Leaf leaf1 = new Leaf("zhang1", "coder", 30000);
		Leaf leaf2 = new Leaf("zhang2", "coder", 30000);
		Leaf leaf3 = new Leaf("zhang3", "coder", 30000);
		Leaf leaf4 = new Leaf("zhang4", "coder", 30000);
		Leaf leaf5 = new Leaf("zhang5", "coder", 30000);
		Leaf leaf6 = new Leaf("zhang6", "coder", 30000);
		Leaf leaf7 = new Leaf("zhang7", "coder", 30000);
		Leaf leaf8 = new Leaf("zhang8", "coder", 30000);
		/*总裁手下的人*/
		root.addSub(saler);
		root.addSub(develper);
		/* 开发总管手下的人 */
		develper.addSub(coder1);
		develper.addSub(coder2);
		/* 两个开发组长手下的人 */
		coder1.addSub(leaf1);
		coder1.addSub(leaf2);
		coder1.addSub(leaf3);
		coder1.addSub(leaf4);
		coder2.addSub(leaf5);
		coder2.addSub(leaf6);
		coder2.addSub(leaf7);
		coder2.addSub(leaf8);
		return root;
	}
	
	public static String getTreeInfo(Branch root){
		ArrayList<ICorp> subList = root.getSubList();
		String info = "";
		for(ICorp s : subList){
			if(s instanceof Leaf){
				info = info + s.getInfo() + "\n";
			}else{
				info = info + s.getInfo() + "\n" +getTreeInfo((Branch)s);
			}
		}
		return info;
	}
}
