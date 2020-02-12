package com.android.samsung.codelab.guestbookdapp.ethereum;

import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Uint;
import org.web3j.abi.datatypes.Utf8String;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.singletonList;

public class FunctionUtil {
    //TODO : 여기서 스마트컨트랙트 주소 바꿀 수 있떠
    public static final String CONTRACT_ADDRESS = "0x84777eebB409E6F3eDe402B4c2A70f3C9B89B8Ea";

    public static Function createPostSmartContractCall(String name, String comment, String date, String emoji) {
        return new Function("post"
                , Arrays.asList(
                new Utf8String(name)
                , new Utf8String(comment)
                , new Utf8String(date)
                , new Utf8String(emoji))
                , Collections.emptyList());
    }

    public static Function createGetPostCountSmartContractCall() {
        return new Function("getPostCount"
                , Collections.emptyList()
                , singletonList(new TypeReference<Uint>() {
        }));
    }

    public static Function createGetPostSmartContractCall(int index) {
        return new Function("getPost"
                , singletonList(new Uint(BigInteger.valueOf(index)))
                , Arrays.asList(
                new TypeReference<Utf8String>() {
                }
                , new TypeReference<Utf8String>() {
                }
                , new TypeReference<Utf8String>() {
                }
                , new TypeReference<Utf8String>() {
                }
        ));
    }
}
