package back.server.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class City {

    @Id
    @GeneratedValue
    @Column(name = "CITY_ID", updatable = false, nullable = false, unique = true)
    private Long CID;

    @Column(nullable = false)
    private String cityName;

    @OneToOne
    @JoinColumn(name = "VALUE_ID")
    private MeasuredValue value;
}
