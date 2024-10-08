package org.traccar.protocol;

import org.junit.jupiter.api.Test;
import org.traccar.ProtocolTest;

public class AstraProtocolDecoderTest extends ProtocolTest {

    @Test
    public void testDecode() throws Exception {

        var decoder = inject(new AstraProtocolDecoder(null));

        verifyPositions(decoder, binary(
                "4b00700529c0c265976b8202cba9ff00676d864554a9c30000000020073401006436000300030008000000000000a0000100001920c43d00009600428302cba9ff00676d864554aa3e000000002007240100643b000300020008000000000000b0000100001920c43d00009600420f0e"));

        verifyPositions(decoder, binary(
                "4b00320524c1da58769e6d0322617effe874024453065600a800000100080000643e0000000000000000000000069500e7bb"));

        verifyPositions(decoder, binary(
                "4b013c02213aec35c501ad031368b8ffcd1ad043e5c4500c79000100003101005c490c001c0009020200020015069600ae03136801ffcd1af143e5c452125e000100003101005c491200090011010000020015068500af0313629effcd1f4b43e5c45d1e46000100003101005c491e00080409040500040015068700b0031359d5ffcd35ad43e5c47b2a3b000001003101005c492a1b1a0d0b0f0b00080015068700b103134984ffcd4b1e43e5c4913354000100003101005c49340b0103090606000f0015067700b203132e1affcd5a5a43e5c4af3348000001003101005c4935070a08000a070017001505f700b30313192cffcd7af143e5c4cd3733000001003101005c4937091206050a0800200015058600b403130debffcda88743e5c4eb2c3e000001003101005c493707030601080600290015058600b377"));

    }

}
