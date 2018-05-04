/*
 * MIT License
 *
 * Copyright (c) 2017-2018 nuls.io
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package io.nuls.consensus.poc.protocol.tx;

import io.nuls.consensus.poc.protocol.tx.entity.YellowPunishData;
import io.nuls.consensus.poc.protocol.tx.validator.YellowPunishValidator;
import io.nuls.ledger.entity.tx.AbstractNoneCoinTransaction;
import io.nuls.protocol.constant.TransactionConstant;
import io.nuls.protocol.model.Transaction;

/**
 * @author Niels
 * @date 2017/12/4
 */
public class YellowPunishTransaction extends AbstractNoneCoinTransaction<YellowPunishData> {
    public YellowPunishTransaction() {
        super(TransactionConstant.TX_TYPE_YELLOW_PUNISH);
        this.registerValidator(YellowPunishValidator.getInstance());
    }

    @Override
    public YellowPunishData parseTxData(byte[] bytes) {
        YellowPunishData data = new YellowPunishData();
        data.parse(bytes);
        return data;
    }
}
