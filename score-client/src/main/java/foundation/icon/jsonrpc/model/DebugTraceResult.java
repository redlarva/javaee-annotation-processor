package foundation.icon.jsonrpc.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.math.BigInteger;
import java.util.List;
import java.util.StringJoiner;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DebugTraceResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String status;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DebugLog> logs;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<DebugLog> getLogs() {
        return logs;
    }

    public void setLogs(List<DebugLog> logs) {
        this.logs = logs;
    }

    public static class DebugLog {

        private BigInteger level;
        private String msg;
        private BigInteger ts;

        public BigInteger getLevel() {
            return level;
        }

        public void setLevel(BigInteger level) {
            this.level = level;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public BigInteger getTs() {
            return ts;
        }

        public void setTs(BigInteger ts) {
            this.ts = ts;
        }

        @Override
        public String toString() {
            return "{" +
                    "level=" + level +
                    ", msg='" + msg + '\'' +
                    ", ts=" + ts +
                    '}';
        }
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", DebugTraceResult.class.getSimpleName() + "[", "]")
                .add("status=" + status)
                .add("logs=" + logs)
                .toString();
    }
}
