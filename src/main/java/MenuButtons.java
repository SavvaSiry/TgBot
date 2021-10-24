import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MenuButtons {

    IT("Список IT услуг", "{value: 1}"),
    START_UP("Хочу предложить иедю для стартапа", "{value: 2}"),
    MEET("Хочу встретиться лично", "{value: 3}");

    final private String name;
    final private String json;

}
