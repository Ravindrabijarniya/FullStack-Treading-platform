import axios from 'axios';
export const dataType="Time Series (Daily)"
const fetchData = async (keyword,symbol) => {
  try {
    const response = await axios.get("https://www.alphavantage.co/query", {
      params: {
        function: keyword,
        symbol: symbol,
        apikey: "6OA4X23ZRGEV34TZ", 
        market: "EUR",
      },
    });

    if (response.status === 200) {
      return response.data; 
    } else {
      throw new Error("Failed to fetch data");
    }
  } catch (error) {
    console.error(
      "Error fetching data:",
      error?.response?.data || error.message
    );
    return null;
  }

};

export default fetchData;
