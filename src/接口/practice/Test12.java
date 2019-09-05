package 接口.practice;
interface I extends II,III{}
interface II /*extends I*/{}    //报错
interface III extends II{}
public class Test12 {
}
