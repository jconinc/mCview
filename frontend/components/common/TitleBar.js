export default function TitleBar(props) {
    return (
        <div className={`bar ${props.color}`}>
            {props.verbiage}
            <style jsx>{`
                .bar {
                    height:40px;
                    line-height:40px;
                    background-color: black;
                    color:white;
                    font-size:16px;
                    padding:0 8px;
                    margin-bottom:8px;
                }
                .green {
                    background-color: #377037;
                }
                .yellow {
                    background: linear-gradient(to bottom,#faac29 0,#d78f18 100%);
                }
                .red {
                    background: linear-gradient(to bottom, #d60c00 0, #a61e1b 100%);
                }
            `}</style>
        </div>
    )
}