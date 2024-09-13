//Progrm showing  Streams
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamDemo{
    public static void main(String[] args ){
        List<Integer> num= Arrays.asList(5,6,3,1,9);
        Stream<Integer> streamNum=num.stream();
        Stream<Integer> streamNew=streamNum.map(n->n*2);
        streamNew.forEach(n->System.out.println(n));
    }
}