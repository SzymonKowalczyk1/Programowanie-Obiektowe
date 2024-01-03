public class TextProcessor implements DataProcessor{

    @Override
    public String processData(String data){
        if (data == null){
            return "Input is null";
        }
        return new StringBuilder(data)
    }

}
