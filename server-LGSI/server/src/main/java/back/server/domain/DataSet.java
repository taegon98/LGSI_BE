package back.server.domain;

import back.server.api.dto.data.RaspRequestDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DataSet {
    @Id
    @GeneratedValue
    @Column(name = "DATA_ID", nullable = false, updatable = false, unique = true)
    private Long id;
    @Column(nullable = false)
    private String cityName;
    private String waterLevel;

    private String temperature;

    private String ph;

    private String turbidity;

    public void update(RaspRequestDto dto) {
        this.waterLevel = dto.getWaterLevel();
        this.temperature = dto.getTemperature();
        this.ph = dto.getPh();
        this.turbidity = dto.getTurbidity();
    }
}
*/
