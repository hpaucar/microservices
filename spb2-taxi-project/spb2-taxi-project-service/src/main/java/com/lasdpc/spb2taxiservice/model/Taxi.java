package com.lasdpc.spb2taxiservice.model;

import com.lasdpc.spb2taximodel.enums.TaxiStatus;
import com.lasdpc.spb2taximodel.enums.TaxiType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("Taxi")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Taxi implements Serializable {
    @Id
    private String taxiId;

    private TaxiType taxiType;

    private TaxiStatus taxiStatus;
}
