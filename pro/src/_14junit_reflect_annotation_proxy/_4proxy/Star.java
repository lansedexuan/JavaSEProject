package _14junit_reflect_annotation_proxy._4proxy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Star implements StarService{
    private String name;

    @Override
    public void sing(String name) {
        System.out.println(this.name+"明星唱歌");
    }

    @Override
    public String dance() {
        System.out.println("明星跳舞");
        return "谢谢！";
    }
}
